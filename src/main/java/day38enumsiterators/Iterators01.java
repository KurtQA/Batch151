package day38enumsiterators;
/*


Iterator'lar looplarin yaptigi ayni isi yapar. Iterator'da looplardaki gibi sonsuz loop olusma
ihtimali yoktur.
Iteratorlar ile looplar arasinda hiz bakimindan performans farki yoktur.

Itereatorlar bir collectiondan eleman silme ve collectiondaki elemani degistirme konusunda looplara nazaran
daha basarilidir.
Iki tip iterator vardir. Birincisi sadece iterator olup bu sadece eleman silmede kullanilir.
Eleman eklemek veya elemani degistirmek mumkun degildir.
Ikincisi ise ListIterator olup, elaman silebilir, ekleyebilir ve degistirebilir.
Iterator sadece soldan saga dogru for each loop gibi ilk elemandan son elemana kadar calisir.
ListIterator ise iki yonlu calisabilir. Bastan sona, sondan bas elemana gidebilir.

Main method icinde bir List olusturduk ve import ettik. Burada loop yerine Iterator kullandik.
Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. Burada while loop kullandik.

Main method icinde bir List olusturduk ve import ettik. Burada loop yerine Iterator kullandik.
Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. While loop kullandik.
While icine myItr.hasNext() yazarak iteratordaki sonraki eleman var mi diye soracagiz, varsa onu silmesini
isteyecegiz. Su sekilde devam ettik:
myItr.next();
myItr.remove();
Sonda sout icine myList yazarak elemanlari bir list icinde ekranda gorebildik. Iterator sayesinde sonsuz loop
tehlikesi ile karsilasmadik.
Biz bu kodu yazinca Java ayni elemanlari iterator yapisi icine koydu. Biz liste bakinca bir de iteratora bakinca
ayni seyi gorsek de yapi olarak farklidirlar. Fark: Ilk elemanin oncesine iterator bir pointer koyuyor.
Biz has.Next methodu kullaninca bu methodla ilk pointer'a gelip kendisinden sonra bir eleman var mi diye
sormus olduk. Pointer kendisinden sonra Tom olduguna isaret ediyor yani true oluyor. Daha sonra bir sonraki
elemanin onune java tarafindan konulan pointer'a gelip senden sonra eleman var mi diye methodumuz sormaya devam eder.
While loop condition'i true oldugu surece bir sonraki elemanin olup olmadigina bakilir.
Remove methodu ise gelip oldugu anlasilan ilk eleman silinir ve sonraki kisma gelir. Once has.Next sonra
remove methodu her eleman icin calisacak.




ListIterator kullanmak icin yeni bir List yaptik. Elemanlarini add methodu ile ekledik.
yourList. yapinca methodlari gorduk ve ListIterator'i sectik. Bu bize String verecek. Listimizi ListIterator'a
cevirecek.
ListIterator<String> konteynerina yourListItr'yi assign ettik.
While loop kullandik ve parantez icinde listIterator'imizin ismini yazip nokta koyunca methodlari gorduk.
Methodlardan has.Next() methodunu secip condition olarak yazdik. Daha sonra ListItaretor'imizi kullanarak
baska methodlara baktik, Iterator'a oranla daha fazla method oldugunu gorduk.
Oradaki next methodunu aldik, next methodumuzu el isimli String'e assign ettik.ve devaminda yine
ListIterator'imiz ismini yazip nokta koyduk ve set methodunu aldik.
set methodu icine el + "!" yazarak her elamanin onundeki pointeri alip o elemanin uzerinden atlayip bir sonrakinin
onune poiter'i koymasini sagladik. Ancak her atlayista uzerinden atlanan elemanin yanina ! isareti eklenecek, cunku
biz set methodu ile bunu istedik. Set methodu icinde concatination yaptik.
Sout icine listimizin ismini yazinca ekrana [Tom!, Jim!, Clara!] yazildi. has.Next nethodu calisirken son elemandan
sonra bir eleman olmadigi anlasilinca false olur ve loop kirilir. Pointer en saga gelmeden hasPrevious methodunu
kullanamayiz. Kullanirsak bastaki elemanin oncesinde eleman olmadigindan loop kirilir.






 */
import java.util.*;

public class Iterators01 {

        /*
            1)Iterator'lar loop'larin yaptigi ayni isi yapar.
            2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
            3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
            4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basrilidir.
            5)Iki tip iterator var; i)Iterator: Bu sadece eleman silmede kullanilir,
                                                eleman eklemek veya elemani degistirmek mumkun degildir.
                                    ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
                                    Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                         "ListIterator" ise iki yonlu calisabilir.
         */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        //"Iterator" kullanalim
        Iterator<String> myItr = myList.iterator();    // [ Tom,   Jim,   Clara,   Angie,   Mark ]

        while(myItr.hasNext()){//hasNext() pointer'a "Senden sonra eleman var mi?" diye sorar.
            //Eleman varsa "true" yoksa "false" return eder.
            myItr.next();//next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            myItr.remove();//next() methodunun return ettigi elemani siler.
        }
        System.out.println(myList);// [ ]

        //ListIterator kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        System.out.println(yourList);// [ Tom,   Jim,   Clara ]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + "!");//set() methodu list'i update etmeye yarar.
        }
        System.out.println(yourList);// [ Tom!,   Jim!,   Clara! ]

        //hasPrevious() ve previous() nasil kullanilir?
        while(yourListItr.hasPrevious()){

            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);

        }
        System.out.println(yourList);// [ ?Tom!,   ?Jim!,   ?Clara! ]

        //En sondan en basa nasil iterate edebiliriz?
        //Hasprevious ve previous methodlari bir oncekinin olup olmadigini kontrol edeceginden en bastaki elemandan
        //baslayamayiz. Cunku ilk elemanin bir onceki elemani olmayacak, false olacak ve devam edemeyecegiz. Bu durumda
        //pointer'i en son elemana kadar getirip oyle baslamaliyiz. Bunun icin once hasNext ve next methodlarini kullaniriz
        //en sona bu methodlar ile geldikten sonra yeni bir while loop icinde hasPrevious ve previous'i kullanabiliriz.

        //Peki listin en sonuna gitmek icin baska bir yontem yok mu? Var. descendingIterator() kullanmakla olur. Ancak
        //bu method listlerde degil linkedListelerde kullanilabilir. Bu nedenle list degil yeni bir LinkedList
        //olustururuz. Yeni LinkedList'e add methodu ile elemanlar ekleyecegiz. LinkedListin bu sekilde olusmasi sonrasi
        //Icinde LinkedListimizin ismi ile alabilecegimiz descendingIterator methodu olan Iterator'i olustururuz. Ona bir isim veririrz ve olustrucagimiz
        //kod icinde bu Iterator'in ismini kullanarak hasNext ve next methodlarini kullanacagiz.
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();// descendingIterator() ancak LinkedList ile kulanilabilir.
  // descendingIterator bize Iterator dondurur. Bu methodu secerken Iterator String dondurecegi gorunuyor. Bu nedenle
  //Basa Iterator<String> yazdik.
        while(ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }
        /*
        Normalde hasNext ve next methodlari kullanilinca bastan sona dogru gidis olurdu. Burada descendingIterator
        kullandigimiz, listimizde descendingIterator() yazdigimiz icin sondan baslayip basa dogru gidis olacak.
        Sondaki elemandan bastaki elemana kadar next methodu ile pointer tek tek ilerleyecek.

         */
    }
}