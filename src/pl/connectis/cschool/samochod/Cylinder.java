package pl.connectis.cschool.samochod;

public class Cylinder {
    private double pojemnosc;

    public Cylinder(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public Cylinder() {
        System.out.println("stworzono cylinder");
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
        System.out.println("stworzono cylinder");
    }
}
