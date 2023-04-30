package day35exception;


public class E01 {
    /* " Exception" beklenmedik problem demektir. Java cozemedigi bir sorunla karsilastiginda Exception class'i devereye girer
         Exception class'İ bize karsilasilan sorunun cinsini, bu sorunun nereden kaynaklandigini ve sebebini verir.
      *  Java exception firlattiginda kodun calismasini durdurur. java exception olusturan kod icin bizden bir karar vermemizi ister
      *  Eger hicbirsey yapmaz isek beklendigi gibi kodumuzun calismasini durdurur.
      *    - Kodumuzun calismaya devam etmesini istiyorsak try catch ile exception olusturmasi muhtemel kodlarimizi catch blogu icinde yazmaliyiz
      ** Exception i halledebilmek icin iki temel yol vardir;
         1) Exception a uygun cozumler uretebilirsiniz. Buna Exception Handling denir
         2) Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Bunada "Throw Exception" denir
      * Exception a uygun cozumler uretmede "try-catch" kullanilir, try block icinde yapilmasi gereken islemi java dan isteriz
        Eger java bu islemi sorunsuz bir sekilde yaparsa catch block devreye girmez
        try block icerisinde eger bir "exception" olusursa catch block o zaman devreye girer, ve catch black icindeki kodlar calisir
     *  try block icinde islem yapilirken "Exception" olusursa try block icindeki exceptiondan sonraki kodlar calistirilmaz
     *  catch satirindaki parantez icine karsilasilmasi muhtemel olan exception class ismini ve bir obje ismi (e) yazariz
     *  if else kullanirsak olusabilecek her problemi specific olarak if parantezinin icine yazmamiz gerekir. Bu da ciddi bir matematik bilgisi gerektirir
        ve yazacagimiz kodu cok uzatir.
        Ama try catch te java ilgili Exception ile alakali olusabilecek tum problemleri yakalar
    */
    public static void main(String[] args) {
        divide(12, 6);
        divide(12, 0);
        divide2(3,0);
    }
    //tavsiye edilmez
    public static void divide(int a, int b) {
        if (b==0){
            System.out.println("sayi sifira bolunemez");
        }else{
            System.out.println(a / b);
            System.out.println("divide methodu ici");
        }
    }
    public static void divide2(int a, int b){
        try{
            //ArithmeticException yazdiginiz code da matematiksel islem kullaniyor iseniz alinabilecek bir exception dir.
            System.out.println(a / b);
            System.out.println("try-catch blok ici");
        }catch (ArithmeticException e){
            System.out.println("Sayi sifira bolunemez");
        }
        System.out.println("try catch ile handle edildi");
    }
}
