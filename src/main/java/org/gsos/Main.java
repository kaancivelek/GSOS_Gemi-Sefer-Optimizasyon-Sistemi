package org.gsos;

public class Main {
    public static void main(String[] args) {

        do{
            SeferKayitlari seferKayitlari = new SeferKayitlari();
            GemiListesi gemilistesi = new GemiListesi();
            SeferDetaylari seferDetaylari = new SeferDetaylari();


            YukGemisi yukGemisi = new YukGemisi();
            gemilistesi.ekle(yukGemisi);

HataYakalama oku = new HataYakalama();
            System.out.println("Rotanizi seciniz.");
int secim= oku.nextIntForNavigation(1,4);


Sefer sefer;
switch(secim){

            case 1: System.out.println("Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)");sefer =new Mumbai_PortSaid(yukGemisi);break;
            case 2: System.out.println("Brezilya (Santos) - Nijerya (Lagos)"); sefer =new Santos_Lagos(yukGemisi); break;
            case 3: System.out.println("Çin (Shanghai) - ABD (Los Angeles)"); sefer =new Shangai_LosAngels(yukGemisi);  break;
            case 4: System.out.println("Rusya (Murmansk) - Çin (Shanghai)"); sefer =new Murnmask_Shangai(yukGemisi);  break;
    default: System.out.println("Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)"); sefer = new Mumbai_PortSaid(yukGemisi); break;
        }
            System.out.println("patlamadi");

            seferKayitlari.ekle(sefer);
            sefer.tamamlamaSuresi= org.gsos.MatematikselIslemler.tahminiVarisZamaniHesapla(yukGemisi.gemiHiz, sefer.seferMesafesi);
                   sefer.seferdekiSure=0;
        while(sefer.seferdekiSure<=sefer.tamamlamaSuresi){
            sefer.cevreselFaktor();
sefer.seferdekiSure++;
sefer.katEdilenMesafe+= yukGemisi.gemiHiz;
yukGemisi.yakitTuketimi= org.gsos.MatematikselIslemler.yakitTuketimiHesapla(yukGemisi.gemiHiz,sefer.akintiHizi,sefer.akintiYonu,sefer.ruzgarHizi,sefer.ruzgarYonu);
seferDetaylari.ekle(sefer);
        }

seferDetaylari.listele();
break;

        }while(true);

    }}


/*
Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)

Yaklaşık Mesafe: 4.500 - 5.000 deniz mili.
Bu rota, Arap Denizi'nden Kızıldeniz'e ve Süveyş Kanalı'na doğru ilerler.
Brezilya (Santos) - Nijerya (Lagos)

Yaklaşık Mesafe: 3.200 - 3.500 deniz mili.
Güney Atlantik Okyanusu'nu geçerek bir rota izler.
Çin (Shanghai) - ABD (Los Angeles)

Yaklaşık Mesafe: 6.000 - 6.200 deniz mili.
Pasifik Okyanusu üzerinden bir rota takip edilir.
Rusya (Murmansk) - Çin (Shanghai)

Yaklaşık Mesafe: 12.000 - 13.000 deniz mili.
Bu rota genellikle Avrupa'nın kuzeyinden ve Asya'nın doğu kıyılarından geçerek ilerler.


Hint Okyanusu
•	Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)
Rotanın özellikleri: Hindistan’dan Süveyş Kanalı’na kadar deniz trafiği genellikle yoğundur. Bu rota, Avrupa ve Asya arasındaki en önemli ticaret yollarından biridir.
•	Hindistan (Chennai) - Endonezya (Jakarta)
Rotanın özellikleri: Güneydoğu Asya bağlantısı, genellikle petrol ve mineral yük taşımacılığında kullanılır. Bengal Körfezi ve Malakka Boğazı üzerinden geçer.
•	Avustralya (Perth) - Güney Afrika (Durban)
Rotanın özellikleri: Hint Okyanusu boyunca uzun mesafeli bir rota. Çoğunlukla doğal kaynak ve mineral taşımacılığı için kullanılır.
________________________________________
Atlas Okyanusu
•	ABD (New York) - Avrupa (Rotterdam, Hollanda)
Rotanın özellikleri: Kuzey Atlantik ticaret hattı. Dünyanın en yoğun ticaret yollarından biridir, konteyner taşımacılığı yaygındır.
•	Brezilya (Santos) - Nijerya (Lagos)
Rotanın özellikleri: Güney Atlantik üzerindeki rota, genellikle tarım ürünleri ve petrol taşımacılığı için kullanılır.
•	Kanada (Halifax) - Birleşik Krallık (Liverpool)
Rotanın özellikleri: Kuzey Atlantik üzerindeki bu rota, denizcilik açısından eski bir gelenektir. Çoğunlukla genel kargo ve konteyner taşımacılığı yapılır.
________________________________________
Pasifik Okyanusu
•	Çin (Shanghai) - ABD (Los Angeles)
Rotanın özellikleri: Pasifik’teki en yoğun ticaret rotalarından biri. Elektronik ve diğer tüketim mallarını taşımada kullanılır.
•	Japonya (Tokyo) - Avustralya (Sydney)
Rotanın özellikleri: Asya-Pasifik ticareti için önemli bir rota. Endüstriyel ürünler ve kömür taşımacılığı bu hat üzerinde yaygındır.
•	Şili (Valparaiso) - Çin (Guangzhou)
Rotanın özellikleri: Latin Amerika ile Asya arasında bakır, meyve ve mineral taşımacılığı için kullanılır.
________________________________________
Kuzey Kutup Rotası
•	Rusya (Murmansk) - Çin (Shanghai)
Rotanın özellikleri: Arktik rotası, buz kırıcı gemilerle Kuzey Kutbu boyunca geçiş yapılmasını sağlar. Hızlı ama risklidir.



* */