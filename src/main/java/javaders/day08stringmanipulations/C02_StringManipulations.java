package javaders.day08stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {
        // **************** replaceFirst () ********************\\

        /*
        replace () ayni isi yapiyor ancak ilk gordugu datayi degistiriyor
         */
        String str ="Hayirli Olsunda ";

        // EX : str String'indeki ilk gorunen "a"'yi "e" ile degistiriniz

        System.out.println(str.replaceFirst("a", "e"));//Heyirli Olsunda

        String str1 =str.replaceFirst("a", "e");
        System.out.println("str1 = " + str1);


        // *************************** trim () ******************************\\
        /*
        trim () bir String'deki basinda ve sonundaki space karakterlerini siler
        Aradaki spacelere dokunmaz.Saclar icin uclarindaki kiriklarin aldirilmasi gibi
        Cumledeki spacelerin silinmesi
         */

        //EX : str String'indeki bas ve sonda varsa space karakterlerini siliniz

        String str2 = "     Ali Can   ";
        System.out.print(str2);
        System.out.println("*******");
        String strTrim= str2.trim();
        System.out.print( strTrim);
        System.out.println("*******");

        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        // String tv =599.99$            String laptop = 299.99$
        String tv ="599.99$";
        String laptop = "299.99$";

        String tv2=tv.replace("$","");
        System.out.println("tv2 = " + tv2);//tv2 = "599.99"
        String laptop2=laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);//laptop2 = "299.99"

        System.out.println(tv2+laptop2);//599.99299.99// Burada + isareti concatination yapar
        // Cunku hala datalar String oldugu icin

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);//totalPrice = 899.98
        /*
        valueOf() methodu String olan datayi bize sayi haline getirir
         */


        // Ex : Verilen ismin ilk isminin ilk harfini
        // ve soyisminin ilk harfini ekrana yazdiriniz

        String tamIsim = "  mehmet fatih  ";//  ==>   MF
        char first = tamIsim.trim().toUpperCase().charAt(0);//M

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("second = " + second);// F
        System.out.println("Ilk Harf Son Harf : " + first + second);

        String str3="  mehmet fatih yildirim";
        char first2 = tamIsim.trim().toUpperCase().charAt(0);
        char second2 = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        char third = str3.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println(" Ilk harf son harf: "+first2+second2+third);//MFY







    }//main
}//class
