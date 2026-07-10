public class Livre {

    private int isbn;
    private String titre;
    private Auteur auteur;

    public Livre(int isbn, String titre, Auteur auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", Titre: " + titre + ", Auteur: [" + auteur + "]";
    }
}
