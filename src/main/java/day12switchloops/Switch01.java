package day12switchloops;

import java.util.Scanner;

public class Switch01 {


    public static void main(String[] args) {

        //Example 1; Ay numarasini soyleyince, numarasi verilen aydan baslayip 12. aya kadar
        //tum aylarin isimlerini yazdiran kodu yaziniz.
        //Diyelim ki kullanici 8==>August girdi, sonra September October November December yazilacak

        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz..");
         int numOfMonth=  input.nextInt();

         switch (numOfMonth){
             case 1:
                 System.out.println("January");
             case 2:
                 System.out.println("February");
             case 3:
                 System.out.println("March");
             case 4:
                 System.out.println("April");
             case 5:
                 System.out.println("May");
             case 6:
                 System.out.println("June");
             case 7:
                 System.out.println("July");
             case 8:
                 System.out.println("August");
             case 9:
                 System.out.println("September");
             case 10:
                 System.out.println("October");
             case 11:
                 System.out.println("November");
             case 12:
                 System.out.println("December");
                 break;
             default:
                 System.out.println("Gecerli ay numarasi veriniz..");
         }
         //3. ayi kullaniciymisiz gibi asagida verince, 3. ay dahil kalan aylari yazdirdi
        //March
        //April
        //May
        //June
        //July
        //August
        //September
        //October
        //November
        //December
        //Switch'de default, if statement'daki else gibidir
        //break'i nereye koyarsak sonrasini Java yazdirmaz
        //talimatta tum secenekleri yazdirmak istedi. Bu durumda default tum gecerli seceneklerin
        //en altina eklendi, sonra default yazildi
        //cunku talimatta kacinci ay oldugu yazilsin isteniyordu.
        //istenmeyen kisimdan oncesine break yazabiliriz
        //11 yazinca ustteki case'lerin icine giremedi. 11 kismina girip calistirabildi
        //Java break'i gorunce disari cikiyor devam etmiyor
        //12'den sonra break koymasaydik ne olurdu?
        //default'u da yazdirir bu durumda
        //default yani son secenegin altina break koymaya gerek yok. break koymasak da kod bitmis
        //olur
        //her ayi tek gormek istersek altina break koyariz
        //Suleyman Hoca ile yapilan switch orneginde her secenek altina break yazmistik ve sadece
        //kullanicinin verdigi gun kismini yazdirmisti.
        //Switch ikiden fazla secenek oldugunda kullanilmasi onerilir.
        /*
        Note: "switch" condition parantezi icerisinde 1)String 2)int 3)byte 4)short 5)char
        kullabiliriz
        ornek biz switch(numOfMonth) yazdik yukarida
        "switch" condition parantezi icinde boolean, long, float, double kullanamiyoruz
        case icinde kullanabiliriz ancak switch parantezi icinde boolean, long, float, double
        kullanamiyoruz. Yani int sonrasi data types lar kullanilmiyor
         */
        //Baska bir ornekte Scanner olmadan kod yazdik
        /*
        Ay numarasi girdiginde ayin numarasini yazan kodu yazin dedik
        int monthNumber=5; yazdik. Bu May'e geliyordu ama April sonrasina
        sadece break; yazdik boyle olunca sonucu su oldu:
        May
        June
        July
        August
        September
        October
        November
        December
        Gecerli bir ay numarasi giriniz
        yani break sonrasinin tum sonuclarini verdi. Cunku mayistan
        basladik ve sonrasina ayrica break; koymadik.
        sayiyi 2 yazinca ve hic break; yazmayinca February dahil geri
        kalan tum sonuclari default dahil verdi.
        daha sonra hem April sonrasina hem de July sonrasina break koyduk
        ve int monthNumber= 5 vermistik. sonuc iki break'e dikkat etti
        May, June,July verdi. July sonrasi break oldugu icin vermedi.

         */
    }
}
