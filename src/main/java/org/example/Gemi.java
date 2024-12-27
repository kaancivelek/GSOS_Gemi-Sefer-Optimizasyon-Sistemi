package org.example;




// Ana Sınıf
public class Gemi {
    // Özellikler
    private String yapiMalzeme;
    private double agirlik;
    private double hacim;
    private double azamiYuk;
    private double yukMik;
    private double hiz;

    // Yapıcı Metot
    public Gemi(String yapiMalzeme, double agirlik, double hacim, double azamiYuk, double yukMik, double hiz) {
        this.yapiMalzeme = yapiMalzeme;
        this.agirlik = agirlik;
        this.hacim = hacim;
        this.azamiYuk = azamiYuk;
        this.yukMik = yukMik;
        this.hiz = hiz;
    }

    // Metotlar
    public String gemiBilgisi() {
        return "Gemi bilgileri: Yapı Malzemesi = " + yapiMalzeme + ", Ağırlık = " + agirlik + ", Hacim = " + hacim + ", Azami Yük = " + azamiYuk + ", Yük Miktarı = " + yukMik + ", Hız = " + hiz;
    }

    public void yakitHesapla() {
        // Yakıt hesaplama işlemleri
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
        // Özellikler
        private double metalYorgunlugu;
        private double RPM;
        private double yakitTuketimi;
        private boolean bakimDurumu;
        private String yakitKalitesi;
        private double yakitMik;

        // Yapıcı Metot
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

// Alt Sınıf
class YukGemisi extends Gemi {
    // Özellikler
    private double kazanc;

    // Yapıcı Metot
    public YukGemisi(String yapiMalzeme, double agirlik, double hacim, double azamiYuk, double yukMik, double hiz, double kazanc) {
        super(yapiMalzeme, agirlik, hacim, azamiYuk, yukMik, hiz);
        this.kazanc = kazanc;
    }

    // Metotlar
    public double kazancHesapla() {
        // Kazanç hesaplama işlemleri
        return 0.0;
    }
}
