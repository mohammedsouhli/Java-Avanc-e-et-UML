public class CompteEpargne extends CompteBancaire {

    private double tauxInteret;

    public CompteEpargne(String numeroCompte, double solde, String titulaire, double tauxInteret) {
        super(numeroCompte, solde, titulaire);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void appliquerInterets() {
        double interets = getSolde() * tauxInteret / 100;
        setSolde(getSolde() + interets);
    }
}
