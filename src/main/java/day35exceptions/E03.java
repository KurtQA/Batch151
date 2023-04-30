package day35exceptions;

/*
   Bir String'i Integer'a ceviren ve bu integer'i String'in lengthine bolen methodu olusturunuz.
   convertStringToIntDivideByLength isimli methodumuzu olusturduk. parametresi icine String str yazdik.
   int a=Integer.valueOf(str);
   return a/str.length(); ya da return a / (str.length(0-1)
  yazdigimizda ve main methoda gidip sout icine bos String "" veya "2" yazinca hata aldik.
  15 nolu satirda hata verdi.

  valueOf() methodu kullandigimizda NumberFormatException alma ihtimalimiz var.
  ValueOf methodu bos Stringde de hata verir. Mutlaka bir rakam vermemiz gerekir. Boylece formatta hata yapmamis oluruz.
  Bir methoddan iki farkli exception alma ihtimali var. Bolme islemi de exception verir.
  Iki exceptionimiz oldugundan her ikisini birden handle etmemiz sarttir. Bu durumda bir kez try bolumunu
  iki kez catch bolumu olusturduk. Catchlerden biri NumberFormatException ile ilgili digeri AritmeticException
  ile ilgili olusturduk. Birinde kendi mesajimizi sout icine yazdik, digerinde javanin mesaji varsa gormek
  istedik. Onu da e.getMessage() methodunu sout icine yazarak sagladik. Java en once try bolumune gelir.
   str isimli Stringimiz valueOf methodu ile "124" iken 124'e cevrildi. 124 olan degeri bir int conteynerina
   assign ettik. Daha sonra int a'ya atadigimiz sayiyi Stringin length'ine bolduk.
   Length 2 olup, 124/2 bize 62'yi verdi.
  Pozitif senaryo olunca artik Java catch bolumune gitmez. Ancak biz String'i "124" degil de "A"
  yaptigimizda kural ihlali oldugundan exception verdi ve NumberFormatException yazili catch'e gelir.
  Buradaki kod calisir ve buradaki sout calisir. Bu sout ile javanin mesaji varsa ekranda onu gorecegiz.
  Biz String icine "A" degil de "6" yaptigimizda hata verecek.
  try icinde 6'yi 0'a bolersek java bize bu defa
  AritmetikException verir ve Java AritmeticException kismina gelir,
  kodun bu bolumu calisir ve oaradaki sout calisir.
  Her probleme ozel bir catch yazdik. Coklu catch block yaptik.




///

Baska bir yontem olarak catch() icine "Exception e" yazarsak tum exceptionlari handle edebiliriz. 911 nolu telefon
gibi her cagriya cevap verir. sout icine javanin mesajini getMessage yontemi ile sorunca bize teknik mesajini
ekarana yazdirdi. catch(Exception e) problemin ne cesit oldugunu anliyor.
(Citizens Advice Burolar gibi, soruna gore yonlendirme)

///
Eger catch bloklardaki exceptionlar arasinda child parent iliskisi varsa child yukarida,
parent asagida olmalidir. Bu siralamaya dikkat etmez ve parent'i yukari alirsak java hata verir.
Exception classlarin ismi genellestikce class olurlar. Exception genel bir isim, AritmeticException ve
gordugumuz diger classlar ise ozeldir yani child sayilirlar. Exception class diger
tum exceptionlarin parentidir.


try + finally olabilir yani catch olmadan kullanilabilir, ancak finally keywordu ile kullanilir

*/
public class E03 {
        /*
            1)try block'dan sonra coklu catch block kullanilabilir.
              catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
              catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir.

            2)"Exception Class" tum Exception'larin parent'idir.
              Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
              tek catch block'i "Exception Class" ile kullanabilirsiniz.

            3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz.

            4) "try" catch block olmadan kullanilabilir mi?
               "try + finally" olabilir.
         */

    public static void main(String[] args) {

        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));

    }

        //Example 1: Bir String'i integer'a ceviren ve bu integer'i String'in length'inin 1 eksigine bolen method'u olusturunuz



    public static int convertStringToIntDivideByLength1(String str){

        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }
        return result;
    }

    public static int convertStringToIntDivideByLength2(String str){

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }


    public static int convertStringToIntDivideByLength3(String str){

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch(ArithmeticException e){
            System.out.println("Jump");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}


