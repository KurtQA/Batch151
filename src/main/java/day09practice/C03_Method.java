package day09practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {

    public static void main(String[] args) {
/*
        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
           String cumle=scan.nextLine();
        System.out.println(cumle);//ayaginiz tasa degmesin javacanlar
          String arr[]= cumle.split("");//burada char kullanmadik, cunku bir stringi parcalara ayirsak dahi
        //yine bir string elde ederiz. Her harf tek tek control edileceginden split kullanildi

        System.out.println(Arrays.toString(arr));
        //ayaginiz tasa degmesin javacanlar
        //[a, y, a, g, i, n, i, z,  , t, a, s, a,  , d, e, g, m, e, s, i, n,  , j, a, v, a, c, a, n, l, a, r]
            sesliharfleriyazdir(arr);//bunu yazarak method call yaptik ve uyari verdi
        // methodu create etmemiz istendi. Uzerini tiklayinca
        //otomatik olarak asagidaki methodu main method disinda olusturdu,
        // Biz sadece otomatik olarak private olan methodu public yaptik

    }

    public static void sesliharfleriyazdir(String[] arr) {
        for (int i=0; i<arr.length; i++){//0 dan baslayarak array'in uzunluguna kadar donguye aldik
           if(arr[i].equalsIgnoreCase("a")
                    || arr[i].equalsIgnoreCase("e")
                    || arr[i].equalsIgnoreCase("i")
                    || arr[i].equalsIgnoreCase("o")
                    || arr[i].equalsIgnoreCase("u")) {
                System.out.print(arr[i]);//tum sesli harfleri yazdirdi

           }
        }
     //ayaginiza tas degmesin javacanlar
        //[a, y, a, g, i, n, i, z, a,  , t, a, s,  , d, e, g, m, e, s, i, n,  , j, a, v, a, c, a, n, l, a, r]
        //aaiiaaeeiaaaa

    }

}
