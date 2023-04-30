package day42lambda;

/*
Example 1:List elemanlarini son harflerine gore natural order'da tekrarsiz olarak
buyuk harfle bir list'in icinde return ediniz.

Elemanlarimiza baktigimizda son harflere gore siralarsak basa Michael, Jim, Tom, Alexander, Alex, Alex, Mary
olmali. Tekrarsiz istendigi icin Alex bir kere yazilacak. Buyuk harfle yazmamiz gerektiginden, kalan elemanlari
buyuk harfe cevirecegiz ve son olarak bu elemanlari list icine alacagiz.

Oncelikle methodumuzu String bir List olarak olustururuz. Method parantezi icine bir list koymaliyiz, cunku
bir list ile calisacak. Method body'si icinde basa return yazdik ve Methodumuzu stream'e cevirdik
daha fazla method barindirdigi icin. Tekrarsiz olmasi icin distinct methodu ve devaminda elemanlarin
buyuk harfe cevrilmesi icin map methodunu kullandik. Ideal kod yazmamiz icin map methodu icinde
String::toUpperCase yazdik. Daha sonra natural order yapabilmemiz icin sorted methodunu kullandik.
sorted() icinde Comparator classina giderek Comparator.comparing'i sectik. Son harfe gore secim yapan
method olmadigi icin biz charAt methodundan istifade ettik. Bu methodla son indexe
giderek, son harfi alip bakabilecegiz. charAt(t.length()-1). Bizden elemanlari list icine koymamiz istendi.
Bu durumda collect yapip liste koyacagiz. Burada List mi set mi kullanacagiz. Kodumuzda tekrarli eleman
istenmediginden ve set tekrarsiz elemanlari depoladigindan set'teki collect(Collectors. methodunu da
kullanabiliriz.

Eger collect methodunu Set ile kullanmak istersek, kodumuz kizarir. Bu durumda methodumuzun data type'ini
List yerine Set olarak degistiririz. Bu durumda problem cozulmus olur. Ancak baska bir problem ile
karsilasiriz. Yukarida kodumuz icine yazdigimiz sorted methodunu kabul etmez. Cunku toSet icinde HashSet
kullanilir ve HashSet elemanlari sirali olarak degil rastgele siralar. Bu sekilde kodumuzu tamamlayamadik.
Oyleyse kodumuzda toSet degil to List kullanmamiz gerektigini anladik.
Normalde distinct elemanlari depolamak icin Set kullanilir. Ama Lambda'daki toSet methodu elemanlari rastgele
siralar. Sorumuzda siralama istenmeseydi, distinct de olunca toSet kullanmak okunurluk acisindan daha dogru olurdu.

Example 2:List elemanlarini character sayilarina gore ters sirada kucuk harfle
bir list'in icinde return ediniz. Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun.

Bu sorumuzdaki fark, character sayilarina gore bir karsilastirma yapma, tersten yazma, alfabetik siraya gore
yazilma var.
En uzun olani en basa gelerek devam edecek. Karakter sayisi ayni olanlari da alfabetik siraya gore yerlestirecegiz.
String List olarak bir method olusturduk. Parametre olarak Listimizi koyduk.
sirasiyla return listimizin ismi, stream(), map(String::toLowerCase), sorted(Comperator.
comparing(String::length), reversed(), thenComparing(t->t.charAT(0)), collect(Collectors.toList()
sorted charAt(0) dahil olacak sekilde yazildi.
thenComparing siralamanin icinde siralama yaptigimizda kullaniriz. Basta uzunluklara gore siraladik, devaminda
alfabetik siraya gore siraladik. Bu yuzden then.Comparing'i kullandik.

Main method icinde methodumuzu cagirip calistirinca en uzundan baslayarak elemanlar kisalarak siralandi.
Ayni sayida ornegin 4 karakterli elemanlar kendi iclerinde alfabetik siraya gore siralandilar.
Ayni isimler yan yana yazildi. Ornek: alex, alex, brad, mary brad ve mary ayni uzunlukta ancak ilk
harflerine bakinca brad'in b ilk harfi mary'nin m harfinden onceye gelmesi gerektiginden, brad daha once yer buldu.

Example 3:List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini
kontrol eden method'u olusturunuz.

Bu soruda yeni olan seyler: allMatch methodu, elemanlarin karakter sayilarina bakip 2'den buyuk mu diye kontrol edecegiz.
Bunu normalde for each loop ile yapabiliriz. Ancak simdi Lambda ile cozecegiz.
Methodun return type'nin boolean olmasi mantikli. Parnatezi icine listimizi koyduk.
Sirasiyla names.stream().allMatch(t->t.length()>2)
Sorumuzda elemanlarin tamami dendiginden allMatch methodunu sectik. Herbir elaman alinacak ve karakter sayilarina
bakacak, 2'den buyukse true verecek aksi halde false verecek.

Example 4:List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini
kontrol eden method'u olusturunuz.

Bu soruda yeni olan seyler: Elemanlarin hicbiri dendigine gore noneMatch methodu kullanilacak.
Yine boolean bir method olusturduk. sirasiyla return names.stream().noneMatch(t->t.length()<3);

Example 5:List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol
eden method'u olusturunuz.

Bu soruda yeni olan seyler: elemanlarin en az biri dendigi icin burada anyMatch methodunu kullanacagiz. Bu method
kurala uyan birini bulunca digerlerine bakmaz.
Method boolean bir method ve parametresi listimiz.
method body'si icine sirasiyla return names.stream()anyMatch(t->t.length()<4);
Ekranda true gorduk. Cunku Jim ve Tom vardi. Bu isimleri cikarinca kalanlara bakti ve false verdi.

Match
allMatch() ==> tum elemanlar sarti saglarsa true dondurur
anyMatch() ==>bir ya da birden daha fazla eleman sarti saglarsa true dondurur
noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur




 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));

        System.out.println(atLeastOneLengthLessThanFour(names));
    }
    //Example 1: List elemanlarini son harflerine gore natural order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.
    //           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, TOM, JIM, ALEXANDER, ALEX, MARY]
    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){

        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());//Normalde distinct elemanlari depolamak icin "Set" kullanilir.
        //ama Lambda'daki collect(Collectors.toSet()); method'u elemanlari
        //rastgele siralar  halbuki bu soruda rastgele siralama kabul edilmiyor.
        //Bu yuzden mecburen collect(Collectors.toList());
    }

    //Example 2: List elemanlarini character sayilarina gore ters sirada'da kucuk harfle bir list'in icinde return ediniz.
    //           Ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun
    //           [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [Alexander, Michael, Alex, Alex, Mary, Jim, Tom]
    public static List<String> sortWithLengthReversedSameLengthInNaturalOrderLowerInList(List<String> names){
        return names.
                stream().                  // [tom, alex, jim, michael, mary, alexander, alex]
                        map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }

    //Example 3: List elemanlarinin tamaminin character sayisinin 2 den buyuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean isLengthMoreThanTwo(List<String> names){
        return names.stream().allMatch(t->t.length()>2);
    }

    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLengthLessThanThree(List<String> names){
        return names.stream().noneMatch(t->t.length()<3);
    }

    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){
        return names.stream().anyMatch(t->t.length()<4);
    }
}
