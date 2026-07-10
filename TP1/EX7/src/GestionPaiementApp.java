public class GestionPaiementApp {

    public static void main(String[] args) {

        CarteCredit carteCredit = new CarteCredit("TXN001", "4532-XXXX-XXXX-7890");
        PayPal payPal = new PayPal("TXN002", "client@mail.com");

        Commande commande1 = new Commande(250.0, carteCredit);
        Commande commande2 = new Commande(89.5, payPal);

        Commande[] commandes = { commande1, commande2 };

        for (Commande commande : commandes) {
            commande.processPayment();
        }
    }
}
