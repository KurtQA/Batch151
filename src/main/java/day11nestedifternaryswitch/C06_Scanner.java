package day11nestedifternaryswitch;

import java.util.Scanner;

public class C06_Scanner {


    public static void main(String[] args) {



        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.


        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi ve Soyisminizi Giriniz");
        String isimSoyIsim = scan.nextLine().toUpperCase();


        char isimIlkKarakter = isimSoyIsim.charAt(0);

        char soyisimIlkKarakter = isimSoyIsim.charAt(isimSoyIsim.indexOf(" ")+1);


        System.out.println("" + isimIlkKarakter + soyisimIlkKarakter);


    }




}
