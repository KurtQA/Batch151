package day_03_practice;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {


       /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner scan=new Scanner(System.in) ;
        System.out.println("1-4 Arasi islem numarasi giriniz" +"\n"+
                "Islem 1: Bakiye Sorgulama" +"\n"+
                "Islem 2: Para Cekme" +"\n"+
                "Islem 3: Para Yatirma" +"\n"+
                "Islem 4: Islemi Sonlandir");
        int Islemno=scan.nextInt();
         int bakiye=1000;

         switch(Islemno) {
             case 1:
                 System.out.println("Bakiyeniz: " + bakiye + "TL");
                 break;
             case 2:
                 System.out.println("Cekmek istediginiz parayi giriniz");
                 int cekilecekPara = scan.nextInt();
                 if (cekilecekPara <= bakiye) {
                     bakiye = bakiye - cekilecekPara;
                     System.out.println("Para cekme isleminden sonraki mevcut bakiyeniz: " + bakiye + "TL");
                 } else {
                     System.out.println("Bakiyeniz Yetersiz");
                 }
                 break;
             case 3:
                 System.out.println("Yatirmak istediginiz parayi giriniz");
                 int yatirilacakPara = scan.nextInt();
                 if(yatirilacakPara<=2000){
                 bakiye = bakiye + yatirilacakPara;
                 System.out.println("Para yatirma isleminden sonraki mevcut bakiyeniz: " + bakiye + "TL");
         }else{
                     System.out.println("ATM'de gunluk para yatirma limiti 2000TL'dir");
                 }
                 break;

             case 4:
                 System.out.println("Techpro Bank/i kullandiginiz icin tesekkur ederiz");
                 break;
             default:
                 System.out.println("Lutfen gecerli bir islem numarasi giriniz");
         }
        /*
        1-4 Arasi islem numarasi giriniz
       Islem 1: Bakiye Sorgulama
      Islem 2: Para Cekme
      Islem 3: Para Yatirma
      Islem 4: Islemi Sonlandir
      2
      Cekmek istediginiz parayi giriniz
      2001
      Bakiyeniz Yetersiz




      1-4 Arasi islem numarasi giriniz
      Islem 1: Bakiye Sorgulama
      Islem 2: Para Cekme
       Islem 3: Para Yatirma
       Islem 4: Islemi Sonlandir
       3
      Yatirmak istediginiz parayi giriniz
       1500
      Para yatirma isleminden sonraki mevcut bakiyeniz: 2500TL

         */
    }
}
