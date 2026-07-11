public class TestEntierNaturel {

    public static void main(String[] args) {

        try {
            EntierNaturel n = new EntierNaturel(3);
            System.out.println("Valeur initiale: " + n.getVal());

            n.decrementer();
            System.out.println("Apres decrementer: " + n.getVal());

            n.setVal(10);
            System.out.println("Apres setVal(10): " + n.getVal());

            n.decrementer();
            n.decrementer();
            n.decrementer();
            System.out.println("Apres 3 decrementer: " + n.getVal());

        } catch (NombreNegatifException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\n--- Test constructeur avec valeur negative ---");
        try {
            EntierNaturel invalide = new EntierNaturel(-5);
        } catch (NombreNegatifException e) {
            System.out.println("Exception capturee: " + e.getMessage());
            System.out.println("Valeur erronee: " + e.getValeurErronee());
        }

        System.out.println("\n--- Test setVal avec valeur negative ---");
        try {
            EntierNaturel n2 = new EntierNaturel(1);
            n2.setVal(-7);
        } catch (NombreNegatifException e) {
            System.out.println("Exception capturee: " + e.getMessage());
            System.out.println("Valeur erronee: " + e.getValeurErronee());
        }

        System.out.println("\n--- Test decrementer sous zero ---");
        try {
            EntierNaturel n3 = new EntierNaturel(0);
            n3.decrementer();
        } catch (NombreNegatifException e) {
            System.out.println("Exception capturee: " + e.getMessage());
            System.out.println("Valeur erronee: " + e.getValeurErronee());
        }
    }
}
