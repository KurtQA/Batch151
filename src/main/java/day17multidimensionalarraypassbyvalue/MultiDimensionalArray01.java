package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        //Multidimensional Array nasil olusturulur?

        String names[][] = new String[3][2];

        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";
        System.out.println(Arrays.deepToString(names));
      /*
      sonuc: [[A, K], [P, M], [C, Z]]
      Multidimensional Arrayleri console'a yazamak icin "toString()" methodu degil
      "deepToString() methodu kullanilir
      toString() yaparsak yukaridaki array'i[][], bu durumda arrraylerden bastakine girer
      sonrakine giremezsiniz, onun referansini verir.

       */

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(names[1][1]);
        //sonuc M'yi verdi. Ikinci array'in birinci String'ini istemis olduk. Ornegimizde o kisimda
        //M vardi.

        //Multidimensional Array icindeki bir Array'i yazdirmak
        System.out.println(Arrays.toString(names[0])); //[A, K]
        System.out.println(Arrays.toString(names[1]));//[P,M]
        System.out.println(Arrays.toString(names[2]));//[C,Z]

        //Kisa yol ile multidimensional array olusturma
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayhan"}};
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int sum = 0;
        //burada sum 0 iken asagida sum=sum+w.length kisminda sum 0 + w.length ilk array de iki isim oldugundan
        //0 olan sum'a iki eklenecek. sum 2 olacak, bir sonraki array'de bir isim var, bu defa 2 olan sum'a
        //1 eklenecek ve 3 olacak, sonuna kadar her array icindeki kelime sayisinca sum buyuyecek
        //sonucu 8 verecek
        for (String[] w : students) {
            sum = sum + w.length;
        }
        //for each loop kullandik
        System.out.println(sum);//8
        //data type String iken array olusturunca data type artik arraydir

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console yazdirin.
        //Burada tekrarli islem olacak for loop each array yapalim
        //burada nested loop var. Iki loop yapacagiz ilk for each loop
        //ikinci for loop ikinci array icindeki elemanlar icin calisacak

        for (String[] w : students) {

            for (String k : w) {

                if (k.contains("m")) {
                    System.out.println(k);
                }
            }

        }
        //sonuc: Kemal Cemal
        //Bir Integer multidimensional array olusturun, tum elemanlarin carpimini hesaplayin.
        int nums[][]={{5,4},{2,3,2},{7}};

        int result=1;
        for(int[]w:nums) {
            for (int k : w) {
                result = result * k;
            }
        }
        System.out.println(result);
        //1680 verdi
        //birinci for () distaki ilk array icin, ikinci for() icteki array'in ici icin calisacak

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz

        //#######BU ORNEK 5.ORNEK'e kadar dinlenmedi. MUTLAKA DINLE ##########
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1.Step: Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for(int[] w : numbers){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        //2.Step: Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim
        int idx = 0;


        for(int[] w : numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int ages[][]= { {15,4}, {12,43,21},{7}};//==>4+43=47
        int small=ages[0][0];
        int big=ages[0][0];
        for(int[] w: ages){
            for(int k: w){
                small=Math.min(small,k);
                big=Math.max(big,k);
            }
        }
        System.out.println(small+big);
      //en kucuk 4 ile en buyuk 43 'un toplamini 47 verdi

    }
}
