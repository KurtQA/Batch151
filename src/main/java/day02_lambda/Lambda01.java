package day02_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
        public static void main(String[] args) {


                List<String > iller = new ArrayList<>(Arrays.asList("Van","GumusHANE","MUS","Ankara","Kutahya","MUS","Ordu","Gaziantep","Hatay","Edirne"));

                bykHrfLenghtArtanSiradaTkrsz(iller);
                System.out.println();

                bykHrfSonHarflerineGoreArtanSiradaTkrsz(iller);
                System.out.println();

                bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(iller);
                System.out.println();

        }//main

        // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

        public static void bykHrfLenghtArtanSiradaTkrsz(List<String > iller){
                System.out.print("1) ");
                iller.
                        stream().
                        distinct().
                        map(t->t.toUpperCase()).
                        sorted(Comparator.comparing(t->t.length())).
                        forEach(t-> System.out.print(t+" "));
        }


        // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz

        public static void bykHrfSonHarflerineGoreArtanSiradaTkrsz(List<String > iller){
                System.out.print("2) ");
                iller.
                        stream().
                        distinct().
                        map(t->t.toUpperCase()).
                        sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//son harfine gore aldik
                        forEach(t-> System.out.print(t+" "));

                // forEach(t-> System.out.print(t+" ")) Lambda bu yapiyi sevmez
                // Bunun yerine Method Reference yontemini bulmus

        }

// 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
// Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

        public static void bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(List<String > iller) {
                System.out.print("3) ");
                iller.
                        stream().
                        distinct().
                        map(String::toUpperCase).
                        sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                        forEach(System.out::println);

        }

    /*
    .map(t->t.toUpperCase()) Lambda Expression bu sevilme bunun yerine
     */

        // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz



        // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz



        // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




        //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.





}











