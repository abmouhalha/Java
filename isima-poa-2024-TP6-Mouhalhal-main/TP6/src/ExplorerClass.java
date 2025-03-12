import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExplorerClass {
    public static void main(String[] args) {
        Class<Personne> personneClass = Personne.class;

        // Nom de la classe
        System.out.println("Nom de la classe : " + personneClass.getName());

        // Attributs
        System.out.println("Attributs : ");
        Field[] fields = personneClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Nom : " + field.getName() + ", Type : " + field.getType().getSimpleName());
        }

        // Méthodes
        System.out.println("Méthodes : ");
        Method[] methods = personneClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Nom : " + method.getName() + ", Retour : " + method.getReturnType().getSimpleName());
        }
    }
}

