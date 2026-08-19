package market;

/**
 * Représente une ligne du panier d'un client.
 * 
 * Une ligne contient un produit et la quantité achetée.
 */
public class CartItem {

	// =========================
	// ATTRIBUTS
	// =========================
	
	private Product product;
	private double quantity;
	
	// =========================
	// CONSTRUCTEUR
	// =========================
	
	/**
	 * Crée une ligne de panier pour un produit et une quantité donnée.
	 *
	 * @param product  produit ajouté au panier
	 * @param quantity quantité achetée
	 */
	public CartItem(Product product, double quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	// =========================
	// ACCESSEURS
	// =========================
	
	public Product getProduct() {
		return product;
	}
	
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	
	// =========================
	// MÉTHODES
	// =========================
	
	/**
	 * Calcule le sous-total de la ligne du panier.
	 *
	 * @return le prix du produit multiplié par la quantité achetée
	 */
	public double calculateSubtotal() {
		return product.getUnitPrice() * quantity ;
	}
}
