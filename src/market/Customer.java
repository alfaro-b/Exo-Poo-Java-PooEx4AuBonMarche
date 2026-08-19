package market;

/**
 * Représente un client
 */
public class Customer {

	// =========================
	// ATTRIBUTS
	// =========================

	private String firstName;
	private String lastName;
	private Cart cart;

	// =========================
	// CONSTRUCTEUR
	// =========================

	/**
	 * Crée un client avec son prénom, son nom et son panier vide.
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cart = new Cart();
	}

	// =========================
	// ACCESSEURS
	// =========================
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	// =========================
	// MÉTHODES
	// =========================
	
	
	/**
	 * Permet d'obtenir le nom complet du client.
	 * @return le prénom et le nom du client
	 */
	public String getFullName() {
		return firstName + " " + lastName; 
	}
	

}
