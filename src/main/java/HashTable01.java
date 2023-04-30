import java.util.Hashtable;

public class HashTable01 {
/*
HashMap ile HashTable arasindaki fark nedir?
i)HashMap thread-safe degildir, HashTable thread-safe'dir.
Thread-safe ayni anda birden fazla is yapmaktir.
HashMap synchronised degildir, ancak
HashTable synchronised'dir.
ii)HashMap bir tane null key'e ve istediginiz kadar null value'a musaade eder.
HashTable keylerde de valuelerde de null kullanilmasina musaade etmez.

iii)HashMap hizlidir, HashTable' digerine gore yavastir. Multi thread yapma ozellikleri nedeniyle zaman kaybeder
Note: Her ikisi de entryleri rastgele siralar.

///////

String ve Integer'i olan Hashtable olusturduk. put methodu ile elemanlar ekledik. sout ile calistirinca
entrylerin rastgele siralandigini gorduk.

put methodu ile null eklemek istedik ancak hata verdi. HashTablelarin keylerine null konulamaz.
null'i value kismina eklemek istedik, yine hata verdi. HashTablelarin valuelerine null konulamaz.

HashTable'larda get, put,keyset, getOrDefault, remove elements methodlari var.(HashMap'de elements methodu yok)

 */



    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        //stdAges.put(null, 85); ==> HashTable'larin key'lerine null konulamaz.
        //stdAges.put("Chris", null); ==> HashTable'larin value'larina da null konulamaz.
        System.out.println(stdAges);//{Jim=52, Henry=43, Tom=43, Walker=85, Jack=21}





    }
}
