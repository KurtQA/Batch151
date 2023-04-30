package day_15_practice;

/*
Personal class parent classtir. En ustteki class oldugu icin herkes icin var olan datalari bu class icinde
olusturabiliriz. Bu classlar arasi parent-child iliskisi oldugu icin variablelarin access modifierlerini
protected olarak belirledik. Sirasiyla int persNo, String isim, String soyisim, String adres, String tel
variablelarini olusturduk. Onlara herhangi bir deger vermedik.

Her class icine main method olusturduk.

Daha sonra bu classin child classi olan Muhasebe classina gittik. Muhasebe class'i memur ve Isci classlarinin
genel bilgileri, onlarin parent'i olan Muhasebe class'inda tutulur. Burada da olusturdugumuz variablelar
protected. Sirasiyla, int saatUcreti, String statu, int maas. Daha sonra maasHesapla methodu olusturduk. Access
modifier'i yine protected. Bu method icinde saatUcreti variable'ini su sekilde kullandik:
int maas=saatUcreti*8*30; 8 saat, 30 gun ve saatUcreti'ni bir integer variable'ina assign ettik.

Daha sonra Muhasebe class'inin child'i olan Memur class'ina gittik. Memur class'inda sadece memurlar var.
Burada Personal ve Muhasebe claslarinda olusturdugumuz variablelar'i alip onlara yeni degerler verecegiz.
Bu class icinde bir object olusturduk: Memur memur1=new Memur(); Object kendi class'indan olustu, ancak parenti
olan Personal ve Muhasebe classlarindan tum datalari alabilecek.

memur1 object'ini kullanarak persNo'ya ulasmak icin memur1.persNo=1001; persNo'ya 1001'i assign ettik. Java once
bu class icinde persNo var mi bakar. Burada olmadigi icin, daha sonra parent'i Muhasebe classina gelir, orada da
bulamayinca Muhasebe'nin parent'i Personal Class'ina gelir ve orada buldugu persNo'yu buldugu yerden tutup
getirir. Biz buna 1001 degeri atamistik. Getirdigi data boylece degismis olacak.
Sirasiyla diger datalari da bu sekilde arayip bulacak.

Biz Memur class'indan memur1 object'i ile saatUcreti'ne yeni deger atadik. Bu class icinde saatUcreti olmayinca
Muhasebe classina bakar ve orada bulunca onu getirir, getirdiginin degeri yeni degere gore degismis olur. Ayrica
saatUcretine bakmak icin bir ustteki parent'a gitmez cunku kendi parent'i icinde buldu.

memur1.maas variable'ini cagirmak istedik ancak cagirirken maasHesapla methodundan faydalanarak maas'a yeni bir deger
vermek istedik. memur1.maasHesapla();'yi memur1.maas'a assign ettik. Biz saatUcretine deger olarak 10'u assign etmistik.
buna gore memurun saat ucretine gore maasHesapla methodu calisti, sonra sout icine memur1.maas yazinca ekranda
2400'u gorduk. Bu memur1'in maasi.

Her seferinde tek tek sout yazip maaslari hesaplamak yerine to.String yontemini kullanalim. Sagi tiklayinca
generate'den toString'i secelim. toString methodu objectlerin tum ozelliklerini yazdirmak icin pratik bir
yontemdir.

sout icine memur1.toString() yazinca ekranda objectlerin tum ozellikleri gorundu.
Memur{saatUcreti=10, statu='Memur', maas=2400,....}

Ikinci bir memur olusturduk. Memur memur2=new Memur();
memur2'yi kullanarak persNo'sunu bir deger assign ederek cagiriyoruz. Java once memur classinda persNo'yu
arar ve bulamayinca sirasiyle ust ve en ustteki class'a gider.
memur2.persNo=1002;
memur2.saatUcreti=10;
memur2.maas=memur2.maasHesapla(); Bu methodu parent'i Muhasebe classinda bulur.

Biz istedigimiz yerden main method olusturabiliriz, ama en ust parent olan Personal class'inda main method olustur
mak yerine sub=classlarda olusturmak daha uygun. Daha sonra toString methodundan faydalanabiliriz. Ancak
ekranda deger verdiklerimizi o degerlere gore yazsa da deger vermedigimiz ornek tel variable'i icin null yazar.
tel String oldugu icin null goruruz ekranda. System.out.println(memur2.toString()) yazinca memur2 icin
ne yazdiysak ekranda onlari goruruz, ayrica diger variablelar icin deger atamasi olmayinca Personal
ya da Muhasabe class'indaki tum ozellikleri inherit yaptigindan deger atamadigimiz variablelar icin data type'ina gore
ya 0 ya null default degerlerini {} icinde gosterir.

Isci class'ina gittik. Orada calisanlar surekli isci ve ustabasi oldugundan yeni bir object olusturmadik.
Olustursaydik bir problem olmazdi, sadece bu soruda uygun olan object olusturmak degil variablelar olusturmak.
Variable'larimizi protected olarak yazdik. Sirasiyla String isciStatu="SurekliIsci"; yazarak, Biz bu isci
classinin child'i olan claslara herhangi bir iscistatu degeri vermezsek, bunun default degeri "Surekli Isci"
olsun demis olduk.
Bu classin child classlarinin olmasi object olusturmaya engel degildir. Fakat isciler icin surekli isci ve
ustabasi olmaktan baska ihtimal olmadigi icin isci class'inda isci uretmeye gerek yok.

Daha sonra protected void mesai(){
System.out.println("Isciler gunluk 8 saat ve haftada 5 gun calisir");}

Surekliisci class'ina girince bir main method olusturduk. Surekli isciler esas calisanlar, bu sebeple main methoud burada
olusturduk. Bu main method uzerinde surekli isci olusturmak icin main method icinde object olusturduk.
Surekliisci surIc1=new SurekliIsci();

Yeni objectimizi kullanarak persNo datasini cagirdik ve cagirma isini yaparken ona 5001'i assign ettik. Java
persNo'yu bulmak icin sirasiyla SurekliIsci, Isci, Muhasebe ve Personal classlarina gidecek. Buldugu yer personal
class'i olup, onu alarak geri geldi.

Object ile isim variable'ini cagirdik. isim variable'ina "Cem" atadik. isim variable Personal classindan bulundu.
Ayni mantik ile object ismi yazilir ve yanina ilgili variable ismi yazilir ve cagrilir.
statu variable'ini Muhasebe class'indan bulur.
saatUcreti variable'ini Muhasebe classindan bulur.
maas ve maasHesapla'yi Muhasebe classinda bulur.

Bu datalari sout icine tek tek yazdirabiliriz. Sout(surIc1.persNO) Ancak toString kullanirsak object ozellikleri'
nin tamamini gorebiliriz. toString'i generate'den secerken tum variable isimlerini ayni anda sectik. Ekranda
IsciStatu="Surekli Isci"'yi de gorduk. Oysaki biz object ile bunu cagirip yeni bir deger vermemistik. Biz
IsciStatu'yu parent icinde olusturmus, "Surekli Isci"'yi assign etmistik. Biz deger vermeyince default deger
yerine "Surekli Isci"'yi goruruz, ayrica deger vermediklerimiz icin ya 0 ya null degerleri goruruz.

Ustabasi class'ina gittik. Burada da main method olusturduk. Sonra yeni bir object olusturduk.
Ustabasi ustabasi1=new Ustabasi();

ustabasi1.isim="Murat" Bir ustteki gibi bazi variablelari yeni degerler atayarak object ismi ile cagirma
islemini yaptik.
object ile mesai methodunu cagirinca sout icine yazdigimiz cumleyi ekranda gorebildik.











 */

public class Personal {

    // bir fabrikada gerekli olan departmanları;
    // Personel, Muhasebe, Memur, Isci, Surekliİsci, Ustabasi olarak farklı classlara ayırınız
    // Muhasebe departmanı, Personel departmanına baglı olacak
    // Memur ve Isci departmanları, Muhasebe departmanına baglı olacak
    // Surekliİsci ve UstaBasi departmanları, İsci departmanına baglı olacak

    // Memur, Surekliİsci ve UstaBası departmanlarından obje olusturarak,
    // variable'lara kendi departmanlarına gore deger atayınız ve yazdırınız
}
