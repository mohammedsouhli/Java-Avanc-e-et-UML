public class Vehicule {

    private String nom;
    private double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public void emettreSon() {
        System.out.println("Le vehicule emet un son inconnu.");
    }

    public void afficherInformations() {
        System.out.printf("Nom: %s, Prix: %.2f DH%n", nom, prix);
    }
}
