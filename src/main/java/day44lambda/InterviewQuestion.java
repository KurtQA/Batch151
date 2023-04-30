package day44lambda;
/*
Limit
    Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını
    göstermemize yarayan,sınırlandıran bir metoddur. Parametre olarak
    vereceğimiz rakamla aslında Stream içerisinde dönen çok sayıda veri
    var ancak sen bize şu kadarını göster diyoruz.
    findFirst() => İlk elemanı verir. Optional return eder.
    split()=>Bu String öğesini verilen normal ifadenin eşleşmelerine böler.
    Comparator => bir Class’tır. Compar karşılaştırmak demektir.
    Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma
    işlevi.Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol
    sağlamak için bir sıralama yöntemine (Collections.sort veya Arrays.sort
    gibi) aktarılabilir.Karşılaştırıcılar, belirli veri yapılarının
    (sıralı kümeler veya sıralı haritalar gibi) sırasını kontrol etmek veya
    doğal sıralaması olmayan nesnelerin koleksiyonları için bir sıralama
    sağlamak için de kullanılabilir.
    reverseOrder() => Comparator Class’ının bir methodudur.
    Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator
    (karşılaştırıcı) döndürür.
    comparing() => karşılaştırma demektir.
    reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
    uygulayan bir karşılaştırıcı (comparator) döndürür.
    skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu
    akışın kalan elemanlarından oluşan bir akış döndürür.
    Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür.
    Bu, durum bilgisi olan bir ara işlemdir.
    skip(list.size()-1) => List’in uzunluğunun 1 eksiğini yazarsak son
    elemanı yazdırırız.


Example 1: Size verilen bir arrayin "Mountain Array" olup olmadigini gosteren kodu yaziniz.

Elemanlar bu cesit arrayde once artacak, belli bir elemana gelince o elemandan sonra azalacak.
// {0,2,5,3,1,-2}

Bu soruyu cozmek icin Lambda kullancagiz ve arrayi liste cevirecegiz. Cunku list metodlar yonunde
daha zengindir.
1. adim: Bir array olustur.

2. adim: arrayi liste cevir

3.adim: Integer elemanlari olan yeni bir list olustur

4.adim:Arrays.stream(arr) ile arr arrayindeki elemanlari stream'e cevir

5.adim:forEach metodu ile elamani al ve liste ekle (forEach(t->myList.add(t);
forEach sadece yazdirma islemi icin kullanilmaz. Bunu burada gormus olduk.

6. adim: sout icine listimizin ismini ekleyerek listin elemanlarini ekranda gor

7.adim: maximum elamani bul, int max=myList.stream()reduce(Math::max).get();
sout icine max yazip calistirinca maximum elamani gor

8.adim: maximum elemanin indexini bul. Cunku bundan sonra azalma oldugunu biliyoruz.
int idxOfMax=myList.indexOf(max);
sout icine idxOfMax yazarak maksimum elemanin indexini gor

9.adim: maximum oldugu ve 2.indexte oldugunu anladigimiz sayi 5'ten once artma, sonrasinda azalma var.
maksimum elemana kadarki tum elemanlari bir listin icine koy.

10.adim: yeni bir list olustur. Ilk bolum bu liste girecek.

11.adim:myList.stream().filter(t->myList.indexOf(t)<=idxOfMax).forEach(t->firstList.add(t)
sout icine firstList yazarak ilk bolumu gor. Neden filter kullandik. Cunku ilk bolumu alacagiz, 5'ten sonrasi
elenmeli. Filter icine yazdiklarimiz ile 2.index oncesi indexteki elemanlari aldik. Maximum elemanin
indexinden oncekileri aldik. [3,2,5]

12.Yeni Integer list olustur. First listi ekle. Bu sekilde firstList'i kopyaladik, ayni elemanli
list olusturduk. [3,2,5]

13.firstList'in kopyasi olan listi, collections.sort ile elemanlari alip sirala [2,3,5]

14.firstList ile kopyasinin ayni olup olmadigini kontrol et. boolean rule1=firstList.equals(firstListCopy);
sout icine rule1 yazdik

15. adim: Maximum elemandan sonraki tum elemanlari yeni bir list icine koy

16.adim: yeni bir list daha olusturduk. secondList isimli listimize myList.stream().filter
(t->myList.indexOf(t)>=idxOfMax).forEcah(t->secondList.add(t));

17.adim secondListin copy'sini olustur

18.adim: secondListCopy'i ters olarak sirala. Collections.sort ve ardindan Collections.reverseOrder
metodunu kullandik.

19.adim:secondList ile secondList kopyasi ayni mi diye bak.
equals metodunu kullandik.
Mountain Array olmasi icin iki boolean conteynerimizin sout icinde yazilmasi gerekir.
Sout icinde rule1&&rule2 yazdik. Bize true verdi.


 */



public class InterviewQuestion {
}
