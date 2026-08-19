package market;

import java.time.LocalDate;

public abstract class Product {

	// =========================
	// ATTRIBUTS
	// =========================

	private String name; //  Nom du fruit ou légume.
	private Double unitPrice; // Prix par kg ou par pièce
	private String unite; // L'unité de vente ("kg" ou "pièce")
	private Double stockQuantity; // Le stock actuel (en kg ou en nombre de pièces)
	private LocalDate pickingDate; // La date à laquelle le produit a été récolté
	private int shelfLifeDays; // La durée maximale de conservation en jours

	// =========================
	// CONSTRUCTEURS
	// =========================

	public Product(String name, Double unitPrice, String unite, Double stockQuantity, LocalDate pickingDate,
			int shelfLifeDays) {
		super();
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

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public Double getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Double stockQuantity) {
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
	 * Méthode abstraite .
	 */
	public abstract LocalDate calculateExpirationDate();

	/**
	 * Met à jour le stock après un achat
	 */
	public Double updateStock() {

		return stockQuantity;

	};

}
