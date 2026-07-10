public abstract class Paiement {

    protected double montant;
    protected String numeroTransaction;

    public Paiement(String numeroTransaction) {
        this.numeroTransaction = numeroTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public String getNumeroTransaction() {
        return numeroTransaction;
    }

    public abstract void effectuerPaiement(double montant);
}
