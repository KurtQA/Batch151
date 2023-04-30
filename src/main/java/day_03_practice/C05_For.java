package day_03_practice;

import java.util.Scanner;

public class C05_For {

    public static void main(String[] args) {

        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */

        Scanner scan =new Scanner(System.in);


        int toplam=0;
        String s="";

        for(int i=0; i<5; i++){//0 dan 5 e kadar donguye aldik
            System.out.println("5 adet sayi giriniz");
            int sayi= scan.nextInt();
            if(sayi>=5 && sayi<=10){
                System.out.println("Girdiginiz sayi 5 ile 10 arasinda oldugundan isleme alinmayacaktir");
            }else{
                toplam=toplam+sayi;//degilse sayilari topladik
            }
        }
        System.out.println(toplam);
        //5 ten kucuk, 10 dan buyuk sayilar girilince toplamini verdi, 5 ile 10 arasindakiler icin
        //sayinin isleme alinmayacagini yazdirdi.
        //sondaki sout for icine yazilsaydi, sayi girmemiz istendiginde her sayi girisinde toplam degeri tek tek
        //verecek. for {} disina sout yazinca her sayi girdiginde degil, toplami en son sayi sonrasinda vermis olacak




    }
}
