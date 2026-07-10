public class Main {

    public static void main(String[] args) {

        Cercle cercle = new Cercle("Cercle1", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle1", 4.0, 6.0);

        Figure[] figures = { cercle, rectangle };

        for (Figure f : figures) {
            f.afficherDetails();
        }
    }
}
