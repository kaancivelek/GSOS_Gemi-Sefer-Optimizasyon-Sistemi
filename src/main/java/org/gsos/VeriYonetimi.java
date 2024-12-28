package org.gsos;
import java.util.ArrayList;


abstract class VeriYonetimi<T> {
    ArrayList<T> veriler;

    public VeriYonetimi() {this.veriler = new ArrayList<>();}

    public void ekle(T kayit) {this.veriler.add(kayit);}

    public abstract void listele();

}

class GemiListesi extends VeriYonetimi<Gemi> {
    @Override
    public void listele() {

//String format metodu kullanarak internette ASCII ART yaparak duzgun bir sekilde verilerimizi yazdirmayi hedefledim.
            String boyutlandirma= "| %-15s | %-15s | %-10s | %-15s | %-15s | %-15s | %-10s |%n";
            String cizgi = "+-----------------+-----------------+------------+-----------------+-----------------+-----------------+------------+";

//bu kısım tablo başlığı
            System.out.println(cizgi);
            System.out.printf(boyutlandirma, "Gemi Adi","Yapı Malzeme", "Ağırlık(Ton)", "Hacim(Gros Tonaj)", "Azami Yük(Ton)", "Yük Mik(Ton)", "Azami Hız(Knot)");
            System.out.println(cizgi);
//bu kısım tablo başlığı

            // bu kısım tablo öğelerini ekrana yazdırmayı içeriyor.
            for (Gemi gemi : veriler) {
               System.out.printf(boyutlandirma,
                        gemi.gemiAdi,
                        gemi.yapiMalzeme,
                        String.format("%.2f", gemi.agirlik),
                        String.format("%.2f", gemi.hacim),
                        String.format("%.2f", gemi.azamiYuk),
                        String.format("%.2f", gemi.yukMik),
                        String.format("%.2f", gemi.hiz));
            }System.out.println(cizgi);
        }

    }

    class SeferKayitlari extends VeriYonetimi<Sefer> {
        @Override
        public void listele() {


//String format metodu kullanarak internette ASCII ART yaparak duzgun bir sekilde verilerimizi yazdirmayi hedefledim.
            String boyutlandirma= "| %-15s | %-15s | %-20s | %-15s | %-20s | %-15s | %-15s |%n";
            String cizgi = "+-----------------+-----------------+----------------------+-----------------+----------------------+-----------------+-----------------+";

//bu kısım tablo başlığı
            System.out.println(cizgi);
            System.out.printf(boyutlandirma, "Sefer Numarasi","Geminin Adi","Sefer Guzergahi(A-B)", "Sefer Suresi(Saat)", "Tehlike Duzeyi(%)", "Gelir(TL)", "Gider(TL)");
            System.out.println(cizgi);
//bu kısım tablo başlığı

            // bu kısım tablo öğelerini ekrana yazdırmayı içeriyor.
            for (Sefer sefer : veriler) {
               /* System.out.printf(boyutlandirma,
                        sefer.seferNumarasi,
                         sefer.gemiAdi,
                        String.format("%.2f", sefer.guzergah),
                        String.format("%.2f", sefer.tamamlamaSuresi),
                        String.format("%.2f", sefer.tehlikeDuzeyi),
                        String.format("%.2f", sefer.toplamGelir),
                        String.format("%.2f", sefer.toplamGider));
            }System.out.println(cizgi);*/
        }

        }

    }

    class SeferDetaylari extends VeriYonetimi<Sefer> {
        @Override
        public void listele() {
            //String format metodu kullanarak internette ASCII ART yaparak duzgun bir sekilde verilerimizi yazdirmayi hedefledim.
            String boyutlandirma= "| %-20s | %-25s | %-15s | %-20s | %-10s | %-15s | %-15s | %-15s | %-15s |%-15s |%n";
            String cizgi = "+----------------------+--------------------------+-----------------+-----------------------+-------------------+-----------------+-----------------+-----------------+-----------------+-----------------+";

//bu kısım tablo başlığı
            //System.out.println(sefer.seferNumarasi+" NUMARALI SEFERIN DETAYLARI");
            System.out.println(cizgi);
            System.out.printf(boyutlandirma, "Seferdeki sure(Saat)","Kat edilen Mesafe(Deniz Mili)","Yakit Tuketimi(LT/sa)","Metal Yorgunlugu","Hiz(knot)","Ruzgar Hizi(km/sa)","Ruzgar Yonu", "Akinti Hızı(cm/s)", "Akinti Yonu");
            System.out.println(cizgi);
//bu kısım tablo başlığı

            // bu kısım tablo öğelerini ekrana yazdırmayı içeriyor.
            for (Sefer sefer : veriler) {
               /* System.out.printf(
               boyutlandirma,
                        sefer.Numarasi,
                         sefer.gemiAdi,
                        String.format("%.2f", sefer.guzergah),
                        String.format("%.2f", sefer.tamamlamaSuresi),
                        String.format("%.2f", sefer.tehlikeDuzeyi),
                        String.format("%.2f", sefer.toplamGelir),
                        String.format("%.2f", sefer.toplamGider));
            }System.out.println(cizgi);*/

        }
    }
    }