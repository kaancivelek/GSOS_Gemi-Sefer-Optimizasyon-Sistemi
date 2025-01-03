package org.gsos;
import java.util.ArrayList;


// T verisiyle calisan soyut sinif. Tum veri yonetim islemleri icin temel gorevleri saglar.
abstract class VeriYonetimi<T> {
    private ArrayList<T> veriler;

    public VeriYonetimi() {
        this.veriler = new ArrayList<>();
    }

    // Yeni kayit ekler.
    public void ekle(T kayit) {
        this.veriler.add(kayit);
    }
    public ArrayList<T> getVeriler() {return veriler;}
    // Alt siniflarin doldurmasi gereken listeleme metodu.
    public abstract void listele();
}

// Gemi verilerini listeleyen sinif.
class GemiListesi extends VeriYonetimi<Gemi> {
    @Override
    public void listele() {

        // Tablo boyutlandirma ve cizgi formatlari.
        String boyutlandirma = "| %-15s | %-15s | %-10s | %-15s | %-15s | %-15s | %-10s |%n";
        String cizgi = "+-----------------+-----------------+------------+-----------------+-----------------+-----------------+------------+";

        // Tablo basligi yazdir.
        System.out.println(cizgi);
        System.out.printf(boyutlandirma, "Gemi Adi", "Yapı Malzeme", "Ağırlık(Ton)", "Hacim(Gros Tonaj)", "Azami Yük(Ton)", "Yük Mik(Ton)", "Azami Hız(Knot)");
        System.out.println(cizgi);

        // Gemi verilerini ekrana yazdir.
        for (Gemi gemi : getVeriler()) {
            System.out.printf(boyutlandirma,
                    gemi.gemiAdi,
                    gemi.yapiMalzeme,
                    String.format("%.2f", gemi.agirlik),
                    String.format("%.2f", gemi.hacim),
                    String.format("%.2f", gemi.azamiYuk),
                    String.format("%.2f", gemi.yukMik),
                    String.format("%.2f", gemi.azamiHiz));
        }
        System.out.println(cizgi);
    }
}

// Sefer kayitlarini listeleyen sinif.
class SeferKayitlari extends VeriYonetimi<Sefer> {
    @Override
    public void listele() {

        // Tablo boyutlandirma ve cizgi formatlari.
        String boyutlandirma = "| %-15s | %-15s | %-20s | %-15s | %-20s | %-15s | %-15s |%n";
        String cizgi = "+-----------------+-----------------+----------------------+-----------------+----------------------+-----------------+-----------------+";

        // Tablo basligi yazdir.
        System.out.println(cizgi);
        System.out.printf(boyutlandirma, "Sefer Numarasi", "Geminin Adi", "Sefer Guzergahi(A-B)", "Sefer Suresi(Saat)", "Tehlike Duzeyi(%)", "Gelir(TL)", "Gider(TL)");
        System.out.println(cizgi);

        // Sefer verilerini ekrana yazdir.
       /* for (Sefer sefer : getVeriler()) {
             System.out.printf(boyutlandirma,
                    sefer.seferNumarasi,
                    sefer.gemiAdi,
                    String.format("%.2f", sefer.guzergah),
                    String.format("%.2f", sefer.tamamlamaSuresi),
                    String.format("%.2f", sefer.tehlikeDuzeyi),
                    String.format("%.2f", sefer.toplamGelir),
                    String.format("%.2f", sefer.toplamGider));
            System.out.println(cizgi);
        }*/
    }
}

// Sefer detaylarini listeleyen sinif.
class SeferDetaylari extends VeriYonetimi<Sefer> {
    @Override
    public void listele() {

        // Tablo boyutlandirma ve cizgi formatlari.
        String boyutlandirma = "| %-20s | %-25s | %-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-15s |%n";
        String cizgi = "+----------------------+--------------------------+-----------------+-----------------------+-------------------+-----------------+-----------------+-----------------+-----------------+";

        // Tablo basligi yazdir.
        System.out.println(cizgi);
        System.out.printf(boyutlandirma, "Seferdeki sure(Saat)", "Kat edilen Mesafe(Deniz Mili)", "Yakit Tuketimi(LT/sa)", "Metal Yorgunlugu", "Hiz(knot)", "Ruzgar Hizi(km/sa)", "Ruzgar Yonu", "Akinti Hızı(cm/s)", "Akinti Yonu");
        System.out.println(cizgi);

        // Sefer detaylarini ekrana yazdir.
      /*  for (Sefer sefer : getVeriler()) {
            System.out.printf(boyutlandirma,
                    sefer.Numarasi,
                    sefer.gemiAdi,
                    String.format("%.2f", sefer.guzergah),
                    String.format("%.2f", sefer.tamamlamaSuresi),
                    String.format("%.2f", sefer.tehlikeDuzeyi),
                    String.format("%.2f", sefer.toplamGelir),
                    String.format("%.2f", sefer.toplamGider));
            System.out.println(cizgi);
        }*/
    }
}
