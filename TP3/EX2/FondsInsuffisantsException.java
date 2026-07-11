public class FondsInsuffisantsException extends Exception {

    public FondsInsuffisantsException(String numeroCompte, double montant) {
        super("Fonds insuffisants sur le compte " + numeroCompte + " pour retirer " + montant + " DH");
    }
}
