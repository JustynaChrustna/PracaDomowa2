package pl.connectis.cschool.ksiazki;

public class Autor {
    private String imie;
    private String nazwisko;
    public Autor(){
        System.out.println("Stworzono autora");
    }
    public Autor(String imie, String nazwisko){
        this.imie=imie;
        this.nazwisko=nazwisko;
        System.out.println("Stworzono autora");
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
