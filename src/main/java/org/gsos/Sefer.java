package org.gsos;

/*
 * Bu sınıf ve alt sınıfları deniz seferlerini modellemek için oluşturulmuştur.
 * 1 knot = 47.182 mil
 * 1 knot = 1,852 km
 */

// Abstrakt Sefer sınıfı, seferlerin genel özelliklerini ve davranışlarını tanımlar.
public abstract class Sefer {

    // Sınıf üyeleri
    YukGemisi yukGemisi;      // Seferde kullanılan yük gemisi bilgisi
    int seferNumarasi;        // Seferin numarası
    String seferGuzergahi;    // Sefer güzergahı bilgisi
    String tehlikeDuzeyi;     // Seferin tehlike düzeyi
    double tamamlamaSuresi;   // Seferin tamamlanma süresi (saat)
    double gelir;             // Seferden elde edilen gelir (dolar)
    double gider;             // Seferin maliyeti (dolar)
    int seferdekiSure;        // Seferin süresi (gün)
    int seferMesafesi;        // Sefer mesafesi (mil)
    double ruzgarHizi;        // Rüzgar hızı (knot)
    int ruzgarYonu;           // Rüzgar yönü (1: Pozitif, -1: Negatif)
    int akintiYonu;           // Akıntı yönü (1: Pozitif, -1: Negatif)
    double akintiHizi;        // Akıntı hızı (knot)
    double katEdilenMesafe;   // Kat edilen mesafe (mil)
    String gemiAdi;           // Gemi adı
    double gemiHiz;           // Gemi hızı (knot)

    // Abstrakt metod: Alt sınıflar tarafından implement edilir.
    public abstract void cevreselFaktor();

    // Constructor: Yük gemisi bilgisi ile Sefer nesnesi oluşturur.
    public Sefer(YukGemisi yukGemisi) {
        this.yukGemisi = yukGemisi;
        this.gemiHiz = yukGemisi.gemiHiz;
        this.gemiAdi = yukGemisi.gemiAdi;
    }
}

// Mumbai ile Port Said arasındaki seferi temsil eden sınıf.
class Mumbai_PortSaid extends Sefer {

    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 5; // Rüzgar hızı: 5-10 knot arası
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1; // Rüzgar yönü rastgele belirlenir
        this.akintiHizi = Math.random() * 3 + 1; // Akıntı hızı: 1-4 knot arası
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1; // Akıntı yönü rastgele belirlenir
    }

    public Mumbai_PortSaid(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 1;
        this.seferGuzergahi = "Mumbai-PortSaid";
        this.tehlikeDuzeyi = "AZ TEHLIKELI";
        this.seferMesafesi = 4750; // Mesafe: 4750 deniz mili
    }
}

// Santos ile Lagos arasındaki seferi temsil eden sınıf.
class Santos_Lagos extends Sefer {

    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 10; // Rüzgar hızı: 10-15 knot arası
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi = Math.random() * 3 + 3; // Akıntı hızı: 3-6 knot arası
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Santos_Lagos(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 2;
        this.seferGuzergahi = "Santos-Lagos";
        this.tehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.seferMesafesi = 3350; // Mesafe: 3350 deniz mili
    }
}

// Shanghai ile Los Angeles arasındaki seferi temsil eden sınıf.
class Shanghai_LosAngeles extends Sefer {

    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 15; // Rüzgar hızı: 15-20 knot arası
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi = Math.random() * 3 + 6; // Akıntı hızı: 6-9 knot arası
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Shanghai_LosAngeles(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 3;
        this.seferGuzergahi = "Shanghai-LosAngeles";
        this.tehlikeDuzeyi = "TEHLİKELİ";
        this.seferMesafesi = 6100; // Mesafe: 6100 deniz mili
    }
}

// Murmansk ile Shanghai arasındaki seferi temsil eden sınıf.
class Murmansk_Shanghai extends Sefer {

    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 20; // Rüzgar hızı: 20-25 knot arası
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi = Math.random() * 3 + 9; // Akıntı hızı: 9-12 knot arası
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Murmansk_Shanghai(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 4;
        this.seferGuzergahi = "Murmansk-Shanghai";
        this.tehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.seferMesafesi = 12500; // Mesafe: 12500 deniz mili
    }
}
