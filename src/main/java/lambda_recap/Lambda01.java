package lambda_recap;
/*

Lambda map haric butun collection uyelerinde kullanilabilir. Map'de kullanilamaz cunku maplerde key value
iliskisi vardir.

Gelin bir list olusturalim. sayi isimli integer listimizi olusturduk. Bu liste elemanlar ekleyebiliriz.
List parantezi icine Arrays.asList diyerek kisa yoldan listi olusturduk.
List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

Biz lambda islemleri yaparken metodlar olusturacagiz ve bu metodlarimizi main metod body'si disinda
olurturup, daha sonra main metod body'si icinde metodlarimizi cagiracagiz. (metod call)

//SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında
bosluk olacak sekilde yazdırın.

Yolumuza elemanlarin  cift ve pozitif olanlari ile yolumuza devam edecegimiz icin bir filtreleme yapacagiz.

1. adim: metodumuzu olusturalim.Parametre olarak integerlardan olusan listi girelim.
public static void ciftVePozitifLamExYazdir(List<Integer> sayi){

2.adim: list elemanlarini stream metodu ile akisa sunalim. Cift ve pozitif elemanlari almak icin filter metodu
kullanalim. t'nin 2'ye bolumunden kalan 0 ise bu sayi cifttir. Pozitif olani da almak gerek. Sayinin pozitif olmasi
icin 0'dan buyuk olmasi gerek. filter metodu icine cift ve pozitif olarak yazmaliyiz. t%2==0 77 t>0
devaminda forEach metodu ile yazdirma islemini yapalim.
sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " ")

3.adim: Main metod icinden metodumuzu call edelim. Metodu yazinca parantezi icine bir argument girmeliyiz.
Bu nedenle () icine sayi yazdik ve run edince ekranda 12 6 8' i gorduk. Yani cift ve pozitif olan elemanlari
aralarinda bosluk olacak sekilde yazdirmis olduk.

//SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında
bosluk olacak sekilde yazdırın

Bu soru, onceki soruya benzer olup, farki metod referans kullanmayi gerektirmesi.

1. adim: metod olusturalim. Parametre olarak integerlardan olusan bir list yerlestirelim

2.adim parametre olarak aldigimiz listin ismini yazip, devaminda gerekli olan metodlarimizi yazalim.
forEach parantezi icinde bir metod yazacagiz, ancak once ayni package icinde bir Utils Class'i olusturalim ve orada
bize gerekli olan bir metod olusturalim. Bu metodu yazdirma islemleri icin olusturalim. yazdir isimli metodumuza
parametre olarak gerekirse integer ya da String bir ifade girebilecegimiz gibi Object de yazabiliriz. Olusturdugumuz
bu metoda parametre olarak Object yazalim.
public static void yazdir(Object a){
sout...
Utils Class'i icinde metodumuzu olusturduktan sonra tekrar Lamda01 Class'imiza donduk ve forEach() icine Utils::yazdir
yazalim. Burada yazdir isimli metodumuzu kullandik. Boylece soruda bizden istendigi gibi metod referans kullanmis
olduk.
sayi.stream().filter(t->t%==0 77 t>0).forEach(Utils::yazdir);

3.adim: main metoda giderek metodu call edelim. Metodumuza parametre olarak listin ismini aldik. Run edince
12 6 8'i ekranda gorduk. Birinci soru icin lamda expression kullanmistik ve ayni sonucu ekranda gormustuk. Ikinci
soruda ise metod referans kullanarak ayni sonuca ulastik.

//SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın.

List elamanlari kareleri ile yoluna devam edecek. Yani elemanlarin yapilari aksiyon sonrasi degisime ugrayacak.
Bu nedenle map metodunu kullanalim.

1. adim: kareYazdir isimli metodu olusturalim. Parametre olarak integerlardan olusan bir list alalim. sayi isimli
listimizi yazalim.

2. adim: sayi listinin ismi ile baslayarak sirasiyla kullanilacak metodlari yazalim.
map metodu streamden akistan gelen elemanlarin karelerini alma islemini yapacak. Yazdirma islemi icin forEach metodu
parantezi icine Utils Class'imizdaki yazdir isimli metodumuzu metod referens ile yazalim. Utils::yazdir
sayi.stream().map(t->t*T).forEach(Utils::yazdir);
3.adim:main metod icinde metodumuzu cagirip yazdiralim. Ekranda elemanlarin karelerini gorduk.
map islemi icin biz lamda expression kullandik. Map islemini metod referans kullanarak da yapabiliriz.
Bunun icin Utils Class'ina gidelim ve akistan gelen elemanlarin karelerini alma islemi icin bir metod
olusturalim. Metodumuzun ismi kareBul, bu metodu Lambda01 Class'inda kullanacagiz.
public static int kareBul(int a){
return a*a;// int a stream'den gelen herbir elemani temsil ediyor. Herbir eleman geldikce kendisi ile carpilarak
karesi alinmis olacak. map ara eleman oldugu icin return ettirdik. Cunku sonrasinda forEach ile yazdirma yapacagiz.
Yazdirma oncesi return edilmesi gerekir.
}
Daha sonra ayni kodumuzu yazarken map () icine Utils::kareBul) yazarak metodumuzu burada kullandik ve lambda
expression islemi yerine metod referans islemi yaptik. Main metod icinde metodumuzu cagirip, run edince ayni
sonucu elde ettik.

//SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın.

Soru bizden ne istiyor. List elemanlarinin karelerini bulacagiz. Sonra bunlari tekrarsiz olarak yazdiracagiz.

1.adim: kareTekrarsiz isimli metodumuzu parametre olarak integerlardan olusan sayi isimli listimizi yazarak olusturalim.
listimize istedigimiz ismi verebiliriz. Biz sayi ismini verdik.

2.adim: stream metodu sonrasi yine Utils Class'imizdan sayilarin karelerini bulan metodumuz kareBul metodunu
kullanabilecegimiz sekilde map metodunu kullanalim. Daha sonra kareleri alinan elemanlari tekrarsiz almak
icin distinct metodunu kullanalim. ForEach metodu icine Utils::yazdir yazarak metod referans kullanalim. yazdir metodunu
Utils Class'inda biz olusturmustuk ve burada kullandik.

 sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);

 3.adim: main metod icinde metodumuzu call edip yazdiralim.

 //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın.

 1. adim: Metodumuzu olusturalim. buyKucSirala metodu (List<Integer> sayi)


 2.adim: siralama islemi yapilacaksa sorted metodu kullaniriz. Siralamayi kucukten buyuge dogru siralar. Soru bize
 buyukten kucuge sirala diyor. Bu sebeple sorted'a ters siralama yapacagini Comparator.reverseOrder() yazarak soyleriz.
 forEach ile yazdiralim. Utils Class'indaki yazdir metodunu kullanarak metod referens yapalim/

 3.adim: Main metod icinde metod call ve run edelim.

  // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız.

  Bu sorudaki fark pozitif elamani al, kuplerini bul, birler basamagi 5 olanlari al.

  Burada pozitif eleman icin filtreleme olacagindan filter metodu kullanmaliyiz. Akistan gelen elemanlarin kupleri
  alinirken yapilari degiseceginden map metodunu kullanmaliyiz. Akistan gelen elemanlarda birler basamagi 5 olanlarla
  yolumuza devam edecegimiz icin yine filtreleme yapmaliyiz. Filter metodunu kullanmaliyiz.

  1.adim:pzitifKupBirlerBas5 isimli integerlardan olusan list parametreli metodu olustur

  2.adim: Birler basamagi 5 olani nasil almaliyiz? t->t%10==5 bir sayinin 10'a bolumunden kalan 5 ise bu sayinin birler
  basmagi 5'tir. Istersek Utils Class'inda bir kup alma islemi yapan bir metod olusturup, o metodu map icinde yazarak
  metod referans kullanabiliriz. Ancak biz burada lambda expression ile cozume gittik.

  sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);

  3.adim:main metod icinde metod call ve run islemi yapalim.

// SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın.


1.adim: toplamMetRef isimli list parametreli metodumuzu olusturalim.

2.adim: Burada farkli olarak reduce metodunu kullancagiz. reduce metodu akistan gelen elemanlari tek bir eleman
olarak cikariyor. Soru bizden elemanlarin toplamini istediginden , toplam bir tane sonucu verecek.reduce() icinde
metod referans kullanacagiz. Cunku soru bizden net bir sekilde bunu istiyor. Integer Class'indaki sum metodu lambda
nin hazir bir metodu olup, biz hazirdaki bu metodu kullanacagiz. Toplami bu sekilde bulunca, yazdirma islemi yapalim.
Ancak reduce metodu terminal metod oldugu icin bu metod sonrasinda forEach metodu gelmez. Ne yapmaliyiz?
Su ana kadar elimizde list elemanlarin toplam degeri var ve biz bunu bir integer'a assign edelim. Integer'a assign
edersek java kizariklik yaparak bizi uyaracak, bunu integer'a degil Optional'a assign etmemizi isteyecek. Ya akista
hicbir eleman yoksa bunu toplayamayacak. Akista hicbir eleman yoksa null olur. Java bunun tedirginligini yasiyor.
null'i integer'a assign edersek java bu durumda nulPointerException verebilirim diyor ve bu yuzden bunu Optional'a
donustur diye israr ediyor. Biz bunu kabul edip Optional<Integer> olarak yazinca kizariklik sona erer. Bundan
sonra sout ile yazdirmayi yapariz. Sout icine sonuc isimli Optional'i yazalim.

sayi.stream().reduce(Integer::sum);

int sonuc=sayi.stream().reduce(Integer::sum)

Optional<Integer> sonuc= sayi.stream().reduce(Integer::sum);


3.adim: Main metod icinde metod call ve run islemi yapalim.


// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın.

7. soru ile ayni soru ama sadece bizden metod referans degil lambda expression ile cozmemiz isteniyor.

1.adim: toplamLambaEx metodumuzu olusturalim.

2.adim: sayiyi aldik sayi.stream() ile akisa sunduk. reduce metodunu tek bir elemani yani toplam degeri alacagiz.
reduce() icine lambda expression ile islem yaptik. reduce metodu icine identity olarak 0'i yazdik. Cunku toplama
isleminde etkisiz elemandir. List elemanlarinin toplamini alacagimiz icin iki a ve b gibi iki degiskene ihtiyacimiz
var. Bu degiskenlerle toplama islemi yaptik. reduce(identity 0, (a,b)->a+b); a her zaman ilk degerini identity'den alir. Burada ilk degeri 0'di.
b ise ilk degeri stream akisindan, ilk elemandan alir. Elemanlarimiz 1, 2, 3
a    b
0  + 1//b ilk eleman 1'i deger olarak aldi ve 0 olan identity ile toplandi. Sonuc 1
1  + 2//b ikinci siradaki eleman olan 2'yi aldi ve artik degeri 1 olan a ile toplandi. sonuc 3
3  + 3//b ucuncu elemani alip, a'daki bir onceki sonuc olan deger ile toplandi
6  //akista baska eleman kalmadigi icin sonuc 6

kodumuzu bir integer'a assign edince java bizi Optional'a donusturmeye zorlamiyor. Bir kizariklik vermiyor. Cunku
ilk deger var. null sonucu cikayacak. Hic eleman olmazsa sonuc 0 olur ve bir integera assign edilebilir.
Bu nedenle nullPointerException atmayacak.
int sonuc= sayi.stream().reduce(identity 0, (a,b)->a+b);

3.adim: metodu main metod icinde call edip, run edelim. Ekranda 36'yi gorduk.

//SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

Listin cift elemanlari ile yolumuza devam edecegiz. filter metodu kullanacagiz. Sonrasinda karelerini alacagiz.
Yani bir degisim soz konusu. Bu yuzden map metodunu kullnacagiz. Kucukten buyuge bir siralama istendiginden sorted
metodunu kullanacagiz. list halinde return ederek yazdirma islemi yapacagiz.

1.adim: ciftElKareKucBuySirListReturn isimli metodumuzu olusturalim. Parametresini girelim. Parametresi integerlardan
olusan bir list.

2.adim: Cift elemanlari alacagimiz icin filter metodunu kullanalim. t->t%2==0 (lambda expression)
elemanlarin karesini larak degisiklige ugrayacaklari icin map metodu kullanalim. t->t*t (lambda expression)
istersek metod referans ile islemimizi yapariz. Utils::kareBul
Kucukten buyuge siralama yapilmasi icin tek basina sorted() kullanalim.
elemanlari liste donusturelim.collect(Collectors.toList
yazdigimiz kodu sonuc adinda bir liste assign edelim.

List<Integer> sonuc= sayi.stream().filter(t->t%2==0).map(Utils::kareBul).sorted().collect(Collectors.toList);

3.adim: List halinde iken return etmemiz istendiginden List alt satirina return sonuc; yazdik. return edecegimiz
icin bast a void olarak return type'ini yazdigimiz metodun return type'ini List<Integer>'a cevirdik.

4.adim: return ettigimiz icin onceki soru cozumlerinden farkli olarak main metod icinde sadece metodu call yapmadik,
sout islemini yaptik. sout icine metodumuzun ismini ve parametresi icine list'in adi olan sayi'yi yerlestirdik. Sonucu
main metod icinde return etmis olduk.

Return type void olunca soutu method içine yazar ve sadece method ismi ile  main den çağırmak yeterli
ama return type void dışında diğerleri olunca method içerisinde return yapıp main içerisin de sout ile
çağırmamız yapmamız gerek.




 */

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftVePozitifLamExYazdir(sayi);
        System.out.println(" \n  *******");
        ciftVePozitifMetRef(sayi);
        System.out.println(" \n  *******");
        kareYazdir(sayi);
        System.out.println(" \n  *******");
        kareTekrarsiz(sayi);
        System.out.println(" \n  *******");
        buyKucSirala(sayi);
        System.out.println(" \n  *******");
        pozitifKupBirlerBas5(sayi);
        System.out.println(" \n  *******");
        toplamMetRef(sayi);
        System.out.println(" \n  *******");
        toplamLambaEx(sayi);
        System.out.println(" \n  *******");
        System.out.println(ciftElKareKucBuySirListReturn(sayi));

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifLamExYazdir(List<Integer> sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t + " "));
    }


    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitifMetRef(List<Integer> sayi){
        sayi.stream().filter(t->t%2==0 && t>0).forEach(Utils::yazdir);
    }


    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi){
        // sayi.stream().map(t->t*t).forEach(Utils::yazdir);
        sayi.stream().map(Utils::kareBul).forEach(Utils::yazdir);
    }


    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsiz(List<Integer> sayi){
        sayi.stream().map(Utils::kareBul).distinct().forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSirala(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::yazdir);
    }



    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBas5(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::yazdir);
    }



    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamMetRef(List<Integer> sayi){
        Optional<Integer> sonuc = sayi.stream().reduce(Integer::sum);
        System.out.println(sonuc);
    }


    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLambaEx(List<Integer> sayi){
        int sonuc = sayi.stream().reduce(0,(a,b)->a+b);
        System.out.println(sonuc);
    }



    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız

    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer> sayi){

        List<Integer> sonuc = sayi.stream().filter(t->t%2==0).map(Utils::kareBul).sorted().collect(Collectors.toList());

        return sonuc;

    }







}




