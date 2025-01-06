package org.gsos;

import java.util.Scanner;

public abstract class Gemi {
    // Kullanıcıdan giriş almak için Scanner nesneleri


    // Gemiye ait özellikler
    String gemiAdi;
    String yapiMalzeme;
    double agirlik;
    double hacim;
    double azamiYuk;
    double yukMik;
    double azamiHiz;
    double ortHız;
    // Varsayılan yapıcı metot
    public Gemi() {}

    // Alt sınıfların uygulaması gereken soyut metotlar
    public abstract void yukMikHesapla();
    public abstract void gemiCalistir();
    public abstract void gemiDurdur();

    // Gemi motorunu temsil eden iç sınıf
    public  static class Motor {
        // Motor özellikleri

        private double yakitTuketimi;
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
        public double yakitHesapla(double ortHiz, int mesafe) {
            double zaman = mesafe / ortHiz; // Sefer süresi (saat)
            double kullanilanYakit = zaman * yakitTuketimi; // Yakıt tüketimi (litre)
            return kullanilanYakit;
        }

        // Bakım işlemi için metot
        public boolean bakim() {
            return true; // Bakım için varsayılan mantık
        }

        // Motoru çalıştıran metot
        public void motorCalistir() {
            // Motor çalıştırma mantığı placeholder
        }

        // Motoru durduran metot
        public void motorDurdur() {
            // Motor durdurma mantığı placeholder
        }

        // Yakıt bilgilerini ekrana yazdıran metot
        public void yakitBilgisi() {
            System.out.println("Yakit bilgisi:\n Kalite = " + yakitKalitesi + "\n"+", Miktar = " + yakitMik);
        }
    }
}

class YukGemisi extends Gemi {
    // Yuk gemisi özelliklerini başlatan yapıcı metot
    YukGemisi() {
        super(); // Üst sınıfın yapıcı metodunu çağır
        HataYakalama gs = new HataYakalama();
        Scanner s = new Scanner(System.in);
        // Kullanıcıdan gemi detaylarını al
        System.out.println("Gemi adini giriniz:");
        String gemiAdi = s.nextLine();

        System.out.println("Yapi malzemesi:");
        String yapiMalzeme = s.nextLine();

        System.out.println("Agirlik giriniz:");
        double agirlik = gs.nextDouble();

        System.out.println("Hacim giriniz:");
        double hacim = gs.nextDouble();

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
        this.hacim = hacim;
        this.azamiYuk = azamiYuk;
        this.yukMik = yukMik;
        this.azamiHiz = hiz;

        // Motoru baslat
        Motor m = new Motor(2,  true, "A kalite",  500);
    }

    // Soyut metotların uygulamaları
    @Override
    public void yukMikHesapla() {
        // Yuk miktarini hesaplama mantigi placeholder
    }

    @Override
    public void gemiCalistir() {
        // Gemiyi calistirma mantigi placeholder
    }

    @Override
    public void gemiDurdur() {
        // Gemiyi durdurma mantigi placeholder
    }
}