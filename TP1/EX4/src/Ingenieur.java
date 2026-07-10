public class Ingenieur extends Employe {

    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    @Override
    public double calculerSalaire() {
        return getSalaire() * 1.15;
    }
}
