public class Livre implements Empruntable {

    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.emprunte = false;
    }

    @Override
    public void emprunter() {
        if (emprunte) {
            System.out.println("Le livre \"" + titre + "\" est deja emprunte.");
        } else {
            emprunte = true;
            System.out.println("Le livre \"" + titre + "\" a ete emprunte.");
        }
    }

    @Override
    public void retourner() {
        if (!emprunte) {
            System.out.println("Le livre \"" + titre + "\" n'etait pas emprunte.");
        } else {
            emprunte = false;
            System.out.println("Le livre \"" + titre + "\" a ete retourne.");
        }
    }

    @Override
    public String toString() {
        return "Livre[titre=" + titre + ", auteur=" + auteur + ", emprunte=" + emprunte + "]";
    }
}
