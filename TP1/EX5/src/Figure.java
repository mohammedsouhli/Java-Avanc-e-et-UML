public abstract class Figure {

    protected String nom;

    public Figure(String nom) {
        this.nom = nom;
    }

    public abstract double calculerAire();

    public abstract double calculerPerimetre();

    public void afficherDetails() {
        System.out.println("Figure: " + nom + ", Aire: " + calculerAire() + ", Perimetre: " + calculerPerimetre());
    }
}
