package day44lambda;
/*
 Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
 Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan
 sonra sürekli azalan Array.

         int arr[]={1,2,3,2,1}
         int brr[]={1,3,7,11,8,7,3}== {2,4,4,-3,-1,-4}   7 elemanli brr[] nin 6 elemanli diff[] olur
         int crr[]={3,5,1,11,8}


1.adim: Bir Integer array olustur. int arr[]={1,2,3,2,1}


2.adim: Bir metod olustur. private static boolean isMountainArray(int[] arr)
Metodumuz arrayin mountain array olup olmadigini kontrol etmek icin olusturuldugundan, true ya da false vermesini istedigimizden data type'i boolean olarak olusturduk
ve parantezi icine parametre olarak arrayimizi yerlestirdik. int[] arr

3.adim: Bu sorunun cozumunde elemanlar arasindaki farklari alarak bir artma ya da azalma olup olmadigini bulmaya calisiriz. Ornek: 2. indexteki sayiyi
1. indexteki sayidan, 3. indexteki sayiyi 2. indexteki sayidan cikaririz. Cikan en az bir ise bir artis var demektir. Ancak bir noktaya geldigimizde bu array elemanlarinda
azalma oldugunu goruruz. Ornek 2.indexten sonra azalma var. 2'den 1'i, 1'den 2'yi cikarinca cikan -1 olduguna gore azalma oldugunu anladik.

4.adim: Arrayimizin length'ini alalim. int length = arr.length;//arr length'i 5 olup, bu sayiyi bir length ismini verdigimiz bir integer'a assign ettik.

5.adim: Farka bakabilmemiz icin yeni bir array olustur. int diff[] = new int[lenght - 1]; length-1 neden yazdik. Cunku bizim arr array'inin length'ini(5) diff isimli yeni
array'e assign etmistik. Ancak yeni arrayimizin length'i bir eksik olmali. Cunku ilk array'in elemanlari arasindaki farka bakarken cikan sonuclari aldigimizda artik elimizde
4 eleman kalacak ve yeni array bu farklara bakmak icin olusturuldugundan length'i 4 olacak. //[1,1,-1,-1]
 7 elemanli bir array olsaydi ve yine bir sonrakini bir oncekinden cikarsaydik bu durumda 6 eleman elde ederdik. Cikarma islemi oldugunda toplam elemanlar bir eksiliyor.
 Boylece length-1 olarak yeni arrayimizin elemanlarini belirleme nedeni anlasilmistir. Yeni arrayimizin buyuklugunu belirledik.

 6.adim: Lambdaya gore kodumuzu yazmayi baslat.
 Integerlarla ugrasirken IntStream Class'i kullanilir, bu sekilde elemanlari akista tutmus oluruz. IntStream Class'i elemanlari belirli bir aralikta tutacak 0.nci indexten son index
 dahil olan araligi tutacak.
 IntStream Class'inda range() metodu var, onu aldik. Sadece range() aldigimizda baslangic dahil, bitis haric olacak. Cunku biz elemanlari tek tek alip bakmak istiyoruz.
 Eger rangeClosed() metodunu kullansaydik bu durumda hem baslangic hem de bitis dahil olurdu. range metodu icine sirasiyla 0, length-1 yazdik. Cunku 0. indexten
 son index'e kadarki degerleri tek tek dondurmesi gerekli. arr arrayimizin length'i 5 oldugundan burada bize en son 4. index'teki elemani yani son elemani da dondurecek.

  IntStream.
          range(0, lenght - 1).

 forEach ile ikinci array'imiz olan int diff[]'deki 4 sayi arasindaki farki bulmak icin yazdiralim. forEach icine t data'sini aldik ve yeni arrayi icine t data'sini verelim. Daha
 sonra ilk arrayimiz olan arr'deki bir sonraki elemandan bir oncekini cikaralim ve bu islem sonucunu ikinci array olan diff arrayine atayalim.

                  forEach(t -> diff[t] = arr[t + 1] - arr[t]);// Burada ne yaptik? Ilk array elemanlari {1,2,3,2,1} olup, bunlardan ornegin t+1 2 ise, t 1'dir, t+1 elemanlardan 3 ise
  ondan onceki t elemani 2'dir ve tum t+1 olanlardan t olanlari cikardik. Sonucta su elemanlar elimizde kaldi [1,1,-1,-1]. Bu kalan elemanlari yeni array diff[]'e assign ettik.

  7.adim: Elimizdeki son elemanlar arasi yukari dogru artis ve bir noktadan sonra azalis var mi diye bakabilmek icin iki while loop kullanalim. Once yukariya dogru artisa bakan
  while loop ile baslayalim. While loop disinda bir int variable tanimlayalim. Ona deger olarak 0 verelim ki bastaki indexten itibaren calissin. while icine sartimizi koyalim.
   i variable'i son elemandan kucukse ve diff arrayinin i.nci indexi 0'dan buyukse i variable'imiz bir artsin. Length'imiz neydi? 4'tu. i 4'ten kucuk olursa ve diff[i} 0'dan buyukse
   true verecek ve true oldugu surece 'i' bir artacak. 0'dan buyuk olma hali bize elemanlar arasinda artis oldugunu gosterir. 0'dan buyuk olmadigi bir ana ulasirsa false verir ve
   artik azalmanin basladigini anlariz.

            int i = 0;
            //yukari cikis kontrolu
            while (i < lenght - 1 && diff[i] > 0) {
                i++;
            }

  Bundan sonra artis neticesinde en son cikilan noktayi bulmaliyiz. Birden fazla tepe noktasi olmamali. Bunu nasil bulabiliriz? Eger i.nci data en son ciktigimiz data ==0 ise
  Yani ilk deger ise ya da hic donmediyse ya da i.nci data ==length-1 ise return false diyoruz. Neden? Baslangic ve son degerden zirve olmaz. Birden fazla zirve mountain array'de
  olmaz.


            //zirve kontrolu
            if (i == 0 || i == lenght - 1) {
                return false;
            }

   Asagi inis varsa farkli olarak ne yapmaliyiz? Inerken 0'dan kucuk olmali, eksi degerler icermeli. i yine i++ olacak,asagi dogru inizi saglayacak.
   i.nci datamizin artik son indexteki data olmasi, artik bitirmesi lazim. return diyoruz ve i.nci data length-1'e esit olmali.

            //asagi inis kontrolu
            while (i < lenght - 1 && diff[i] < 0) {
                i++;
            }
            return i == lenght - 1;

Kodumuzu calistirinca true dondurdu. Once artis ve bir zirve noktasindan sonra azalis var. Eger biz farkli elemanlari olan int crr[]={3,5,1,11,8}'yi bu kod ile
mountain array mi diye kontrol etseydik bize false dondururdu.

Biz kodumuz icinde hem lambda expression hem de structural programming kullandik. Her ikisini kullaninca kodumuz daha hizli calisti.
 */





