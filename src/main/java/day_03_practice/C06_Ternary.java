package day_03_practice;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
          int a=scan.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int b=scan.nextInt();
        System.out.println(a==b ?("Sayilar Birbirine Esit"):(a>b ? ("Buyuk sayi:" +a) :("Buyuk sayi:"+b)));
        //Lutfen bir tamsayi giriniz  16  Lutfen ikinci tamsayiyi giriniz 24 Buyuk sayi:24

    }
}
