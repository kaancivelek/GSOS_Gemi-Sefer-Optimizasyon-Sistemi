package org.gsos;
import  java.util.Scanner;

public class Menu {
   HataYakalama oku = new HataYakalama();
    public  Menu(){
        System.out.println("Lütfen Gemi Rotasını Belirleyin!");
        System.out.println("1: Hint Okyanusu");
        System.out.println("2: Atlas Okyanusu");
        System.out.println("3: Pasifik Okyanusu");
        System.out.println("4: Kuzey Kutup Rotası");
        int rota1 = oku.nextIntForNavigation(1,4);
        switch (rota1){
            case 1:
                System.out.println("Lütfen Hint Okyanusu Rotasını Belirleyin!");
                System.out.println("""
                        
                        1: Hindistan (Mumbai) - Mısır (Süveyş Kanalı, Port Said)
                        Rotanın özellikleri: Hindistan’dan Süveyş Kanalı’na kadar deniz trafiği genellikle yoğundur.
                         Bu rota, Avrupa ve Asya arasındaki en önemli ticaret yollarından biridir.
                
                        2: Hindistan (Chennai) - Endonezya (Jakarta)
                        Rotanın özellikleri: Güneydoğu Asya bağlantısı, genellikle petrol ve mineral yük
                        taşımacılığında kullanılır. Bengal Körfezi ve Malakka Boğazı üzerinden geçer.
                        
                        3: Avustralya (Perth) - Güney Afrika (Durban)
                        Rotanın özellikleri: Hint Okyanusu boyunca uzun mesafeli bir rota. Çoğunlukla %n" +
                        doğal kaynak ve mineral taşımacılığı için kullanılır.
                        """);

                int hintrota = oku.nextIntForNavigation(1,3);break;

                /*seçim yapıldıktan sonra rota bilgisi ilgili yere aktarılmalı */
            case 2:
                System.out.println("Lütfen Atlas Okyanusu Rotasını Belirleyin!");
                System.out.println(""" 
                        
                        1: ABD (New York) - Avrupa (Rotterdam, Hollanda)" +
                        Rotanın özellikleri: Kuzey Atlantik ticaret hattı. Dünyanın en yoğun ticaret 
                        yollarından biridir, konteyner taşımacılığı yaygındır.
            
                        2: Brezilya (Santos) - Nijerya (Lagos)
                        Rotanın özellikleri: Güney Atlantik üzerindeki rota, genellikle 
                        tarım ürünleri ve petrol taşımacılığı için kullanılır.
            
                        3: Kanada (Halifax) - Birleşik Krallık (Liverpool)
                        Rotanın özellikleri: Kuzey Atlantik üzerindeki bu rota, denizcilik açısından eski bir gelenektir.
                         Çoğunlukla genel kargo ve konteyner taşımacılığı yapılır.
                        """);
                int atlasrota = oku.nextIntForNavigation(1,3);break;

            case 3:
                System.out.println("Lütfen Pasifik Okyanusu Rotasını Belirleyin!");
                System.out.println("""
                        
                        1: Çin (Shanghai) - ABD (Los Angeles)
                        Rotanın özellikleri: Pasifik’teki en yoğun ticaret rotalarından biri.
                         Elektronik ve diğer tüketim mallarını taşımada kullanılır.
              
                        2: Japonya (Tokyo) - Avustralya (Sydney)
                        Rotanın özellikleri: Asya-Pasifik ticareti için önemli bir rota.
                        Endüstriyel ürünler ve kömür taşımacılığı bu hat üzerinde yaygındır.
                  
                        3: Şili (Valparaiso) - Çin (Guangzhou)
                        Rotanın özellikleri: Latin Amerika ile Asya arasında
                        bakır, meyve ve mineral taşımacılığı için kullanılır.
                        """);
                int pasifikrota = oku.nextIntForNavigation(1,3);break;

            case 4:
                System.out.println("Lütfen Kuzey Kutup Rotasını Belirleyin!");
                System.out.println("""
                        
                        1: Rusya (Murmansk) - Çin (Shanghai)
                        Rotanın özellikleri: Arktik rotası, buz kırıcı gemilerle Kuzey
                        Kutbu boyunca geçiş yapılmasını sağlar. Hızlı ama risklidir.
                        """);
                int kutuprota = oku.nextIntForNavigation(1,1);break;

            default:
                System.out.println("BUG!");break;
        }
    }
}
