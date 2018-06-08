package pl.connectis.cschool.laptop;

public class Laptop {
    private String nazwaProducenta;
    private String nazwaModelu;
    private double przekatnaEkranu;
    private int pamiecRAM;
    private Procesor procesor;
    private int pojemniscDyskuGB;
    private double wagaKg;
    private String syetmOperacyjny;

    public Laptop(){
        System.out.println("tu zaczynam tworzenie laptopa");
        //System.out.println(toString());

    }

    public Laptop(String nazwaProducenta, String nazwaModelu, double przekatnaEkranu, Procesor procesor) {
        System.out.println("tu zaczynam tworzenie laptopa");
        this.nazwaProducenta = nazwaProducenta;
        this.nazwaModelu = nazwaModelu;
        this.przekatnaEkranu = przekatnaEkranu;
        this.procesor=procesor;
        System.out.println(toString());
    }

    public String getNazwaProducenta() {
        return nazwaProducenta;
    }

    public String getNazwaModelu() {
        return nazwaModelu;
    }

    public double getPrzekatnaEkranu() {
        return przekatnaEkranu;
    }

    public int getPamiecRAM() {
        return pamiecRAM;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public int getPojemniscDyskuGB() {
        return pojemniscDyskuGB;
    }

    public double getWagaKg() {
        return wagaKg;
    }

    public String getSyetmOperacyjny() {
        return syetmOperacyjny;
    }

    public void setNazwaProducenta(String nazwaProducenta) {
        this.nazwaProducenta = nazwaProducenta;
    }

    public void setNazwaModelu(String nazwaModelu) {
        this.nazwaModelu = nazwaModelu;
    }

    public void setPrzekatnaEkranu(double przekatnaEkranu) {
        this.przekatnaEkranu = przekatnaEkranu;
    }

    public void setPamiecRAM(int pamiecRAM) {
        this.pamiecRAM = pamiecRAM;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public void setPojemniscDyskuGB(int pojemniscDyskuGB) {
        this.pojemniscDyskuGB = pojemniscDyskuGB;
    }

    public void setWagaKg(double wagaKg) {
        this.wagaKg = wagaKg;
    }

    public void setSyetmOperacyjny(String syetmOperacyjny) {
        this.syetmOperacyjny = syetmOperacyjny;
    }

    public String toString(){
        return "Laptop:" +
                "\nNazwa producenta: "+ nazwaProducenta+
                "\nModel: "+ nazwaModelu+
                "\nPrzekątna ekranu: "+ przekatnaEkranu+
                "\nPamięć RAM: "+ pamiecRAM+
                "\nPojemnosc dysku [GB]: "+ pojemniscDyskuGB+
                "\nWaga [kg]: "+ wagaKg+
                "\nSystem operacyjny: "+ syetmOperacyjny+
                "\nProcesor: "+ procesor.toString()+
                "\n-------------------------"
                ;
    }
}
