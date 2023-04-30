package day22stringbuilder;

public class Sb01 {

    public static void main(String[] args) {
         /*
    1)"StringBuilder" String ureten bir Class'dir.
    2)String Class kullanarak String uretiriz. Java nicin "StringBuilder" Class'i da olusturdu?
       "String" class "immutable" (degistirilemez) String uretir, "StringBuilder" Class "mutable"(degistirilebilir)  String uretir.
    3) "immutable" olmak demeke orijinal degerin korunmasi, degistirilemez olmasi demektir.
    "mutable" olmak demek orijinal degerin degistirebilir olmasi demektir.
    4)Capacity Javanin size verdigi (16 yer) data depolama yer sayisidir. Length ise size verilen data
    depolama yerinin kullanilan kismidir. Ornek Money yazdik(length'i 5)
    5)Java baslangicta capacity'i 16 olarak verir. Verilen capacity asilirsa, Java yeni capacity'i
    varolanin iki katinin iki fazlasi olarak buyutur. Ornek Money yazdik 5, Java 16 verdi
    //Biz apend. ile ..... capacity'i asacak ekleme yaptik. Toplam 21'i gecince Java 21*2+2==44 olarak
    capacity'i arttirdi.

     */

            String s = "Java";
            s = s + "!";

            String u = "Apex";
            String v = "Apex";
            String y = "C++";

            // StringBuilder nasil olusturulur?

        //1.Way
            StringBuilder t = new StringBuilder("Python");
            System.out.println(t);//"Python"

        //StringBuilder'lara nasil ekleme yapilabilir?
            t.append("!").append("..");
            System.out.println(t);//Python!..

       //2.Way
        StringBuilder r=new StringBuilder();
        System.out.println();

        //Bos String ile ekranda bir sey gormezsiniz, ama bu bos String sonrasi
        //r.apend('c'); yazarsak orginal String degisir
        r.append('c');
        System.out.println(r);//c

        //capacity ve length arasindaki fark nedir?
        StringBuilder sb1=new StringBuilder("Money");

        int capacity= sb1.capacity();
        System.out.println(capacity);//21

        int length=sb1.length();
        System.out.println(length);//5 (Money'nin length'i 5tir)
        sb1.append("!").append(".................");
        int c = sb1.capacity();
        System.out.println(c);// 21x2 + 2 ==> 44

        int ln = sb1.length();
        System.out.println(ln);// 23

        //Default capacity'i degistirebiliriz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6

        }
    }
