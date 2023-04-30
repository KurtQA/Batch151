package day06;

/*
1. Soru: Listedeki elemanlarin hepsi cift sayi mi? allMatch metodunu dusunduk. Cunku hepsi mi diye soruluyor.

allMatch metodu icerisinde tum sayilara bak ve cift mi diye t%2==0 seklinde kontrol ettik dedik.
Cift mi diye sordugumuza gore bunu bir boolean conteynarina assign etmeliyiz.
Sout icine boolean variableimizin ismini yazarak sonucu yazdirdik.

2.Soru: Listteki herhangi biri tek mi diye soruldugundan anyMatch metodunu dusunduk. Birinin bu sarti saglamasi
yeterli olacak. Yine Lambda'ya gore olusturdugumuz kodu bir booelan variable'ina assign ettik. Tek sayi mi sorumuzu
anyMatch metodu icinde t%2!=0 seklinde yazarak sorduk ve sout icinde boolean variable ismini yerlestirdik. Daha
sonra main metod icine giderek metodumuzun ismini yazdik ve calistirdik.

3.Soru: En kucuk ilk 3 eleman haric kalanlara %50 artis yapilmasi dendigi icin skip metodunu hatirladik.
Metodumuzun ismini sorumuza uygun olarak verdik.
sorted() metodu kucukten buyuge dizme isini yapar. Sorumuzda ilk 3 kucuk eleman dendiginden sorted icine ayrica arguman
koymamiza gerek yok, cunku zaten kucukten buyuge siralama yapacak. skip() icine 3 yazarak 3 dahil ilk 3 elemani atla
demis oluruz. Elimizde kalan sayilarda %50 artis yaparsak elemanlarin yapilari degisir. Bunu map metodu ile yapariz.
map metodu icine %50 artisi veren islemi su sekilde yaptik: t*1.5 Daha sonra yazdirma islemi icin forEach metodunu
kullandik ve main metod icinde yazdirmayi sagladik.
Sirasiyla nums.stream().sorted().skip(3).map(t->t*1.5).forEach(t->System.out.print(t+ " ")); yazdik.
Ekranda gordugumuz sayilardan ilk uc elemanin atlandigini ve kalanlarda %50 artis yapildigini anladik.

4.Soru: Cift elemanlari bulmak ve yazdirmak icin structural programmingde if statement icine sayi%2==0 yazarak cozuyorduk.
Functional programmingde ise filter metodu ile eleme yapiyoruz.

5.Soru: tek sayi olan elemanlarin kareleri istenmis.
tek sayilari almak icin filter metodu daha sonra bu elemanlarin yapisini karelerini alarak degistircegiz ve bunun
icin map metodunu kullaniriz. map metodu icinde sayilarin yerine yazdigimiz t ile t'yi carptik.

6.Soru: Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak
yazdirmamiz gerekli.
Bu soruda 5. sorudan farkli olarak tekrarsiz elemanlar istendigi icin ayrica distinct metodunu kullandik ve tek sayilarin
kupunu map metodu icinde almis olduk. Genellikle distinct metodu basta kullanilan metodlardandir. distinct metodu sonrasinda
elimizde benzersiz elemanlar kaldi ve filter metodu ile tek olan sayilari alinca elimizde 3 datamiz kaldi ve map ile onlarin
kuplerini aldik.'t' olarak yazdigimiz aslinda bir variabledir. Sout icine t yazdik ve onun tek harf olmasi,
datalari icinde toplayan bir konteyner olmasina engel
teskil etmez.

7) Benzersiz cift sayilarin karelerinin toplamini hesaplayan bir method olusturmaliyiz.
Bu sorudaki fark ayrica sayilarin toplami istenmis. reduce metodu kullanmaliyiz. reduce ile coklu data tekli dataya
donecek. reduce metodu icinde bir baslangic degeri konulur. Bu soruya gore 0 ile baslatabiliriz. 0'dan sonra t ve u
yazariz. t her zaman baslangic degerini yani buraya gore 0'i alir, t her zaman stream icinde sirali halde olan elemanlarin
en tepedeki ile baslar ve ilerleyen asamalarda bir onceki toplam sonucu deger olarak alirken, t ise streamde devam eden
sonraki elemanlari deger olarak alir. Sonucta bu elemanlar toplama islemi ile tek sayiya reduce metodu ile indirgenmis olur.

Biz reduce metodu icinde bu sekilde lambda expression yazabilecegimiz icin Math Classindan addExact metodunu da alip
yazabiliriz.

stream ile elemanlar yukaridan asagiya siralandi. Benzersiz dendigi icin basta distinct metodu kullanilarak
elemanlar azaltildi. filter metodu ile cift sayilari aldik. map metodu ile sayilarin kareleri alindi.
Devaminda reduce metodu icinde Math Class'indan addExact ile toplama yapildi ve cozumlerimizden birinde get metodunu
ekledik bu kisma, ikinci cozumde get metodu yerine orElseThrow() metodunu ekledik. get metodu ile ayni yapidadir. reduce
metodu sonrasi degerler Optional Class'da sayi degerleri donduruluyor. Biz ise sayilari integer olarak almaliyiz.
Bu metod terminalde bize get metoduna gore daha fazla bilgi veriyor. Biz reduce metodu sonrasi get ya da orElseThrow
metodlarini eklemezsek her ikisi de bize Exception firlatir. Exception firlatma olmamsi, sayilari integer degere dondurmek
icin bu metodlari kullaniriz.
Cunku integer olarak sonucu almak istedik. get metodu optional data type'ini integer'a ceviriyor.
Get metodunu kullanmasaydik, hata alirdik. Bu defa forEach metodu ile yazdirma yapilmadi.
Metodumuz integer olup bize integer dondurulmesi icin baslangic kismina return keywordu ile basladik.

Bu soruyu cozerken get metodu kullanirken bir kizariklik gorduk ve uzerine gidince icindeki Ingilizce statement'i secili
halde tutunca sagi tiklayarak translate kismi ile Turkce'ye cevirdik. Buradaki uyari ve tavsiyeyi
okuyarak neler yapabilecegimizi anladik.


reduce metodu sonrasinda forEach metodu ile yazdirma islemi yapamiyoruz. get ve orElseThrow metodlari yazdirma yapmadigi icin reduce
metoduna eklenebilirler. Biz bunlara gerek olmasin dersek kodumuzu dogrudan bir int variable'a assign etmeliyiz.

8. Soru: Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturmaliyiz.
Bu sorudaki fark burada carpim islemine ihtiyac var. Metodumuzu olusturduk.
sirasiyla; stream() distinct() filter() map() reduce() get() metodlarini kullandik. map icerisinde carpim, reduce
metodu icinde Math Class'indan multiplyExact ile carpma islemi yaptik.
get metodu sonrasi bir nokta koyarak forEach metodunu bulmak istedik, ancak bulamadik. Cunku get metodundan sonra
baska bir metod yazamiyoruz. BU metodun yapisi baska bir metod yazdirmaya uygun degil. Bu tip metodlara terminal metod denir.

Bu soruda bizden sayilarin kupu istenseydi ayni kodla AritmeticException alirdik. Cunku sonuc integer araligindan
buyuk olurdu.

9. Soru: Liste ogelerinden max degeri veren bir method olusturmaliyiz.
Bu sorudaki fark list elemanlarindan max deger isteniyor. Metodumuzu olusturduk.

distinct ve reduce metodlarini kullandik. reduce metodu icinde nums.get(0)
nums'in ilk indexteki elemanini, degeri aldi dedik. nums.get(0), (t,u)->t>u ? t :u ); get(0) ile ilk degerimiz
0.nci indexteki deger olacak. t baslangictaki deger olarak 0.nci indexteki degeri alir. u ise stream icindeki ilk
indexteki elemani alacak. Daha sonra t, ilk islemde karsilastirma yapilirken elimizde kalan sayiyi deger olarak alir. Ornek
elimizde 0'dan buyuk olan 12 vardi. 12 t'de kaliyor ikinci islem icin. u ise stream icindeki ikinci elemani alir ve 12 ile
karsilastirilir. Ornek ikinci eleman 9 idi. 9 12'den kucuk oldugu false verecegi icin t icinde elimizde yine 12 var.
Gordugumuz uzere her karsilastirmada en buyuk olan eleman elimizde kalir. Alinan deger buyuk oldugu surece true olacak ve
sirasiyla bu sekilde devam edecek.

2.YOL

sorted metodunu da kullanabilirdik. sorted icinde Comparator.reverseOrder() yazariz ve yanina limit(1) ve forEach ile
yazdirma yapariz. limit metodu ile bir eleman alacagimizi soyleriz. Sadece sorted() yazsaydik kucukten buyuge elemanlar
siralanirdi. Burada reverseOrder ile elemanlar tersten siralandi ve limit metodu ile birinci eleman alindi. Birinci
eleman en buyuk sayi idi.
Bir metod hakkinda daha fazla bilgi almak istedigimizde metodun uzerine gelip, aciklama kisminda ozelliklerini
okuyabiliriz.

3.YOL
Maximum degeri bulabilmek icin coklu datayi tekli dataya dusurmeliyiz. Cunku birden fazla ayni sayilar olabilir.
reduce metodu icinde Integer Classini yazarak bu Class'daki metodlari kullandik. Uygun olan MIN_VALUE olup devaminda
parantez icine iki sayi verdik. Bu sayilari t ve u harfleri temsil edecek sekilde yazdik. ve devaminda ternary
yapisi ile sayilardan t u'dan buyukse diye sorduk. Kodumuzu max isimli Integer bir conteynerine assign ettik.

int Max=nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->>u ? t: u);

stream metodu ile elamanlari stream'e cevirdik ve hepsi alt alta yazildi. reduce metodu ile elemanlari indirge dedik.
reduce metodu icinde Integer.MIN_VALUE baslangic deger demektir. Biz bunu deger olarak vererek kendisi ile karsilastirma
yapildiginda hep false verecek. Cunku t buyuk sayi olmamis olacak ve hep u hangi sayi ise o yazilacak.
Her karsilastirmada daha buyuk sayi u icinde kalmis olacagindan sonucta u daki en buyuk sayiyi alabiliriz.
t her zaman ilk degerini baslangic degeri dedigimiz Integer.MIN_VALUE'yi alir,  Integer.MIN_VALUE degeri -2 milyar.
Bu sabit bir deger. u ise stream icinde siralanan bastaki degeri alir. t daha sonra stream'deki
ikinci degeri alir.  Sirasiyla t>u kisminda iki sayi deger aldikca karsilastirilir.
Basta -2 milyar>12  12 daha buyuk. Bu sekilde biz buyuk olani bulduk.

3.YOL
1.Yoldan farki sorted metodu ve reduce metodunu kullandik. reduce metodu icine (t,u)->u).get() metodunu kullandik.
get metodu ile bu sekilde yazdirinca goremeyecegimiz icin atama yapmamiz gerekti. kodumuzu max2 isimli
Integer conteynerina assign ettik. 2. Yol tercih edilir. Cunku daha az metod kullanildi.


burada sorted metodu kullanmadik. distinct ve reduce metodlarini yine kullandik. reduce metodu icinde nums.get(0)
nums'in ilk indexteki elemanini, degeri aldi dedik. nums.get(0), (t,u)->t>u ? t :u ); get(0) ile ilk degerimiz
0.nci indexteki deger olacak. Iki onceki yolda baslangic degerimiz Integer.MIN_VALUE idi. Simdi t baslangictaki
deger olarak 0.nci indexteki degeri alir. Listimizde ilk eleman 12 idi. U ise ikinci indexteki elemani alacak.
Listimiz icinde 2. index 9. Burada 12 9'dan buyuk mu diye bakacagiz. Buyuk oldugu icin true olacak ve sirasiyla
bu sekilde devam edecek. Boylece en buyuk sayi elimizde kalacak ve sonucta gorebiliriz.



10. Soru: Liste ogelerinden minumum degeri veren methodu olusturmaliyiz.

Integer min=nums.stream().distinct().reduce(Integer.MAX_VALUE(t,u)->t<u ? t : u) ;
reduce metodu icinde t ve u'yu kullaninca ve baslangic degerleri alinirken stream icindeki datalarin alinmasina
gore sabit deger olan Integer.MIN_VALUE ya da Integer.MAX_VALUE'dan alinmasi halinde kodumuz daha hizli calisir.
Bu sabit degeri almak daha kolaydir. Sorumuza gore MAX ya da MIN_VALUE'yu baslangic degeri yapariz. Reduce metodu
icinde onceki soru cozumunden farkli olarak t<u mu diye sorduk. Oncekinde t>u mu demistik. Cunku burada en kucuk
olani bulmaliyiz. Max value 2 milyar olup kucuk mu kiyaslamasinda u'nu aldigi degerler hep kucuk olacak, false verecek ve
sonucta degeri en az olan elimizde kalacak.
Math Class'inda cok sayida metod var. Ancak derdimiz integer'a cevirmek ise Integer Class'indaki metodlardan faydalanmaliyiz.



 */

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.



    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz



    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.



    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.




    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.


    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz


    //9)Liste ogelerinden max degerini veren bir method olusturunuz



    //10)Liste ogelerinden minumum degerini veren method olusturunuz


}


