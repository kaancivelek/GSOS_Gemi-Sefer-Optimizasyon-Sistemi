package org.gsos;

class Simulasyon {
/*
* 1 knot 47.182mil
* 1 knot 1,852 km
*ruzgaryonu(-1,1)
* ruzgarhizi(
* akıntıyonu
* akıntıhızı
* yakıttuketimi(ton)
* hiz(knot)
* gemiHizi+akintiHizi*akintiYonu+ruzgarHizi*ruzgarYonu*kSabiti=netHiz
*
*Maliyet(1ton)=45TL/litre×1176litre=52,920TL
*1000/0.85=1176lt
*
*
*/
static double aerodinamikSabiti;

    //hızımız aşağı yukarı 12 knot olduğunu düşünelim buradaki olay 12-8 olduğunda mesela
    //4'e düşüyor hızımız ancak tekrar onu 12 yapmak için 8 daha harcayacağız yani harcama 12+8=20 şeklinde oldu
    double yakitTuketimiHesapla(double hiz, double akintiHizi, int akintiYonu ,double ruzgarHizi, int ruzgarYonu) {
        double cevreselFaktor= akintiHizi*akintiYonu+ruzgarHizi*ruzgarYonu*aerodinamikSabiti;
if(cevreselFaktor<0){Math.abs(cevreselFaktor);return hiz+cevreselFaktor*0.15;}
//hızımız aşağı yukarı 12 knot olduğunu düşünelim buradaki olay 12-8 olduğunda mesela
//4'e düşüyor hızımız ancak tekrar onu 12 yapmak için 8 daha harcayacağız yani harcama 12-8=4 şeklinde oldu
else{ return hiz-cevreselFaktor*0.15;}}//10 knotta giden bir yuk gemisi takribi 1.5ton saatte yakıt tuketır.}



double tahminiVarisZamaniHesapla(double hiz, double seferMesafesi){
return seferMesafesi/hiz;
}


}



