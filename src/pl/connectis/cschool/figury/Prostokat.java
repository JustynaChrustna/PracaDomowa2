package pl.connectis.cschool.figury;

public class Prostokat {
    private double bokA;
    private double bokB;

    public Prostokat() {

    }

    public Prostokat(double a, double b) {
        bokA = a;
        bokB = b;

    }

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }
    public String toString() {
        return "Prostokąt o wymiarach: a="+bokA+ ", b="+bokB+"\n-------------------------";
    }

    public double obwod(){
        return (2*bokA)+(2*bokB);
    }
    public double pole(){
        return bokA*bokB;

    }
}
