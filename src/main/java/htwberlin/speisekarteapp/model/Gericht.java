package htwberlin.speisekarteapp.model;

public class Gericht {
    private int gerichtID;
    private String name;
    private String beschreibung;
    private double preis;

    public Gericht(String name, String beschreibung, double preis, boolean vegetarisch) {
        this.gerichtID = 0; // Assign a default value to gerichtID
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
    }
}
