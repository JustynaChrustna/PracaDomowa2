package pl.connectis.cschool.samochod;

public class Samochod {
    Kolo[] kola;
    Silnik silnik;
    Swiatlo[] swiatlo;

    public Samochod(Kolo[] kola, Silnik silnik, Swiatlo[] swiatlo) {
        this.kola = kola;
        this.silnik = silnik;
        this.swiatlo = swiatlo;
        System.out.println("stworzono samochód");
    }

    public Samochod() {
        System.out.println("stworzono samochód");
    }

    public Kolo[] getKola() {
        return kola;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public Swiatlo[] getSwiatlo() {
        return swiatlo;
    }

    public void setKola(Kolo[] kola) {
        this.kola = kola;
    }

    public void setSilnik(Silnik silnik) {
        this.silnik = silnik;
    }

    public void setSwiatlo(Swiatlo[] swiatlo) {
        this.swiatlo = swiatlo;
    }

    public void jedz(){
        silnik.wlaczSilnik();
        for (int i = 0; i < kola.length; i++) {
            kola[i].setKreciSie(true);
        }

    }
    public void zatrzymaj(){
        silnik.wylaczSilnik();
        for (int i = 0; i < kola.length; i++) {
            kola[i].setKreciSie(false);
        }

    }
    public void skrecWLewo(){

        for (int i = 0; i < kola.length; i++) {
            kola[i].setSkretKol(SkretKol.LEWO);
        }
    }
    public void skrecWPrawo(){

        for (int i = 0; i < kola.length; i++) {
            kola[i].setSkretKol(SkretKol.PRAWO);
        }
    }
    public void jedzProsto(){

        for (int i = 0; i < kola.length; i++) {
            kola[i].setSkretKol(SkretKol.PROSTO);
        }
    }
}
