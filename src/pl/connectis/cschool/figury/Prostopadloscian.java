package pl.connectis.cschool.figury;

public class Prostopadloscian {
    private double bokA;
    private double bokB;
    private double bokC;


    public Prostopadloscian(){

    }
    public Prostopadloscian(double a, double b, double c){
        bokA=a;
        bokB=b;
        bokC=c;
    }

    public double getBokA() {
        return bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public double getBokC() {
        return bokC;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    public void setBokC(double bokC) {
        this.bokC = bokC;
    }
    public String toString() {
        return "Prostopadłościan o wymiarach: a="+bokA+ ", b="+bokB+", c="+bokC+"\n-------------------------";
    }
    public double powierzchnia(){
        return 2*bokA*bokB+2*bokB*bokC+2*bokA*bokC;
    }
    public double objetosc(){
        return bokA*bokB*bokC;
    }

}
