package day20multidimensionalarray;

import java.util.Arrays;

public class MD02 {


    public static void main(String[] args) {

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1.step: iki boyutlu array de oncelikle kac eleman oldugunu bulmaliyiz.

        int toplamElemanSayisi=0;
        for(int [] w:  numbers){
            toplamElemanSayisi=toplamElemanSayisi + w.length;
        }
        System.out.println(toplamElemanSayisi);//5

        //2.step:Tek boyutlu arrayi elde ettigimiz eleman sayisi kullanarak olusturalim
        int newArr[]=new int[toplamElemanSayisi];
        //3.step: Iki boyutlu arraydeki elemanlari tek biyutlu arraye transfer edelim.
        int idx=0;
        for(int [] w:numbers ){
            for(int k: w){
                newArr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));//[5,4,2,3,2}
        //Burada son kisimda newArr[idx]=k; idx++; yazdik. Cunku arraye + yazarak k'ya yukleme yapamazdik. Array icine ulasip
        //tek tek elemanlari gormek ve bu elemanlari k'ya yuklemek ve her elamani devam edecek sekilde gormek icin
        //idx++; yazdik.

        int sayilar [][]={{17,22},{5,9,8}};
        int numEl=0;
        for (int w1[]:sayilar) {
            numEl=numEl+w1.length;
        }
        System.out.println("numEl");
        int yeniArr[]=new int[numEl];
        int idx1=0;
        for(int []w1:sayilar){
            for(int r:w1){
                yeniArr[idx1]=r;
                idx1++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));//[17,22,5,9,8]

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47
        int small=ages[0][0];
        int big=ages[0][0];

        for (int[] w : ages) {
            for (int k : w) {
                small=Math.min(small,k);
                big=Math.max(big,k);
            }
        }
        System.out.println(small+big);




    }

}
