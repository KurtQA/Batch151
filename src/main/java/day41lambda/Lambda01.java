package day41lambda;

/*
Dersin basinda nums ismini verdigimiz Integer list olusturduk. Listteki tek sayi olan elemanlarin
kareleri toplamini hesaplayan bir method olusturduk. Main method icinde cagirma yapabilmemiz icin methodu static
yaptik.
public static int getTheSumOfSquareOdds(List<Integer> nums). Methdoumuz bir list ile calisacagindan
parantezi icine Integer Listimizi koyduk. Basa return yazdik ve bosluk birakarak listin ismini yazip
devaminda stream methodunu yazdik. Basa neden return yazdik? Cunku sayilarin toplamini bize vermesini
isteyecegiz.Tek sayilari almamiz gerektiginden burada stream sonrasi filter kullandik.
't' harfi sayi olan elemanlarimizi temsil ediyor. Java'ya map methodu icinde elemani al,
kendisi ile carp diyerek sayinin karesini almasini sagladik.
Daha sonra karesini aldiklarimizin toplamini alacagiz ancak sum methodu olmadigini gorduk ve
reduce methodunu kullanmaya karar verdik. map methodu sonrasi nokta koydugumuzda 3 tane farkli parametreli
reduce methodunu gorduk ve onlardan Integer identity gerektireni sectik.
Identity matematikte etkisiz eleman denir. Toplamada etkisiz eleman 0'dir.
Ilk parametre yapacagimiz islemin etkisiz elemani olmalidir. Carpma yaparken etkisiz
eleman olarak 1'i aliriz. Reduce methodu icine ilk 0 yazdik ve devaminda javaya
"iki sayi aldiginda, sayilarin toplamini yap" dedik. O iki sayi yerine t ve u yazdik.
reduce(0,(t,u)t->t+u); ve kodu calistirmak icin main method icine giderek methodumuz ismini
list ismi ile yazdik ve sout icine aldik.

Listimizi stream'e cevirince elemanlar yan yana degil alt alta siralandi. Filter methodu ile o elemanlardan
tek sayi olanlar alindi ve yine alt alta sirali halde oldular. Daha sonra map methodu ile tek tek alinan
elemanlarin kendileri ile carpimlari sonucu yani kareleri alt alta siralandi ve son olarak reduce
methodu soyle calisti: t her zaman baslangic degerini ilk parametreden alir.Yani 0'dir ilk degeri.
u degerlerini her zaman son method icinde alt alta sirali stream'e cevrilmis elemanlardan alir. Yani basta
sirali olan elemanlardan 9'un karesi olarak yazilan 81'i alacak. t ve u toplaninca 0+81=81 olacak
devam edecek. Bu defa t'nin degeri 81 olup, u ise sirali elemanlarimizdan ikinci siradaki 131'in karesi olan
17161'i alir ve 81+17161=17242 oldu ve t sonraki islem icin 17242 degerini aldi, u bu defa 3. siradaki eleman
81'i aldi. 17242+81=17323, t 17323 oldu, u 4. eleman 225'i aldi. t+u islemi yapilacagindan 17323+225=17548
sonucta biz ekranda 17548'i gorduk, methodu main method icinde calistirdigimizda.

reduce azaltmak, indirgemek demektir. Burada 4 deger vardi ve java bize bir deger verdi. Yani 4 degeri bir
degere dusurerek azaltma yapilmis oldu. Ne zaman coklu datayi tekli dataya cevirmek istersek reduce methodunu
kullanmaliyiz. Mesela 40 sayi var ve en buyugunu almak istedik. 40 sayi bire indirilecek oldugundan reduce
methodunu kullanabiliriz. 40 sayinin minimumunu almamiz gerektiginde de reduce methodunu kullanabiliriz. Cunku
bir tane minumum sayi vardir 40 sayi icerisinde.

Ikinci ornegimizde listteki cift sayilarin tekrarsiz olan karelerinin carpimini hesaplayan bir method
olusturduk. Tekrarsiz diyorsa distinct methodu kullanmamiz gerektigini hatirlamaliyiz. Ancak burada distinc
methodunu cift sayilarin kareleri alindiktan sonra kullanmaliyiz. Cunku soruda bizden tekrarsiz cift sayilari
istemiyor, sayilarin karelerinde tekrar olmamasi istendi. Cift sayilari ararken sayi olan elemanimizi temsil eden t'nin 2'ye bolumunden kalan 0'a esit ise t cift sayidir olacak ve t'de
cift sayilar birikecek. Eger cift sayilar tekrarsiz olsun denseydi distinct methodu stream methodu sonrasi
kullanilirdi. Burada karelerin tekrarsiz olanlari istendiginden map icinde kare hesaplamasi yapildiktan sonra
distinct methodunu kullandik. reduce methodunun ilk parametresi 1 olarak yazildi. Cunku carpma isleminde
1 etkisiz elemandir. Daha sonra t ve u t,u olarak yazildi. t basta 1'i deger olarak alacak. u ise distinct
methodu icinde stream olarak alt alta sirali tekrarsiz kare olan elamanlardan birinci siradaki elemani ilk
deger olarak alir. Burada basta 64 var. t*u islemi yapilacagindan, 1*64=64 olur.
Bir sonraki loop'da t'nin degeri 64 olacak.u ise ikinci siradaki elemani deger olarak alacak ve islem ayni yolla
devam ederek en son carpma islemindeki sonucu bize return edecek. Methodumuzun parantezi icinde en basta
return yazmistik, bize carpma isleminin sonucunu versin diye yazmistik.

Ucuncu ornegimizde, tek sayilarin minimum, cift sayilarin maksimum olanini bulmamiz gerekli. Yine bir listimiz var
ve methodumuzu yazinca parantezi icine listimizi koyduk.
Javaya bu listi bir stream'e cevir ve sonra filtrele. Once cift sayilari filter methodu ile aldik ve maksimum
olan sayiyi almak icin reduce methodunu kullandik. Javaya en buyuk sayiyi vermesi icin reduce methodu
icinde ternary'i kullandik. reduce(t,u)t->t>u ? t : u);
Ancak kodumuzun kizardigini gorduk. Tekrar reduce methodlarina baktik. Burada etkisiz elemani yazdirmamiz
gerekli olan reduce methodunu degil 1. siradaki reduce methodunu kullandik. Bu method bize Optional<Integer>
veriyor. Oysa biz data type olarak methodumuza int yazdigimiz icin hata veriyor. O zaman get() methodunu yanina
ekleyince Optional data type'i normal data type'a donebildi ve kizariklik sona erdi. Methodumuz icinde kodumuzu
yazarken basta return yazmistik. return yazinca sonucu almaliyiz. Ancak biz yazdigimiz ilk kod ile maksimum
sayiyi bulmus olacagiz. Ayrica minumum sayiyi bulmak icin ikinci bir islem iceren kodu yazmaliyiz. Yani islem
henuz bitmediginden bastaki return keyword'unu kaldirip, listimizin ismi ve devamindaki methodlari yeni
olusturdugumuz int variable'ina assign ettik. Ayni islemi minumum sayiyi bulmak icin yazdigimiz kod icin de
yapacagiz, yine baska bir int variable'ina assign edecegiz. int maxEven ve intminOdd variablelari olusturduk.

Minimum sayiyi bulmak icin reduce methodunu etkisiz eleman olmadan kullandigimiz icin methodun devamina get
methodunu ekledik. reduce methodu icinde yine ternary kullandik, ancak bu defa minumum sayiyi alacagimiz
icin t>u degil t<u ? t :u seklinde yazdik. return keywordunu islemlerimiz bitince en alta yazdik.
return maxEven + minOdd;

Dorduncu ornegimizde, filter'i degistirmemiz gerekecek. Yani filter methodu icine hem cift ve tek sayilari
hem de 7'den kucuk ve 8'den buyuk olma kuralini maximum ve minumum elemanlar icin yerlestirmemiz gerekti.
Methodumuzu olusturduktan sonra parantezi icine listimizi koyduk ve method body'si icinde iki ayri islem
yaptik. Yukaridaki soru cozumunde oldugu gibi maximum ve minumum sayilarla ilgili iki ayri int variable
olusturduk. Yukaridaki cozumden farkli olarak filter methodu icinde birden fazla kurali belirttik.
listimizin ismi, stream methodu, distinct methodu, filter methodu, reduce methodu ve
kullandigimiz reduce methodu type'ina gore get methodunu yazdik.
filter methodu icine ilk kisimda t->t%2==0 && t<7 yazdik. Ikinci kisimda ise t->t%2!=0 && t>8 yazdik.
filter methodlarimizin devaminda istenen sonuca uygun olarak reduce methodlarimizi ternary kullanarak yazdik.
reduce methodu devaminde get methodu yazdik ve alt kisimda bize javanin neyi return etmesini istediysek
o sekilde return'u yazdik. return max + min; Daha sonra main methoduna giderek methodumuzu list ismi ile
birlikte sout icinde yazdirip sonucu gorduk.

filter methodu icinde t->t%2==0 && t<7 Lambda expression'dir. Ideal kodu yazarken mumkun oldugunca
bu sekilde bir yazim olmamali. Lambda experssion yerine method reference kullanmaliyiz. Ayni sorulari
tekrarladik method reference'i kullanabilmemiz icin. Bunun icin sadece onceden olustrudugumuz methodlarin
isimlerini basitce degistirdik. Onceki kodumuz icinde reduce methodu icinde yazdigimizi sildik ve Math
Class'i icine giderek methodlara baktik. Bize toplama methodu lazimdi o nedenle add methodunu aldik ve onu
kullandik. reduce methodu icine soyle yazdik reduce(0, Math::addExact)
Daha sonra main methodu icine gidip ismini degistirdigimiz methodu yazdirinca bize onceki kodumuzda verdigi ayni
sonucu yazdirdi. Math::addExact bu soz dizimine method reference denir. Methodu refere ettik.

Lambda expression'lari kaldirmamiz gerekir.

reduce methodu icinde  (0, (t,u)->t+u) yazmak yerine, (Math: :addExact) yazdik.
O kisim kizarinca, yanina get methodu ekleyince duzeldi.

Baska bir kodumuzda sayinin karesini almamiz gerekmisti. Math Class'ina gittik ve sayilarin karesini alan bir
method var mi diye baktik ve bulamadik. Applicationimizda kare alma sikca kullanilacak bir islem ise onun
icin package kismina gelip Utils Class isimli class'i olusturmaliyiz. Utils demek sik kullanilanlardir ve faydali
methodlarin depolandigi yer demektir. Bir kere bu class'i olusturup lazim olan methodu bir kere olusturup,
buraya depolariz ki daha sonra kullanabilelim.

Utils class'i icinde public static int getSquare(int a){
return a*a;
}
Ayni package icinde bu classimizi olusturduk ve kodumuzu yazdigimiz class'a geri donerek reduce methodu
icinden Utils: :getSquare yazarak bu method Math Classinda olmasa dahi onceden olusturdugum methoddan istifade
ettim. getSquare ismini methoda biz vermistik ve methodun ismini yazdik reduce methodu icine.

Utils Classimizda bir isOdd methodu olusturduk ve kodumuzu yazdigimiz class'a geri gelip, reduce methodu icine
Utils: :isOdd) yazarak Utils'deki methoddan faydalandik.

Ideal kod sadece methodlardan olusan koddur.
Utils Class'indaki methodlar tekrar kullanabilecegimiz faydali methodlardir.
get methodu Optional <Integer> i Integer'a cevirir. Daha once int ile basladigimiz methodlarda kizariklik olunca
get methodu ekleyince integer Integer'a cevrilmis oldu ve sorun sona erdi.

 */

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));

        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));//15

        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));//6+9=15

    }

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){
        return nums.//return keyword'u method sonunda degil basinda yazilmis burada
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0, (t,u)->t+u);
    }

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums){
        return nums.//return sonda degil basta
                stream().
                filter(Utils::isOdd).//Bizim Utils classindaki methodu cagirdik
                map(Utils::getSquare).//Ihtiyaciniz olan method Java Class'larinda yoksa Utils Class olusturup icinde
                //ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                        reduce(0, Math::addExact);//Class Ismi :: Method Ismi ==> Method Reference
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums){
        return nums.
                stream().
                filter(Utils::isOdd).//Utils classindan
                map(Utils::getSquare).//Olusturdugumuz Utils classindan
                reduce(Math::addExact).//Java Math Class'indan
                get();// get() method'u Optional<Integer> i Integer'a cevirir.
    }

    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens(List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(1, (t,u)->t*u); //147456
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
    //           toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums){
        int maxEven = nums.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u ? t : u).get();
        int minOdd = nums.stream().distinct().filter(t->t%2!=0).reduce((t, u)->t<u ? t : u).get();
        return maxEven + minOdd;//Burada return basta degil sonda kullanilmis.
    }
    //Bir ustte reduce icerisinde ternary kullanildi. t u'dan buyuk mu? buyukse t'yi degilse u'yu
    //t u'dan kucuk mu? kucukse t'yi degilse u'yu yazdir dedik.

    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile
    // tek sayi olan elemanlarin 8 den buyuk minimum degerinin toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){
        int max = nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t : u).get();
        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t : u).get();
        return max + min;//return kismi sonda
    }
}