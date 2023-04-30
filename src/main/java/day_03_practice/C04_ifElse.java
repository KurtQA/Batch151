package day_03_practice;

import java.util.Scanner;

public class C04_ifElse {

    public static void main(String[] args) {

         /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
         String ilkKelime= scan.next();
        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String ikinciKelime= scan.next();

        if(ilkKelime.length()%2==0){
            String ilkKelimeIlkYarisi=ilkKelime.substring(0,ilkKelime.length()/2);
            String ilkKelimeIkinciYarisi=ilkKelime.substring(ilkKelime.length()/2);
            System.out.println(ilkKelimeIlkYarisi+ikinciKelime+ilkKelimeIkinciYarisi);

        }else{

            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }
        //Eren Lutfen ikinci kelimeyi giriniz Hasan sonuc ErHasanen verdi

    }
}
