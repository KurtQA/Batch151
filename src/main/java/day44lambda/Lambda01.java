package day44lambda;

/*

files isimli text'imize ulasmamizi saglayan Paths.get icindeki sifreli kismi aldiktan sonra
java text icindeki metni bir stream halinde satir satir alt alta siraliyor.
forEach ile yazdirma islemi yapiliyor.

forEach methodu icinde lambda expression yerine System.out::println yazdik. Makbul olan budur.

Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiracagiz.
files.Lines(Paths.get ve devami bize bir stream verir. sirasiyla map kullanacagiz. Varolan satirlar
buyuk harfle yazilacagindan, yapilari degiseceginden map kullandik. Map icinde String::toUpperCase ile
harflerin tamami buyuk harfe cevrildi ve sonrasinda forEach ile yazdirdik.

Example 3:Text'imiz icinde "Java" kelimesi var mi diye bakacagiz.
Basta files.lines kismini yazdik. Sonra anyMatch methodu ile Java kelimesini aradik. Aramayi yaparken
contains("Java") yazdik. anyMatch bize boolean vereceginden bir boolean conteyner olusturup files ve devamini
o boolean'a assign ettik. Burada forEach degil yazdirmayi sout ile yaptik. Sout icine boolean'in ismini
yazdik.

Example 4: Text icinde kullanilan farkli kelimeleri bir list icinde return edecegiz.

Oncelikle String bir List olusturduk. text'imiz files.lines ve devamini assign ettik. files.lines kismi ile biz
file'a ulasiriz. Bu satir yanina sirasiyla map methodunu yazdik. Map icinde once noktalama isaretlerini
silmemiz ve sonrasinda split metodu ile kelimeleri almamiz lazim. Once replaceAll
metodu icine {"\\p{Punct}" yazarak noktalama isaretlerini sildik ve yine map icinde split metodunu kullandik. split metodu
icine " " yazarak bosluklar cikarilinca bize kelimeler kaldi. split metodu bize array verir. Kelimelerimiz
bir array icinde oldu. map metodu yaninda flatMap metodu kullandik. flatMap array icine girmemizi saglar,
metni cevreleyen duvarlar flatMap ile kirildi. stream icindeki kelimeler ile calisacaksak icine girebilmek icin
flatMap kullaniriz. Bu metod icine Arrays::stream yazarak ardindan distinct metodunu ekleyerek farkli kelimeleri aldik.

ve collect(Collector.toList) ile kalan tum farkli kelimeleri bir liste koyduk. En son sout icinde listimizin
words olan ismini yazarak kodumuzu calistirdik.


Example 6: Text icindeki text'de toplam kac harf oldugunu bulacagiz.

Once Files.lines...ile textimizi aldik. Harfler disinda ne varsa silebilmemiz icin map metodu icinde
replaceAll metodunu kullandik. Bu defa bir map icinde birden fazla metod kullanmak yerine ikinci bir map
metodu yazdik ve icinde split metodunu kullanarak hicliklerden kelimeleri degil, harfleri aldik. Elimizdeki
harfler bir stream'in ve array'in icinde. Bu elemanlara ulasmak icin array parantezini kirmak icin flatMap
metodunu yazdik. flatMap icine Arrays::stream yazarak elemanlara ulastik. Devaminda count () metodu
kullanmaya karar verdik. Cunku bu metod ile toplam harf sayisini alabiliriz. count metodu bize long verir.
Biz de tum kodumuzu yeni olusturdugumuz long numOfLetters conteynerina assign ettik.
Son olarak sout icine numOfLetters koyarak kodumuzu calistirdik.
lambda da bazi metodlar kendisinden sonra metod gosterir, bazi metodlar son kullanim amacli olup, ondan sonra
baska metod kullanamiyoruz. Ornek anyMatch() ya da count(), forEach() yanlarina nokta koyunca baska metodlari
ekranda sirali halde goremedik. count() gibi kendisinden sonra metod kullanilmasina musaade etmeyen metodlara
terminal method denir.

Example: Text file icinde kullanilan tum harfleri alfabetik olarak ters sirada bir list icinde return
edecegiz.

1. adim:List olustur

2.adim:text file'i dosyaya ulasacak sekilde al, Files.lines(Paths...

3.adim:map metodu ile harf disindaki karakterleri sil

4.adim:2.map ile split metodu ile hiclikten keserek harfleri al. Array olarak verir.

5.adim:flatMap ile duvari kir ve harflere ulas

6.adim:sorted(Comparator.reverseOrder() ile ters sirada harfler sirala

7.adim:collect(Collectors.toList() ile harfleri list icine yerlestir.

sout icine listin ismini yaz ve calistir









 */



public class Lambda01 {
}
