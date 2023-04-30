package day12switchloops;

public class Loops01 {

    public static void main(String[] args) {

   /*
   Example 1 : Ekrana 5 kere "Hi" yazdiriniz.
    */
        //1.Yol tavsiye edilmez
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");
        System.out.println("Hi..");

     //calistirinca asagida alt alta bes kez Hi yazildi.
        /*
        Code Standarts
        1) Repetition olmamali
        2) Dynamic olmali
        3)Maintainable olmali

         */
        //2.Yol
        //Ayni adimlar tekrarlanmasi gerektiginde "Loop"lar kullanilir.
        //4 cesit loop var.
        //1)for-loop 2)while-loop 3)do-while loop 4)for-each loop
        //1)for loop
        /*
        for (Baslangic Degeri ; Loop Calisma sarti;  Artirma/Eksiltme ){
        //buraya calisacak kodlar girecek
        }

         */
        //Baslangic deger ; Loop Calisma sarti; Artirma/Eksilme
        for( int i=1       ; i<6         ;   i++       ){
            System.out.println("Hi");//bes kez alt alta Hi yazdi
            //Java'ya birden basla ve 6'ya gelinceye kadar calistir dedik

        }
        //for sonrasi parantez sonra baslangic deger olarak int i=1 yazdik, birden basla dedik
        //sonra Java'ya benim i degerim 6'dan kucuk ise diye sartimizi yazdik
        //daha sonra i++ ile ne kadar artirma yapacagini yazdik. Yani bir artir dedik
        //i++ bir artir
        //boylece i bir iken 2 oldu. 2 kucuktur 6'dan
        //1<6 bu boolean return eder, evet 6 dan kucuktur
        //sonra dongu devam ediyor icinde. Bir artirma daha olunca 2 olan i 3 oldu
        //sonra tekrar i bir artinca 4 oldu, bu islem 6'dan kucuk oluncaya kadar devam etti
        //6'dan kucuk oldugu sure calisacak
        //biz bes defa yazsin dedik o zaman sarti buna uygun olusturduk i<6 yazdik
        //eger 6 defa yazdir deseydik i<7 yazardik
        //diyelim ki Hi yanina iki tane !! yazmamiz istendi. Parantez icine !! ekleriz.
        //Bu durumda sonucu Hi!! olarak verir. Bu ornek maintainable'a ornek

        //Example 2: 11 den 14'e kadar tum sayilari ekrana yazdirin
        for( int i = 11  ;  i<15     ;  i++    ){
            System.out.println(i);

        }
    //ekrana alt alta su rakamlari yazdi: 11 12 13 14

        //Example 3: 40'dan 23'e kadar tum cift sayilari ekrana yazdiriniz.
        for(int i=40; i>22; i--) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
        //40'dan 22'ye kadar 22 haric cift sayilari yazdi
                //Example 4: 18 den 56 ya kadar tum tek sayilari ekrana yazdirin
        for(int i=18  ; i<57   ; i++ ){
            if(i%2!=0){
                System.out.println(i+" ");
            }
        }
      //aradaki tek sonuclari verdi. println degil print olursa rakamlar alt alta degil yan yana
        //yazilir. sout parantezine i+ ve " " yazildi cunku rakamlar yan yana bitisik cikmasin diye
    }
}
