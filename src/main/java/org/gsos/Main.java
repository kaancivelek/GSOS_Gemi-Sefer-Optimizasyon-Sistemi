package org.gsos;

public class Main {
    public static void main(String[] args) {
        // Giriş ve hata yönetimi için HataYakalama sınıfı örneği
        HataYakalama oku = new HataYakalama();
        int secim;



        // Sefer, gemi ve detaylarla ilgili kayıtların tutulduğu sınıf örnekleri oluşturuldu
        SeferKayitlari seferKayitlari = new SeferKayitlari();
        GemiListesi gemilistesi = new GemiListesi();
        SeferDetaylari seferDetaylari = new SeferDetaylari();

        while (true) {
            // Kullanıcıya seçeneklerin sunulması
            System.out.println("""
                        1- Yeni sefere Basla.
                        2- Yeni gemi ekle.
                        3- Seferleri listele.
                        4- Gemileri Listele.
                        
                        5- Cikis yap.
                        """);

            // Kullanıcıdan 1 ile 5 arasında bir seçim alınması
            secim = oku.nextIntForNavigation(1, 5);

            if (secim == 5) {
                break; // Çıkış yap
            } else {
                switch (secim) {
                    case 2:
                        // Yeni gemi ekleme
                        YukGemisi yeniyukGemisi = new YukGemisi();
                        gemilistesi.ekle(yeniyukGemisi);
                        break;

                    case 3:
                        // Seferleri listeleme
                        if (seferKayitlari.getVeriler().isEmpty()) {
                            System.out.println("Sefer bulunmuyor.");
                            break;
                        } else {
                            seferKayitlari.listele();
                            break;
                        }

                    case 4:
                        // Gemileri listeleme
                        if (gemilistesi.getVeriler().isEmpty()) {
                            System.out.println("Goruntulenecek gemi yok.");
                            break;
                        } else {
                            gemilistesi.listele();
                            break;
                        }

                    default:
                        System.out.println("BUG!");
                        break;

                    case 1:
                        // Yeni sefere başlama
                        if (gemilistesi.getVeriler().isEmpty()) {
                            System.out.println("Sefere cikacak gemi yok.");
                            YukGemisi yukGemisi = new YukGemisi();
                            gemilistesi.ekle(yukGemisi);
                        }

                        gemilistesi.listele();
                        System.out.println("Kacinci gemiyi istiyorsunuz?.");
                        secim = oku.nextIntForNavigation(1, gemilistesi.getVeriler().size());
                        YukGemisi yukGemisi = gemilistesi.getVeriler().get(secim - 1);

                        System.out.println("\nRotanızı seçiniz:");
                        System.out.println("1. Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)");
                        System.out.println("2. Brezilya (Santos) - Nijerya (Lagos)");
                        System.out.println("3. Çin (Shanghai) - ABD (Los Angeles)");
                        System.out.println("4. Rusya (Murmansk) - Çin (Shanghai)");

                        secim = oku.nextIntForNavigation(1, 4);
                        Sefer sefer;

                        // Rota seçimi
                        switch (secim) {
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

                        // Sefer başlangıç değerlerinin atanması
                        sefer.gelir = 0.0;
                        sefer.gider = 0.0;
                        sefer.katEdilenMesafe = 0.0;
                        sefer.tamamlamaSuresi = MatematikselIslemler.tahminiVarisZamaniHesapla(yukGemisi.gemiHiz, sefer.seferMesafesi);

                        // Sefer kaydını ekle ve listele
                        seferKayitlari.ekle(sefer);
                        seferKayitlari.listele();

                        // Sefer simulasyonu başlat
                        System.out.println("\n=== SEFER SİMÜLASYONU BAŞLIYOR ===");
                        sefer.seferdekiSure = 0;
                        double toplamYakitTuketimi = 0.0;

                        // Sefer simülasyonu çıktısının başlıklarını yazdır
                        String cizgi = "+----------------------+--------------------------+-----------------+-----------------------+-------------------+-----------------+-----------------+-----------------+";
                        String boyutlandirma = "| %-25s | %-30s | %-22s | %-22s | %-20s | %-15s | %-20s | %-15s |%n";
                        System.out.println(cizgi);
                        System.out.printf(boyutlandirma,
                                "Seferdeki Süre (Saat)",
                                "Kat Edilen Mesafe (Mil)",
                                "Yakıt Tüketimi (Ton)",
                                "Gemi Hızı (Knot)",
                                "Rüzgar Hızı (Knot)",
                                "Rüzgar Yönü",
                                "Akıntı Hızı (Knot)",
                                "Akıntı Yönü");

                        // Sefer boyunca her saatin detayları hesaplanır
                        while (sefer.seferdekiSure <= sefer.tamamlamaSuresi) {
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
                            yukGemisi.motoraEris().yakitTuketimi = saatlikYakitTuketimi;
                            sefer.katEdilenMesafe += yukGemisi.gemiHiz;
                            sefer.seferdekiSure++;

                            // Maliyet hesapları (1 ton yakıt = 52,920 TL)
                            sefer.gider = toplamYakitTuketimi * 52920;
                            sefer.gelir = sefer.gider * 1.2; // %20 kar

                            // Final durumu göster
                            seferDetaylari.listele(sefer);
                            double yakitMiktari=yukGemisi.motoraEris().yakitMik;
                            yakitMiktari-= yukGemisi.motoraEris().yakitTuketimi;
                            if(yakitMiktari <= 0.0) {
                                System.out.println("Yakit ikmali yapiliyor.");
                                sefer.gider+=5*52920;
                                yakitMiktari += 5;
                            }
                            yukGemisi.motoraEris().bakimKontrolEt(sefer.seferdekiSure);
                        }
                        break;
                }
            }
        }
    }
}
