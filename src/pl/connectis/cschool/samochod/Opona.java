package pl.connectis.cschool.samochod;

public class Opona {
    private double cisnienie;
    private double rozmiar;

    public Opona() {
        System.out.println("stworzono oponę");
    }

    public Opona(double cisnienie, double rozmiar) {
        this.cisnienie = cisnienie;
        this.rozmiar = rozmiar;
        System.out.println("stworzono oponę");

    }

    public void setCisnienie(double cisnienie) {
        this.cisnienie = cisnienie;
    }

    public void setRozmiar(double rozmiar) {
        this.rozmiar = rozmiar;
    }

    public double getCisnienie() {
        return cisnienie;
    }

    public double getRozmiar() {
        return rozmiar;
    }
}
