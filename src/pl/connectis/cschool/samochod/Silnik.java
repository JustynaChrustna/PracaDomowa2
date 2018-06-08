package pl.connectis.cschool.samochod;

import static pl.connectis.cschool.samochod.StanSilnika.WLACZONY;
import static pl.connectis.cschool.samochod.StanSilnika.WYLACZONY;

public class Silnik {
    private Cylinder[] cylindry;
    private double momentObrotowy;
    private double moc;
    private StanSilnika stan=WYLACZONY;

    public Silnik(Cylinder[] cylindry) {
        this.cylindry = cylindry;

        System.out.println("stworzono silnik");
    }

    public Silnik() {
        System.out.println("stworzono silnik");
    }

    public Cylinder[] getCylindry() {
        return cylindry;
    }

    public double getMomentObrotowy() {
        return momentObrotowy;
    }

    public double getMoc() {
        return moc;
    }

    public void setCylindry(Cylinder[] cylindry) {
        this.cylindry = cylindry;
    }

    public void setMomentObrotowy(double momentObrotowy) {
        this.momentObrotowy = momentObrotowy;
    }

    public void setMoc(double moc) {
        this.moc = moc;
    }

    public void setStan(StanSilnika stan) {
        this.stan = stan;
    }

    public StanSilnika getStan() {
        return stan;
    }

    public void wlaczSilnik(){
        setStan(WLACZONY);
    }
    public void wylaczSilnik(){
        setStan(WYLACZONY);
    }
}
