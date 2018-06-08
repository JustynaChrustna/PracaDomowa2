package pl.connectis.cschool.ulamek;

public class Ulamek {
    int licznik;
    int mianownik;

    public Ulamek(int licznik, int mianownik) {

        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public int getLicznik() {
        return licznik;
    }

    public int getMianownik() {
        return mianownik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }
    public int wspolnyMianownik(Ulamek u){
        int wspolnyMianownik=0;
        for (int i = 2; i < 10000; i++) {
            if(i%u.mianownik==0&&i%mianownik==0){
                wspolnyMianownik= i;
                break;
            }


        }
        return wspolnyMianownik;
    }

    public Ulamek dodaj(Ulamek ulamek){

        int newMianownik=wspolnyMianownik(ulamek);
        licznik=(newMianownik/mianownik)*licznik;
        ulamek.licznik=(newMianownik/ulamek.mianownik)*ulamek.licznik;
        return new Ulamek(licznik+ulamek.licznik, newMianownik);
    }
    public Ulamek odejmij(Ulamek ulamek){
        int newMianownik=wspolnyMianownik(ulamek);
        licznik=(newMianownik/mianownik)*licznik;
        ulamek.licznik=(newMianownik/ulamek.mianownik)*ulamek.licznik;
        return new Ulamek(licznik-ulamek.licznik, newMianownik);
    }

    public Ulamek pomnoz(Ulamek ulamek){
        return new Ulamek(licznik*ulamek.licznik, mianownik*ulamek.mianownik);
    }
    public Ulamek podziel(Ulamek ulamek){

        if(ulamek.licznik<0){
            ulamek.licznik=ulamek.licznik*(-1);
            ulamek.mianownik=ulamek.mianownik*(-1);
        }
        return new Ulamek(licznik*ulamek.mianownik, mianownik*ulamek.licznik);
    }
    static public Ulamek dodaj(Ulamek u1, Ulamek u2){
        int newMianownik=u1.wspolnyMianownik(u2);
        u1.licznik=(newMianownik/u1.mianownik)*u1.licznik;
        u2.licznik=(newMianownik/u2.mianownik)*u2.licznik;
        return new Ulamek(u1.licznik+u2.licznik, newMianownik);
    }
    static public Ulamek odejmij(Ulamek u1, Ulamek u2){
        int newMianownik=u1.wspolnyMianownik(u2);
        u1.licznik=(newMianownik/u1.mianownik)*u1.licznik;
        u2.licznik=(newMianownik/u2.mianownik)*u2.licznik;
        return new Ulamek(u1.licznik-u2.licznik, newMianownik);
    }
    static public Ulamek pomnoz(Ulamek u1, Ulamek u2){
        return new Ulamek(u1.licznik*u2.licznik, u1.mianownik*u2.mianownik);
    }
    static public Ulamek podziel(Ulamek u1, Ulamek u2){

        if(u2.licznik<0){
            u2.licznik=u2.licznik*(-1);
            u2.mianownik=u2.mianownik*(-1);
        }
        return new Ulamek(u1.licznik*u2.mianownik, u1.mianownik*u2.licznik);
    }
}
