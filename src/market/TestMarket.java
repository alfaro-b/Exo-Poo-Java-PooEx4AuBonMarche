package market;

import java.util.Scanner;

/**
 * Classe principale permettant de lancer et tester le fonctionnement du marché.
 */
public class TestMarket {

	/**
	 * Lance le programme principal du primeur.
	 *
	 * Affiche le menu permettant de créer un nouveau client,
	 * de constituer son panier, d'afficher son ticket de caisse,
	 * de consulter le bilan de la journée ou de fermer le magasin.
	 *
	 * @param args arguments de la ligne de commande
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Crée le magasin avec ses produits
		Store store = new Store(MarketData.createProducts());

		String choice = "0";

		while (!choice.equals("3")) {

			System.out.println("\n----- Au bon marché -----");
			System.out.println("1. Nouveau client");
			System.out.println("2. Bilan de la journée");
			System.out.println("3. Quitter (Fermeture du magasin)\n");

			System.out.print("Votre choix : ");
			choice = scanner.nextLine();

			if (choice.equals("1")) {

				// Crée le client
				System.out.print("\nPrénom du client : ");
				String firstName = scanner.nextLine();
				System.out.print("\nNom du client : ");
				String lastName = scanner.nextLine();
				Customer customer = store.createCustomer(firstName, lastName);

				// Vend un ou plusieurs produits
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

			} else if (choice.equals("2")) {

				store.dailyReport();

			} else if (choice.equals("3")) {

				System.out.println("Fermeture du magasin.");

			} else {

				System.out.println("Choix invalide.");
			}
		}
		scanner.close();
	}

}
