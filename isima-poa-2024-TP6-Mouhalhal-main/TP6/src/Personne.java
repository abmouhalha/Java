
public class Personne {
    private String nom;
    protected int age;
    public String adresse;

    // Constructeur
    public Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    // Méthodes publiques
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthodes protégées
    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    // Méthodes publiques
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode d'affichage des détails
    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
        System.out.println("Adresse: " + adresse);
    }
}
