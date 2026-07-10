public class GestionBibliotheque {

    public static void main(String[] args) {

        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupery");
        Livre livre2 = new Livre("1984", "George Orwell");
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");

        Utilisateur user1 = new Utilisateur("Karim");
        Utilisateur user2 = new Utilisateur("Sara");

        user1.emprunterObjet(livre1);
        user1.emprunterObjet(dvd1);
        user2.emprunterObjet(livre2);

        user2.emprunterObjet(livre1);

        user1.retournerObjet(livre1);
        user2.emprunterObjet(livre1);
    }
}
