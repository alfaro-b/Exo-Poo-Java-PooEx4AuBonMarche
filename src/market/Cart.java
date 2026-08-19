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
	 * Crée le panier d'un client
	 * 
	 * @param items représente les différentes lignes (produits) du panier d'un
	 *              client
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
	 * @param product  Produit ajoutée au panier
	 * @param quantity Quantité souhaitée
	 */
	public void addProduct(Product product, double quantity) {
		items.add(new CartItem(product, quantity));
	}
}
