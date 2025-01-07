package org.gsos;

/*
 * 1 knot = 47.182 mil
 * 1 knot = 1,852 km
 */
public abstract class Sefer {
    YukGemisi yukGemisi;
    int seferNumarasi;
    String seferGuzergahi;
    String tehlikeDuzeyi;
    double tamamlamaSuresi; // saat
    double gelir; // dolar
    double gider; // dolar
   int seferdekiSure; // Gun
    int seferMesafesi; // mil
    double ruzgarHizi; // knot
    int ruzgarYonu;
    int akintiYonu;
    double akintiHizi; // knot
    double katEdilenMesafe;
    String gemiAdi;
    double yakitTuketimi;
    double gemiHiz;

    public abstract void cevreselFaktor();

    public Sefer(YukGemisi yukGemisi) {
        this.yukGemisi = yukGemisi;
        this.yakitTuketimi = yukGemisi.yakitTuketimi;
        this.gemiHiz = yukGemisi.gemiHiz;
        this.gemiAdi = yukGemisi.gemiAdi;
    }
}

class Mumbai_PortSaid extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 5;
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi = Math.random() * 3 + 1;
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Mumbai_PortSaid(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 1;
        this.seferGuzergahi = "Guzergah1";
        this.tehlikeDuzeyi = "AZ TEHLIKELI";
        this.seferMesafesi = 4750; // Deniz Mili
    }
}

class Santos_Lagos extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 10;
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi = Math.random() * 3 + 3;
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Santos_Lagos(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 2;
        this.seferGuzergahi = "Guzergah2";
        this.tehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.seferMesafesi = 3350; // Deniz Mili
    }
}

class Shanghai_LosAngeles extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 15;
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi = Math.random() * 3 + 6;
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Shanghai_LosAngeles(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 3;
        this.seferGuzergahi = "Guzergah3";
        this.tehlikeDuzeyi = "TEHLİKELİ";
        this.seferMesafesi = 6100; // Deniz Mili
    }
}

class Murmansk_Shanghai extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi = Math.random() * 5 + 20;
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi = Math.random() * 3 + 9;
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Murmansk_Shanghai(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 4;
        this.seferGuzergahi = "Guzergah4";
        this.tehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.seferMesafesi = 12500; // Deniz Mili

    }
}
