package market;

import java.util.ArrayList;

/**
 * Représente le panier d'un client
 */
public class Cart {

	// =========================
	// ATTRIBUTS
	// =========================

	private ArrayList<CartItem> items;

	// =========================
	// CONSTRUCTEUR
	// =========================

	/**
	 * Crée un panier vide pour un client.
	 */
	public Cart() {
		this.items = new ArrayList<>();
	}

	// =========================
	// ACCESSEURS
	// =========================

	public ArrayList<CartItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<CartItem> items) {
		this.items = items;
	}

	// =========================
	// MÉTHODES
	// =========================

	/**
	 * Ajoute un produit au panier en créant une nouevlle ligne.
	 *
	 * @param product  Produit ajouté au panier
	 * @param quantity Quantité souhaitée
	 */
	public void addProduct(Product product, double quantity) {
		items.add(new CartItem(product, quantity));
	}
	
	/**
	 * Calcule le total d'un panier
	 * 
	 * @return cartTotal le montant total du panier
	 */
	public double calculateTotal() {
		double cartTotal = 0.0;
		for(CartItem item : items) {
			cartTotal += item.calculateSubtotal();
		}
		return cartTotal;
	}
}
