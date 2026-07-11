public class CompteInexistantException extends Exception {

    public CompteInexistantException(String numeroCompte) {
        super("Le compte " + numeroCompte + " n'existe pas");
    }
}
