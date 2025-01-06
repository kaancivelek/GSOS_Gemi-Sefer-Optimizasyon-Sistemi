package org.gsos;
import java.util.ArrayList;


// T verisiyle calisan soyut sinif. Tum veri yonetim islemleri icin temel gorevleri saglar.
abstract class VeriYonetimi<T> {
    private ArrayList<T> veriler;
Gemi gemi;
Sefer sefer;

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
        String boyutlandirma = "| %-15s | %-15s | %-10s | %-15s | %-15s | %-10s |%n";
        String cizgi = "+-----------------+-----------------+------------+-----------------+-----------------+-----------------+------------+";

        // Tablo basligi yazdir.
        System.out.println(cizgi);
        System.out.printf(boyutlandirma, "Gemi Adi", "Yapı Malzeme", "Ağırlık(Ton)", "Azami Yük(Ton)", "Yük Mik(Ton)", "Azami Hız(Knot)");
        System.out.println(cizgi);

        // Gemi verilerini ekrana yazdir.
        for (Gemi gemi : getVeriler()) {
            System.out.printf(boyutlandirma,
                    gemi.gemiAdi,
                    gemi.yapiMalzeme,
                    String.format("%.2f", gemi.agirlik),
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
        System.out.println(cizgi);}}

        // Sefer verilerini ekrana yazdir.
 /*       for (Sefer sefer : getVeriler()) {
             System.out.printf(boyutlandirma,
                     gemi.gemiAdi,
                     String.format("%.2f", sefer.seferNumarasi),
                     String.format("%.2f", sefer.seferGuzergahi),
                     String.format("%.2f", sefer.tahminiSure),
                     String.format("%.2f", sefer.tehlikeDuzeyi),
                     String.format("%.2f", sefer.gelir),
                     String.format("%.2f", sefer.gider));
             System.out.println(cizgi);
        }
    }
}

// Sefer detaylarini listeleyen sinif.
class SeferDetaylari extends VeriYonetimi<Sefer> {
    @Override
    public void listele() {

        // Tablo boyutlandirma ve cizgi formatlari.
        String boyutlandirma = "| %-20s | %-25s | %-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-15s |%-15s | %-15s | %-15s |%-15s | %-15s | %-15s |%n";
        String cizgi = "+----------------------+--------------------------+-----------------+-----------------------+-------------------+-----------------+-----------------+-----------------+-----------------+";

        // Tablo basligi yazdir.
        System.out.println(cizgi);
        System.out.printf(boyutlandirma, "Seferdeki sure(Saat)", "Kat edilen Mesafe(Deniz Mili)", "Yakit Tuketimi(LT/sa)", "Hiz(knot)", "Ruzgar Hizi(km/sa)", "Ruzgar Yonu", "Akinti Hızı(cm/s)", "Akinti Yonu");
        System.out.println(cizgi);

        // Sefer detaylarini ekrana yazdir.
       for (Sefer sefer : getVeriler()) {

            System.out.printf(boyutlandirma,
                    String.format("%.2f", sefer.seferdekiSure),
                    String.format("%.2f", sefer.mesafe),
                    String.format("%.2f", sefer.yukGemisi.motor.yakitTuketimi),
                    String.format("%.2f", gemi.ortHiz),
                    String.format("%.2f", sefer.ruzgarHizi),
                    String.format("%.2f", sefer.ruzgarYonu),
                    String.format("%.2f", sefer.akintiHizi),
                    String.format("%.2f", sefer.akintiYonu));
            System.out.println(cizgi);
        }
    }
}
*/