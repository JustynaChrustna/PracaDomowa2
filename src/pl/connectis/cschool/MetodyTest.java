package pl.connectis.cschool;

import org.junit.Test;
import pl.connectis.cschool.figury.Kula;
import pl.connectis.cschool.figury.Okrag;
import pl.connectis.cschool.figury.Prostokat;
import pl.connectis.cschool.figury.Prostopadloscian;
import pl.connectis.cschool.samochod.*;
import pl.connectis.cschool.ulamek.Ulamek;

import static org.junit.Assert.assertEquals;
import static pl.connectis.cschool.ulamek.Ulamek.*;

public class MetodyTest {
    Prostokat p=new Prostokat(10.0, 2.0);
    Okrag o= new Okrag(2.1);
    Kula k=new Kula(3.1);
    Prostopadloscian pro=new Prostopadloscian(1.1, 2.2, 3.3);
    Samochod samochod= new Samochod(new Kolo[]{new Kolo(new Opona()), new Kolo(new Opona()), new Kolo(new Opona()), new Kolo(new Opona())}, new Silnik(new Cylinder[]{new Cylinder(), new Cylinder(), new Cylinder()}), new Swiatlo[]{new Swiatlo(), new Swiatlo(), new Swiatlo(), new Swiatlo()});
    Ulamek u=new Ulamek(3, 4);
    @Test
    public void obwodProstokataTest(){
        assertEquals(24.0, p.obwod(),0.1);
    }
    @Test
    public void poleProstokataTest(){
        assertEquals(20.0, p.pole(),0.1);
    }

    @Test
    public void obwodOkreguTest(){
        assertEquals(13.2, o.obwod(),0.1);

    }
    @Test
    public void poleOkreguTest(){
        assertEquals(13.84, o.pole(),0.1);

    }
    @Test
    public void powierzchniaKuliTest(){
        assertEquals(120.7, k.powierzchnia(), 0.1);
    }
    @Test
    public void objetoscKuliTest(){
        assertEquals(124.72, k.objetosc(), 0.1);
    }
    @Test
    public void powierzchniaProstopadloscianuTest(){
        assertEquals(26.62, pro.powierzchnia(), 0.1);
    }
    @Test
    public void objetoscProstopadloscianuTest(){
        assertEquals(7.986, pro.objetosc(), 0.1);
    }
    @Test
    public void wlaczSilnikTest(){
        samochod.getSilnik().wlaczSilnik();
        assertEquals(StanSilnika.WLACZONY, samochod.getSilnik().getStan());
    }
    @Test
    public void wylaczSilnikTest(){
        samochod.getSilnik().wlaczSilnik();
        samochod.getSilnik().wylaczSilnik();
        assertEquals(StanSilnika.WYLACZONY, samochod.getSilnik().getStan());
    }
    @Test
    public void jedźSamochodemTest(){
        samochod.jedz();
        assertEquals(StanSilnika.WLACZONY, samochod.getSilnik().getStan());
        for (int i = 0; i < samochod.getKola().length; i++) {
            assertEquals(true, samochod.getKola()[i].isKreciSie());


        }
    }
    @Test
    public void zatrzymajSamochodTest(){
        samochod.jedz();
        samochod.zatrzymaj();
        assertEquals(StanSilnika.WYLACZONY, samochod.getSilnik().getStan());
        for (int i = 0; i < samochod.getKola().length; i++) {
            assertEquals(false, samochod.getKola()[i].isKreciSie());


        }
    }

    @Test
    public void skrecanieSamochodemTest(){
        samochod.skrecWLewo();
        for (int i = 0; i < samochod.getKola().length; i++) {
            assertEquals(SkretKol.LEWO, samochod.getKola()[i].getSkretKol());
        }
        samochod.skrecWPrawo();
        for (int i = 0; i < samochod.getKola().length; i++) {
            assertEquals(SkretKol.PRAWO, samochod.getKola()[i].getSkretKol());
        }
        samochod.jedzProsto();
        for (int i = 0; i < samochod.getKola().length; i++) {
            assertEquals(SkretKol.PROSTO, samochod.getKola()[i].getSkretKol());
        }
    }

    @Test
    public void dodawanieTest(){


        assertEquals(7,u.dodaj(new Ulamek(1, 8)).getLicznik() );
        assertEquals(8,u.dodaj(new Ulamek(1, 8)).getMianownik() );
    }
    @Test
    public void odejmowanieTest(){


        assertEquals(5,u.odejmij(new Ulamek(1, 8)).getLicznik() );
        assertEquals(8,u.odejmij(new Ulamek(1, 8)).getMianownik() );
    }
    @Test
    public void odejmowanieTestUjemne(){


        assertEquals(-1,u.odejmij(new Ulamek(7, 8)).getLicznik() );
        assertEquals(8,u.odejmij(new Ulamek(7, 8)).getMianownik() );
    }
    @Test
    public void mnozenieTest(){


        assertEquals(6,u.pomnoz(new Ulamek(2, 3)).getLicznik() );
        assertEquals(12,u.pomnoz(new Ulamek(2, 3)).getMianownik() );
    }
    @Test
    public void dzielenieTest(){


        assertEquals(-9,u.podziel(new Ulamek(-2, 3)).getLicznik() );
        assertEquals(8,u.podziel(new Ulamek(-2, 3)).getMianownik() );
    }
    @Test
    public void dodawanieTest2Ulamkow(){


        assertEquals(7,dodaj(new Ulamek(3, 4),new Ulamek(1, 8)).getLicznik() );
        assertEquals(8,dodaj(new Ulamek(3, 4),new Ulamek(1, 8)).getMianownik() );
    }
    @Test
    public void odejmowanieTest2Ulamkow(){


        assertEquals(5,odejmij(new Ulamek(3, 4),new Ulamek(1, 8)).getLicznik() );
        assertEquals(8,odejmij(new Ulamek(3, 4),new Ulamek(1, 8)).getMianownik() );
    }
    @Test
    public void mnozenieTest2Ulamkow(){


        assertEquals(3,pomnoz(new Ulamek(3, 4),new Ulamek(1, 8)).getLicznik() );
        assertEquals(32,pomnoz(new Ulamek(3, 4),new Ulamek(1, 8)).getMianownik() );
    }
    @Test
    public void dzielenieTest2Ulamkow(){


        assertEquals(16, podziel(new Ulamek(-2, 3), new Ulamek(-1, 8)).getLicznik() );
        assertEquals(3,podziel(new Ulamek(-2, 3), new Ulamek(-1, 8)).getMianownik() );
    }
}
