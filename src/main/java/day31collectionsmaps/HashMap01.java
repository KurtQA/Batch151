package day31collectionsmaps;

import java.util.HashMap;

public class HashMap01 {


    //Hash unique ID olusturma

    /*Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
    Ornek:
    Cat=Evcil hayvan
    Dog=Evcil hayvan
    Su sozluk yapisi Java'daki map yapisina benzer. Kelimenin oldugu sirada ayni kelimeden birden fazla bulunmaz
    bu kelimeler tekrarsizdir. Sol tarafta tekrarli kelimeler yani esanlamli kelimeler olabilir. Maplerde de boyle
    iki bolum olur. Ilk bolum tekrarsiz, ikinci bolumde tekrarli bolum olabilir. Tekrarsiz kisim key, tekrarli kisim
    value olarak tanimlanir. Key=Value
    Maplar key=value yapisini kullanir. Maplerde birinci ve ikinci deger var. Maplerdeki elemanlara "Entry" denilir.
    Elemanlari iceren yapinin tamamina "EntrySet" denir.
    Java tekrarsizlara Set diyor,
    */

    /*
    Key ve valueler icin ayri ayri data tipi olur.
    HashMap'e baktigimizda birinci yazilan key'in
    ikinci yazilan value'nin data tipini gosterir.

    HashMapler HashSetler'de oldugu gibi entry'leri rastgele siralar.
    Bu yuzden maplerde en hizli HashMap'tir.
    Mapler Collection degildir, tamamiyle farkli bir yapidir.
    Mapler'de {} kullanilir. Ekrana yazdirdigimizda entryleri {} icinde gorduk.
    Setler ise [] kullanir.
    Map'lere eklemeyi add methodu ile degil put methodu ile yaptik.

    Get() methodu key ile calisir ve value kismini verir. Integer calisir, integer verir.
    Ornek getCat() bize Cat'in anlamini verir

    keySet() methodu keyler ile alakalidir. Bize bir set verir. Keyler tekrarsizdir,
    keyler verilirken Set'in icine konulur. KeySet methodu butun keyleri verir.
    Methodun icine girdigimizde methodun return type'i bizim olusturacagimiz
    conteynerin data type ile ayni olmasi gerektigi yazili.

    Tum valueleri Integer ile aliyoruz. Keyleri alirken String kullandik.

    Ortalama nufusu alirken for each loop kullandik ve value.size'i kullandik.
    Value.size'a toplami bolduk.

    Mapler'de bazen sadece valueler bazen de sadece keyler ile calisabiliriz.

    entrySet() methodu entryler'i kalip halinde Set icine koyar. Get() methodu valueler'i Set icine koyar.
    Looplar Mapler'de calismaz. Map'in ismini for each loop parantezi icine koydugumuzda uyari verdi.
    Bazen Mapler'deki elemanlar arasina girmek, loop ile bakmak isteriz. Tekrarli islerde loop yapmamzi gerekir.
    Map'te loop kullanabilmemiz icin entrySet() methodu kullanilir. Aksi halde looplari kullanamayiz.

    entrySet() bize Set verir. Her Set'in < > arasina data tipi yazilir. Set;in elemanlarinin data tipi Map'deki
    entrylerdir. Entry'lerin keyleri String, valueleri Integerdir.




     */

    //HashMap<String, Integer> countryPopulation = new HashMap<>();//Burada diamond shape icine iki data type
    //Map nasil olusturulur?

    public static void main(String[] args) {


    HashMap<String, Integer> countryPopulation = new HashMap<>();

    //Map'e entry nasil eklenir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        countryPopulation.get("USA");



}
}