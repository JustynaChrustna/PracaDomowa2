package pl.connectis.cschool;

import pl.connectis.cschool.figury.Kula;
import pl.connectis.cschool.figury.Okrag;
import pl.connectis.cschool.figury.Prostokat;
import pl.connectis.cschool.figury.Prostopadloscian;
import pl.connectis.cschool.laptop.Laptop;
import pl.connectis.cschool.laptop.Procesor;
import pl.connectis.cschool.ksiazki.Autor;
import pl.connectis.cschool.ksiazki.Ksiazka;
import pl.connectis.cschool.samochod.*;

public class Main {
    public static void main(String[] args){

        //tworzę obiekty z zainicjowaniem atrybutów w konstruktorze
        Okrag okrag1= new Okrag(15.6);
        Prostokat prostokat1=new Prostokat(1.1, 2.4);
        Prostopadloscian prostopadloscian1=new Prostopadloscian(2.3, 5.6, 1.3);
        Kula kula1=new Kula(2.9);

        // tworzę obiekty z zainicjowaniem atrybutów za pomocą metod dostepowych
        Okrag okrag2=new Okrag();
        okrag2.setPromien(1.0);

        Prostokat prostokat2=new Prostokat();
        prostokat2.setBokA(4.6);
        prostokat2.setBokB(2.3);

        Prostopadloscian prostopadloscian2=new Prostopadloscian();
        prostopadloscian2.setBokA(15.7);
        prostopadloscian2.setBokB(7.3);
        prostopadloscian2.setBokC(2.9);

        Kula kula2= new Kula();
        kula2.setPromien(4.5);

        // wywołanie metod toString
        System.out.println(okrag1.toString());
        System.out.println(okrag2.toString());
        System.out.println(prostokat1.toString());
        System.out.println(prostokat2.toString());
        System.out.println(prostopadloscian1.toString());
        System.out.println(prostopadloscian2.toString());
        System.out.println(kula1.toString());
        System.out.println(kula2.toString());

        //Laptop
        /*Laptop laptop1=new Laptop();
        laptop1.setNazwaProducenta("Lenovo");
        laptop1.setNazwaModelu("Ideapad 320-15");
        laptop1.setProcesor("Intel Core i5-8250U");
        laptop1.setPamiecRAM(8);
        laptop1.setPojemniscDyskuGB(256);
        laptop1.setSyetmOperacyjny("Microsoft Windows 10 Home PL");
        laptop1.setPrzekatnaEkranu(15.6);
        laptop1.setWagaKg(2.20);

        Laptop laptop2=new Laptop("Dell", "Inspiron 3567", 15.6, "Intel Core i3-6006U");
        laptop2.setSyetmOperacyjny("Microsoft Windows 10 Home PL");
        laptop2.setPamiecRAM(8);
        laptop2.setPojemniscDyskuGB(1000);
        laptop2.setWagaKg(2.0);*/


        //metoda toString dla klasy Laptop
        //System.out.println(laptop1.toString());
       // System.out.println(laptop2.toString());


        //tworzenie procesorów
        Procesor procesor1= new Procesor();
        procesor1.setNazwa("Intel® Core™ i3-6320 Processor");
        procesor1.setCache(4);
        procesor1.setCzestotliwosc(3.90);
        procesor1.setIloscRdzeni(2);
        System.out.println("*******************");
        Procesor procesor2= new Procesor("Intel® Core™ i7-8850H", 6, 9, 2.6);
        System.out.println("*******************");
        Laptop laptop3 =new Laptop("Dell", "Inspiron 3567", 15.6, new Procesor("Intel® Core™ i7-8850H", 6, 9, 2.6));
        laptop3.setSyetmOperacyjny("Microsoft Windows 10 Home PL");
        laptop3.setPamiecRAM(8);
        laptop3.setPojemniscDyskuGB(1000);
        laptop3.setWagaKg(2.0);
        System.out.println("*******************");

        Laptop laptop4= new Laptop();
        Procesor procesor4=new Procesor();
        procesor4.setNazwa("Intel® Core™ i5-8600T");
        procesor4.setIloscRdzeni(6);
        procesor4.setCache(9);
        procesor4.setCzestotliwosc(2.3);
        laptop4.setProcesor(procesor4);
        laptop4.setSyetmOperacyjny("Microsoft Windows 10 Home PL");
        laptop4.setPamiecRAM(8);
        laptop4.setPojemniscDyskuGB(1000);
        laptop4.setWagaKg(2.0);

        System.out.println("*******************");
        Laptop laptop5 =new Laptop("Dell", "Inspiron 3567", 15.6, procesor4);
        laptop5.setSyetmOperacyjny("Microsoft Windows 10 Home PL");
        laptop5.setPamiecRAM(8);
        laptop5.setPojemniscDyskuGB(1000);
        laptop5.setWagaKg(2.0);
        System.out.println("*******************");


        //książki i autorzy
        Autor pd=new Autor();
        pd.setImie("Paul");
        pd.setNazwisko("Deitel");
        Autor hd=new Autor("Harvey", "Deitel");
        Ksiazka ksiazkaJava=new Ksiazka(new Autor[]{hd, pd}, "Java How to Program", 2018, 1328);
        System.out.println("##################");
        Ksiazka algorytmy= new Ksiazka(new Autor[]{
                new Autor("Thomas", "Cormen"),
                new Autor("Charles", "Leisersin"),
                new Autor("Ronald", "Rivest"),
                new Autor("Clifford", "Stein")}, "Wprowadzenie do algorytmów", 2009,  1300) ;
        System.out.println("##################");
        Ksiazka sql=new Ksiazka();
        Autor jv= new Autor("John", "Viescas");
        Autor ds= new Autor("Douglas", "Steele");
        Autor bc= new Autor("Ben", "Clothier");
        Autor[] autorzy={jv, ds, bc};
        sql.setAutorzy(autorzy);
        sql.setIloscStron(320);
        sql.setRokWydania(2017);
        sql.setTytul("Effective SQL: 61 Specific Ways to Write Better SQL");


        //tworzenie samochodu
        System.out.println("----------------------------------------------");
        Opona o1=new Opona();
        Opona o2=new Opona();
        Opona o3=new Opona();
        Opona o4=new Opona();
        Kolo k1=new Kolo(o1);
        Kolo k2=new Kolo(o2);
        Kolo k3=new Kolo(o3);
        Kolo k4=new Kolo(o4);
        Cylinder c1= new Cylinder();
        Cylinder c2= new Cylinder();
        Cylinder c3= new Cylinder();
        Swiatlo s1=new Swiatlo();
        Swiatlo s2=new Swiatlo();
        Swiatlo s3=new Swiatlo();
        Swiatlo s4=new Swiatlo();
        Samochod samochod1= new Samochod(new Kolo[]{k1, k2, k3, k4}, new Silnik(new Cylinder[]{c1, c2, c3}), new Swiatlo[]{s1, s2, s3, s4});
        System.out.println("-----------------------------");
        Samochod samochod2= new Samochod(new Kolo[]{new Kolo(new Opona()), new Kolo(new Opona()), new Kolo(new Opona()), new Kolo(new Opona())}, new Silnik(new Cylinder[]{new Cylinder(), new Cylinder(), new Cylinder()}), new Swiatlo[]{new Swiatlo(), new Swiatlo(), new Swiatlo(), new Swiatlo()});



    }
}
