package org.gsos;

import java.util.Scanner;

public abstract class Gemi {
    // Gemiye ait özellikler
    String gemiAdi;
    String yapiMalzeme;
    double agirlik;
    double azamiYuk;
    double yukMik;
    double gemiHiz = 12;

    // Alt sınıfların uygulaması gereken soyut metotlar
    public abstract void gemiCalistir();

    public abstract void gemiDurdur();

    // Gemi motorunu temsil eden iç sınıf
    class Motor {
        boolean bakimDurumu;
        private String yakitKalitesi;
        double yakitMik;
        private int toplamCalismaSaati;
        private int geciciCalismaSaati;
        double yakitTuketimi;

        public Motor(boolean bakimDurumu, String yakitKalitesi, double yakitMik) {
            this.bakimDurumu = bakimDurumu;
            this.yakitKalitesi = yakitKalitesi;
            this.yakitMik = yakitMik;
            this.yakitTuketimi=0;
            System.out.println("Motor olusturuldu.");
        }

        public void bakimKontrolEt(int seferdekiSure) {
            if (seferdekiSure%2==0) {//iki gunde bir
                bakimDurumu = false;
                System.out.println("Motorun bakım süresi doldu! Lütfen bakım yapınız.");

                bakimYap();
            }
        }

        private void bakimYap() {
            bakimDurumu = true;
            System.out.println("Motor bakımı tamamlandı.");
        }

        public void motorCalistir() {
            if (bakimDurumu) {
                System.out.println("Motor çalıştırıldı.");
                geciciCalismaSaati++;
            } else {
                System.out.println("Motor çalıştırılamıyor! Lütfen önce bakım yapınız.");
            }
        }

        public void motorDurdur() {
            System.out.println("Motor durduruldu.");
        }

        public void yakitBilgisi() {
            System.out.println("Yakıt bilgisi:\n Kalite = " + yakitKalitesi + ", Miktar = " + yakitMik + "(TON)");
        }
    }
}

class YukGemisi extends Gemi {
    // Motor nesnesini sınıf seviyesinde tanımlıyoruz
    private Motor motor;
    YukGemisi(String gemiAdi, int gemiMalzemesi, double agirlik, double azamiYukKapasitesi, double yukMiktari) {
        super();
        this.gemiAdi = gemiAdi;
        switch (gemiMalzemesi) {
            case 1:
                this.yapiMalzeme = "Çelik";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 1.3;
                break;
            case 2:
                this.yapiMalzeme = "Alüminyum";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 0.9;
                break;
            case 3:
                this.yapiMalzeme = "Fiberglas";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 0.5;
                break;
            case 4:
                this.yapiMalzeme = "Karbon";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 0.3;
                break;
        }
        this.agirlik = agirlik;
        this.azamiYuk = azamiYukKapasitesi;
        this.yukMik = yukMiktari;


        System.out.println("Gemi Olusturuldu.");
        // Motor nesnesi sınıf seviyesinde başlatılıyor
        motor = new Motor(true, "A kalite", 500);
        motor.motorCalistir();
        gemiCalistir();
        motor.yakitBilgisi();
        System.out.println("Gemi sefere hazir.");
    }
    YukGemisi() {
        super();
        HataYakalama gs = new HataYakalama();
        Scanner s = new Scanner(System.in);

        System.out.println("Gemi adini giriniz:");
        this.gemiAdi = s.nextLine();
        System.out.println();

        System.out.println("""
                Geminin yapildigi malzemeyi seciniz.

                Yapi malzemesi:1-Celik
                Yapi malzemesi:2-Aluminyum
                Yapi malzemesi:3-Fiberglas
                Yapi malzemesi:4-Karbon
                """);

        switch (gs.nextIntForNavigation(1, 6)) {
            case 1:
                this.yapiMalzeme = "Çelik";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 1.3;
                break;
            case 2:
                this.yapiMalzeme = "Alüminyum";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 0.9;
                break;
            case 3:
                this.yapiMalzeme = "Fiberglas";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 0.5;
                break;
            case 4:
                this.yapiMalzeme = "Karbon";
                org.gsos.MatematikselIslemler.aerodinamikSabiti = 0.3;
                break;
        }

        System.out.println("Agirlik giriniz(TIPIK BIR YUK GEMISI ICIN 80 BİN İE 100 BIN TON ARASI DEGISIR ):");
        this.agirlik = gs.nextIntForNavigation(80000, 100000);

        System.out.println("Azami yuk giriniz(TIPIK BIR YUK GEMISI ICIN 50 BİN İLE 80 BİN TON ARASI DEGISIR):");
        while (true) {
            this.azamiYuk = gs.nextDouble();
            if (azamiYuk >= 50000 && azamiYuk <= 80000) {
                break;
            } else {
                System.out.println("HATA: AZAMI YUK KAPASITESI 50 BIN ILE 80 BIN ARASI OLMALIDIR");
            }
        }

        System.out.println("Yuk miktari giriniz:");
        while (true) {
            this.yukMik = gs.nextDouble();
            if (yukMik <= azamiYuk) {
                break;
            } else {
                System.out.println("YUK MIKTARI AZAMI YUKTEN YUKSEK OLAMAZ");
            }
        }

        System.out.println("Gemi Olusturuldu.");
        // Motor nesnesi sınıf seviyesinde başlatılıyor
        motor = new Motor(true, "A kalite", 500);
        motor.motorCalistir();
        gemiCalistir();
        motor.yakitBilgisi();
        System.out.println("Gemi sefere hazir.");
    }

    // Motor nesnesine erişim sağlayan metod
    public Motor motoraEris() {
        return motor;
    }

    @Override
    public void gemiCalistir() {
        System.out.println("Gemi calistirildi.");
    }

    @Override
    public void gemiDurdur() {
        System.out.println("Gemi durduruldu.");
    }
}
