public class Utilisateur {

    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void emprunterObjet(Empruntable objet) {
        System.out.print(nom + " emprunte -> ");
        objet.emprunter();
    }

    public void retournerObjet(Empruntable objet) {
        System.out.print(nom + " retourne -> ");
        objet.retourner();
    }
}
