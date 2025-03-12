import java.util.LinkedList;
import java.util.Queue;

public class Stock {
    private final int capacity = 100;
    private Queue<PereNoel> stock = new LinkedList<>();

    // Ajouter un PereNoel au stock
    public synchronized boolean ajouterPereNoel(PereNoel pereNoel) {
        if (stock.size() >= capacity) {
            return false; // Stock plein
        }
        stock.add(pereNoel);
        notify(); // Réveiller un consommateur en attente
        return true;
    }

    // Retirer entre 1 et 5 PereNoel du stock
    public synchronized PereNoel[] retirerPereNoel(int quantity) {
        while (stock.size() < quantity) {
            try {
                wait(); // Attente si stock insuffisant
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        PereNoel[] removed = new PereNoel[quantity];
        for (int i = 0; i < quantity; i++) {
            removed[i] = stock.poll();
        }
        notify(); // Réveiller un producteur en attente
        return removed;
    }

    public synchronized int getStockSize() {
        return stock.size();
    }
}
