package org.gsos;

import java.util.Scanner;

public abstract class Gemi {
    // Gemiye ait özellikler
    String gemiAdi;
    String yapiMalzeme;
    double agirlik;
    double azamiYuk;
    double yukMik;
    double azamiHiz;
    double hiz;

    // Alt sınıfların uygulaması gereken soyut metotlar

    public abstract void gemiCalistir();
    public abstract void gemiDurdur();

    // Gemi motorunu temsil eden iç sınıf
     class Motor {
        // Motor özellikleri

         double yakitTuketimi;
        private boolean bakimDurumu;
        private String yakitKalitesi;
        private double yakitMik;

        // Motor özelliklerini başlatan yapıcı metot
        public Motor( double yakitTuketimi, boolean bakimDurumu, String yakitKalitesi, double yakitMik) {
            this.yakitTuketimi = yakitTuketimi;
            this.bakimDurumu = bakimDurumu;
            this.yakitKalitesi = yakitKalitesi;
            this.yakitMik = yakitMik;

            // Yakıt bilgilerini ekrana yazdır
            yakitBilgisi();
        }

        // Bakım işlemi için metot
        public boolean bakim() {return true;} // Bakım için varsayılan mantık


        // Motoru çalıştıran metot
        public void motorCalistir() {System.out.println("Motor calistirildi.");}


        // Motoru durduran metot
        public void motorDurdur() {System.out.println("Motor durduruldu.");}

        // Yakıt bilgilerini ekrana yazdıran metot
        public void yakitBilgisi() {System.out.println("Yakit bilgisi:\n Kalite = " + yakitKalitesi + "\n"+", Miktar = " + yakitMik);}
    }
}

class YukGemisi extends Gemi {

    // Yuk gemisi özelliklerini başlatan yapıcı metot
    YukGemisi() {

        super(); // Üst sınıfın yapıcı metodunu çağır
        Motor motor = new Motor(2, true, "A kalite", 500);
        HataYakalama gs = new HataYakalama();
        Scanner s = new Scanner(System.in);
        // Kullanıcıdan gemi detaylarını al
        System.out.println("Gemi adini giriniz:");
        String gemiAdi = s.nextLine();


        System.out.println(""" 
                Geminin yapildigi malzemeyi seciniz.
                
                Yapi malzemesi:1-Celik
                Yapi malzemesi:2-Aluminyum
                Yapi malzemesi:3-Fiberglas
                Yapi malzemesi:4-Karbon
                """);

        switch (gs.nextIntForNavigation(1,6)) {
            case 1: this.yapiMalzeme = "Çelik"; break;
            case 2: this.yapiMalzeme = "Alüminyum"; break;
            case 3: this.yapiMalzeme = "Fiberglas"; break;
            case 4: this.yapiMalzeme = "Karbon"; break;
            }


        System.out.println("Agirlik giriniz:");
        double agirlik = gs.nextDouble();

        System.out.println("Azami yuk giriniz:");
        double azamiYuk = gs.nextDouble();

        System.out.println("Yuk miktari giriniz:");
        double yukMik = gs.nextDouble();

        System.out.println("Hiz giriniz:");
        double hiz = gs.nextDouble();

        // Degerleri özelliklere ata
        this.gemiAdi = gemiAdi;
        this.yapiMalzeme = yapiMalzeme;
        this.agirlik = agirlik;
        this.azamiYuk = azamiYuk;
        this.yukMik = yukMik;
        this.azamiHiz = hiz;


    }

    // Soyut metotların uygulamaları

    @Override
    public void gemiCalistir() {
        System.out.println("Gemi calistirildi.");
        // Gemiyi calistirma mantigi placeholder
    }

    @Override
    public void gemiDurdur() {
        System.out.println("Gemi durduruldu.");
        // Gemiyi durdurma mantigi placeholder
    }
}