package day20methodoverloadingarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    public static void main(String[] args) {
        //Arrayler cok hizli calisir ve memoryde az yer kaplarlar.

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages=new ArrayList<Integer>();


        //ArrayList console a nasil yazdirilir?
        System.out.println(ages);//[]

        //ArrayListlere eleman nasil eklenir?
        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);//[9, 12, 10]
        //verilen siraya gore listeyi hazirladi. Buna insertion denir.
        ages.add(1,656);
        System.out.println(ages);//[9, 656, 12, 10] index 1'i yazarak index birde 9 varken 656 yazmis olduk
        //eger yukaridaki listede 10'nun geldigi yere 777 eklemek isteseydik ages.add(3,777) yazmaliydik
        //[9,656, 12, 777,10] ondan sonraya 5 ekleyebilir miydik?
        //ArrayListe bir eleman add() methodu ile eklenir. Ancak elemanlar verdigimiz sirada liste eklenir.
        //Bune insertion order denir. Listenin sonundaki elemandan sonra bir eleman eklemek isteseydik,
        //bir index yazmadan sadece sayiyi ornegin 888'i ages() icine yazarsak, listenin sonunda 888/i
        //goruruz.

        //List'e coklu eleman nasil eklenir? veya Liste baska bir List nasil eklenir?

        ArrayList<Integer> newAges= new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 10, 8, 9, 10]
        //en son ekledigimiz 8,9,10'u onceki listenin en sonuna ekledi

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 10, 8, 9, 10]

        //ArrayListte eleman sayisi nasil bulunur?
        //size methodu bize bir listteki elaman sayisini verir.
        int numOfElement=ages.size();
        System.out.println(numOfElement);//10


        //ArrayListte specific bir eleman nasil alinir?
        //get() methodu index kullanarak istedigimiz elemani alamaya yarar
        int el1=ages.get(1);
        System.out.println(el1);//656
        //burada method icine elemanin indexini yazdik

        //ArrayListte specific bir eleman nasil degistirilir?
        ages.set(2,313);
        System.out.println(ages);//[9, 656, 313, 9, 10, 12, 10, 8, 9, 10] index 2 de 8 vardi yerine 313 yazildi

        ages.set(4,353);
        System.out.println(ages);//[9, 656, 313, 9, 353, 12, 10, 8, 9, 10]

        //Bir Listteki tum elemanlari nasil silebiliriz?
        ages.clear();
        System.out.println(ages);//[]

        //ArrayListte specific bir elemanin var olup olmadigini nasil anlariz?
        //Object uzerinden methodlari gorebilirsek bu non statictir, class uzerinden yani class ismi.method
        //ise statictir. Biz burada hep object ismini yazarak methoda ulastik. Ulastiklarimiz non static
        boolean r= ages.contains(656);
        System.out.println(r);//false verdi cunku yukarida clear methodu ile sildik

        //Bir ArrayListin bos olup olmadigini nasil knotrol ederiz? Kontrol varsa her zaman boolean vardir
        //eger method basinda is varsa o boolean dondurur
        boolean r2=ages.isEmpty();
        System.out.println(r2);//true
        //ancak yukaridaki clear methodunu yoruma alsaydik // ya da /* */ bu durumda o method calismamis gibi
        //olurdu ve isEmpty() calistirilinca false sonucu verirdi. Cunku liste silinmemisti.

        //Example 1: Bir listin bos olup olmadigini kontrol eden kodu yazin.
        //Listlerden bahsederken listin size'i, array icin length'inden konusuruz.

        ArrayList<String> names=new ArrayList<>();
        names.add("usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");

        if (names.size()==0){
            System.out.println("Bu list bostur");
        }else{
            System.out.println("Bu Listin en az bir elemani vardir");//bu kismi yazdirdi
        }

        names.clear();
        if (names.isEmpty());
        System.out.println(names);//[]
        //yukarida listimizi clear methodu ile sildik. Bu kisim ikinci yol olup daha sade ve tercih
        //edilir

        //Bir listin baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        ArrayList<String> names1=new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ali");
        names1.add("ufuk");

        ArrayList<String> names2=new ArrayList<>();
        names2.add("usame");
        names2.add("fatih");
        names2.add("ufuk");
        names2.add("ali");

        boolean s=names1.equals(names2);
        System.out.println(s);//false
   //iki listin esit olmasi icin ayni indexte ayni elemanlar olmasi gerekir.

        //verilen iki integer listte tamami ile ayni elemanlar var mi bunu nasil anlariz?

        ArrayList<Integer> nums1= new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2= new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
       //Asagiya Collections yazdik ve yanina nokta ekleyince methodu bulduk
        Collections.sort(nums1);
        Collections.sort(nums2);
        System.out.println(nums1.equals(nums2));//true
        //Ancak sort methodunu yazmasaydik sirali olmayacakti ve elemanlar ayni indexte gorunmeyeceklerdi
        //bu durumda false verirdi.


    }



}
