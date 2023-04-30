package day34exceptions;

public class E01 {



/*
    1)"Exception" beklenmedik problem demektir
    2)"Exception"i hallebilmek icin iki temel yol vardir
        i)"Exception"a uygun cozumler uretebilirsiniz "Exception Handling" denir
       ii)"Exception" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir.
       3)"Exception" a uygun cozumler uretmede "try-catch" kullanilir.
  "try block" da yapilmasi gereken islemi Java'dan yapmasi istenir.
  Java islemi problemsiz bir sekilde yaparsa "catch block" Java tarafindan okunmaz.
  "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer
  ve "catch block" icindeki kodlar calisir.
  4)"try block" da islem yapilirken "Exception" olusursa "try block"
  icindeki Exception'dan sonraki kodlar calistirilmaz.
 */
    /*
"Exception" beklenmedik problem demektir. "Exception"a uygun cozumler uretilebilir,
buna "Exception Handling" denir
Mutlu senaryolarda catch kismi calismaz. Cunku seyahate ciktin, benzinin bitmedi, lastigin patlamadi.
Sorun olmayinca 911’i aramaya gerek yok. Kotu senaryo halinde ornek 6’yi 0’a bolmesini isteyince
Java bolme islemini matematik kurallarina gore bolemeyince AritmeticException atiyor ve
ekrana olusan problem yaziyor. AritmeticException matematik ile ilgili butun problemleri handle edebilir.
Catch kismi icinde olusacak problemler ile ilgili kodlar yazabiliriz.

Mutlu senaryoda, java try kismina gider ve bolme islemini yaptiktan sonra
atama opeartoru bolum olan sonucu result’in icine koyar. result=a/b; bolum 4 oldugu icin sifir yerine
4 oldu ve 4’u yazdirdi. Istersek basta 0 degeri verdigimiz result’in altina sout ile mesaj yazabiliriz.
Negatif bir durum olmadigi icin java once mesajimizi sonra 4 olan sonucu ekrana yazar.
Negatif senaryoda ornek 6/0 istedik. Java bolemedigi icin ArtimeticException atar(Throw Exception).
AritmeticException matematik ile ilgili bir kural ihlali varsa atilir.
Java bu exception’i alir almaz  kosa kosa catch kismina gider. Artik catch kismi calisir.
Exception catch icinde yakalandi. catch icinde sout ile javaya requirement neyse ona gore
problemle ilgili mesaj verdik. Java mesaji gordu ve yazdirdi. Sonra try catch kismi bitince
javaya result’I return et dedik. Result 0 idi, burada degisim olmadi cunku bolme yapilamadi ve sifir’i yazdirdi.

Exception oldugunda sonraki kodlar calismaz yani application’iniz donar.
Toplama, cikarma ve carpmada sorun olmaz, Bu nedenle try catch demeye gerek yok, dogrudan return a+b; yazabiliriz. Ancak bolme isleminde sorun cikabilir. Sorun cikmasi beklendiginde try catch yapmaliyiz.
Exception’i handle ederken if kullanmamaliyiz.  */

/*  Bir String arrayden istenilen bir elemani eleman sirasi ile alan bir method olusturunuz.
String array’imizi 4 elemanli olusturduk. Sout icine get methodu yerlestirdik.
Get method icine kac nolu elemani istersek onun numarasini yazdik.
4. elemandan sonra ornegin get method icine 6 yazinca hata verdi.
Cunku 6. eleman yok.  6. Eleman 5.index’e karsilik gelir. 5. Index yok arrayimizde.
Array’in index’inin sinirlarin disinda oldugunu java ekranda belirtir.
Method olusturduk(method parametresi icine bir array  ve bir int parametresi su sekilde yazildi:

 String [] a, int numOfElement). Method body’si icine return a[numOfElement-1] yazdik.
 Cunku arrayler index ile calisirlar. 4 elemani olan arrayde sonuncu 4. Elemana 3.indexle ulasabiliriz.
 Bunun icin numOfElement-1 yazmaliyiz. Bir array’de indexi 2 olan elamana atifta bulundugumuzda: a[2] yazariz.
4 elemanli bir array’de 5. index’i istersek bu hata verir. Olmayan index nedenli verilen hatayi handle etmeliyiz. Bu durumda try ve catch’i kullaniriz. Burada atilacak ilk adim once method olusturmaktir. Method icine bos bir String variable koyariz ki, try icindeki sonucu bu variable icine koyabilelim. Verilen soruya gore String bulmada java sorun ile karsilasirsa soyle yapabiliriz: catch(ArrayIndexOutOfBoundsException e) yazalim. String bulmada hata almamiz halinde ArrayIndexOutOfBoundsException kullanilir. Catch body’si icine ilk elemandan onceki indexler icin bize ilk elemani vermesini, son elemandan sonraki indexler icin son elemani vermesini javadan isteyebilecegimiz bir kodu olusturabiliriz. If(numOfElement-1<0){
result= a[0]; aksi durumda }else{ result=a[a.length-1];} en son kisma return result; yazabiliriz.
Boylece sout icine get method ile 6. Elemani istersek bu arrayimiz icin son eleman olan 4. Elemani verecek.
Ya da -3 yazdik sout icine bu durumda bize ilk eleman olan 1. Elemani verir.
Bazi String methodlari null ile calismaz. Sout icine “null” yazinca hata Verdi ve hatayi ekranda Verdi.
Ekranda ne cesit bir exception uyarisi varsa onu alip catch icine yazmaliyiz.
Ornegin null nedeniyle NullPointerException yaziliydi. Bunu catch icine e harfi ile birlikte yerlestirdik.
Daha once String’de olmayan elemani istedigimizde ekrana exception olarak ArrayIndexOutOfBoundsException
yazilmisti ve biz bunu catch icine yerlestirmistik. Biz aklimiza geldigi gibi exception’I tanimlayip
 catch icine yazmiyoruz. Null nedenli hatayi handle ederken, catch body’si icine bir mesaj yazariz.
 Bu mesaj Teknik nitelikte olabilir. Javanin olusturdugu Teknik mesaji ogrenmek icin catch icine
 eklenen e harfini alip yanina nokta koyarsak getMessage() methodunu kullanabiliriz ve
 bunu sout icine e.getMessage() olarak yerlestirdigimizde javanin bu problemed air onceden olusturdugu
 Teknik bir mesaji varsa o mesaj ekrana yazilir. Yoksa yazilmaz. Sout sonrasinda catch parantezi disinda
 return result yazdik. Biz hem kendi mesajimizi iceren bir sout yazdik hem de e.getMessage() method ile
 javanin mesajini ogrenmek istedik. Ornegimizde javanin Teknik mesaji olmadigindan bizim mesajimiz ve
  alt kismina null yazildi. Javanin null yazmasi bu konuda Teknik bir mesaji olmadigi anlamina gelir.
*/


    public static void main(String[] args) {


        System.out.println(divide2(12,3));
        System.out.println(divide2(6,0));


    }

    //1. way: Exceptioni handle etmede ilk yol.
//    public static int divide(int a, int b) {
//        if (b == 0) {
//            return 0;
//        } else {
//            return a / b;
//        }

        //Bu sekilde proplemli oldu. Exception sayilan durumlarda if kullanilmaz


        /*
        catch(AritmeticException e) riskli matematiksel islemlerde kullanilir. java kod icerisinde
        exception'i gorunce kod durur.

        Toplama, cikarma, carpma yaparken try catch yapmaya gerek yok, bolme isleminde kullaniriz.

    */

        //2.Way: Exception'i handle etmede harika yol
        public static int divide2(int a, int b){
            int result = 0;

            try{
                result = a/b;
                System.out.println("I am here");
            }catch(ArithmeticException e){//AritmeticException matematik ile ilgili herhangi bir kural ihlali yapildiginda
                //atilir
                System.out.println("There is an issue in division");
            }
            return result;
        }

    }

