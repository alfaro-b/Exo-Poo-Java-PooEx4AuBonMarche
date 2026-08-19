package market;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Représente un fruit vendu par un primeur.
 * 
 * Un fruit hérite des caractéristiques générales d'un Product
 * et implémente les coimportements liés à la maturioté et à la péremption
 * définis par l'interface Consumable.
 * 
 * Un fruit est considéré comme mûr quelques jours après sa récolte
 * (Ici, on a choisi 3 jours).
 */
public class Fruit extends Product implements Consumable {
	
	private static final int RIPE_AFTER_DAYS = 3;

    // =========================
    // CONSTRUCTEUR
    // =========================
	
	/**
	 * Crée un fruit avec toutes ses caractéristiques
	 * 
	 * @param name Nom du fruit 
	 * @param unitPrice Prix par kg ou par pièce
	 * @param unite L'unité de vente ("kg" ou "pièce")
	 * @param stockQuantity Le stock actuel (en kg ou en nombre de pièces)
	 * @param pickingDate La date à laquelle le fruit a été récolté
	 * @param shelfLifeDays La durée maximale de conservation en jours
	 */
	public Fruit(String name, double unitPrice, String unite, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unite, stockQuantity, pickingDate, shelfLifeDays);
	}
	
    // =========================
    // METHODES
    // =========================
	
	/**
	 * Vérifie si le produit est à maturité idéale.
	 *
	 * @return true si le produit est à sa maturité idéale de consommation
	 */
	@Override
	public boolean isRipe() {
		LocalDate today = LocalDate.now();
		LocalDate ripeDate = getPickingDate().plusDays(RIPE_AFTER_DAYS);
		
		return !today.isBefore(ripeDate) && !isExpired(today);
	}

	/**
	 * Vérifie si le fruit est périmé.
	 * 
	 * @param dateVerification Date de vérification
	 * @return True si la date de vérification est postérieure 
	 *			   à la Date Limite de Consommation (DLC) du produit
	 */
	@Override
	public boolean isExpired(LocalDate dateVerification) {
		return dateVerification.isAfter(calculateExpirationDate());
	}

	/**
	 * Calcule le nombre de jours restants avant la péremption du fruit.
	 * 
	 * @param dateVerification Date à partir de laquelle effectuer le calcul
	 * @return le nombre de jours restants avant la DLC
	 */
	@Override
	public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
		return ChronoUnit.DAYS.between(dateVerification, calculateExpirationDate());
	}

	/**
	 * Calcule la date d'expiration du fruit.
	 * 
	 * @return La date limite de consommation (DLC)
	 */
	@Override
	public LocalDate calculateExpirationDate() {
		return getPickingDate().plusDays(getShelfLifeDays());
	}



}
