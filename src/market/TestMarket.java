package market;

import java.util.Scanner;

/**
 * Classe principale permettant de tester le fonctionnement du marché.
 */
public class TestMarket {

	/**
	 * Lance le programme de vente du primeur :
	 * création du magasin et du client, constitution du panier
	 * puis affichage du ticket de caisse.
	 *
	 * @param args arguments de la ligne de commande
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Crée le magasin avec ses produits
		Store store = new Store(MarketData.createProducts());

		// Crée le client
		System.out.println("\nPrénom du client : ");
		String firstName = scanner.nextLine();
		System.out.println("\nNom du client : ");
		String lastName = scanner.nextLine();
		Customer customer = store.createCustomer(firstName, lastName);

		// Vend un  ou plusieurs produits
		String addAProduct = "o";
		while (addAProduct.equals("o")) {
			store.sellProduct(customer, scanner);

			System.out.println("Souhaitez-vous acheter un nouveau produit? o/n");
			addAProduct = scanner.nextLine().toLowerCase();

			while (!addAProduct.equals("o") && !addAProduct.equals("n")) {
				System.out.println("Merci de répondre par 'o' ou 'n'.");
				System.out.println("Souhaitez-vous acheter un nouveau produit? o/n");
				addAProduct = scanner.nextLine().toLowerCase();
			}

		}
		// Affiche le ticket de caisse une fois le panier terminé
		System.out.println("-----Ticket de caisse-----");
		System.out.println(customer.getCart().display());
		
		scanner.close();

	}

}
