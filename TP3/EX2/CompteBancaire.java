public class CompteBancaire {

    private String numeroCompte;
    private double solde;
    private String titulaire;

    public CompteBancaire(String numeroCompte, double solde, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.titulaire = titulaire;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    protected void setSolde(double solde) {
        this.solde = solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void depot(double montant) {
        solde += montant;
    }

    public void retrait(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException(numeroCompte, montant);
        }
        solde -= montant;
    }

    public void afficherSolde() {
        System.out.printf("Compte %s (%s) - Solde: %.2f DH%n", numeroCompte, titulaire, solde);
    }

    public void transfert(CompteBancaire destinataire, double montant)
            throws FondsInsuffisantsException, CompteInexistantException {
        if (destinataire == null) {
            throw new CompteInexistantException("destinataire inconnu");
        }
        this.retrait(montant);
        destinataire.depot(montant);
    }
}
