package org.gsos;
/*
* 1 knot 47.182mil
* 1 knot 1,852 km
* */
 public abstract class Sefer {
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

    public  abstract void   çevreselFaktor();

    public Sefer(YukGemisi yukGemisi) {this.yukGemisi = yukGemisi;}
}


class Sefer1 extends Sefer {
    @Override
    public void çevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+5);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+1);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Sefer1(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 01;
        this.seferGuzergahi = "Guzergah1";
        this.tehlikeDuzeyi = "AZ TEHLIKELI";
        this.seferMesafesi =400;
        this.gelir = (yukGemisi.yukMik*50000-this.gider);
    }
}


class Sefer2 extends Sefer {
    @Override
    public void çevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+10);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+3);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Sefer2(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 02;
        this.seferGuzergahi = "Guzergah2";
        this.tehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.seferMesafesi =1000;
        this.gelir = (yukGemisi.yukMik*100000-this.gider);
    }
}

class Sefer3 extends Sefer {
    @Override
    public void çevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+15);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+6);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Sefer3(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 03;
        this.seferGuzergahi = "Guzergah3";
        this.tehlikeDuzeyi = " TEHLİKELİ";
        this.seferMesafesi =3500;
        this.gelir = (yukGemisi.yukMik*200000-this.gider);
    }
}

class Sefer4 extends Sefer {
    @Override
    public void çevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+20);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+9);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Sefer4(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 04;
        this.seferGuzergahi = "Guzergah4";
        this.tehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.seferMesafesi = 10000;
        this.gelir = (yukGemisi.yukMik * 500000 - this.gider);
    }
}
