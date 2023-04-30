package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {


        ArrayList<String> cities=new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Yozgat]

        //ArrayList'te bir elemanin "ilk gorunumu" nasil silinir?
        System.out.println(cities.remove("Miami"));//true
        //Eger Miami yerine Miamiuuu yazsaydik false olurdu sonuc ve cities icinde Miami hala kaliyor olurdu
        System.out.println(cities);// [Giresun, Yozgat, Barcelona, Miami, Giresun]

        //remove() bir elemanin ilk gorunumunu siler
        System.out.println(cities.indexOf("Miami"));//ilk Miami silinmisti. Bu nedenle sonraki Miami 3.indexte
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun, Yozgat] ikinci indextekini sildi.


        //remove() eleman ile kullanilirsa ilk gorunumu siler.
        //Bu method eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true ya da false verir.

        //Example 1: Bir Integer List olusturun ve 12 elemanini siliniz.

       ArrayList<Integer> ages=new ArrayList<>();
       //ArrayList ya da sadece List diyerek baslayabiliriz bir arrayliste.
       ages.add(23);
       ages.add(12);
       ages.add(7);
       ages.add(4);

       //1.Yol
        Integer nonPrimitive=12;
        ages.remove(nonPrimitive);
        System.out.println(ages);

        //2.Yol
        ages.remove((Integer)12);
        System.out.println(ages);
        //Burada int primitive'i wrapper classi olan Integer'a cevirdik. 12 int olarak degil object
        //olarak kabul edilsin diye.

        //3.Yol
        ages.remove(ages.indexOf(12));
        System.out.println(ages);
        //Bu kisimda remove methodunun object icerecek olani kullandigimizda bunu object degil 12 sayisindan
        //dolayi int kabul etti ve hata verdi. Bu durumda Java'ya remove ile birlikte indexof kullaninca
        //Java 12'yi object olarak kabul etti ve hata vermedi.

        //Kisa yoldan list olusturmak icin List.of() methodu kullanilabilir
        //List<> icine non primitive data type konulur ornek Integer, Character, Boolean...
        /*
        List.of() methodu degistirilemez bir liste olusturmak icin kullanilir
        Bu method ile degistirmeye yonelik methodlari desteklemez. Ornek add(), remove(),set()...
        */

        //List<Character> initials=List.of('a','b','a','c','d');
        //Normal list<Character> initials=new ArrayList<>(); yazsaydik bu flexible olurdu ekleme cikarma
        //yapardik, ancak yukaridaki gibi List.of lu sekilde yapinca degisime izin vermiyor
        //System.out.println(initials);
        //initials.add('e'); (Listimizde olmayani yazdik ve hata aldik)
        //initials.remove(0);
        //initials.set(0,'u')
        //Yukarida her uc durumda ne ekleme, ne cikarma, ne degistirmeye izin verilmedi
        //Ancak baska kullanabilecegimiz methodlar var. Duruma, senaryoya gore uygun methodu kullanabiliriz.
        //System.out.println(initials);//[a,b,c,d]


        //indexOf() methodu aranan karakterin ilk indexini verir.
        //int r1=initials.indexOf('c');
        //System.out.println(r1);

        //int r2=initials.lastIndexOf('a');
        //System.out.println(r2);

        List<Character> initials = List.of('a','b','a','c','d');
        System.out.println(initials);
        // initials.add('e');
        // initials.remove(0);
        // initials.set(0,'u');
        System.out.println(initials);
        //indexOf(aranan karakter) methodu bir aranan karakterin ilk gorunumunun index ini verir
        int r1=initials.indexOf('c');
        System.out.println(r1);

        //lastIndexOf() methodu aranan karakterin son gorunumunun index ini verir
        int r2=initials.lastIndexOf('a');
        System.out.println(r2);



    }
}
