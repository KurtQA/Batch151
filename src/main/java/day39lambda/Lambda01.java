package day39lambda;
/*
Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk. Listimize
add methodu ile elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
degisti. Tom
         Jim
         Clara

  stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
  Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu
  sekilde yazdiriyor. Her yazdirmada bir bosluk birakiyor.

  Ilk yolumuzda uc katli bir yapi olusturuyoruz. Buna yapisal kod denir. Mimari bir yapi olusturduk.Buna
  Structural programming denir.
  Ikinci yolda ise sadece for each dedik. Burada bir yapi olusturmak yerine javaya direct methodun ismini
  veriyoruz. Bu proglama tarzina functional programming denir
////


Example 2: Bir Listteki t ile baslayanlar haric tum elemanlari console'a yazdiran methodu olusturunuz. Yazdiran
dedigi icin return type'i void yapacagiz.
Methodumuz: public static void printElExceptStartsWithT()
Bu method yine bir list kullanacak. Javaya bu listi stream'e cevir, t ile baslayanlari filter et diyecegiz.
myList.stream().filter(t->!t.startsWith("T").forEach(t-> System.out.print(t + " ")
filter methodunu eleme yapmakta kullandik. t ile baslayanlari eledik.
yazdirinca t ile baslayan Tom'u goremedik. Jim ve Clara'yi gorduk.

////
Example 3: Bir Listte character sayisi 4'ten az olan tum elemanlari consol'e yazdiriniz.
methodumuzu yazdirma istendiginden void yapiyoruz.
public static void printElLengthLessThanThreeFour(List<String> myList)
Burada da filtreleme yapacagiz. 4'ten kucuk olanlarin secilmesini saglayacagiz.
myList.stream().filter(t->.length()<4.forEach(t->System.out.print(t + " ")
daha sonra main method icine gidip burada olusturdugumuz methodu cagirdik. Ekrana 4'ten kucuk elemanlar Tom ve Jim
yazildi.

///
Example 4: Bir Listteki charcter sayisi 4 den cok olan tum elemanlari buyuk harflerle consol'e yazdiran
methodu olusturunuz.
public static void printElLengthMoreThanFourWithUpper(List<String> myList)

myList.stream().filter(t->t.length()>4) Filterelemeden sonra varolan elemani degistirmemiz gerekecek. Bu
nedenle map'i kullanmaliyiz ve elemani uppercase'e cevirmesini javadan isteyecegiz.
myList.stream().filter(t->length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.println(t));
Main method icine giderek bu methodumuzu parantezi icine myList yazarak cagirdik ve ekranda karakter
sayisi 4'ten buyuk olan eleman Clara, CLARA olarak ekranda gorduk.

////
Example 5: Bir Listteki charcter sayisi 4 den cok olan tum elamanlari tekrarsiz olarak kucuk harflerle
consol'a yazdiran methodu olusturun.
Bu soruda cok sey isteniyor. Lambda ile kisa surede yapabiliriz.

Yukaridaki listimize daha sonra bir tane daha Tom, bir tane daha Clara ve bir Angelina ekledik.

public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myLIst)
Listimizde tam 6 eleman vardi. Sirasiyla 4'ten kucuk olanlari daha sonra birden fazla olanlarin tekrarli olanlarini
iptal ettik. Once listi stream'e cevirdik ve filtreleme isini yaptirdik. Bu kismda elemanlardan Tom ve Jim'i iptal etti.
Neyi eleyecek? length'i 4'ten kucuk olanlar elendi
devaminda distinct methodunu kullandik. Cunku tekrarli olanlari bir kez yazmasini istedik. Clara iki kez vardi.
Clara'yi bire dusurdu. map'i yazarak toLowerCase methodunu
alabildik, aldigi elemanlarin karakterlerini kucuk harfle yazdik. forEach methodu icine sout,
onun da icine t'yi yazdik. Main method icine gidip methodu yazinca
ekranda clara angelina'yi gorduk. Diger elemanlardan birer tane daha vardi.

Elemanlari azaltan methodlar genellikle once kullanilir. Functional programming ile kod daha okunakli olur.

///

Example 6: Bir listteki elemanlarini tekrarsiz ve buyuk harflerele alfabetik sirada consol'e yazdiran methodu
olusturun.

public static void printElUniqueToUpperCaseSorted(List<String> myList)
Burada eleme yapmayacagiz. Her zamanki gibi stream ile baslayalim. Ancak kodumuzu yan yana okunacak sekilde
degil, alt alta siralayalim.
{
   myList.stream().
           distinct().
           map(t->t.toUpperCase()).
           sorted().//Alfabetik siraya gore dizer
           forEach(t -> System.out.print(t + " "));

}
methodu main method icinde cagirdik ve ekranda ANGELINA CLARA JIM TOM gorduk

Lambda filelar, arraylerde, collectionlarda kullanilir.

Example 7: Bir listteki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina, kucukten buyuge
siralayarak console'a yazdiran methodu yazdirin.

Listimizi steram'e cevirdik, filterelemeye gerek yok, tekrarsiz olarak istendiginden distinc methodunu kullandik ve
kucuk harflere cevirmemiz gerektiginden map'den toLowerCase methodunu kullandik. Bizden kucukten buyuge bir
siralama istendiginden sorted methodunu aldik. Bu method icinde karsilastirma yapilmasi icin Comparator.comparing
yazdik. Boylece uzunluklara gore siralama olacak. sorted(Comparator.comparing(t->t.length)
Siralamayi biz yapacaksak Comparator.comparing kullanmaliyiz.
Methodu main method icinde cagirdik ve ekranda tom iki kez olmasina ragmen bir kez yazildi ve length'i en kisa
olanlarin basa alindigini, tum elemanlarin kucuk harfle yazildigini gorduk.

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);

    }
    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:
    public static void printElements(List<String> myList){
        for(String w : myList){
            System.out.print(w + " ");
        }
    }

    //2.Yol:
    public static void printEl(List<String> myList){
        myList.stream().forEach(t-> System.out.print(t + " "));
    }

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t + " "));
    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String> myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t + " "));
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t + " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t + " "));
    }
}


