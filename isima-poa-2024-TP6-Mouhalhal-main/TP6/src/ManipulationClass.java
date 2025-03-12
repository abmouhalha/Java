import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ManipulationClass {
    public static void main(String[] args) {
        try {
            // Création d'une instance de la classe Personne
            Class<?> personneClass = Class.forName("Personne");
            Constructor<?> constructor = personneClass.getConstructor(String.class, int.class, String.class);
            Object personneInstance = constructor.newInstance("Alice", 30, "123 Rue Exemple");

            // Modification des attributs
            Method setNom = personneClass.getMethod("setNom", String.class);
            setNom.invoke(personneInstance, "Bob");

            Method setAge = personneClass.getDeclaredMethod("setAge", int.class);
            setAge.setAccessible(true); // Rendre la méthode accessible
            setAge.invoke(personneInstance, 25);

            Method setAdresse = personneClass.getMethod("setAdresse", String.class);
            setAdresse.invoke(personneInstance, "456 Avenue Exemple");

            // Appel de la méthode afficherDetails
            Method afficherDetails = personneClass.getMethod("afficherDetails");
            afficherDetails.invoke(personneInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
