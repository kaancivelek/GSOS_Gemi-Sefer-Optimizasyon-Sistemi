package org.example;

public class VeriDepolama {
/*Dinamik Iki boyutlu gemileri ve ozelliklerini tutan bir dizi
  0    1         2          3       4        5                 6
 Gemi Adi|Yapi malzemesi|agirligi|Hacmi|Azami Yuk Siniri|Yakit Deposu buyuklugu|
*/
private String [][] gemiListesi;

/*
Sefer kayitlari ve iceriklerinin
*/
private String [][]seferKayitlari;


/*arama, düzenleme, silme, görüntüleme*/



//Listeleme
    void gemiListesiGoruntule(){
           int cizgiuzunlugu=12;
        for (String[] satir : gemiListesi) { // Her satiri dolasir.
            System.out.print("|");
            for (String sutun : satir) {   // Ilgili satirdaki sutunlari dolasir.
                System.out.printf(" %-9s |", gemiListesi);//9. karakter alanindan yazdirmak icin oteler
                System.out.print(sutun + " ");
            }
            //her sutun icin denk gelen genisligin carpimiyla olmasi gereken cizgi miktarini hesaplayıp cizgileri ekler
            System.out.println("-".repeat(cizgiuzunlugu * gemiListesi[0].length));
        }}

        void seferKayitlariGoruntule(){
            int cizgiuzunlugu=12;
            for (String[] satir : this.seferKayitlari) { // Her satiri dolasir.
                System.out.print("|");
                for (String sutun : satir) {   // Ilgili satirdaki sutunlari dolasir.
                    System.out.printf(" %-9s |",seferKayitlari);//9. karakter alanindan yazdirmak icin oteler
                    System.out.print(sutun + " ");
                }
                //her sutun icin denk gelen genisligin carpimiyla olmasi gereken cizgi miktarini hesaplayıp cizgileri ekler
                System.out.println("-".repeat(cizgiuzunlugu * this.seferKayitlari[0].length));
            }
    }

}
