package org.gsos;
/*
* 1 knot 47.182mil
* 1 knot 1,852 km
* */
class Sefer {
    YukGemisi yukGemisi;
    int seferNumarasi;
    String seferGuzergahi;
    String tehlikeDuzeyi;
    double tamamlamaSuresi;//
    double gelir;//dolar
    double gider;//dolar
    int seferdekiSure;//Gun
    int seferMesafesi;//mil
    double ruzgarHizi;//knot
    int ruzgarYonu;
    double akintiHizi; //km/saat
    int akintiYonu;

public Sefer(YukGemisi yukGemisi) {this.yukGemisi = yukGemisi;}
}


class Sefer1 extends Sefer {
    public Sefer1(YukGemisi yukGemisi) {
        super(yukGemisi);
yukGemisi.hiz =15;
        this.seferGuzergahi = "Guzergah1";
        this.tehlikeDuzeyi = "AZ TEHLIKELI";
        this.seferMesafesi =400;
        this.ruzgarHizi =(int)(Math.random()*5+5);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+1);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;

        this.gelir = (yukGemisi.yukMik*50000-this.gider);
    }
}

/*class Sefer2 extends Sefer {
    public Sefer2() {
        this.seferGuzergahi = "Guzergah2";
        this.tehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.tahminiSure = (int) (mesafe/ yukGemisi.azamiHiz);
        this.gelir = (yukGemisi.yukMik*100000-this.gider);
        giderHesapla();
        this.seferdekiSure = (int) (mesafe/ yukGemisi.ortHiz);
        this.mesafe =1000;
        this.ruzgarHizi =(int)(Math.random()*5+10);
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+3);
        this.akintiYonu =Math.random() < 0.5 ? 1 : -1;
    }
}

class Sefer3 extends Sefer {
    public Sefer3() {
        this.seferGuzergahi = "Guzergah3";
        this.tehlikeDuzeyi = " TEHLİKELİ";
        this.tahminiSure = (int) (mesafe/ yukGemisi.azamiHiz);
        this.gelir = (yukGemisi.yukMik*200000-this.gider);
        giderHesapla();
        this.seferdekiSure = (int) (mesafe/ yukGemisi.ortHiz);
        this.mesafe =3500;
        this.ruzgarHizi =(int)(Math.random()*5+15);
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+6);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }
}

class Sefer4 extends Sefer {
    public Sefer4() {
        this.seferGuzergahi = "Guzergah4";
        this.tehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.tahminiSure = (int) (mesafe/ yukGemisi.azamiHiz);
        this.gelir = (yukGemisi.yukMik*500000-this.gider);
        this.gider = seferdekiSure *150000;
        this.seferdekiSure = (int) (mesafe/ yukGemisi.ortHiz);
        giderHesapla();
        this.ruzgarHizi =(int)(Math.random()*5+20);
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+9);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }*/
