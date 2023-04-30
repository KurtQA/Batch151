package day11nestedifternaryswitch;

import java.util.Scanner;

public class C07_IfElse {


    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırıniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        int ilkSayi=scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int ikinci=scan.nextInt();

        if(ilkSayi>ikinci){
            System.out.println("Ilk sayi ikinci sayidan buyuktur");
        }else {
            System.out.println("ilk sayi ikinci sayidan buyuk degildir");
        }

    }
}
