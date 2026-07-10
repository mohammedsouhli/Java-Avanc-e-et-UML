import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        IMetier<Produit> metier = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);

        metier.add(new Produit(1, "Clavier mecanique", "Logitech", 450.0, "Clavier RGB", 15));
        metier.add(new Produit(2, "Souris sans fil", "Razer", 250.0, "Souris ergonomique", 30));

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par id");
            System.out.println("3. Ajouter un nouveau produit");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter");
            System.out.print("Votre choix: ");

            int choix = Integer.parseInt(sc.nextLine().trim());

            switch (choix) {
                case 1:
                    System.out.println("\n--- Liste des produits ---");
                    for (Produit p : metier.getAll()) {
                        System.out.println(p);
                    }
                    break;

                case 2:
                    System.out.print("ID a rechercher: ");
                    long idRecherche = Long.parseLong(sc.nextLine().trim());
                    Produit trouve = metier.findById(idRecherche);
                    System.out.println(trouve != null ? trouve : "Aucun produit trouve avec l'id " + idRecherche);
                    break;

                case 3:
                    System.out.print("ID: ");
                    long id = Long.parseLong(sc.nextLine().trim());
                    System.out.print("Nom: ");
                    String nom = sc.nextLine();
                    System.out.print("Marque: ");
                    String marque = sc.nextLine();
                    System.out.print("Prix: ");
                    double prix = Double.parseDouble(sc.nextLine().trim());
                    System.out.print("Description: ");
                    String description = sc.nextLine();
                    System.out.print("Stock: ");
                    int stock = Integer.parseInt(sc.nextLine().trim());

                    metier.add(new Produit(id, nom, marque, prix, description, stock));
                    System.out.println("Produit ajoute avec succes.");
                    break;

                case 4:
                    System.out.print("ID a supprimer: ");
                    long idSuppr = Long.parseLong(sc.nextLine().trim());
                    if (metier.findById(idSuppr) != null) {
                        metier.delete(idSuppr);
                        System.out.println("Produit supprime avec succes.");
                    } else {
                        System.out.println("Aucun produit trouve avec l'id " + idSuppr);
                    }
                    break;

                case 5:
                    continuer = false;
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Choix invalide, reessayez.");
            }
        }

        sc.close();
    }
}
