package org.gsos;

import java.util.Scanner;

public abstract class Gemi {
    // Gemiye ait özellikler
    String gemiAdi;
    String yapiMalzeme;
    double agirlik;
    double azamiYuk;
    double yukMik;
    double azamiHiz;


    // Alt sınıfların uygulaması gereken soyut metotlar

    public abstract void gemiCalistir();

    public abstract void gemiDurdur();

    // Gemi motorunu temsil eden iç sınıf
    class Motor {
        // Motor özellikleri
        private boolean bakimDurumu;
        private String yakitKalitesi;
        private double yakitMik;
        private int toplamCalismaSaati; // Motorun toplam çalışma süresi
        private int geciciCalismaSaati; // 50 saatlik döngü için geçici sayaç

        // Motor özelliklerini başlatan yapıcı metot
        public Motor(boolean bakimDurumu, String yakitKalitesi, double yakitMik) {
            this.bakimDurumu = bakimDurumu;
            this.yakitKalitesi = yakitKalitesi;
            this.yakitMik = yakitMik;
            this.toplamCalismaSaati = 0; // Başlangıçta toplam çalışma saati 0
            this.geciciCalismaSaati = 0; // Geçici sayaç 0
            yakitBilgisi(); // Yakıt bilgilerini yazdır
        }

        // Bakım durumu kontrol metodu
        public void bakimKontrolEt() {
            if (geciciCalismaSaati >= 50) {
                toplamCalismaSaati += geciciCalismaSaati; // Geçici çalışma saatlerini toplam saate ekle
                geciciCalismaSaati = 0; // Geçici sayaç sıfırlanır
                bakimDurumu = false; // Bakım gerekli hale gelir
                System.out.println("Motorun bakım süresi doldu! Lütfen bakım yapınız.");
            }
        }

        // Bakım yapma metodu
        public void bakimYap() {
            bakimDurumu = true; // Bakım durumu yeniden aktif edilir
            System.out.println("Motor bakımı tamamlandı.");
        }

        // Motoru çalıştıran metot
        public void motorCalistir() {
            if (bakimDurumu) {
                System.out.println("Motor çalıştırıldı.");
                geciciCalismaSaati++; // Geçici çalışma saati artırılır
                bakimKontrolEt(); // Çalışma saatine göre bakım durumu kontrol edilir
            } else {
                System.out.println("Motor çalıştırılamıyor! Lütfen önce bakım yapınız.");
            }
        }

        // Motoru durduran metot
        public void motorDurdur() {
            System.out.println("Motor durduruldu.");
        }

        // Yakıt bilgilerini ekrana yazdıran metot
        public void yakitBilgisi() {
            System.out.println("Yakıt bilgisi:\n Kalite = " + yakitKalitesi + ", Miktar = " + yakitMik);
        }
    }
}
        class YukGemisi extends Gemi {

            // Yuk gemisi özelliklerini başlatan yapıcı metot
            YukGemisi() {

                super(); // Üst sınıfın yapıcı metodunu çağır
                Motor motor = new Motor(true, "A kalite", 500);
                HataYakalama gs = new HataYakalama();
                Scanner s = new Scanner(System.in);
                // Kullanıcıdan gemi detaylarını al
                System.out.println("Gemi adini giriniz:");
                String gemiAdi = s.nextLine();


                System.out.println(""" 
                        Geminin yapildigi malzemeyi seciniz.
                        
                        Yapi malzemesi:1-Celik
                        Yapi malzemesi:2-Aluminyum
                        Yapi malzemesi:3-Fiberglas
                        Yapi malzemesi:4-Karbon
                        """);

                switch (gs.nextIntForNavigation(1, 6)) {
                    case 1:
                        this.yapiMalzeme = "Çelik";
                        break;
                    case 2:
                        this.yapiMalzeme = "Alüminyum";
                        break;
                    case 3:
                        this.yapiMalzeme = "Fiberglas";
                        break;
                    case 4:
                        this.yapiMalzeme = "Karbon";
                        break;
                }


                System.out.println("Agirlik giriniz:");
                double agirlik = gs.nextDouble();

                System.out.println("Azami yuk giriniz:");
                double azamiYuk = gs.nextDouble();

                System.out.println("Yuk miktari giriniz:");
                double yukMik = gs.nextDouble();


                // Degerleri özelliklere ata
                this.gemiAdi = gemiAdi;
                this.yapiMalzeme = yapiMalzeme;
                this.agirlik = agirlik;
                this.azamiYuk = azamiYuk;
                this.yukMik = yukMik;


            }

            // Soyut metotların uygulamaları

            @Override
            public void gemiCalistir() {

                System.out.println("Gemi calistirildi.");
                // Gemiyi calistirma mantigi placeholder
            }

            @Override
            public void gemiDurdur() {
                System.out.println("Gemi durduruldu.");
                // Gemiyi durdurma mantigi placeholder
            }
        }