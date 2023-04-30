package lambda_recap;
/*

Stringlerden olusan bir list olusturalim.

List<String> meyve=new ArrayList<>(Arrays.asList("elma", "portakal","uzum", "cilek", "greyfurt", "nar", "mandalina",
"armut", "elma", "keciboynuzu", "elma"));

Her zamanki gibi metodlarimizi main metod disinda olusturup, main metod icinde call ederek calistiracagiz.

// SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım.

Soru bizden ilk harfi e veya olanlari almamizi, bir filtreleme yapmamizi istiyor.

1.adim: ilkHarfeVeyac isimli metodumuzu olusturduk. Parametresi Stringlerden olusan bir list oldu.

2.adim: meyve listimizi stream ile akisa sunduk. List elemanlarinin ilk harfi e veya c olanlari alarak yolumuza
devam edecegiz. startsWith metodu ilk harfi alacagindan bu metodu filter metodu icinde kullandik.
Bundan sonra forEach metodu ile yazdirdik. Utils Class'imizda yazdir metodumuz vardi. O metodun parametresini
Object olarak girmistik. Object yazinca bu metodu hem integerlar hem Stringler icin kullanabiliriz. Burada da kullana-
biliriz.
meyve.stream().filter(t->t.startsWith("e" || t.startsWith("c")).forEach(Utils::yazdir);

3.adim:metodumuzu main metod icinde call ettik ve metod parantezi icine listimizin ismi olan meyve'yi yazdik. Run
edince ekranda ilk harfi e ve c olanlari gorduk.

// SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim.
elemanlarinin basina ve sonuna yildiz ekleyerek elemanlari degisiklige ugratmis olacagimiz icin burada map metodunu
kullanmaliyiz.


1.adim: elamanBasinaVeSonunaYildiz isimli list parametreli metodumuzu main metod disinda olusturduk.

2.adim:
meyve.stream().map(t->"*" + t + "*").forEach(Utils::yazdir);

3.adim:main metod icerisinden metodumuzu call ettik. Argument olarak metod parametresi icine meyve yazdik. Kodumuzu
run ettik. Ekranda her elemanin basi ve sonunda * oldugunu gorduk.

 // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
 karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız.

 Siralama varsa sorted metodunu kullaniriz. Buyukten kucuge dendigi icin tek basina sorted metodu ile olmaz. Tersten
 bir siralama olacak

 1.adim:karakterSayGoreKucSirKarSayEnBuyIlk3 isimli metodumuzu olusturduk.

 2.adim: karakter sayisina gore bakacagimiz icin length'e bakariz. length metodunu yazinca java kizardi. Javaya
 gelecek elemanin String oldugu teminatini vermek icin toString() metodunu t elemanimizin yanina comparing metodu icine
 yazdik ve bu durmda length metodunu yazinca problem cikmadi. Devaminda reversed metodunu kullandik ki buyukten
 kucuge siralama yapilsin diye. Bu siralama sonrasi ilk 3 eleman en buyuk length'e sahip olacagi ve bunlari almamiz
 gerektiginden limit metodunu kullnadik. limit metodu icine 3 yazinca ilk 3 elemani aldi. Daha sonra bu elemanlari
 bir list icinde toplamamiz gerektiginden collect(Collectors.toList() yazdik. Soruda bizden return etmemiz
 istendiginden alt satira return sonuc; yazdik. Kodumuzu String olan bir liste assign ettik. Boylece return edebilecektik.
 Listimizin adina sonuc dedik.

 meyve.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(3).collect
 (Collectors.toList());

 3.adim:main metod icinde sout ile yazdirma yaparak burada return etmis olduk. Ekranda en uzun karaktere sahip ilk uc
 elemanin yazildigini gorduk.

 sorted(Comperetor.comparing(String::length).reversed da yazabilirdik. Ayni sonucu elde etmis oluruz.




 */







public class Lambda02 {
}
