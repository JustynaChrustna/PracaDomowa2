package pl.connectis.cschool.figury;

public class Kula {
    double promien;

    public Kula(double promien) {
        this.promien = promien;
    }
    public Kula(){

    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }
    public String toString() {
        return "Kula o promieniu:"+ promien+"\n-------------------------";
    }
    public double powierzchnia(){
        return 4*Math.PI*(promien*promien);
    }
    public double objetosc(){
        return 4*Math.PI*(promien*promien*promien)/3;
    }
}
