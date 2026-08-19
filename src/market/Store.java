package market;

import java.util.ArrayList;

public class Store {


	// =========================
	// ATTRIBUTS
	// =========================
	
	private ArrayList<Product> products;
	private ArrayList<Customer> customers;
	
	
	// =========================
	// CONSTRUCTEUR
	// =========================
	
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
	
	private void searchProduct(String productName) {
		
	}
	
	public void displayProducts() {
		
	}
	
	private void createCustomer(String firstName, String lastName) {
		
	}
	private void sellProduct(Customer customer, Product product, double quantity) {
		
	}
	
	private void dailyReport() {
		
	}
	
}
