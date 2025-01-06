package org.gsos;

public class Sefer {
    YukGemisi gemisi;

    int seferNumarasi;
    String seferGuzergahi;
    String tehlikeDuzeyi;
    int tahminiSure;
    double gelir;
    double gider;
    int seferdekisure;
    int mesafe ;
    double ruzgarHizi;
    int ruzgarYonu;
    double akintiHızı;
    int akintiYonu;

    public void giderHesapla() {
        Gemi.Motor motor = new Gemi.Motor(2, 100, "A kalite", 500); // Gemi motoru
        double yakitMaliyeti = motor.yakitHesapla(gemisi.ortHiz, mesafe) * 10; // 1 litre yakıt maliyeti: 10 birim
        gider += yakitMaliyeti;
    }

}
class sefer1 extends Sefer {
    public sefer1() {
        this.seferGuzergahi = "Guzergah1";
        this.tehlikeDuzeyi = "AZ TEHLİKELİ";
        this.tahminiSure = (int) (mesafe/gemisi.azamiHiz);
        this.gelir = (gemisi.yukMik*50000-this.gider);
        giderHesapla();
        this.seferdekisure = (int) (mesafe/gemisi.ortHiz);
        this.mesafe =400;
        this.ruzgarHizi =(int)(Math.random()*5+5);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHızı =(int)(Math.random()*3+1);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;

    }
}

class sefer2 extends Sefer {
    public sefer2() {
        this.seferNumarasi=01;
        this.seferGuzergahi = "Guzergah2";
        this.tehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.tahminiSure = (int) (mesafe/gemisi.azamiHiz);
        this.gelir = (gemisi.yukMik*100000-this.gider);
        giderHesapla();
        this.seferdekisure = (int) (mesafe/ gemisi.ortHiz);
        this.mesafe =1000;
        this.ruzgarHizi =(int)(Math.random()*5+10);
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHızı =(int)(Math.random()*3+3);
        this.akintiYonu =Math.random() < 0.5 ? 1 : -1;
    }
}

class sefer3 extends Sefer {
    public sefer3() {
        this.seferNumarasi=01;
        this.seferGuzergahi = "Guzergah3";
        this.tehlikeDuzeyi = " TEHLİKELİ";
        this.tahminiSure = (int) (mesafe/ gemisi.azamiHiz);
        this.gelir = (gemisi.yukMik*200000-this.gider);
        giderHesapla();
        this.seferdekisure = (int) (mesafe/gemisi.ortHiz);
        this.mesafe =3500;
        this.ruzgarHizi =(int)(Math.random()*5+15);
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHızı =(int)(Math.random()*3+6);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }
}

class sefer4 extends Sefer {
    public sefer4() {
        this.seferNumarasi=01;
        this.seferNumarasi=01;
        this.seferGuzergahi = "Guzergah4";
        this.tehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.tahminiSure = (int) (mesafe/ gemisi.azamiHiz);
        this.gelir = (gemisi.yukMik*500000-this.gider);
        this.gider = seferdekisure*150000;
        this.seferdekisure = (int) (mesafe/ gemisi.ortHiz);
        giderHesapla();
        this.ruzgarHizi =(int)(Math.random()*5+20);
        this.ruzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.akintiHızı =(int)(Math.random()*3+9);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }
}