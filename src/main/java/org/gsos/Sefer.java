package org.gsos;

public class Sefer {
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
        this.TahminiSure = Mesafe/hiz;
        this.Gelir =800000-this.Gider ;
        this.Gider = Seferdekisure*50000;
        this.Seferdekisure =Mesafe/orthiz;
        this.Mesafe =150000;
        this.RuzgarHizi =(int)(Math.random()*15);
        this.RuzgarYonu = 0;
        this.AkintiHızı =(int)(Math.random()*10);
        this.AkintiYonu = 0;

    }
}

class sefer2 extends Sefer {
    public sefer2() {
        this.SeferGuzergahi = "Guzergah2";
        this.TehlikeDuzeyi = "ORTA TEHLİKELİ";
        this.TahminiSure = Mesafe/hiz;
        this.Gelir =800000-this.Gider ;
        this.Gider = Seferdekisure*50000;
        this.Seferdekisure =Mesafe/orthiz;
        this.Mesafe =150000;
        this.RuzgarHizi =(int)(Math.random()*15);
        this.RuzgarYonu = 0;
        this.AkintiHızı =(int)(Math.random()*10);
        this.AkintiYonu = 0;
    }
}

class sefer3 extends Sefer {
    public sefer3() {
        this.SeferGuzergahi = "Guzergah3";
        this.TehlikeDuzeyi = " TEHLİKELİ";
        this.TahminiSure = Mesafe/hiz;
        this.Gelir =800000-this.Gider ;
        this.Gider = Seferdekisure*50000;
        this.Seferdekisure =Mesafe/orthiz;
        this.Mesafe =150000;
        this.RuzgarHizi =(int)(Math.random()*15);
        this.RuzgarYonu = 0;
        this.AkintiHızı =(int)(Math.random()*10);
        this.AkintiYonu = 0;
    }
}

class sefer4 extends Sefer {
    public sefer4() {
        this.SeferGuzergahi = "Guzergah4";
        this.TehlikeDuzeyi = "YUKSEK TEHLİKELİ";
        this.TahminiSure = Mesafe/hiz;
        this.Gelir =800000-this.Gider ;
        this.Gider = Seferdekisure*50000;
        this.Seferdekisure =Mesafe/orthiz;
        this.Mesafe =150000;
        this.RuzgarHizi =(int)(Math.random()*15);
        this.RuzgarYonu = 0;
        this.AkintiHızı =(int)(Math.random()*10);
        this.AkintiYonu = 0;
    }
}