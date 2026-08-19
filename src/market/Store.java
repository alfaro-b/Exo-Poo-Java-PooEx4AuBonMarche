package market;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Représente le magasin du primeur.
 *
 * Le magasin gère les produits disponibles, les clients ainsi que les opérations de vente.
 */
public class Store {


	// =========================
	// ATTRIBUTS
	// =========================
	
	private ArrayList<Product> products;
	private ArrayList<Customer> customers;
	
	
	// =========================
	// CONSTRUCTEUR
	// =========================
	
	/**
	 * Crée un magasin avec son stock initial de produits.
	 *
	 * La liste des clients est initialisée vide.
	 *
	 * @param products produits disponibles dans le magasin
	 */
	public Store(ArrayList<Product> products) {
		this.products = products;
		this.customers = new ArrayList<>();
	}
	
	// =========================
	// ACCESSEURS
	// =========================
	
	public ArrayList<Product> getProducts() {
		return products;
	}


	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}


	public ArrayList<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	// =========================
	// MÉTHODES
	// =========================
	
	
	/**
	 * Recherche un produit à partir de son nom.
	 * 
	 * @param productName nom du produit recherché
	 * @return le produit correspondant ou null s'il n'existe pas
	 */
	public Product searchProduct(String productName) {
		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(productName)) {
				return product;
			}
		}
		return null;
	}
	
	/**
	 * Affiche les produits du magasin
	 */
	public void displayProducts() {
		for (Product product : products) {
			System.out.println(product);
		}
	}
	
	/**
	 * Crée un client et l'ajoute à la liste des clients du magasin.
	 *
	 * @param firstName prénom du client
	 * @param lastName nom du client
	 * @return le client créé
	 */
	public Customer createCustomer(String firstName, String lastName) {
		Customer customer = new Customer(firstName, lastName);
		customers.add(customer);
		return customer;
	}
	
	/**
	 * Vend un produit à un client.
	 *
	 * Affiche les produits, demande le produit et la quantité,
	 * vérifie le stock, met à jour celui-ci et ajoute le produit
	 * au panier du client.
	 *
	 * @param customer client qui effectue l'achat
	 * @param scanner scanner utilisé pour les saisies utilisateur
	 */
	public void sellProduct(Customer customer, Scanner scanner) {

		displayProducts();

		System.out.print("\nSaisissez le nom du produit que vous souhaitez acheter : ");
		String productName = scanner.nextLine();

		// Recherche du produit demandé par le client
		Product product = searchProduct(productName);

		// Vérifie si le produit existe
		if (product == null) {
			System.out.println("Veuillez choisir un produit disponible.");
			return;
		}

		System.out.print("Quelle quantité de " + product.getName()
				+ " souhaitez-vous acheter ? ");

		double quantity = Double.parseDouble(scanner.nextLine());

		// Vérifie que la quantité saisie est valide
		if (quantity <= 0) {
			System.out.println("La quantité doit être supérieure à zéro.");
			return;
		}

		// Vérifie que le stock est suffisant
		if (quantity > product.getStockQuantity()) {
			System.out.println(
					"Il ne reste pas assez de " + product.getName()
					+ ". Stock disponible : "
					+ product.getStockQuantity() + " "
					+ product.getUnite() + ".");
			return;
		}

		// Met à jour le stock
		product.updateStock(quantity);

		// Ajoute le produit au panier du client
		customer.getCart().addProduct(product, quantity);
	}
	
	public void dailyReport() {
		// TO DO
	}
	
}
