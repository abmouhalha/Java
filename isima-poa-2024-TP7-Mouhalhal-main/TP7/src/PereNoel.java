public class PereNoel {
    // Déclaration de la variable statique pour compter les instances
    private static int count = 0;  // <-- Assurez-vous que cette ligne est présente

    // Numéro de série unique pour chaque instance
    private int serialNumber;

    // Constructeur
    public PereNoel() {
        this.serialNumber = ++count;  // Incrémente et assigne le numéro de série
    }

    // Méthode pour obtenir le numéro de série
    public int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "PereNoel #" + serialNumber;
    }
}

