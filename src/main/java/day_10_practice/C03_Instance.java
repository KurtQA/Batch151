package day_10_practice;

public class C03_Instance {
    int sayi;  // 0

    String bransIsmi="Java";

    boolean okuldaMi;  // false


    public static void main(String[] args) {

    /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım

*/

        // instance variable'lara, static method'dan ulasabilmek icin obje olusturmamız gerekir

        C03_Instance obj1 = new C03_Instance();

        System.out.println(obj1.sayi);  // 0

        System.out.println(obj1.bransIsmi); // Java

        System.out.println(obj1.okuldaMi);  // false



        // instance variable'lar objeye baglıdır
        // hangi obje uzerinden variable'da degisiklik yapıldıysa, yapılan bu degisiklik sadece o objeyi baglar


        obj1.sayi=10;


        System.out.println(obj1.sayi);  // 10



        C03_Instance obj2 = new C03_Instance();


        System.out.println(obj2.sayi);  // 0



        obj1.bransIsmi="SQL";


        System.out.println(obj1.bransIsmi); //SQL


        System.out.println(obj2.bransIsmi);  // Java


        System.out.println(obj1.okuldaMi);  // false


        obj1.okuldaMi=true;

        System.out.println(obj1.okuldaMi);  // true


        System.out.println(obj2.okuldaMi);  // false


        obj2.sayi=100;

        System.out.println(obj2.sayi); // 100


        obj2.bransIsmi="API";

        System.out.println(obj2.bransIsmi); // API










    }
}






