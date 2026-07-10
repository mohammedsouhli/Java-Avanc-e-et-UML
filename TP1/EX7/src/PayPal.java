public class PayPal extends Paiement {

    private String email;

    public PayPal(String numeroTransaction, String email) {
        super(numeroTransaction);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        this.montant = montant;
        System.out.println("Paiement de " + montant + " DH effectue via PayPal (" + email
                + ") (transaction " + numeroTransaction + ").");
    }
}
