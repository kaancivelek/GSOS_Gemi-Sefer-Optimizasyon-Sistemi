package org.gsos;

public class Main {
    public static void main(String[] args) {
        do {
            // Veri yönetimi nesnelerini oluştur
            SeferKayitlari seferKayitlari = new SeferKayitlari();
            GemiListesi gemilistesi = new GemiListesi();
            SeferDetaylari seferDetaylari = new SeferDetaylari();

            // Yük gemisi oluştur ve listeye ekle
            YukGemisi yukGemisi = new YukGemisi();
            // YukGemisi constructor'ı zaten kullanıcıdan girdi alıyor
            gemilistesi.ekle(yukGemisi);
            gemilistesi.listele();

            // Rota seçimi
            HataYakalama oku = new HataYakalama();
            System.out.println("\nRotanızı seçiniz:");
            System.out.println("1. Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)");
            System.out.println("2. Brezilya (Santos) - Nijerya (Lagos)");
            System.out.println("3. Çin (Shanghai) - ABD (Los Angeles)");
            System.out.println("4. Rusya (Murmansk) - Çin (Shanghai)");
            int secim = oku.nextIntForNavigation(1, 4);

            // Sefer oluştur
            Sefer sefer;
            switch(secim) {
                case 1:
                    System.out.println("\nSeçilen rota: Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)");
                    sefer = new Mumbai_PortSaid(yukGemisi);
                    break;
                case 2:
                    System.out.println("\nSeçilen rota: Brezilya (Santos) - Nijerya (Lagos)");
                    sefer = new Santos_Lagos(yukGemisi);
                    break;
                case 3:
                    System.out.println("\nSeçilen rota: Çin (Shanghai) - ABD (Los Angeles)");
                    sefer = new Shanghai_LosAngeles(yukGemisi);
                    break;
                case 4:
                    System.out.println("\nSeçilen rota: Rusya (Murmansk) - Çin (Shanghai)");
                    sefer = new Murmansk_Shanghai(yukGemisi);
                    break;
                default:
                    System.out.println("\nVarsayılan rota: Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)");
                    sefer = new Mumbai_PortSaid(yukGemisi);
                    break;
            }

            // Başlangıç değerlerini ayarla
            sefer.gelir = 0.0;
            sefer.gider = 0.0;
            sefer.katEdilenMesafe = 0.0;
            sefer.tamamlamaSuresi = MatematikselIslemler.tahminiVarisZamaniHesapla(yukGemisi.gemiHiz, sefer.seferMesafesi);
            String boyutlandirma = "| %-20s | %-25s | %-15s | %-20s | %-15s | %-15s | %-15s | %-15s |%n";
            // Sefer kaydını ekle ve listele
            seferKayitlari.ekle(sefer);
            System.out.println("\n=== SEFER KAYDI ===");
            System.out.printf(boyutlandirma, "Seferdeki Süre (Saat)", "Kat Edilen Mesafe (Mil)", "Yakıt Tüketimi (Ton)", "Gemi Hızı (Knot)", "Rüzgar Hızı (Knot)", "Rüzgar Yönü", "Akıntı Hızı (Knot)", "Akıntı Yönü");
            seferKayitlari.listele();

            // Sefer simulasyonu
            System.out.println("\n=== SEFER SİMÜLASYONU BAŞLIYOR ===");
            sefer.seferdekiSure = 0;
            double toplamYakitTuketimi = 0.0;
            String cizgi = "+----------------------+--------------------------+-----------------+-----------------------+-------------------+-----------------+-----------------+-----------------+";
            System.out.println("\n=== SEFER DETAYLARI ===");
            while(sefer.seferdekiSure <= sefer.tamamlamaSuresi) {
                // Çevresel faktörleri güncelle
                sefer.cevreselFaktor();

                // Yakıt tüketimini hesapla ve toplama ekle
                double saatlikYakitTuketimi = MatematikselIslemler.yakitTuketimiHesapla(
                        yukGemisi.gemiHiz,
                        sefer.akintiHizi,
                        sefer.akintiYonu,
                        sefer.ruzgarHizi,
                        sefer.ruzgarYonu
                );
                toplamYakitTuketimi += saatlikYakitTuketimi;

                // Değerleri güncelle
                sefer.yakitTuketimi = saatlikYakitTuketimi;
                sefer.katEdilenMesafe += yukGemisi.gemiHiz;
                sefer.seferdekiSure++;

                // Her saatin detayını kaydet


                // Maliyet hesapları (1 ton yakıt = 52,920 TL)
                sefer.gider = toplamYakitTuketimi * 52920;
                sefer.gelir = sefer.gider * 1.2; // %20 kar

                // Final durumu göster

                seferDetaylari.listele(sefer);
            }

            System.out.println("\nYeni bir sefer planlamak için herhangi bir tuşa basın (Çıkış için CTRL+C)");
            try {
                System.in.read();
            } catch(Exception e) {
                break;
            }

        } while(true);
    }
}


/*




 */