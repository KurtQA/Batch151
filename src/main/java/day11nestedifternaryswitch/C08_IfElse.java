package day11nestedifternaryswitch;


import java.util.Scanner;

public class C08_IfElse {

    public static void main(String[] args) {
     /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen hizmet yilinizi giriniz");
        int hizmetYili= scan.nextInt();

        System.out.println("Lutfen maasinizi giriniz");
        int maas=scan.nextInt();

        if(hizmetYili>=5){
            System.out.println("Zamli Maas: " + (maas + (maas*10/100)));
        }else{
            System.out.println("Zam Alabilmek Icin " +(5-hizmetYili) + "Yil Daha Calismalisin");

        }
        /*
        Lutfen hizmet yilinizi giriniz

        6,hizmet yili 6 olarak girdik
        Lutfen maasinizi giriniz
        3000,maasi 3000 olarak girdik
        Zamli Maas: 3300
        Lutfen hizmet yilinizi giriniz

         5
         Lutfen maasinizi giriniz
         1000
         Zamli Maas: 1100, burada 1000 TL maasa %10 ekleyerek sonucu verdi
         Lutfen hizmet yilinizi giriniz

         3, hizmet yilini 3 yil girince else bolumu calisti
         Lutfen maasinizi giriniz
         4000, bu kisimda yuzde 10 artis olmadi cunku sarti tutmuyor
         Zam Alabilmek Icin 2Yil Daha Calismalisin, sout icinde 5-hizmet yili + yil daha
         calismalisin'i ekleyince 5'ten hizmet yili 3'u cikardi ve 2yil daha calismalisin
         dedi

         */

    }



}
