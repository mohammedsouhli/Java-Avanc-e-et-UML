public class Main {

    public static void main(String[] args) {

        Ingenieur ingenieur = new Ingenieur("Amrani", "Youssef", "y.amrani@mail.com", "0611112222", 8000, "Genie Logiciel");
        Manager manager = new Manager("Bennani", "Fatima", "f.bennani@mail.com", "0633334444", 12000, "Developpement");

        System.out.println("--- Ingenieur ---");
        System.out.println("Nom: " + ingenieur.getNom() + ", Prenom: " + ingenieur.getPrenom());
        System.out.println("Salaire calcule: " + ingenieur.calculerSalaire() + " DH");
        System.out.println("Specialite: " + ingenieur.getSpecialite());

        System.out.println("\n--- Manager ---");
        System.out.println("Nom: " + manager.getNom() + ", Prenom: " + manager.getPrenom());
        System.out.println("Salaire calcule: " + manager.calculerSalaire() + " DH");
        System.out.println("Service: " + manager.getService());
    }
}
