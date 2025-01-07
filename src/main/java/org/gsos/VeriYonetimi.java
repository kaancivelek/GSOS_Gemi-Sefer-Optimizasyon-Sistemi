package org.gsos;

import java.util.ArrayList;




// T verisiyle çalışan soyut sınıf. Tüm veri yönetim işlemleri için temel görevleri sağlar.
abstract class VeriYonetimi<T> {
    private ArrayList<T> veriler;

    public VeriYonetimi() {
        this.veriler = new ArrayList<>();
    }

    public void ekle(T kayit) {
        this.veriler.add(kayit); // Yeni kayıt ekler
    }

    public ArrayList<T> getVeriler() {
        return veriler; // Verileri döndürür
    }

    public abstract void listele(); // Listeleme işlemi
}

// Gemi verilerini listeleyen sınıf.
class GemiListesi extends VeriYonetimi<YukGemisi> {
    @Override
    public void listele() {
        // Tablo başlıkları
        String boyutlandirma = "| %-15s | %-15s | %-10s | %-15s | %-15s |%n";
        String cizgi = "+-----------------+-----------------+------------+-----------------+-----------------+";

        // Tablo başlıklarını yazdır
        System.out.println(cizgi);
        System.out.printf(boyutlandirma, "Gemi Adı", "Yapı Malzeme", "Ağırlık(Ton)", "Azami Yük(Ton)", "Yük Mik(Ton)");
        System.out.println(cizgi);

        // Gemileri listele
        for (YukGemisi gemi : getVeriler()) {
            System.out.printf(boyutlandirma,
                    gemi.gemiAdi,
                    gemi.yapiMalzeme,
                    String.format("%.2f", gemi.agirlik),
                    String.format("%.2f", gemi.azamiYuk),
                    String.format("%.2f", gemi.yukMik));
        }
        System.out.println(cizgi);
    }
}

// Sefer kayıtlarını listeleyen sınıf.
class SeferKayitlari extends VeriYonetimi<Sefer> {
    @Override
    public void listele() {
        // Tablo başlıkları
        String boyutlandirma = "| %-15s | %-15s | %-20s | %-15s | %-20s | %-15s | %-15s |%n";
        String cizgi = "+-----------------+-----------------+----------------------+-----------------+----------------------+-----------------+-----------------+";

        // Tablo başlıklarını yazdır
        System.out.printf(boyutlandirma, "Sefer Numarası", "Gemi Adı", "Sefer Güzergahı", "Tamamlama Süresi", "Tehlike Düzeyi", "Gelir (TL)", "Gider (TL)");
        System.out.println(cizgi);

        // Seferleri listele
        for (Sefer sefer : getVeriler()) {
            System.out.printf(boyutlandirma,
                    sefer.seferNumarasi,
                    sefer.gemiAdi,
                    sefer.seferGuzergahi,
                    String.format("%.2f", sefer.tamamlamaSuresi),
                    sefer.tehlikeDuzeyi,
                    String.format("%.2f", sefer.gelir),
                    String.format("%.2f", sefer.gider));
        }
        System.out.println(cizgi);
    }
}

// Sefer detaylarını listeleyen sınıf.
class SeferDetaylari {

    public void listele(Sefer sefer) {
        // Tablo başlıkları ve çizgi
        String boyutlandirma = "| %-20s | %-25s | %-15s | %-20s | %-15s | %-15s | %-15s | %-15s |%n";
        String cizgi = "+----------------------+--------------------------+-----------------+-----------------------+-------------------+-----------------+-----------------+-----------------+";

        // Tablo başlıklarını yazdır

        System.out.println(cizgi);

        // Sefer verilerini yazdır
        System.out.printf(boyutlandirma,
                sefer.seferdekiSure,
                String.format("%.2f", sefer.katEdilenMesafe),
                String.format("%.2f", sefer.yukGemisi.motoraEris().yakitTuketimi),
                String.format("%.2f", sefer.gemiHiz),
                String.format("%.2f", sefer.ruzgarHizi),
                sefer.ruzgarYonu,
                String.format("%.2f", sefer.akintiHizi),
                sefer.akintiYonu);

        System.out.println(cizgi);
    }

}

