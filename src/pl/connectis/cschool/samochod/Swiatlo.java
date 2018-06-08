package pl.connectis.cschool.samochod;

public class Swiatlo {
    int napiecie;
    String typ;

    public Swiatlo(int napiecie, String typ) {
        this.napiecie = napiecie;
        this.typ = typ;
        System.out.println("stworzono światło");
    }

    public Swiatlo() {
        System.out.println("stworzono światło");
    }

    public int getNapiecie() {
        return napiecie;
    }

    public String getTyp() {
        return typ;
    }

    public void setNapiecie(int napiecie) {
        this.napiecie = napiecie;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
