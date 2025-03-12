package isima;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parser parser = null;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== Menu ===");
            System.out.println("1. Charger les arrêts de métro depuis un fichier");
            System.out.println("2. Afficher les arrêts de métro");
            System.out.println("3. Trier les arrêts de métro par ID");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Entrez le chemin du fichier: ");
                    String filePath = scanner.next();
                    parser = new Parser(filePath);
                    try {
                        parser.parse();
                        System.out.println("Arrêts de métro chargés avec succès.");
                    } catch (Exception e) {
                        System.out.println("Erreur lors du chargement du fichier: " + e.getMessage());
                    }
                    break;
                case 2:
                    if (parser != null && !parser.getListMetroStop().isEmpty()) {
                        System.out.println("Liste des arrêts de métro :");
                        for (MetroStop stop : parser.getListMetroStop()) {
                            System.out.println(stop);
                        }
                    } else {
                        System.out.println("Aucun arrêt de métro à afficher.");
                    }
                    break;
                case 3:
                    if (parser != null) {
                        parser.sortMetroStopsById();
                        System.out.println("Arrêts de métro triés par ID.");
                    } else {
                        System.out.println("Veuillez d'abord charger les arrêts de métro.");
                    }
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
                    break;

            }
        }
    }
}
