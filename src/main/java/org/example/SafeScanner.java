package org.example;
import java.util.Scanner;


    /* Hatalari ele almak icin tanimladigim ozel scanner sinifi.
    Calisma prensibi girdiyi string olarak alıp onu istenen tipte ki degere cevirmeye calismak basaramazsa
    uyari mesaji atıp tekrar deger girilmesini istiyor.
     */


     class SafeScanner {

        Scanner scanner = new Scanner(System.in);
     SafeScanner() {}

        // Integer Degerler icin.
        int nextInt() {
            boolean gecerlilik = false;
            String girdi;
            int cikti = 0;

            while (!gecerlilik) {
                girdi = scanner.nextLine();
                try {
                    cikti = Integer.parseInt(girdi);
                    gecerlilik = true;

                } catch (NumberFormatException e) {System.out.println("Sadece sayi girebilirsiniz");}
            }

            return cikti;
        }
        //Double Degerler icin.
        double nextDouble() {
            boolean gecerlilik = false;
            String girdi;
            double cikti = 0;

            while (!gecerlilik) {
                girdi = scanner.nextLine();
                try {
                    cikti = Double.parseDouble(girdi);
                    gecerlilik = true;

                } catch (NumberFormatException e) {System.out.println("Sadece sayi girebilirsiniz");}}

            return cikti;
        }

/*Bu metod ile birlikte belirledigimiz kullanicinin sadece belirledigimiz
aralikta ki tam sayilari girmesini sagliyoruz.*/
int nextIntForNavigation(int taban, int azami) {
         int girdi= nextInt();
while (girdi >= taban&&girdi <= azami) {
    System.out.println("Sadece["+taban+" - "+azami+"]araliginda bir sayi girebilirsiniz.");
    girdi = nextInt();
}

    return girdi;
}
     }
