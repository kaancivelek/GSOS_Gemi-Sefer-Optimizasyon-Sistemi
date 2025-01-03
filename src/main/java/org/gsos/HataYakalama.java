package org.gsos;
import java.util.Scanner;

/**
 * Hataları ele almak için tanımladığım özel scanner sınıfı.
 * Çalışma prensibi girdiyi string olarak alıp onu istenen tipteki değere çevirmeye çalışmak.
 * Başaramazsa uyarı mesajı atıp tekrar değer girilmesini istiyor.
 */
class HataYakalama {
    Scanner scanner; // Referans tanımlandı ancak nesne oluşturulmadığı için bellekten harcmanmadı


    // Negatif sayı hatası için özel istisna sınıfı
    private class NegatifDogalSayiHatasi extends Exception {
        private NegatifDogalSayiHatasi() {
            super("Negatif sayı hatası.");
        }

        private NegatifDogalSayiHatasi(String ileti) {
            super(ileti);
        }
    }

    // Aralık dışı sayı hatası için özel istisna sınıfı
    private class AralikDisiSayiHatasi extends Exception {
        private AralikDisiSayiHatasi() {
            super("Aralık dışı sayı hatası.");
        }

        private AralikDisiSayiHatasi(String ileti) {
            super(ileti);
        }
    }

    /**
     * Kullanıcıdan tam sayı girişi alır ve pozitif bir değer olmadığında tekrar sorar.
     *
     * @return Pozitif bir tam sayı
     */
    int nextInt() {
        String girdi;
        int cikti;

        while (true) {
            scanner = new Scanner(System.in);
            girdi = scanner.nextLine();
            try {
                cikti = Integer.parseInt(girdi);

                if (cikti < 0) {
                    throw new NegatifDogalSayiHatasi();
                }

                break;
            } catch (NumberFormatException | NegatifDogalSayiHatasi hata) {
                System.out.println(hata + "\n!HATA! Sadece sayısal ve pozitif değerler girin!");
            }
        }

        return cikti;
    }

    /**
     * Kullanıcıdan ondalıklı sayı girişi alır ve pozitif bir değer olmadığında tekrar sorar.
     *
     * @return Pozitif bir ondalıklı sayı
     */
    double nextDouble() {
        String girdi;
        double cikti;

        while (true) {
            scanner = new Scanner(System.in);//nesne oluşturuldu ve bellekten yer ayrıldı
            girdi = scanner.nextLine();
            try {
                cikti = Double.parseDouble(girdi);

                if (cikti < 0) {
                    throw new NegatifDogalSayiHatasi();
                }

                break;
            } catch (NumberFormatException | NegatifDogalSayiHatasi hata) {
                System.out.println(hata + "\n!HATA! Sadece sayısal ve pozitif değerler girin!");
            }
        }

        return cikti;
    }

    /**
     * Kullanıcıdan belirli bir aralıkta tam sayı girişi alır.
     * Aralık dışında bir değer girildiğinde tekrar sorar.
     *
     * @param taban Minimum kabul edilebilir değer
     * @param azami Maksimum kabul edilebilir değer
     * @return Belirtilen aralıkta bir tam sayı
     */
    int nextIntForNavigation(int taban, int azami) {
        int girdi;

        while (true) {
            try {
                girdi = nextInt();

                if (girdi < taban || girdi > azami) {
                    throw new AralikDisiSayiHatasi();
                }

                break;
            } catch (AralikDisiSayiHatasi hata) {
                System.out.println(hata + "\nHATA! Belirtilen aralıkta sayısal değerler girin!");
            }
        }

        return girdi;
    }
}
