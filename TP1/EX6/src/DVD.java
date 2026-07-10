public class DVD implements Empruntable {

    private String titre;
    private String realisateur;
    private boolean emprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.emprunte = false;
    }

    @Override
    public void emprunter() {
        if (emprunte) {
            System.out.println("Le DVD \"" + titre + "\" est deja emprunte.");
        } else {
            emprunte = true;
            System.out.println("Le DVD \"" + titre + "\" a ete emprunte.");
        }
    }

    @Override
    public void retourner() {
        if (!emprunte) {
            System.out.println("Le DVD \"" + titre + "\" n'etait pas emprunte.");
        } else {
            emprunte = false;
            System.out.println("Le DVD \"" + titre + "\" a ete retourne.");
        }
    }

    @Override
    public String toString() {
        return "DVD[titre=" + titre + ", realisateur=" + realisateur + ", emprunte=" + emprunte + "]";
    }
}
