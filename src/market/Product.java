package market;

import java.time.LocalDate;

/**
 * Représente un produit vendu par le primeur.
 * 
 * Un produit possède un nom, un prix unitaire, une unité de vente,
 * une quantité en stock, une date de récolte et une durée maximale
 * de conservation.
 * 
 * Cette classe est abstraite : chaque type de produit doit définir
 * sa propre méthode de calcul de la date de péremption.
 */
public abstract class Product {

	// =========================
	// ATTRIBUTS
	// =========================

	private String name; 
	private double unitPrice; 
	private String unite; 
	private double stockQuantity; 
	private LocalDate pickingDate;
	private int shelfLifeDays; 

	// =========================
	// CONSTRUCTEUR
	// =========================

	/**
	 * Crée un produit avec ses informations de vente et de conservation.
	 *
	 * @param name Nom du fruit ou légume
	 * @param unitPrice Prix par kg ou par pièce
	 * @param unite L'unité de vente ("kg" ou "pièce")
	 * @param stockQuantity Le stock actuel (en kg ou en nombre de pièces)
	 * @param pickingDate La date à laquelle le produit a été récolté
	 * @param shelfLifeDays La durée maximale de conservation en jours
	 */
	public Product(String name, Double unitPrice, String unite, Double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.unite = unite;
		this.stockQuantity = stockQuantity;
		this.pickingDate = pickingDate;
		this.shelfLifeDays = shelfLifeDays;
	}

	// =========================
	// ACCESSEURS
	// =========================

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public double getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(double stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public LocalDate getPickingDate() {
		return pickingDate;
	}

	public void setPickingDate(LocalDate pickingDate) {
		this.pickingDate = pickingDate;
	}

	public int getShelfLifeDays() {
		return shelfLifeDays;
	}

	public void setShelfLifeDays(int shelfLifeDays) {
		this.shelfLifeDays = shelfLifeDays;
	}

	// =========================
	// MÉTHODES
	// =========================

	/**
	 * Calcule la date limite de consommation du produit.
	 * 
	 * La méthode doit être définie par les classes concrètes héritant Product.
	 *
	 * @return la date de péremption du produit
	 */
	public abstract LocalDate calculateExpirationDate();

	/**
	 * Met à jour le stock après l'achat d'une certaine quantité du produit.
	 *
	 * @param quantity quantité achetée, en kilogrammes ou en nombre de pièces
	 */
	public void updateStock(double quantity) {

		stockQuantity -= quantity;

	};
	
	/**
	 * Retourne les informations du produit.
	 * 
	 * @return les caractéristiques du produit sous forme de chaîne de caractères
	 */
	public String toString() {
		return name + " - " + 
				"Stock disponible : " + stockQuantity + unite + " - " +
				"Prix : " + unitPrice + "€ / " + unite + " - " +
				"Date de récolte : " + pickingDate + " - " +
				"Date limite de consommation : " + calculateExpirationDate();
	}

}
