package day03_lambda;
/*

Stream:
Datalari akisa sunar. Cok sayıda işlevsel metodun çağrılmasını sağlar

ForEach:
Stream içindeki veriyi tek tek tüketmek için oluşturulmuş bir yapıdır.
**Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
artık kullanılamayacağı anlamına gelir.


Filter:
Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
filtreleme işlemi yapmamıza yarayan bir yapıdır.
Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


Collect:
Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
veri yapısına dönüştürmek için kullanılır.


Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
ve başka elemanlara dönüştürmemize imkan sağlayan


Distinct:
Stream içerisinde bulunan ve tekrar eden elemanlar varsa
bunları distinct metodu ile çıkartabilir ve
elimizde tekrar etmeyen birbirinden farklı
elemanlar barından bir veri setimiz kalır


Sorted:
Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
İkinci formatı ise Comparator arayüzünden türediği için
bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.



reduce : indirgeme demektir.
kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
bir sonraki elemanla işlemle tutulur


Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;

    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.


    AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
    bu şarta uyması durumunda true dönecektir.


    NoneMatch: Şarta göre Stream içindeki hiç bir
    elemanın şartı sağlamaması durumunda true dönecektir.



Comparator => bir Class'tır. Compar karşılaştırmak demektir.
Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir
sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi)
sırasını kontrol etmek veya doğal sıralaması olmayan
nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.

reverseOrder() => Comparator Class'ının bir methodudur.tersten siralama yapar.
Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
comparing() => karşılaştırma demektir.
reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
uygulayan bir karşılaştırıcı (comparator) döndürür.









 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Hatay", "Edirne", "Gaziantep",
                "Eskisehir", "Ordu", "MUS", "MUS", "Nevsehir"));
        //  System.out.println(karakterSysi5tenFazlaElSil(iller));
        System.out.println();
        //  System.out.println(hIleBaslayanYadaUIleBitenElSil(iller));
        System.out.println();
        System.out.println(elKarakterSayilarininKareleriniAl(iller));//6) [9, 25, 36, 81, 81, 16, 9, 9, 64]
        System.out.println();
        System.out.println(karakterSayisiCiftOlanlariListYazdir(iller));//7) [Edirne, Ordu, Nevsehir]sout

    }//main
/*
    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

    public static List<String> karakterSysi5tenFazlaElSil(List<String> iller ){
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);
        return iller;

    }
    /*
     Burada iller yazdik ve yanina stream yazinca remove methodunu gormedik, bunun uzerine stream'i kullanmadik
     ve iller nokta yapinca remove methodlari gorundu, onlardan removeIf methodunu sectik. Cunku karakter sayisi
     5'ten fazla olanlari silmemiz gerekti. Bu method icine sartimizi soyle koyduk.(t->t,length()>5)
     return iller; sonrasi kodumuzu calistirinca besten fazla olanlarin listede silinmis oldugunu gorduk.
 */

        ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

            public static List<String> hIleBaslayanYadaUIleBitenElSil(List<String> iller ){
                System.out.print("5) ");
               iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));//yine removeIf()icine sartimizi koyduk.
               return iller;

            }


    ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin

    public static List<Integer> elKarakterSayilarininKareleriniAl(List<String> iller )
    //Burada karakter sayisi dendiginden List icine Integer yazilir, data type'i Integer yapilir.
    // ancak arguman olarak parantez icine
            //String datalardan olusan Listimizi koyabiliriz.
    {
        System.out.print("6) ");
        return iller.
                stream().
                map(Utils::karesiniAl).// Basta LAMBDA EXPRESSION koymustuk  map(t->t.length() * t.length()).
                        //karakterin degil karakter sayisinin karesi dendigi icin t.length'inin karesini aldik
               //Utils classinda karesini al methodu olusturduk. Methodun data type'i int ancak method parantezi
               //icinde arguman olarak String bir data verdik. String s ve return s.length*s.length; yazdik.
                        collect(Collectors.toList());//Liste icinde toparla demis olduk.
        //methodu main method icinde cagirip calistirdik. Son listemizde uc harfli uc il ismi kalmisti ve
        //[9,9,9] sonuc verdi
    }


    ////////////////////// ************************************************ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> karakterSayisiCiftOlanlariListYazdir(List<String> iller ) {
        System.out.print("7) ");
        return  iller.
                stream().
                filter(Utils::ciftMi).//Basta Lambda expression filter(t->t.length() %2 ==0). olarak yazmistik
                        //Utils'de boolean ciftMi methodu olusturduk ve onu kullandik burada.
                        collect(Collectors.toList());
    }
}