package market;

import java.util.ArrayList;

/**
 * Classe pricipale permettant de tester le fonctionnement du marché.
 */
public class TestMarket {

	/**
	 * Crée le stock du primeur et affiche les produits disponibles.
	 *
	 * @param args arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		
		// Crée la liste des produits
		ArrayList<Product> products = MarketData.createProducts();
		
		// Affiche tous les produits du primeur
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
