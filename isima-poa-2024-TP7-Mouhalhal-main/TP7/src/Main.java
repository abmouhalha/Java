public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();

        // Lancer n producteurs et m consommateurs
        int n = 3; // Nombre de producteurs
        int m = 5; // Nombre de consommateurs

        for (int i = 0; i < n; i++) {
            new Producteur(stock).start();
        }

        for (int i = 0; i < m; i++) {
            new Consommateur(stock).start();
        }
    }
}
