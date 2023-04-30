package day_11_practice;

public class C02_Static {

    static String okulIsmi = "Yildiz Koleji";

    static int okulNo;  // 0

    static  boolean okulAcikMi;  // false

  /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/


    public static void main(String[] args) {

        // static variable'lara, class icerisindeki tum methodlardan direk ulasabiliriz.

        System.out.println(okulIsmi); // Yildiz Koleji
        System.out.println(okulNo);  //  0
        System.out.println(okulAcikMi);  // false

        //////////////////////////////////////////////////////////////

        // static variable'lar gokteki ay gibidir
        // static variable'ın degeri bir kisi tarafından degistirilirse, herkes icin degisiklige ugrar

        okulNo=102;

        System.out.println(okulNo);  // 102

        staticMethod();// yazinca  ve uyari verince tikladik, main method disinda asagidaki methodu olusturdu.
        System.out.println(okulNo);//200, asagida method icinde okulNo=200; yazdigimiz icin sonradan burada
        //sout yazdirinca yine 200 verdi cunku okulNo static, static de yapilan degisiklik sadece bir yerden
        //degil her yerden gorulebilir.


    }

    private static void staticMethod() {
        okulNo=200;
        System.out.println(okulNo);//200
    }


}