package pl.connectis.cschool.figury;

public class Okrag {
    private double promien;

    public Okrag(){

    }
    public Okrag(double p){
        promien=p;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public String toString() {
        return "Okrąg o promieniu:"+ promien+"\n-------------------------";
    }

    public double obwod(){
        return 2*Math.PI*promien;
    }
    public double pole(){
        return Math.PI*promien*promien;
    }
}
