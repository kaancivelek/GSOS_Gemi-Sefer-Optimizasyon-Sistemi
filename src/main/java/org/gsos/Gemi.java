package org.gsos;

import java.util.Scanner;

public abstract class Gemi {
    GuvenliScanner gs = new GuvenliScanner();
    Scanner s = new Scanner(System.in);
    String gemiAdi;
     String yapiMalzeme;
     double agirlik;
     double hacim;
     double azamiYuk;
     double yukMik;
     double hiz;

    public Gemi() {

    }


    public abstract void yukMikHesapla();

    public abstract void  gemiCalistir();

    public abstract void   gemiBilgisi();

    public abstract void  gemiDurdur();

    public class Motor {

        private double metalYorgunlugu;
        private double RPM;
        private double yakitTuketimi;
        private boolean bakimDurumu;
        private String yakitKalitesi;
        private double yakitMik;


        public Motor(double metalYorgunlugu, double RPM, double yakitTuketimi, boolean bakimDurumu, String yakitKalitesi, double yakitMik) {


            this.metalYorgunlugu = metalYorgunlugu;
            this.RPM = RPM;
            this.yakitTuketimi = yakitTuketimi;
            this.bakimDurumu = bakimDurumu;
            this.yakitKalitesi = yakitKalitesi;
            this.yakitMik = yakitMik;
            yakitBilgisi();

        }

        // Metotlar
        public boolean bakim() {
            // Bakım işlemleri
            return true;
        }

        public void  motorCalistir() {

        }

        public void  motorDurdur() {

        }

        public void yakitBilgisi() {
            System.out.println("Yakıt bilgisi:\n Kalite = " + yakitKalitesi + ", Miktar = " + yakitMik);
        }
    }
}

class YukGemisi extends Gemi {




    @Override
    public void yukMikHesapla() {

    }

    @Override
    public void gemiCalistir() {

    }

    @Override
    public void gemiBilgisi() {
        System.out.println("---GEMİ BİLGİSİ---");
        System.out.println(
                "adi:" +gemiAdi+"\n"+
                "yapi malzemesi:" +yapiMalzeme+"\n"+
                "agirligi:" +agirlik+"ton"+"\n"+
                "hacmi" +hacim+"metreküp"+"\n"+
                "azami yuk siniri:" +azamiYuk+"ton"+"\n"+
                "yuk miktari:" +yukMik+"ton"+"\n"+
                "hizi:" +hiz+"km"
                );
    }

    @Override
    public void gemiDurdur() {

    }

    YukGemisi()
    {super();




        System.out.println("değerleri giriniz:");
        System.out.println("gemi adini giriniz:");
        String gemiAdi= s.nextLine();
        System.out.println("Yapi malzemesi:");
        String  yapiMalzeme= s.nextLine();;
        System.out.println("Agirlik giriniz:");
        double agirlik = gs.nextDouble();
        System.out.println("Hacim giriniz:");
        double hacim = gs.nextDouble();
        System.out.println("azamiyuk giriniz:");
        double azamiYuk= gs.nextDouble();
        System.out.println("Yuk miktari giriniz:");
        double yukMik=gs.nextDouble();
        System.out.println("Hiz giriniz:");
        double hiz = gs.nextDouble();

        this.yapiMalzeme = yapiMalzeme;
        this.agirlik = agirlik;
        this.hacim = hacim;
        this.azamiYuk = azamiYuk;
        this.yukMik = yukMik;
        this.hiz = hiz;
        this.gemiAdi=gemiAdi;


      /*  gemiBilgisi();*/
        Motor m= new Motor(0,25,24,true,"a kalite",2500);
        }


    }

