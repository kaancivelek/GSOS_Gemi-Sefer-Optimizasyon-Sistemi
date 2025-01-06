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
    int akintiYonu;
    double akintiHizi; //knot
    double katEdilenMesafe;

    public  abstract void   cevreselFaktor();

    public Sefer(YukGemisi yukGemisi) {this.yukGemisi = yukGemisi;}
}


class Mumbai_PortSaid extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+5);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+1);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Mumbai_PortSaid(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 1;
        this.seferGuzergahi = "Guzergah1";
        this.tehlikeDuzeyi = "AZ TEHLIKELI";
        this.seferMesafesi =4750; //Deniz Mili
    }
}


class Santos_Lagos extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+10);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+3);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Santos_Lagos(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 02;
        this.seferGuzergahi = "Guzergah2";
        this.tehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.seferMesafesi =3350; //Deniz Mili

    }
}

class Shangai_LosAngels extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+15);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+6);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Shangai_LosAngels(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 03;
        this.seferGuzergahi = "Guzergah3";
        this.tehlikeDuzeyi = " TEHLİKELİ";
        this.seferMesafesi =6100; // Deniz Mili

    }
}

class Murnmask_Shangai extends Sefer {
    @Override
    public void cevreselFaktor() {
        this.ruzgarHizi =(int)(Math.random()*5+20);
        this.ruzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.akintiHizi =(int)(Math.random()*3+9);
        this.akintiYonu = Math.random() < 0.5 ? 1 : -1;
    }

    public Murnmask_Shangai(YukGemisi yukGemisi) {
        super(yukGemisi);
        this.seferNumarasi = 04;
        this.seferGuzergahi = "Guzergah4";
        this.tehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.seferMesafesi = 12500; //Deniz Mili
        this.gelir = (yukGemisi.yukMik * 500000 - this.gider);
    }
}
