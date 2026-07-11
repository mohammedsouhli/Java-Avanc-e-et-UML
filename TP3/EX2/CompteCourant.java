public class CompteCourant extends CompteBancaire {

    private double decouvertAutorise;

    public CompteCourant(String numeroCompte, double solde, String titulaire, double decouvertAutorise) {
        super(numeroCompte, solde, titulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant > getSolde() + decouvertAutorise) {
            throw new FondsInsuffisantsException(getNumeroCompte(), montant);
        }
        setSolde(getSolde() - montant);
    }
}
