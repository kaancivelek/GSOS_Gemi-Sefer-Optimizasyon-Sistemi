package org.example;

public abstract class Gemi {

     String yapiMalzeme;
     double agirlik;
     double hacim;
     double azamiYuk;
     double yukMik;
     double hiz;

    public Gemi(String yapiMalzeme, double agirlik, double hacim, double azamiYuk, double yukMik, double hiz) {
        this.yapiMalzeme = yapiMalzeme;
        this.agirlik = agirlik;
        this.hacim = hacim;
        this.azamiYuk = azamiYuk;
        this.yukMik = yukMik;
        this.hiz = hiz;
    }


    public double yukMikHesapla() {
        // Yük miktarı hesaplama işlemleri
        return 0.0;
    }

    public String gemiCalistir() {
        return "Gemi çalıştırıldı.";
    }

    public String gemiDurdur() {
        return "Gemi durduruldu.";
    }

    // İç Sınıf
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
        }

        // Metotlar
        public boolean bakim() {
            // Bakım işlemleri
            return true;
        }

        public String motorCalistir() {
            return "Motor çalıştırıldı.";
        }

        public String motorDurdur() {
            return "Motor durduruldu.";
        }

        public String yakitBilgisi() {
            return "Yakıt bilgisi: Kalite = " + yakitKalitesi + ", Miktar = " + yakitMik;
        }
    }
}

class YukGemisi extends Gemi {

    public YukGemisi(String yapiMalzeme, double agirlik, double hacim, double azamiYuk, double yukMik, double hiz)
    {
        super(yapiMalzeme, agirlik, hacim, azamiYuk, yukMik, hiz);}
    }

