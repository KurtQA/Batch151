package day_03_practice;

import java.util.Scanner;

public class C04_For_Agac {

    public static void main(String[] args) {

    /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yaprak satir sayisini giriniz");
        int yaprakSatirSayisi=scan.nextInt();

        System.out.println("Govde satir sayisini giriniz");
        int govdeSatirSayisi=scan.nextInt();

        String yaprak="";

        for(int i=0; i<yaprakSatirSayisi; i++){// 0'dan yaprak satir sayisina kadar donguye aldik
            yaprak=yaprak+ "^";
            System.out.println(yaprak);
        }

            for(int i=0; i<govdeSatirSayisi; i++){//0'dan govde satir sayisina kadar donguye aldik
                System.out.println("|||");
        }
      /*
      Yaprak satir sayisini giriniz

      7
      Govde satir sayisini giriniz
      8
^
^^
^^
^^^
^^^^
^^^^^
^^^^^^
^^^^^^^
|||
|||
|||
|||
|||
|||
|||
|||
       */


    }
}
