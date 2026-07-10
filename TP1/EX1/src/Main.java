public class Main {

    public static void main(String[] args) {

        Adherent adherent = new Adherent("Alami", "Sara", "sara.alami@mail.com", "0611223344", 22, 1001);

        Auteur auteur = new Auteur("Bousselham", "Abdelmajid", "a.bousselham@mail.com", "0655667788", 45, 501);
        Livre livre = new Livre(756873, "Programmation Orientee Objet en Java", auteur);

        System.out.println("--- Adherent ---");
        System.out.println(adherent);

        System.out.println("\n--- Livre ---");
        System.out.println(livre);
    }
}
