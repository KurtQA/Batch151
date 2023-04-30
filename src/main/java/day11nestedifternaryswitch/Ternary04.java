package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    /*
    1)Ternary'de true ve false durumlari icin size verilen data type'lari farkli ise
    olusturdugunuz container'in data type'ini "Object" yapin
    2)"Object" Java'da bir class'dir
    "Object" Java'daki butun classlarin "Parent"idir. Java'da parent'i olmayan tek Class
    "Object Class"dir.
    3)Object icine her turlu data tipini kabul eder. Ornek String olani int conteynerina
    koyabilirsin.
     */

    public static void main(String[] args) {
     /*
     Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdirin, tek ise bu sayi ikiye
     bolunmez yazdirin


     */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num = input.nextInt();

        Object result2 = num%2==0 ? num/2 : "Bu sayi ikiye bolunmez";
        System.out.println(result2);


    }
}
