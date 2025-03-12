import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("--------------------------------------2.1 Exercice 1: Collections---------------------------- \n" + "2.1.1 ArrayList" );

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i); 
        }

        List<Integer> evenNumbers = ListOperations.filterEvenNumbers(numbers);

        System.out.println("Nombres pairs : " + evenNumbers);
        

        System.out.println("\n2.1.2 HashMap"  );


        String text = "Interface\n" +
                        "• \"Classe virtuelle pure\"\n" + 
                        "◦ Pas de code\n" + 
                        "◦ Pas de variable/attribut\n" + 
                        "◦ \"Constantes\" autorisées (static final)\n" + 
                        "• Toutes les méthodes sont abstract par défaut\n" + 
                        "• Réponse à l’héritage multiple\n" + 
                        "• Instancier une classe ? Implémenter toutes les méthodes des\n" + 
                        "interfaces qu’elle utilise\n" + 
                        "• Polymorphisme : la classe est du type de l’interface qu’elle\n" + 
                        "implémente";
        
        HashMap<String, Integer> wordCounts = WordCounter.countWords(text);
        
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }



        //--------------------------------------------------
        System.out.println("-------------------------------------- 2.2 Exercice 2: Exceptions ----------------------------------------------- \n"  );
 
        // Test de division normale
        try {
            System.out.println("10 / 2 = " + Calculator.divide(10, 2));
        } catch (ArithmeticException | NegativeNumberException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        // Test de division par zéro
        try {
            System.out.println("10 / 0 = " + Calculator.divide(10, 0));
        } catch (ArithmeticException | NegativeNumberException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        // Test de nombre négatif
        try {
            System.out.println("-5 / 2 = " + Calculator.divide(-5, 2));
        } catch (ArithmeticException | NegativeNumberException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        // Test de nombre négatif
        try {
            System.out.println("5 / -2 = " + Calculator.divide(5, -2));
        } catch (ArithmeticException | NegativeNumberException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
        
    }
}