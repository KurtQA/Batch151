package day32maps;

import java.util.HashMap;

public class HashMap01 {
/*
Maplerde keyler tekrarsiz olmali, ama valueler tekrarli olabilir. Maplerde key ve valuler {} icine konulur.
Eger key tekrarli kullanilirsa kod hata vermez, ancak tekrarli olarak yazilan key'in en son ekleneni alir,
onu yazdirir. Key'in yeni degerini(value) alir. Ornek "Tom" 76 idi, ikinci eklemede "Tom" 83 oldu ve sonucta
"Tom" 83 olarak yazildi. Bu yontem VALUE GUNCELLEME'de tavsiye edilmese de kullanilabilir. Buna override denir.

HashMapler entry'leri rastgele siralarlar, ancak oldukca hizlidirlar. Sira onemli degilse
HashMap kullanmak en iyi cozumdur. Mapler siralamalari yaparken valueleri degil keyleri dikkate alirlar.

 keySet() methodu bize tum keyleri verir.
 entrySet() methodu tum entryleri bir setin icine koyarak verir.
 replace() methodu valueleri degistirmek icin kullanilir. ornek ("Ezel", 38) iken stdAges.replace("Ezel, 39); ile
 value yani 38, 39'a cevrildi. Bu method keyleri update etmeye yarar.

 Valuleri update etmek icin replace() kullanilabilir, ancak valuleri degistirmek istedigimizde put() yerine replace
 kullanmak en makul olanidir. Okunabilirlik acisindan replace methodu tercih edilir.

 Replace() methodlarindan biri sadece key'e bakiyor, diger replace() methodunda key'nin eski degerine(value)
 bakiyor ve degistiriyor. Yani iki is yapiyor.

replace("Angelina", 57, 61); methodu Map'in icinde "Angelina", 57 varsa 57'yi 61'e donusturur, yoksa donusturmez.
Yani value Map icinde 57 ise degistirecek. 57 olan value yoksa bir degisiklik yapmayacak.

putIfAbsent(); methodu, yoksa oraya ekleme yap diyoruz. Ornek "Brad", 60 yazdik bu method icine ve Map'e method ile
bakildi, Map'de "Brad" ,58 oldugundan bir degisiklik yapilmadi. Cunku key olarak Brad var. Key'i dikkate alir.
Key yoksa istenileni Map icine koyacak.

////
get() methodu ile ornek "Tom" yazdigimizda Map icinde Tom varsa Java, Tom'u verecek. Var olmayan key icin null verir.
getOrDefault() methodunda ise ornek "Tom", 0 yazdigimizda Java bize Tom' key'inin Map'deki value'sunu verir. Ornek
sadece 83'u verdi, ayrica key olan Tom'u yazdirmadi. Olmayan key halinde bu method null degil, '0' verir.

///
containsValue() methodunu Stringlerde var mi diye bakmak icin kullanmistik. Burada da valuelerin icinde o deger
var mi diye bakar. Keylerin icinde o deger var mi? Contains methodu her zaman boolean dondurur. Yani true ya da
false gorecegiz ekranda. Method icine yazdigimiz ornek 99 yazarsak ve o deger yoksa map icinde bize false verir.

///
containsKey() methodu, Map icinde ilgili key var mi diye bakar.
Method icine ornegin "Ali" yazdik ve Map icinde keyler arasinda Ali oldugu icin, sonucta true goruruz.

remove() methodlarindan birincisi, key'e bakarak entry'i siliyor. Ornek "Ali" yazdik, ve map icindeki "Ali" cikarildi.
Ikinci remove methodu ise hem key'e ham value'ye bakar ve ona gore siler. Ornegin method icine "Tom", 81 yazdik.
Tom'u silmez cunku Map'de Tom, 83 idi, 81 olmadigi icin silmez.

///

size() methodu kac tane entry oldugunu soyler. Collectionlarda da kullandik.
putAll() methodu, bir Map'in icine baska bir Map koymaya yarar. Bunun icin birden fazla Map olmali.
Degisen ilk Map'tir. Hangi Map, digerine konulursa, konulan degismiyor.



















 */






    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        //"key"i tekrarli kullandigimizda hata vermez, en son verilen entry'nin degerini kabul eder.
        //Bu yontem value guncellemede kullanilabilir. Buna "overwrite" denir.
        stdAges.put("Tom", 83);

        //HashMap'ler entry'leri rastgele siralar, bu yuzden cok hizli calisir.
        //Map'ler entry'leri siralarken "key"lere bakarak siralama yapar.
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=38}

        //replace() methodu "value"lari "key"leri kullanarak update etmeye yarar.
        stdAges.replace("Ezel", 39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //replace("Angelina", 57, 61); methodu Map icin de '"Angelina", 57' varsa 57 i 61 e donusturur, yoksa donusturmez.
        stdAges.replace("Angelina", 57, 61);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //putIfAbsent("Ali", 60); methodu Map'de "Ali" key olarak yoksa Map'e "Ali=60"i ekler, varsa eklemez.
        stdAges.putIfAbsent("Ali", 60);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39, Ali=60}

        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        //"get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom"));// 83
        System.out.println(stdAges.getOrDefault("Tom", 0));// 83

        System.out.println(stdAges.get("Ayse"));// null
        System.out.println(stdAges.getOrDefault("Ayse", 0));// 0

        //containsValue(77); methodu value'larin icerisinde 77 nin olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));//false

        //containsKey("Ali"); methodu key'larin icerisinde Ali'nin olup olmadigini kontrol eder.
        System.out.println(stdAges.containsKey("Ali"));//true

        //remove("Ali"); methodu "key" kullanarak "entry"i silmeye yarar
        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        //remove("Tom", 81); methodu Map'de key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez.
        stdAges.remove("Tom", 81);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

        //stdAges.putAll(kidsAge); methodu stdAges Map'ine kidsAge Map'ini ekler. Dolayisiyla stdAges Map'i degismis olur.
        //Ama kidsAge Map'i degismez.
        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=58, John=12, Ajda=77, Brad=58, Jack=32, Ezel=39, Jim=22}
        System.out.println(kidsAge);// {John=12, Jack=32, Jim=22}



    }
}