/*
5. Soru:
stream methodu sonrasinda tekrarsiz elemanlar istendiginden once distinc methodunu daha sonra uzunlugu 4'ten
kucuk olanlari elemek icin filter methodunu kullaniriz. Siralama bu sekilde yapilir ve data type'in yapisini
degistirme anlamina gelecek sekilde karakterlerin kucuk harfle yazilmasi istendiginden map'ten istifade ederiz.
Map sayesinde isimize yarayacak olan toLowerCase methodunu kullanabiliriz. Baska bir sey istenmediginden
for each methodu ile yazdirma islemini yapiyoruz. Sout icinde elemanlari icinde tutan t harfini ve aralarda
bosluk kalmasi icin + " " yaziyoruz.

6.Soru:
Bu sorudaki fark, method olarak siralama yapmamiza yardim edecek olan methodu kullanmamiza neden olmasidir.
Natural order ile siralama yapilabilmesi icin map methodu sonrasi bir nokta koyuyoruz, orada methodlar sirali
halde gorununce sorted methodunu sectik. Birden fazla sorted methodu var. Birinde icine bir argument koymuyoruz,
bu durumda natural order'a gore siralama yapar. Diger sorted methodu icine bir argument koymamiz gerekiyorsa,
sartimizi belirlememiz gerekirse ornegin karakterlerin uzunluguna gore bir siralama yapilmasi gerekiyorsa bu tip
sorted methodunu kullaniriz. Sorumuza uygun olan ilk tip sorted methodu oldugu icin onu sectik. Sorted methodu
alfabetik siralama yaparken harflerin ascii table'daki degerlerine gore yapar. Daha sonra for each methodu
ile yazdirma islemini yaptik. Ekranda illerin buyuk harflerle alfabetik siralama ile yazildigini gorduk. Listemizde
iki E harfi ile baslayan il oldugunda ornegin Edirne ve Eskisehir. Bu durumda birinci harfler esitse java
alfabetik siralamayi yapmak icin ikinci harflerin ascii table'daki degerlerine bakar. Boylece Edirne Eskisehir'den
once yazilir.

7.Soru:
Bu sorudaki fark, bir siralama yaparken sartimizi belirlememizi gerektiren bir siralama yapmamiz isteniyor.
Alfabetik siralamaya gore degil, karakterlerin uzunluklarina gore siralama yapilacak.
Sirasiyla stream methodu, distinct methodu, map methodu(t variable'ina gir ve karakterlerin hepsini
kucuk harfe cevir), sorted methodu(icine argument koymamiz yani sarti belirlememiz gerekir). Nasil yapacagiz?
sorted(Comparator.comparing(t->t.length) uzunluguna gore karsilastirma yaparak sirala demis olduk. Son
olarak for each ile yazdirdik. Methodlarimizi alt alta okunur sekilde siraladik. Ekranda elemanlari uzunluklarina
gore siraladi. Ancak iki elemanin uzunlugu ayni idi. Bu durumda biz alfabetik siralama istemedigimiz icin listeye
once eklenen once yazdirildi. Verilme siralarina gore yazildilar. (mus van...)

8.Soru:
Bu sorudaki fark, elemanlarin ilk harfi buyuk, digerleri kucuk yazdiracak bir method olusturmamiz gerekli.
Burada biz ekranda sadece yazdirma yapan return type'i void yerine List<String>'i return type olarak yazdik.
Ekranda bize bir list verecek. Bunun icin klasik bir sekilde listimizin ismi ve stream() yazmak yerine
onun basina return yazmak ile basladik.

Method icinde; return  iller.stream().map(t->t.substring(0,1).toUpperCase+t.substring(1).toLowerCase
forEach(t->System.out.print(t+ " "))  Daha sonra kodumuzda sorun gorununce retun'u son kisma return iller; olarak
ekledik.


Biz substring(0,1) yazdik once. Bu sekilde sadece ilk karakteri almasini sagladik. Sonraki substring(1) yazdik.
Bu sekilde 1.index dahil kalan tum karakterleri alabildik ve sonrasinda aldigi bu indexteki karakterleri
kucuk harfe cevirme islemini toLowerCase methodu ile gerceklestirebildik. Ekranda elemanlarin ilk harfleri buyuk,
sonraki harfleri kucuk yazili olarak bir list icinde gorundu.

9.Soru:
Bu sorudaki fark: Biz burada ilk harfi E ve S olanlari aramamiz ve bir list icinde yazdirmamiz gerekli.
Burada ek olarak startsWith methodunu kullandik.Bu methodu filter methodu icinde kullandik, cunku E ve S harfli
elemanlari secmemiz gerekliydi. Aldigimiz datalari bir list icine koyacak olan
collect(Collector.toList()) methodunu kullandik. Method olusturma istenen sorularda ayrica method olusturuyoruz.
Main method icine giderek sout icine methodumuzun ismini listimizin ismi ile yazdirma yapariz.

Sadece bir karakter ornek son karaktere gore siralama istendiginde sorted(Comparator.comparing(t->t.charAt(t.length-1)
Boylece son karakteri alarak siralama yapildi. Listemizde Kutahya once Ankara sonra. Ikisinin de
son harfi a olunca listeye eklenme siralarina gore yazildilar.

toUpperCase String class'indan geliyor. map methodu icinde String class'indan toUpperCase methodu cagirirken
String : : toUpperCase yazmak Lambda'ya ozgu bir uygulama olup, boylece fazladan t ve nokta yazmiyoruz daha basit
bir yazim ile tum String harfleri buyuk harfle yazmis olduk. Ya da uzunluklara gore karsilastirma yapacagimiz
zaman String : : length yazdik Comparator.comparing icinde. Karsilastirma yaparken ayni durumda birden
fazla eleman varsa thenComparing methodunu kullaniriz, bu method icine Comparator.naturalOrder() yazarak
ayni durumda olanlari natural order'a gore siralanmalarini saglamis olduk.
*/

