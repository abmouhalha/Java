import java.util.Random;

public class Consommateur extends Thread {
    private Stock stock;
    private Random rand = new Random();

    public Consommateur(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        while (true) {
            int quantity = rand.nextInt(5) + 1; // Entre 1 et 5
            synchronized (stock) {
                PereNoel[] pereNoels = stock.retirerPereNoel(quantity);
                for (PereNoel pereNoel : pereNoels) {
                    System.out.println("Consommateur a acheté : " + pereNoel);
                }
            }
            try {
                Thread.sleep(1000); // Pause de 1 seconde
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
