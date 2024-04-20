package htwberlin.speisekarteapp.model;

public class Gericht {
    private int gerichtID;
    private String name;
    private String beschreibung;
    private double preis;

    public Gericht(String name, String beschreibung, double preis,boolean vegetarisch) {
        this.gerichtID = 0; // Assign a default value to gerichtID
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
    }
    public int getGerichtID() {
        return gerichtID;
    }

    public void setGerichtID(int gerichtID) {
        this.gerichtID = gerichtID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}

