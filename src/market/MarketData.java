package market;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Contient les données initiales du stock du primeur.
 */
public class MarketData {

	/**
	 * Crée le stock initial du primeur au début du mois de janvier 2025.
	 * 
	 * @return La liste des produits disponibles
	 */
	public static ArrayList<Product> createProducts() {
		
		ArrayList<Product> products = new ArrayList<>();

		// =========================
		// FRUITS
		// =========================

		products.add(new Fruit("Clémentine", 2.90, "kg", 6, LocalDate.of(2024, 12, 28), 14));

		products.add(new Fruit("Datte", 7.00, "kg", 4, LocalDate.of(2024, 12, 20), 30));

		products.add(new Fruit("Grenade", 3.50, "kg", 3, LocalDate.of(2024, 12, 20), 30));

		products.add(new Fruit("Kaki", 4.50, "kg", 3, LocalDate.of(2024, 12, 27), 10));

		products.add(new Fruit("Kiwi", 3.50, "kg", 5, LocalDate.of(2024, 12, 20), 21));

		products.add(new Fruit("Mandarine", 2.80, "kg", 6, LocalDate.of(2024, 12, 29), 12));

		products.add(new Fruit("Orange", 1.50, "kg", 8, LocalDate.of(2024, 12, 25), 21));

		products.add(new Fruit("Pamplemousse", 2.00, "pièce", 8, LocalDate.of(2024, 12, 26), 21));

		products.add(new Fruit("Poire", 2.50, "kg", 5, LocalDate.of(2024, 12, 28), 10));

		products.add(new Fruit("Pomme", 1.50, "kg", 8, LocalDate.of(2024, 12, 20), 30));

		// =========================
		// LÉGUMES
		// =========================

		products.add(new Vegetable("Carotte", 1.30, "kg", 7, LocalDate.of(2024, 12, 28), 14));

		products.add(new Vegetable("Choux de Bruxelles", 4.00, "kg", 4, LocalDate.of(2024, 12, 29), 7));

		products.add(new Vegetable("Chou vert", 2.50, "pièce", 12, LocalDate.of(2024, 12, 27), 14));

		products.add(new Vegetable("Courge butternut", 2.50, "pièce", 6, LocalDate.of(2024, 12, 15), 45));

		products.add(new Vegetable("Endive", 2.50, "kg", 5, LocalDate.of(2024, 12, 29), 7));

		products.add(new Vegetable("Épinard", 2.60, "kg", 4, LocalDate.of(2024, 12, 30), 5));

		products.add(new Vegetable("Poireau", 1.20, "kg", 5, LocalDate.of(2024, 12, 28), 10));

		products.add(new Vegetable("Potiron", 2.50, "pièce", 6, LocalDate.of(2024, 12, 15), 45));

		products.add(new Vegetable("Radis noir", 5.00, "pièce", 10, LocalDate.of(2024, 12, 28), 14));

		products.add(new Vegetable("Salsifis", 2.50, "kg", 3, LocalDate.of(2024, 12, 27), 14));

		return products;

	}

}
