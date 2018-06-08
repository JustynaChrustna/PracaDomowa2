package pl.connectis.cschool.laptop;

public class Procesor {
    private String nazwa;
    private int iloscRdzeni;
    private int cache;
    private double czestotliwosc;

    public Procesor(){
        //System.out.println(toString());
        System.out.println("tu tworzy się procesor");
    }

    public Procesor(String nazwa, int iloscRdzeni, int cache, double czestotliwosc) {
        this.nazwa = nazwa;
        this.iloscRdzeni = iloscRdzeni;
        this.cache = cache;
        this.czestotliwosc = czestotliwosc;
        //System.out.println(toString());
        System.out.println("tu tworzy się procesor");
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getIloscRdzeni() {
        return iloscRdzeni;
    }

    public int getCache() {
        return cache;
    }

    public double getCzestotliwosc() {
        return czestotliwosc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setIloscRdzeni(int iloscRdzeni) {
        this.iloscRdzeni = iloscRdzeni;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public void setCzestotliwosc(double czestotliwosc) {
        this.czestotliwosc = czestotliwosc;

    }

    public String toString(){
        return "Procesor: "+nazwa+
                "\nilość rdzeni: "+iloscRdzeni+
                "\ncache [MB] : "+cache+
                "\nczęstotliwość [GHz] : "+czestotliwosc+
                "\n-------------------------";
    }
}
