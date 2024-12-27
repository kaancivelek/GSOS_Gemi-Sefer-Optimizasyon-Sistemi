package org.example;
import java.util.ArrayList;


public class VeriYonetimi {

private ArrayList<Gemi> gemiKayitlari;
private ArrayList<Sefer> seferKayitlari;
private ArrayList<Sefer> seferRaporlari;

public VeriYonetimi() {
    this.gemiKayitlari = new ArrayList<>(); // ArrayList oluşturuluyor
    this.seferKayitlari = new ArrayList<>(); // ArrayList oluşturuluyor
    this.seferRaporlari = new ArrayList<>(); // ArrayList oluşturuluyor
}

public void ekle(Gemi gemi){
this.gemiKayitlari.add(gemi);
}
public void ekle(Sefer sefer){
    this.seferKayitlari.add(sefer);
}

public void listele(){

}


    public void sec(){}

public void goruntule(){}

    public void sil(){}

public void duzenle(){}


}

