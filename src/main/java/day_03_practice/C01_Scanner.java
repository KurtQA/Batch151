package day_03_practice;

import java.util.Scanner;

public class C01_Scanner {


    public static void main(String[] args) {

        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde
        // tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        //Scanner scan = new Scanner(System.in);

        //System.out.println("Adinizi, ikinci adinizi ve soyadinizi aralarinda bosluk olacak sekilde giriniz");
        //String str = scan.nextLine().toUpperCase();

        // char adIlkKarakter= str.charAt(0);
        // char ikinciKaracter= str.charAt(str.indexOf(" ")+1);
        //char soyAdIlkKarakter=str.charAt(str.lastIndexOf(" ")+1);
        //System.out.println("" +adIlkKarakter+ikinciKaracter+soyAdIlkKarakter);


        //String str1 = scan.nextLine().toUpperCase();
        //char adChr1=str1.charAt(0);
        //char adChr2=str1.trim().split(" ")[1].charAt(0);
        //char sonChr=str1.trim().split(" ")[2].charAt(0);
        //System.out.println(""+ adChr1+adChr2+sonChr);

        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin  a kenarini giriniz");
        int a = scan.nextInt();

        System.out.println("Ucgenin b kenarini giriniz");
        int b = scan.nextInt();

        System.out.println("Ucgenin c kenarini giriniz");
        int c = scan.nextInt();
        if (a * a + b * b == c * c) {
            System.out.println("Bu bir dik ucgendir");
        } else if (a * a + b * b == c * c) {
            System.out.println("Bu bir dik ucgendir");

            }else if (c * c + b * b == a * a) {
                System.out.println("Bu bir dik ucgendir");
            } else {
                System.out.println("Bu bir dik ucgen degildir");
            }
          //sonuc= tek kenar uc kenari girmemiz istendi. 5, 4,3 yazdik. Bu bir dik ucgendir yazdi
        //11,3, 2 girince bu bir dik ucgen degildir yazdi

        }

    }

