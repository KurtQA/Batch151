package lambda_day05;


/*

3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
Bu soruyu structural programminge uygun olarak cozecegiz. Yani lambda ile degil, klasik ogrendigimiz sekilde cozecegiz.
Cift elemanlar diyorsa modules'i kullaniriz, elemanlarin 2'ye bolunmesi halinde sonuc 0'a esitse, sayi cifttir.

Once return type'i void olan metodumuzu olusturduk ve nums isimli ArrayListi parametre olarak yazdik.
Daha sonra for each loop kullandik. listimizi Integer w'ye assign ettik. If statement ile sayinin cift
olma sartini koyarak, cift olan elemanlari aldik. Main metod icinde kodumuzu calistirdigimizda ekranda sadece
cift sayilari gorduk.

4) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u functional programming
ile olusturunuz.

Metodumuzu olusturduk .

5) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
Bir sayinin karesini alacaksak, yapisini degistiriyoruz demektir.
metodu olusturduktan sonra sirasiyla nums.stream().filter(t->t%2 !=0).map(t->t*t).forEach(t->System.out.print(t+ " ")
Tek sayi olan elemanlar deniyor. Datalari stream'e alinca dikey bir yapilasma icinde alt alta siralanir.
filter metodunu calistirirken tek sayilari al, cift olanlari ele demis olduk. map metodu ile aldigi elemanlarin
karesi alinacagindan elemanlarin datasi degistirildi. forEach metodu ile karesi alinan elemanlar yazdirildi.
t harfinin yanina elemanlar arasinda bosluk olsun diye bosluk koyduk ve yazdirdik.

6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
Bu soruda 5. sorudan farkli olarak tekrarsiz elemanlar istendigi icin ayrica distinct metodunu kullandik ve tek sayilarin kupunu map
metodu icinde almis olduk. Genellikle distinct metodu basta kullanilan metodlardandir. t dedigimiz variabledir.
Sout icine yazdik ve onun tek harf olmasi, datalari icinde toplayan bir konteyner olmasina engel teskil etmez.
Her iki soruyu da functional programming ile cozduk.

7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz.
Bu sorudaki fark ayrica sayilarin toplami istenmis. reduce metodu kullanmaliyiz. reduce ile coklu data tekli dataya
donecek. metodumuzu integer olarak olusturduk. Parametresi arraylist

stream ile elemanlar yukaridan asagiya siralandi. Benzersiz dendigi icin basta distinct metodu kullanilarak
elemanlar azaltildi. filter metodu ile cift sayilari aldik. map metodu ile sayilarin kareleri alindi.
Devaminda reduce metodu icinde Math Class'indan addExact ile toplama yapildi ve get metodu eklendi.
Cunku integer olarak sonucu almak istedik. get metodu optional data type'ini integer'a ceviriyor.
Get metodunu kullnamasaydik, hata alirdik. Bu defa forEach metodu ile yazdirma yapilmadi.
Metodumuz integer olup bize integer dondurulmesi icin baslangic kismina return keywordu
ile basladik.

8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz.
Bu soruda fark carpim islemine ihtiyac var. Metodumuzu olusturduk.
sirasiyla; stream() distinct() filter() map() reduce() get() metodlarini kullandik. map icerisinde carpim, reduce
metodu icinde Math Class'indan multiplyExact ile carpma islemi yaptik.
get metodu sonrasi bir nokta koyarak forEach metodunu bulmak istedik, ancak bulamadik. Cunku get metodundan sonra
baska bir metod yazamiyoruz. Bu tip metodlara terminal metod denir.

Bu soruda bizden sayilarin kupu istenseydi ayni kodla AritmeticException alirdik. Cunku sonuc integer araligindan
buyuk olurdu.

9) Liste ogelerinden max degeri veren bir method olusturunuz.
Bu sorudaki fark elemanlardan max deger isteniyor. Metodumuzu olusturduk.
1. Yol:
Maximum degeri bulabilmek icin coklu datayi tekli dataya dusurmeliyiz. Cunku birden fazla ayni sayilar olabilir.
reduce metodu icinde Integer Classini yazarak bu Class'daki metodlari kullandik. Uygun olan MIN_VALUE olup devaminda
parantez icine iki sayi verdik. Bu sayilari t ve u harfleri temsil edecek sekilde yazdik. ve devaminda ternary
yapisi ile sayilardan t u'dan buyukse diye sorduk. Kodumuzu max isimli Integer bir conteynerine assign ettik.

int Max=nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u)->>u ? t: u);

stream metodu ile elamanlari stream'e cevirdik ve hepsi alt alta yazildi. reduce metodu ile elemanlari indirge dedik.
reduce metodu icinde Integer.MIN_VALUE baslangic deger demektir. t her zaman ilk degerini baslangic degeri
dedigimiz Integer.MIN_VALUE'yi alir,  Integer.MIN_VALUE degeri -2 milyar. Bu sabit bir deger. u ise stream icinde siralanan bastaki degeri alir. t daha sonra stream'deki
ikinci degeri alir.  Sirasiyla t>u kisminda iki sayi deger aldikca karsilastirilir.
Basta -2 milyar>12  12 daha buyuk. Bu sekilde biz buyuk olani bulduk.

2.YOL
1.Yoldan farki sorted metodu ve reduce metodunu kullandik. reduce metodu icine (t,u)->u).get() metodunu kullandik.
get metodu ile bu sekilde yazdirinca goremeyecegimiz icin atama yapmamiz gerekti. kodumuzu max2 isimli
Integer conteynerina assign ettik. 2. Yol tercih edilir. Cunku daha az metod kullanildi.

3.YOL(Son yaptigimiz)/2.yol olarak yazdik.
burada sorted metodu kullanmadik. distinct ve reduce metodlarini yine kullandik. reduce metodu icinde nums.get(0)
nums'in ilk indexteki elemanini, degeri aldi dedik. nums.get(0), (t,u)->t>u ? t :u ); get(0) ile ilk degerimiz
0.nci indexteki deger olacak. Iki onceki yolda baslangic degerimiz Integer.MIN_VALUE idi. Simdi t baslangictaki
deger olarak 0.nci indexteki degeri alir. Listimizde ilk eleman 12 idi. U ise ikinci indexteki elemani alacak.
Listimiz icinde 2. index 9. Burada 12 9'dan buyuk mu diye bakacagiz. Buyuk oldugu icin true olacak ve sirasiyla
bu sekilde devam edecek. Boylece en buyuk sayi elimizde kalacak ve sonucta gorebiliriz.



10) Liste ogelerinden minumum degeri veren method olusturunuz.

Integer min=nums.stream().distinct().reduce(Integer.MAX_VALUE(t,u)->t<u ? t : u) ;
reduce metodu icinde t ve u'yu kullaninca ve baslangic degerleri alinirken stream icindeki datalarin alinmasina
gore sabit deger olan Integer.MIN_VALUE ya da Integer.MAX_VALUE'dan alinmasi halinde kodumuz daha hizli calisir.
Bu sabit degeri almak daha kolaydir. Sorumuza gore MAX ya da MIN_VALUE'yu baslangic degeri yapariz. Reduce metodu
icinde onceki soru cozumunden farkli olarak t<u mu diye sorduk. Oncekinde t>u mu demistik. Cunku burada en kucuk
olani bulmaliyiz. Max value 2 milyar olup kucuk mu kiyaslamasinda degeri en az olan elimizde kalacak.




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
        elemanlariYazdir1(nums);
        System.out.println();
        elemanlariYazdir2(nums);
        System.out.println();
        ciftElYazdir(nums);
        System.out.println();
        ciftElYazdir2(nums);
        System.out.println();
        tekElKareYazdir(nums);
        System.out.println();
        tekSayilarinKupleriniTekrarsizYazdir(nums);
        System.out.println();
        System.out.println(benzersizCiftSayilarinKareleriTop(nums));
        System.out.println();
        benzersizCiftElKareCarpimiYazdır(nums);
        System.out.println();
        listedenMaxYazdir1(nums);
        System.out.println();
        listedenMaxYazdir2(nums);
        System.out.println();
        listedenMaxYazdir3(nums);
        System.out.println();
        listMinEleman(nums);

    }//main

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void elemanlariYazdir1(List<Integer> nums) {//12 9 131 14 9 10 4 12 15
        for (Integer w : nums) {
            System.out.print(w + " ");
        }
    }
    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void elemanlariYazdir2(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.stream().forEach(t -> System.out.print(t + " "));
    }
    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void ciftElYazdir(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");//12 14 10 4 12
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElYazdir2(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElKareYazdir(List<Integer> nums) {//[12, 9, 131, 14, 9, 10, 4 12, 15]
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));//81 17161 81 225
    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayilarinKupleriniTekrarsizYazdir(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));//729 2248091 3375
    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static int benzersizCiftSayilarinKareleriTop(List<Integer> nums) {

        return nums.
                stream().
                distinct().//benzersiz elemanlar alindi
                        filter(t -> t % 2 == 0).//cift olanlari secildi
                        map(t -> t * t).
                reduce(Math::addExact).
                get();//456

    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftElKareCarpimiYazdır(List<Integer> nums) {
        Integer benzersizCiftKareToplam = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(Math::multiplyExact).
                get();//45158400

        System.out.println(benzersizCiftKareToplam);
    }

    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void listedenMaxYazdir1(List<Integer> nums) {
        //1.Yol
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println("max = " + max);
    }

    public static void listedenMaxYazdir2(List<Integer> nums) {
        Integer max2 = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println("max2 = " + max2);
    }

    // 3.Yol
    public static void listedenMaxYazdir3(List<Integer> nums) {
        Integer max3 = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println("max3 = " + max3);
    }


    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static void listMinEleman(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);
    }
}