public class Auteur extends Personne {

    private int numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    public int getNumAuteur() {
        return numAuteur;
    }

    @Override
    public String toString() {
        return super.toString() + ", NumAuteur: " + numAuteur;
    }
}
