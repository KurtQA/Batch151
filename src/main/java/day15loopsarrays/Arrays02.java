package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {


        //Array'leri kisa yoldan nasil olustururuz?
        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));

        //Example: grades array'deki en kucuk ve en buyuk grade'in toplamini ekrana yazdiran kodu giriniz
        //en kucuk 34, en buyuk grade 100.Buyukten kucuge siralariz ve birinciyi isterse 34'u aliriz
        Arrays.sort(grades);// sayilari kucukten buyuge siraladi.
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]
        //toplamlarini istedi
        System.out.println(grades[0] + grades[grades.length - 1]);//134
        //grades[0] en kucuk int'i 34'u ve grades.length-1'i 100'u verir. Bu nedenle boyle yazdik.
        //Arrays.short() methodu kucukten buyuge siralama yapar.
        //Applicationlarda data ile bu datalari isleyen kodlar(logic) birbirinden ayrilir
        //logic dataya bagimli olmamali
        //length-1 kullanirsak hep dogru sonuc aliriz. Sayi daha az olabilir. Uzun veya kisa
        //farketmez, length-1 ise yarar

        //size verilen bir String arraydeki isimlerden 5 karakter'den az karakter icerenleri console'a yazdirin. String stdNames[] = new String[5];
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        for (String w : stdNames) {
            if (w.length() < 5) {
                System.out.println(w);//Ajda Tom


            }
        }
        //Example 3: Size verilen bir String arraydeki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimlerden onceki isimleri console/a yazdiriniz.
        Arrays.sort(stdNames);

        for (String w : stdNames) {
            if (w.startsWith("F")) {
                break;
            }
            System.out.println(w);//Ajda Ayhan Cuneyt , Filiz yazilmadi.F'yi gorunce break ile devam etmedi
        }
        //Size verilen bir String arraydeki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimlerden onceki isimleri ve 'F' ile baslayanlari console/a yazdiriniz.
        Arrays.sort(stdNames);

        for (String w : stdNames) {
            System.out.println(w);
            if (w.startsWith("F")) {
                break;
            }

        }
        //bu defa Filiz'i de ekledi. Tom'a gecmedi break ile birakti. Son ornekte sout'u if uzerine koyduk
        //onceki ornekte break sonrasi sout yazdik. Bu yolla aradigimiz ile karsilasinca onu da ekleyip
        //islemi devam ettirmiyor, birakiyoruz.
        //Exsmple 5: Size verilen bir String arraydeki isimleri alfabetik siraya koyduktan sonra
        // F ile baslayan isimler haric diger isimleri yazdiriniz.
        Arrays.sort(stdNames);
        for(String w : stdNames){
            if(w.startsWith("F")){
                continue;
            }else{
                System.out.println(w);//Ajda Ayhan Cuneyt Tom
            }
        }
    }
}