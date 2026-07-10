public class CarteCredit extends Paiement {

    private String numeroCarte;

    public CarteCredit(String numeroTransaction, String numeroCarte) {
        super(numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        this.montant = montant;
        System.out.println("Paiement de " + montant + " DH effectue par Carte Credit n. " + numeroCarte
                + " (transaction " + numeroTransaction + ").");
    }
}
