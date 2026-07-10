public class Personne {

    private String nom;
    private String prenom;
    private String email;
    private String tel;
    private int age;

    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prenom: " + prenom + ", Email: " + email +
                ", Tel: " + tel + ", Age: " + age;
    }
}
