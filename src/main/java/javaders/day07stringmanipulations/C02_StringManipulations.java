package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {

    public static void main(String[] args) {

   /*
   Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz
   i) En az 8 karakterden olussun
   ii) Bosluk olmasin
   iii) En az bir tane buyuk harf olsun
   iv) En az bir tane kucuk harf olsun
   v) En az bir tane sembol olsun
   vi) En az bir tane rakam olsun

    */

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen passswordunuzu giriniz....");

                String pwd= input.nextLine();

     //i)En az 8 karakterden olussun
        boolean krktrSys=pwd.length()>7;
        boolean krktrSys2=pwd.length()>=8;//ayni isi yapar her ikisi
        //ilk kod daha hizli calisiyor


        //ii)Password space icermesin
        boolean spaceOlmamali = !pwd.contains(" ");
        //" "==space karakteri icermeli contains !==icermemeli


        //Ac123?!a
        //iii) En az bir tane buyuk harf olsun
        boolean bykHrfOlmali=pwd.replaceAll("[^A-Z]" , "").length()>0;
        //methodlari yan yana yazdirinca method zinciri olur, method chain
        //yukaridaki gibi replaceAll().length()

        //iv) En az bir tane kucuk harf olmali
        boolean kckHrfOlmali=pwd.replaceAll("[^a-z]","").length()>0;

        //v) En az bir tane sembol olsun
        boolean smblOlmali= pwd.replaceAll("[^a-zA-Z0-9]", "").length()>0;

        //vi) En az bir tane rakam olmali
        boolean rakamOlmali = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("Password Gecerlimi: "+(krktrSys&spaceOlmamali&bykHrfOlmali&kckHrfOlmali&smblOlmali&rakamOlmali));
     //Lutfen passswordunuzu giriniz.... dedi daha sonra bir password girdik asagida
        //Ac123?d.
        //Password Gecerlimi: true verdi
        //Negatif Senaryo ==>Ac123? sd yapalim
        //Ac123? sd
        //Password Gecerlimi: false verdi cunku sartlara uymadi









    }
}
