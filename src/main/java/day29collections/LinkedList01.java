package day29collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        //ArrayListler index kullanir. ["S","J","A","V","A"] J'yi silersek S'nin indeksi degismoyor ancak J
        //den sonraki tum elemanlarin indexleri degisti. Ilk A 2.indexteyken 1.indexe gecti.
        //Usteteki array'e S den sonra K eklersek bastakinin indexi degismedi ancak K'dan sonrakilerin
        //indexi degisir.
        /*
        ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
        LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
        ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

        LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
        oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
        ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
        Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.




     */

        /*
        Linked Listler index kullanmazlar. Node silme ve eklemede basarili olduklari icin silme
        ve ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullanilmali. Ekleme ve silme islemleri sadece
        point'i degistirir.
        */


        /*
        1) Indexler adresler gibidir. LinkedList'da index yok. O zaman arraydeki V istenirse,
        V tek tek kendisi gibi datalara ornegin S'ye, J'ye sorar ve onlarin V'yi gostermesini ister.
        LinkedList eleman bulmada basarisizdirlar. Eleman ekleme ve cikarmada basarilidirlar.
        ArrayListler eleman bulmada(search) basarilidirlar. Cunku indexi kullanarak bulurlar.
         */


        LinkedList<String> s=new LinkedList<>();
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        System.out.println(s);//[Steve, Ajda, Muge, Cuneyt, Esra] elemanlar giris sirasina gore siralandi.
        //daha sonra Ajda ile Muge arasina Esen String'ini ekledik
        s.add(2,"Esen");
        System.out.println(s);//[Steve, Ajda, Esen, Muge, Cuneyt, Esra]
     //Normalde LinkedList index kullanmaz ama biz 2 yazinca Java bunu 3. bir node olarak kabul ediyor, node'a
        //ceviriyor.
        s.addFirst("Kemal");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra] Kemal en basa geldi.
        s.addLast("Kerem");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Kerem]

        s.remove(2);
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Kerem]
        s.remove("Muge");
        System.out.println(s);//[Kemal, Steve, Esen, Cuneyt, Esra, Kerem]
        s.add(4,"Esen");
        System.out.println(s);//[Kemal, Steve, Esen, Cuneyt, Esen, Esra, Kerem]

        s.removeFirstOccurrence("Esen");//iki kez Esen yazmistik, birinci gorunumdeki silinecek
        System.out.println(s);//[Kemal, Steve, Cuneyt, Esen, Esra, Kerem]
        String r1=s.peek();//ilk elemani silmeden bize verir(copy paste gibi)
        /*
        Peek methodda eger listin bos olmasi halinde bize null verir. Element method ise hata verir.
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:
            the head of this list, or null if this list is empty

        */

        System.out.println(r1);
        System.out.println(s);
        String r2=s.poll();//ilk elemani bize verir ve Listten siler(cut paste gibi)
        System.out.println(r2);//Kemal
        System.out.println(s);//[Steve, Cuneyt, Esen, Esra, Kerem]
        s.element();//ilk elemani silmeden verir, peek gibi

        /*
        Eger listin bos olmasi halinde hata vermesini istersek element() methodunu kullanmaliyiz.
        the head of this list
        Throws:
        NoSuchElementException – if this list is empty

        peek() ile element ikisi de ilk elemani silmeden bize verir. Ancak peek() list bos oldugunda bize null
        verir, element() ise hata verir.
       */

        String r4=s.pop();
        System.out.println(r4);//Steve
        /*
        poll() ve pop() ikisi de ilk elemani siler ve bize verir, ama list bos ise poll() bize null, pop() hata
        verir.
        This method is equivalent to removeFirst().
        Returns:
       the element at the front of this list (which is the top of the stack represented by this list)
         */

        /*
        Set tekrarsiz elemanlar ornegin email adresleri, tel no, kimlik nolarini depolamak icin Set kullanilir.
        HashSet ve devami ne zaman kullanilir.
        HashSet setlerin en hizlisi olup hiz ihtiyaci olunca bunu kullanin. HashSet siralama yapmaz.
        LinkedHashSet elemanlarin girilen siraya gore dizilmesi icin kullanilir.
        TreeSet elemanlari natural order'a gore dizmek icin kullanilir.
         */
    }
}
