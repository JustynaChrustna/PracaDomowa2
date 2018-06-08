package pl.connectis.cschool.ksiazki;

public class Ksiazka {
    Autor[] autorzy;
    String tytul;
    int rokWydania;
    int iloscStron;
    public Ksiazka(){
        System.out.println("Stworzono książkę");

    }

    public Ksiazka(Autor[] autorzy, String tytul, int rokWydania, int i) {
        this.autorzy = autorzy;
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.iloscStron=i;
        System.out.println("Stworzono książkę");
    }

    public void setAutorzy(Autor[] autorzy) {
        this.autorzy = autorzy;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public void setIloscStron(int iloscStron) {
        this.iloscStron = iloscStron;
    }

    public Autor[] getAutorzy() {
        return autorzy;
    }

    public String getTytul() {
        return tytul;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public int getIloscStron() {
        return iloscStron;
    }
}
