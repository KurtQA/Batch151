package javaders.day06typecastingstringmanipulation;

public class TypeCasting {

    public static void main(String[] args) {


        /*
        EXPLICIT NARROWING
       byte -128 den +128'e kadar. 127 ve 128'i toplayinca 256 olur. Bizim sayimiz 260 idi
       Java 260'i 256'ya boler ve kalan sayi 4'tur. Bu nedenle asagida 4'u verdi. Sayimiz
       tamamen degisti.
       Bundan sonra numByte'i shorta donusturelim dersek bize geri 260'i vermez. Artik 4'u verir

       Explicit Narrowing'de ciddi bir data kaybi olabilir
       Eger sayimiz donusturmeye calistigimiz variable'in sinirlari disinda ise; Java sayiyi
       module(bolme islemi) islemine alir ve kalani yazdirir
       Kalan bolenin yarisindan fazla ise kalan sayiyi Java kucultmek ister
       ve bolumu bir buyuterek kalani eksi
       isareti olacak sekilde yazdirir.

         */
        short num=260;
        byte numByte= (byte) num;
        System.out.println("numByte =" +numByte);//4 verdi

        short num2=1023;
        byte num2Byte= (byte) num2;
        System.out.println("num2Byte :"+num2Byte);//-1 verdi

        short num3=1000;
        byte num3Byte= (byte) num3;
        System.out.println("num3Byte = " + num3Byte);// -24

        int intSayi =8880;
        short shortSayi= (short) intSayi;//32768 + 32768 + 0
        System.out.println("shortSayi = " + shortSayi);//8880





    }
}
