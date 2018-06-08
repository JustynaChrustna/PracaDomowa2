package pl.connectis.cschool.samochod;

public class Kolo {
    private Opona opona;
    private boolean kreciSie=false;
    private SkretKol skretKol=SkretKol.PROSTO;

    public Kolo() {
        System.out.println("stworzono koło");
    }

    public Kolo(Opona opona) {
        this.opona = opona;
        System.out.println("stworzono koło(");
    }

    public Opona getOpona() {
        return opona;
    }

    public boolean isKreciSie() {
        return kreciSie;
    }

    public void setOpona(Opona opona) {
        this.opona = opona;
    }

    public void setKreciSie(boolean kreciSie) {
        this.kreciSie = kreciSie;
    }

    public void setSkretKol(SkretKol skretKol) {
        this.skretKol = skretKol;
    }

    public SkretKol getSkretKol() {
        return skretKol;
    }
}
