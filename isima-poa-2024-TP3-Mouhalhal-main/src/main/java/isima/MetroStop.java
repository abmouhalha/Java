package isima;

public class MetroStop {
    private int id;
    private double longitude;
    private double latitude;
    private String nom;
    private String arrondissement;
    private String type;

    public MetroStop(int id, double longitude, double latitude, String nom, String arrondissement, String type) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.nom = nom;
        this.arrondissement = arrondissement;
        this.type = type;
    }

    // Getters
    public int getId() { return id; }
    public double getLongitude() { return longitude; }
    public double getLatitude() { return latitude; }
    public String getNom() { return nom; }
    public String getArrondissement() { return arrondissement; }
    public String getType() { return type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MetroStop)) return false;
        MetroStop that = (MetroStop) o;
        return id == that.id &&
                Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.latitude, latitude) == 0 &&
                nom.equals(that.nom) &&
                arrondissement.equals(that.arrondissement) &&
                type.equals(that.type);
    }

    @Override
    public String toString() {
        return "MetroStop{id=" + id + ", nom='" + nom + "', arrondissement='" + arrondissement +
                "', type='" + type + "', longitude=" + longitude + ", latitude=" + latitude + "}";
    }
}
