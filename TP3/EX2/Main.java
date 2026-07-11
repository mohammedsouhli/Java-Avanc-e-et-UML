import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<CompteBancaire> comptes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        comptes.add(new CompteCourant("C001", 1000.0, "Alami Sara", 500.0));
        comptes.add(new CompteEpargne("E001", 2000.0, "Bennani Karim", 3.5));

        boolean continuer = true;

        while (continuer) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Ajouter un compte");
            System.out.println("2. Supprimer un compte");
            System.out.println("3. Depot");
            System.out.println("4. Retrait");
            System.out.println("5. Transfert");
            System.out.println("6. Afficher tous les comptes");
            System.out.println("7. Appliquer les interets (compte epargne)");
            System.out.println("8. Quitter");
            System.out.print("Votre choix: ");

            int choix = Integer.parseInt(sc.nextLine().trim());

            switch (choix) {
                case 1: {
                    System.out.print("Numero de compte: ");
                    String numero = sc.nextLine();
                    System.out.print("Titulaire: ");
                    String titulaire = sc.nextLine();
                    System.out.print("Solde initial: ");
                    double solde = Double.parseDouble(sc.nextLine().trim());
                    System.out.print("Type (1=Courant, 2=Epargne): ");
                    int type = Integer.parseInt(sc.nextLine().trim());

                    if (type == 1) {
                        System.out.print("Decouvert autorise: ");
                        double decouvert = Double.parseDouble(sc.nextLine().trim());
                        comptes.add(new CompteCourant(numero, solde, titulaire, decouvert));
                    } else {
                        System.out.print("Taux d'interet (%): ");
                        double taux = Double.parseDouble(sc.nextLine().trim());
                        comptes.add(new CompteEpargne(numero, solde, titulaire, taux));
                    }
                    System.out.println("Compte cree avec succes.");
                    break;
                }

                case 2: {
                    System.out.print("Numero du compte a supprimer: ");
                    String numero = sc.nextLine();
                    CompteBancaire c = trouverCompte(comptes, numero);
                    if (c != null) {
                        comptes.remove(c);
                        System.out.println("Compte supprime.");
                    } else {
                        System.out.println("Compte inexistant: " + numero);
                    }
                    break;
                }

                case 3: {
                    System.out.print("Numero du compte: ");
                    String numero = sc.nextLine();
                    CompteBancaire c = trouverCompte(comptes, numero);
                    if (c != null) {
                        System.out.print("Montant a deposer: ");
                        double montant = Double.parseDouble(sc.nextLine().trim());
                        c.depot(montant);
                        System.out.println("Depot effectue.");
                    } else {
                        System.out.println("Compte inexistant: " + numero);
                    }
                    break;
                }

                case 4: {
                    System.out.print("Numero du compte: ");
                    String numero = sc.nextLine();
                    CompteBancaire c = trouverCompte(comptes, numero);
                    if (c != null) {
                        System.out.print("Montant a retirer: ");
                        double montant = Double.parseDouble(sc.nextLine().trim());
                        try {
                            c.retrait(montant);
                            System.out.println("Retrait effectue.");
                        } catch (FondsInsuffisantsException e) {
                            System.out.println("Erreur: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Compte inexistant: " + numero);
                    }
                    break;
                }

                case 5: {
                    System.out.print("Numero du compte source: ");
                    String numSource = sc.nextLine();
                    System.out.print("Numero du compte destinataire: ");
                    String numDest = sc.nextLine();
                    System.out.print("Montant du transfert: ");
                    double montant = Double.parseDouble(sc.nextLine().trim());

                    try {
                        CompteBancaire source = trouverCompte(comptes, numSource);
                        CompteBancaire dest = trouverCompte(comptes, numDest);
                        if (source == null) {
                            throw new CompteInexistantException(numSource);
                        }
                        if (dest == null) {
                            throw new CompteInexistantException(numDest);
                        }
                        source.transfert(dest, montant);
                        System.out.println("Transfert effectue.");
                    } catch (FondsInsuffisantsException | CompteInexistantException e) {
                        System.out.println("Erreur: " + e.getMessage());
                    }
                    break;
                }

                case 6:
                    System.out.println("\n--- Liste des comptes ---");
                    for (CompteBancaire c : comptes) {
                        c.afficherSolde();
                    }
                    break;

                case 7: {
                    System.out.print("Numero du compte epargne: ");
                    String numero = sc.nextLine();
                    CompteBancaire c = trouverCompte(comptes, numero);
                    if (c instanceof CompteEpargne) {
                        ((CompteEpargne) c).appliquerInterets();
                        System.out.println("Interets appliques.");
                    } else if (c == null) {
                        System.out.println("Compte inexistant: " + numero);
                    } else {
                        System.out.println("Ce n'est pas un compte epargne.");
                    }
                    break;
                }

                case 8:
                    continuer = false;
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Choix invalide, reessayez.");
            }
        }

        sc.close();
    }

    private static CompteBancaire trouverCompte(ArrayList<CompteBancaire> comptes, String numero) {
        for (CompteBancaire c : comptes) {
            if (c.getNumeroCompte().equals(numero)) {
                return c;
            }
        }
        return null;
    }
}