import java.util.stream.IntStream;

public class Lambda02 {



        public static void main(String[] args) {



           /*
         INTERWIEW QUESTIONS
         Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
         Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan
         sonra sürekli azalan Array.
         int arr[]={1,2,3,2,1}
         int brr[]={1,3,7,11,8,7,3}== {2,4,4,-3,-1,-4}   7 elemanli brr[] nin 6 elemanli diff[] olur
         int crr[]={3,5,1,11,8}

  */
            int arr[] = {3, 5, 1, 11, 8};
            System.out.println(isMountainArray(arr));
        }

        private static boolean isMountainArray(int[] arr) {
            int lenght = arr.length;//5 {1,2,3,2,1};
            int diff[] = new int[lenght - 1];//[1,1,-1,-1]
            IntStream.
                    range(0, lenght - 1).
                    forEach(t -> diff[t] = arr[t + 1] - arr[t]);//[1,1,-1,-1]

            int i = 0;
            //yukari cikis kontrolu
            while (i < lenght - 1 && diff[i] > 0) {
                i++;
            }

            //zirve kontrolu
            if (i == 0 || i == lenght - 1) {
                return false;
            }
            //asagi inis kontrolu
            while (i < lenght - 1 && diff[i] < 0) {
                i++;
            }
            return i == lenght - 1;
        }
    }
