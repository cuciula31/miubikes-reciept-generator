package objekte;

public class Produkt {

    private int id;
    private String produktName;
    private String maßeinheit;
    private int menge;
    private double preis;

    public Produkt(String produktName, String maßeinheit, int menge, double preis) {
        this.produktName = produktName;
        this.maßeinheit = maßeinheit;
        this.menge = menge;
        this.preis = preis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduktName() {
        return produktName;
    }

    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }

    public String getMaßeinheit() {
        return maßeinheit;
    }

    public void setMaßeinheit(String maßeinheit) {
        this.maßeinheit = maßeinheit;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
