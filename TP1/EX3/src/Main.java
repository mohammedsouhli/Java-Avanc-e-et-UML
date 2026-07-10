public class Main {

    public static void main(String[] args) {

        Voiture voiture = new Voiture("Clio", 150000, "RS", 2023);
        Moto moto = new Moto("Ninja", 80000, "Kawasaki", 100);
        Avion avion = new Avion("A320", 90000000, "Royal Air Maroc", 900);

        Vehicule[] vehicules = { voiture, moto, avion };

        for (Vehicule v : vehicules) {
            v.emettreSon();
            v.afficherInformations();
            System.out.println();
        }
    }
}
