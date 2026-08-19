package market;

import java.time.LocalDate;

/**
 * Définit les comportements liés à la maturité
 * et à la péremption d'un produit.
 */
public interface Consumable {
	
	/**
	 * Indique si le produit est à maturité idéale.
	 * 
	 * @return true si le produit est mûr, false sinon
	 */
	public boolean isRipe();
	
	
	/**
	 * Indique si le produit est périmé à une date donnée.
	 * 
	 * @param dateVerification date à laquelle vérifier la péremption
	 * @return true si le produit est périmé, false sinon
	 */
	public boolean isExpired(LocalDate dateVerification);
	
	
	/**
	 * Calcule le nombre de jours restants avant la date de péremption.
	 * 
	 * @param dateVerification date à partir de laquelle effectuer le calcul
	 * @return nombre de jours restants avant la péremption
	 */
	public long daysRemainingBeforeExpiration(LocalDate dateVerification);
}
