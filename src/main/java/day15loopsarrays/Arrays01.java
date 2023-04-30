package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
     /*
     Array olustrudugunuzda, o array'e ayni tip data type konulur. Ornek: Ogrencilerin notlarini icine
     koyacaginiz bir Array'e integer koyarsaniz, hepsi sadece integer olmali. int data type
     Array, Java'nin ayni data tipinde coklu data depolamak icin olusturdugu bir yapidir.
     Array String ise icinde String olacak. Son []icine data sayisini yazariz.

      */

        String stdNames[] = new String[5];//[null, null, null, null, null]

     /*
     Array nasil yazdirilir? Sout yazariz. Parantez icine Arrays.toString(stdNames)
      */
        System.out.println(Arrays.toString(stdNames));//[null,null,null,null](null String'in default degerleri
    //Array'e nasil eleman eklenir?

        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        System.out.println(Arrays.toString(stdNames));//[Ajda,Ayhan,Kemal,Cuneyt,Filiz]

        //Arraydaki specific bir elemani nasil alabiliriz?
        System.out.println(stdNames[3]);//Cuneyt

        //Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdirin.
        //Burada tekrarli islem olacak. Bu nedenle loop kullanacagiz

        for(int i=0; i<stdNames.length;i++ ){
            System.out.println(stdNames[i] + "*");

        }
        //Ajda* ve digerlerinin isminin sonuna * yazdirdi
       //length String'lerde parantezli, Array'lerde parantezsiz kullanilir.

        //2.Way: for-each loop==> Enhanced Loop
        //mumkunse her zaman for=each loop kullanin

        for(String w: stdNames){
            System.out.println(w +"*");


        }
        // Ajda* ve digerlerinde son kisimda * verdi.
        //for each loop her zaman ilk elemandan baslar sonuna kadar gider.
        //bazen bastan baslamamamiz gerekirse for each loop yerine for loop kullanmaliyiz
        //for each loop array'lerde kullanilir. Array gorursek for each loop'u dusun.
        //Array'ler primitive data types ya da reference'lar ile calisir.
        //int, char...primitive data types kullaniriz
        //String'i reference olarak kabul eder. Stack memory icinde primitive ve reference var
        //


        // Bir integer dizisi oluşturun ve elemanlarını ekleyin (Bu ChatGPT'den)
        int[] numbers = { 5, 10, 15, 20, 25 };

        // Dizideki elemanların toplamını hesaplayın
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Toplamı consol'a yazdırın
        System.out.println("Dizideki elemanların toplamı: " + sum);

        //Example 2: Bir integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup consol'a
        //yazdirin.

        //for each loop ornek:

        int ages[]=new int[5];
        System.out.println(Arrays.toString(ages));//{0,0,0,0,0} int lerde default 0'dur null degil
        ages[0]= 12;
        ages[1]= 23;
        ages[2]= 9;
        ages[3]= 38;
        ages[4]= 27;
        System.out.println(Arrays.toString(ages));//{12,23,9,38,27}
        ////bir ustteki 12'yi once w'ya, daha sonra asagida sum+w nedeniyle sum 12 olacak ve devam eder

        int sum1=0;
        for(int w:ages){
            sum1=sum1+w;

        }
        System.out.println(sum1);//109


        // Bir char dizisi oluşturun ve elemanlarını ekleyin (CHATGPT den)
        char letters[] = { 'a', 'b', 'c' };

        // Dizideki elemanların çarpımını hesaplayın
        int product = 1;
        for (int i = 0; i < letters.length; i++) {
            product *= letters[i];
        }

        // Çarpımı consol'a yazdırın
        System.out.println("Dizideki elemanların çarpımı: " + product);

        //Example 3: Bir char Array olusturunuz, 3 eleman ekleyiniz,
        // elemanlarin carpmini bulup console'a yazdiriniz.
        //carpma olunca int carpim=1 verdik, sifir degil

        char initials[] =new char[3];

        int carpim=1;

        initials[0]='J';//74 (Ascii degeri)
        initials[1]='P';//88
        initials[2]='A';//65
        for(char w:initials){
            carpim=carpim*w;

        }
        System.out.println(carpim);//384800
    }
}
