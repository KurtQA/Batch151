package day_11_practice;

public class C01_Instance {

    int sayi; // 0

    String isim; // null

    boolean ogrenciMi; // false


    public static void main(String[] args) {


  /*

    sayi, isim, ogrenciMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım.

*/
        C01_Instance obj1 = new C01_Instance();

        System.out.println(obj1.sayi); // 0
        System.out.println(obj1.isim); // null
        System.out.println(obj1.ogrenciMi); // false



        ////////////////////////////////////////


        C01_Instance obj2 = new C01_Instance();


        obj1.isim="Hasan";
        obj2.isim="Huseyin";

        System.out.println(obj1.isim);  // Hasan


        obj1.sayi=20;
        obj2.sayi=25;

        System.out.println(obj2.sayi); // 25

        System.out.println(obj1.sayi); // 20


        //instance variable'lar objeye baglıdır
        // hangi obje uzerinden degisiklik yapıldıysa, yapılan bu degisiklik sadece o objeyi baglar


    }








}