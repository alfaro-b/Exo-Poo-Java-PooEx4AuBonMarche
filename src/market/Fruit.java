package market;

import java.time.LocalDate;

public class Fruit extends Product implements Consumable {
	
	private static final int RIPE_AFTER_DAYS = 3;

    // =========================
    // CONSTRUCTEUR
    // =========================
	public Fruit(String name, double unitPrice, String unite, double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super(name, unitPrice, unite, stockQuantity, pickingDate, shelfLifeDays);
	}
	
    // =========================
    // METHODES
    // =========================
	
	/**
	 *Vérifie si le produit est à maturité idéale.
	 *@return true si le produit est à sa maturité idéale de consommation
	 */
	@Override
	public boolean isRipe() {
		LocalDate today = LocalDate.now();
		LocalDate ripeDate = getPickingDate().plusDays(RIPE_AFTER_DAYS);
		
		return !today.isBefore(ripeDate) && !isExpired(today);
	}

	/**
	 * Vérifie si le fruit est périmé.
	 *@param dateVerification Date de vérification
	 *@return True si la date de vérification est postérieure 
	 *			   à la Date Limite de Consommation (DLC) du produit
	 */
	@Override
	public boolean isExpired(LocalDate dateVerification) {
		return dateVerification.isAfter(calculateExpirationDate());
	}

	/**
	 * Calcule le nombre de jours restants avant la DLC.
	 * @param dateVerification Date de vérification
	 * @return le nombre de jours avant DLC
	 */
	@Override
	public long daysRemainingBeforeExpiration(LocalDate dateVerification) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 *Calcule la date d'expiration du fruit.
	 *@return La date limite de consommation (DLC)
	 */
	@Override
	public LocalDate calculateExpirationDate() {
		return getPickingDate().plusDays(getShelfLifeDays());
	}



}
