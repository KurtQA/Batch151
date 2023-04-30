package day11nestedifternaryswitch;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...


	    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad = scan.next();
        System.out.println("Soyadinizi giriniz");
        String soyad = scan.next();
        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("Boyunuzu giriniz");
        int boy = scan.nextInt();
        System.out.println("Kilonuzu giriniz");
        int kilo = scan.nextInt();
        System.out.println("Adı: " + ad + "\n" + "Soyad: " + soyad + "\n" + "Yas: " + yas + "\n" + "Boy: " + boy + "\n" + "Kilo: " + kilo);

    }
}

