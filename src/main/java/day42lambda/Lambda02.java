package day42lambda;

/*
Example 1:
Verilen sayilarin toplamini hesaplayan bir method isteniyor. Methodu int olarak olusturduk.
Methodumuzun parametresi icine tek tek sayilari yazmamiz dogru olmaz cunku methodumuz tekrar kullanilabilir
olmali.(reuseable) Boyle olunca parametrelerimiz soruya uygun olarak soyle oldu: int starting, int ending
verilen araliktaki sayilari toplayacagiz. Bu sekilde dinamik bir method olusturduk. Bu soruda bir listten
bahsedilmiyor. Java IntStream isimli bir interface olusturmus. IntStream, integerlari bir stream icinde
bize verecek.

IntStream. yapinca methodlari gorduk. rangeClosed methodunu sectik. Cunku ilk sayi dahil, ikinci sayi haric olacak.
method parantezi icine starting, ending yazdik.
Boylece eger 7 ve 10 sayisi verilirse 7 dahil, 10 dahil olur. Eger rangeClosed yerine range methodunu secseydik
10 haric olacakti.

Java'da, rangeClosed() ve range() metotları IntStream, LongStream ve DoubleStream interface'leri tarafından
sağlanan, belirli bir aralıkta değerler üreten metotlardir.

rangeClosed(int startInclusive, int endInclusive) metodu, startInclusive ile endInclusive arasındaki
tam sayıları içeren bir akım üretir. Örneğin, IntStream.rangeClosed(7, 10) metodu, 7, 8, 9 ve 10 değerlerini
içeren bir stream üretir.

range(int startInclusive, int endExclusive) metodu, startInclusive ile endExclusive arasındaki
tam sayıları içeren bir akım üretir. Ancak, endExclusive parametresi dahil edilmez.
Örneğin, IntStream.range(7, 10) metodu, 7, 8 ve 9 değerlerini içeren bir stream üretir.

Bu nedenle, rangeClosed() ve range() arasındaki temel fark, rangeClosed() metodu ile belirtilen
aralığın uç noktalarının dahil edilip edilmediğidir. rangeClosed() metodu, aralığın her iki
uç noktasını da dahil ederken, range() metodu ikinci parametre olarak belirtilen uç noktasını dahil etmez.

Bu nedenle, eğer uç noktaları da aralığa dahil etmek istiyorsanız, rangeClosed() metodunu kullanmalısınız.
Eğer uç noktaları dahil etmek istemiyorsanız, range() metodunu kullanmalısınız.
Örneğinizde, range() metodu ile 7 ve 10 parametreleri kullanılırsa, sonuçta elde edilecek stream
7, 8 ve 9 değerlerini içerecektir, ancak 10 değerini içermeyecektir. Aynı parametrelerle rangeClosed() metodu
kullanılırsa, elde edilecek stream 7, 8, 9 ve 10 değerlerini içerecektir.

method body'si icine sirasiyla return IntStream.rangeClosed(starting, ending).sum(); yazdik.

sum methodu ile toplama yapabildik. Main method icinde methodumuzu cagirdik ve parametre olarak sirasiyla
7,10 yazip sout ile calistirinca sonucta bize 40'i verdi.


Example 2:
Bu soruda verilen sayilarin carpimini hesaplayan method olusturulmasi istenmis.
Yine int data type'inda methodumuz olusturduk.
Method body'si icinde sirasiyla; return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact)
.getAsInt();

getAsInt() Integer gibi al demis oluyoruz bu methodla. Main method icinde methodumuzu cagirdik, parametreler
7 ve 10. Yazdirdigimizda 5040 gorduk. Kullanici 7 ve 10 yerine 70 ve 10 verseydi sonuc 0 olurdu. rangeClosed
methodu ilk sayi buyukse calismiyor. Bu durumda javaya method body'sinin basinda soyle demeliyiz:
if(starting>ending) {
starting=starting + ending;
ending=starting-ending;
starting=starting-ending;
} Bunu yaparak ilk sayi ikinciden buyukse yerlerini degistirmelerini sagladik ve rangeClosed methodu calismis oldu.
Ancak if statement icinde olusturdugumuz kod sikca kullanilmaz, utils classi icine koymaya gerek yok hatta
onu private bir method icine koyabiliriz. O methoda swap dedik. Tekraralanan kodlar icin bir method olusturup,
o methodu methodun icinde kullaniriz. Diger classlarin gormesine gerek olmadigindan private yaptik.
Example 3:
Bu soruda verilen sayi araligindaki sayilarin rakamlarinin toplamini hesaplayan method olusturmamiz isteniyor.
45 46 47==? 4+5+4+6+4+7=30
methodumuz parametreleri: int starting, int ending

method icinde sirasiyle IntStream.rangeClosed(starting, ending).map(Utils::getSumOfDigits).sum();

elemanlari degistireceksek map methodunu kullaniriz. Burada sayilarin rakamlarinin toplami alinacak. Utils
class'imiza giderek sayilarin rakamlari toplamini alabilecegimiz yeni bir method olusturduk.
public static int getSumOfDigits(int a){
int sum=0;
while(a>0){
sum=sum+a%10;
a=a/10:
}
return sum;
tekrar Lambda02 clasimiza donduk ve map icine Utils::getSumOfDigits) yazdik.

return sonrasi stream methodu ile elemanlar stream yapisi icinde alt alta siralandi. map icindeki methodumuz
ile sayilarin rakamlari birer birer toplandi ve alt alta siralandi. Daha sonra sum methodu ile hepsi toplandi.
Methodu yazdirdigimizda ekranda 30 gorduk. Ancak oncesinde rangeClosed methodunun calismama ihtimaline
karsi bir onceki soru cozumunde yazdigimiz if statement'imiz ve devamini method body'si basina yerlestirdik.


 */


import day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(10, 7));
        System.out.println(getMultiplicationInTheGivenRange(7, 10));
        System.out.println(getSumOfDigitsInTheGivenRange(45, 47));

    }

    //Swap icin bir tane private method olustur
    private static List<Integer> swap(int starting, int ending) {
        List<Integer> list = new ArrayList<>();
        if (starting > ending) {
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
        ///*Biz rangeClosed methodu kullanicinin ilk sayiyi daha buyuk vermesi halinde calismama durumunu engellemek
        //    icin swap methodu olusturduk ve bir if statement'i icinde ilk int parametre ile ikinci int parametreyi
        //    swap methodu kullanarak yerlerini degistirdik. Ancak bu islem sadece bu method icinde calissa da bizim
        //    bu sonucu almamiz ve bir liste koymamiz gerekli. Cunku method bize her iki datayi vermedi. Burada starting ve ending isimli iki datamiz var.
        //    Birden fazla datayi, coklu datayi bir liste koymamiz gerekli. List icine koyarak datayi rangeClosed ile
        //    kullanabiliriz.


    }




    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending) {
        swap(starting,ending);
        return IntStream.rangeClosed(starting, ending).sum();

    }
    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.

    public static int getMultiplicationInTheGivenRange(int starting, int ending) {
        swap(starting,ending);
        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();

        //rangeClosed() methodu ilk sayi buyuk oldugunda calismaz
    }

    //Example 3: 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    //           45 46 47 == ?   4+5+4+6+4+7  = 30
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending) {
        swap(starting,ending);
        return IntStream.rangeClosed(starting,ending).map(Utils::getSumOfDigits).sum();

    }

}
