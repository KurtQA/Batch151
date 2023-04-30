package day36exception;

/*

DayTime day36exception E05 classimiz icinde exception ile ilgili neler yaptik:

1. adimda file.txt isimli text'i olusturduk. Bunun icin ayni package uzerine gittik ve oradan file'i bulup
tiklayinca isim vermemiz icin bir pencere acildi. Ismi file.txt olarak yazdik. Icine Iki satir cumle yazdik

2.adimda bu classimiza gelerek main method icinden FileInputStream classinin ismini yazdik ve class'i import
ettik.

3.adimda FileInputClassindan yeni bir object olusturduk ve parametre girmemiz gerektiginden, bu package'imiz
altinda olusturdugumuz file.txt'in uzerine giderek tikladik, orada copy paste/reference bolumune gittik.
Bize copy yapabilecegimiz secenekler sundu. Bizim icin en kullanisli olan path from content root kismini sectik
oradan copyaladigimiz src/main/java/day36exceptions/file.txt'i String "" icine ve onu da parametre icine
yerlestirdik. Ancak new keywordu yanindaki constructor olan FileInputStream kismi kizardi. Yani Java ona
getirmesini istedigimiz dosya ile ilgili onu bulup bulamayacagi konusunda guvence istiyor.

4. adimda kizaran constructor uzerine gelip baktik. Oradaki seceneklerden add exception kismini sectik, boylece
 Java ile dosyayi bulamazsa exception atmasi ve application'i durdurmasi konusunda java ile anlastik.
 Add exception'i secer secmez java main methodumuz yanina otomatik olarak throws FileNotFoundException'i ekledi.Buradaki throws bir kez exception class'i
ile kullanilir. Exception bir kere atilinca application'i durdurur.

Asagidaki method body'si icindeki throw new keywordu ve constructor ile birlikte try icinde
birden fazla exception varsa birden fazla kez kullanilir. throw'u kendimiz belli sartlar icin exception
atilmasi icin olustururuz.

5.adimda, file.txt'i okumamiz gerekir. Bunun icin olusturdugumuz objeyi kullandik. Objemizin ismini objenin altina
yazdik. Obje ismi olan fis yanina bir nokta koyunca bize methodlari gosterdi ve read() methodunu sectik.
While loop kullanmamiz uygun olacagindan, while loop kullandik. fis objemiz uzerinden okudugumuz karakterler
 -1'e esit olmadigi surece loop'un devamini istedik. While icinde sartimizi bu sekilde olusturduk.
While uzerinde 0 degeri verdigimiz bir int variable olusturmustuk, bunu loop icinde kullanacagimiz icin
olusturduk. k=fis.read()!=-1. Bize -1 karakterini ne zaman verecek? Okudugumuz text icinde okunacak
bir karakter kalmadiginda -1 verecek. Okunacak deger kalmadiginda loop devam etmeyecek. Loop baslarken
okunan ilk karakter J oldugundan J'nin ascii degeri olan 76'yi alip 'k' isimli konteynerimiza girer.
Diger tum karakterler bu sekilde ascii degerleri ile eklenecek.

Sout icine okunan karakterleri ascci degerleri ile icine atadigimiz 0 degerli int k'yi yerlestirdik. Ancak k'da
ascii degerler oldugundan, bu ascii degerleri karakterlere donusturmek icin bir parantez icinde char'i yazdik.
Yani type casting yaptik, parantezin yanina k'yi koyduk.

Ancak read methodunun kizarik oldugunu gorduk. Java ya okuyamazsam diye kizardi. Bu defa uzerine gidince
more action kismina basinca cikan seceneklerden yine add exception'i sectik. Bunun uzerine main method yanindaki
throws FileNotFoundException yerini otomatik olarak IOException'a birakti. Cunku IOException,
FileNOtFoundException'in parent'idir.

Son olarak kodumuzu calistirinca file.txt icinde ne yazmissak ekrana o yazildi.

Son class'imiz E06 icinde ayni isi try catch ile yaptik. Kendimiz throw exception atilmasini saglayacak bir
kod hazirladik. Main yanindaki throws IOException'i kaldirdik. Cunku biz kendi exception'imizi olustmak istedik.

Yukarida izah ettigimiz kodumuzun tamamini yeni objemiz ile birlikte try icine yazdik.
try parantezi bittikten sonra catch{ yazdik ve oraya FileNotFoundException e'yi koyduk. Sout icine kendimiz
atilabilecek exception'a ugun bir mesaj yazdik. While icindeki read methodu javanin okuyamama riskine karsi
yine kizardi ve uzerine gelip, more action'i onceden oldugu gibi tiklayinca 'add catch clause' goruldu.
Onu secince ilk catch body'si altina ikinci catch geldi ve icinde bu defa IOException e atildi.
Istersek more action icindeki seceneklerden replace ile baslayan kismi secersek olusturdugumuz exception'i alip,
onun parenti olan IOException'i yazar, ya da add exception'i secince main method yanina throws exception atilir.
Surround ile baslayan kismi da secebiliriz. Bu defa iki catch olur ve parent exception yukari, child exception'i
iceren exception asagi kisma alinir.

IOException class input ve outputlarla ilgilidir. FileNotFoundException path'in dogrulugu ve istenen dosyanin
varligi ile ilgilidir. Her iki exception compile time exception olarak bilinirler. Birlikte kullanildiklarinda
child exception ustte, IOException altta kullanilmalidir.



 */

import java.io.FileInputStream;//io ==> input output
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/file.txt");

        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char) k);
        }

    }
}