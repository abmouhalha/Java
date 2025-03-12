public class Producteur extends Thread {
    private Stock stock;

    public Producteur(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        while (true) {
            PereNoel pereNoel = new PereNoel();
            synchronized (stock) {
                while (!stock.ajouterPereNoel(pereNoel)) {
                    try {
                        stock.wait(); // Attente si stock plein
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Producteur a ajouté : " + pereNoel);
            }
            try {
                Thread.sleep(2000); // Pause de 2 secondes
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
