public class Commande {

    private double montant;
    private Paiement moyenPaiement;

    public Commande(double montant, Paiement moyenPaiement) {
        this.montant = montant;
        this.moyenPaiement = moyenPaiement;
    }

    public double getMontant() {
        return montant;
    }

    public void processPayment() {
        moyenPaiement.effectuerPaiement(montant);
    }
}
