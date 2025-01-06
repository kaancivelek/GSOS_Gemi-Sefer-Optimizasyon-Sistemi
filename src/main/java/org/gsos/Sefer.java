package org.gsos;

public class Sefer {
    YukGemisi gemisi;

    int SeferNumarasi;
    String SeferGuzergahi;
    String TehlikeDuzeyi;
    int TahminiSure;
    int Gelir;
    int Gider;
    int Seferdekisure;
    int Mesafe ;
    int RuzgarHizi;
    int RuzgarYonu;
    int AkintiHızı;
    int AkintiYonu;

}
class sefer1 extends Sefer {
    public sefer1() {
        this.SeferGuzergahi = "Guzergah1";
        this.TehlikeDuzeyi = "AZ TEHLİKELİ";
        this.TahminiSure = (int) (Mesafe/gemisi.azamiHiz);
        this.Gelir = (int) (gemisi.yukMik*50000-this.Gider);
        this.Gider =Seferdekisure*5000;
        this.Seferdekisure = (int) (Mesafe/gemisi.ortHız);
        this.Mesafe =400;
        this.RuzgarHizi =(int)(Math.random()*5+5);
        this.RuzgarYonu =  Math.random() < 0.5 ? 1 : -1;
        this.AkintiHızı =(int)(Math.random()*3+1);
        this.AkintiYonu = Math.random() < 0.5 ? 1 : -1;

    }
}

class sefer2 extends Sefer {
    public sefer2() {
        this.SeferGuzergahi = "Guzergah2";
        this.TehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.TahminiSure = (int) (Mesafe/gemisi.azamiHiz);
        this.Gelir =(int) (gemisi.yukMik*100000-this.Gider);
        this.Gider = Seferdekisure*10000;
        this.Seferdekisure = (int) (Mesafe/ gemisi.ortHız);
        this.Mesafe =1000;
        this.RuzgarHizi =(int)(Math.random()*5+10);
        this.RuzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.AkintiHızı =(int)(Math.random()*3+3);
        this.AkintiYonu =Math.random() < 0.5 ? 1 : -1;
    }
}

class sefer3 extends Sefer {
    public sefer3() {
        this.SeferGuzergahi = "Guzergah3";
        this.TehlikeDuzeyi = " TEHLİKELİ";
        this.TahminiSure = (int) (Mesafe/ gemisi.azamiHiz);
        this.Gelir =(int) (gemisi.yukMik*200000-this.Gider);
        this.Gider = Seferdekisure*50000;
        this.Seferdekisure = (int) (Mesafe/gemisi.ortHız);
        this.Mesafe =3500;
        this.RuzgarHizi =(int)(Math.random()*5+15);
        this.RuzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.AkintiHızı =(int)(Math.random()*3+6);
        this.AkintiYonu = Math.random() < 0.5 ? 1 : -1;
    }
}

class sefer4 extends Sefer {
    public sefer4() {
        this.SeferGuzergahi = "Guzergah4";
        this.TehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.TahminiSure = (int) (Mesafe/ gemisi.azamiHiz);
        this.Gelir =(int) (gemisi.yukMik*500000-this.Gider);
        this.Gider = Seferdekisure*150000;
        this.Seferdekisure = (int) (Mesafe/ gemisi.ortHız);
        this.Mesafe =10000;
        this.RuzgarHizi =(int)(Math.random()*5+20);
        this.RuzgarYonu = Math.random() < 0.5 ? 1 : -1;
        this.AkintiHızı =(int)(Math.random()*3+9);
        this.AkintiYonu = Math.random() < 0.5 ? 1 : -1;
    }
}