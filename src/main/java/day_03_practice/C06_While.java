package day_03_practice;

import java.util.Scanner;

public class C06_While {

    public static void main(String[] args) {
        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız


        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();


        while(sayi % 10!= 0) {
            System.out.print(sayi + " ");
            sayi++;
        }
        //burada int i=0; ile while'i baslatmadik cunku kullanicinin verdigi sayinin kendisi baslangic degeri
        //olarak sayildi. Ayrica int i=0 ya da 1; ile baslatmaya gerek yoktu.

        //Bir projede basi belli sonu belli olan bir islem yapilacaksa o zaman for loop kullanilir

    }
}
