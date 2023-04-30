package day19arraysforeachloops;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        //Bir array'in elamanlari array ise bu array multidimensional arraydir.

        //Multidimensional array olustur.
        int a[][] = new int[3][2];//3 outer , 2 inner arraysler

        //Multidimensional Array'e eleman ekle.

        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[0][1] = 81;
        a[2][1] = 0;
        //Multidimensional Arrayleri console yazdirmak icin deepToString() methodu kullaniriz.

        System.out.println(Arrays.toString(a));//[[I@27f674d, [I@1d251891, [I@48140564]
        System.out.println(Arrays.deepToString(a));//[[5, 81], [0, 45], [123, 0]]

        //Array icinde spesifik bir eleman alirsak
        System.out.println(a[1][1]);//45

        //Multidimesional Array icindeki bir array nasil yazdirilir?
        //a[0] daki data type int mi array mi, arraydir. Arraysleri yazdirmak icin toString ile yazilmali
        //degilse referansini verir.
        System.out.println(Arrays.toString(a[0]));//[5,12]
        System.out.println(Arrays.toString(a[1]));//[81,45]

        //Kisa yoldan multidimesional array nasil olusturulur?
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};
        //{"Ali","Kemal"} ve digerleri String Array data type olup, loop icine data type olarak
        //String [] koyacagiz daha sonra w sepetini yaziyoruz:students, students array'i icindeki elemanlari
        //tek tek w sepetine koyacagiz for each loop icinde. Daha sonra kodu yazariz.
        //for each loop parantez icini yazdiktan sonra w sepetindekilerin length'ine tek tek bakacagiz.
        //soruda toplama var. Toplanan elemanlar bir sepete girmeli. Bu nedenle int sum=0; olusturduk, for uzerinde
        //sum sepetini yazdiktan sonra for parantez altina gelip sum=sum+w.length; yazdik.
        //cunku 0 olan sum'a her aramada bir sayi eklenecek. Yani her arrayde kac eleman varsa o kadar sayi eklenecek
        //ornek ilk arrayde 2 eleman, 2+0, sonraki arrayde bir eleman, 2+1, sonra 3 eleman 3+3, en son
        //2 eleman var 6+2=8 sonuc 8'i verir.
        //kac isim var diye soruyor. loopun her donusunde lengthine bakacagimiz elemanlari bir sepete
        //koymaliyiz. Bu nedenle sum sepeti olusturduk.

        //Example 1: Yukaridaki students arrayinde toplam kac isim oldugunu bulunuz
        //loop kullanacagiz. Mumkunse oncelikli olarak for each loop kullanalim. Cunku bir index girmiyoruz.

        int sum = 0;
        for (String[] w : students) {
            sum = sum + w.length;

        }
        System.out.println(sum);//8


        //Example 2: Yukaridaki students arrayinde icinde "m" harfi olan isimleri console'a yazdirin.
        //Burada nested loop olacak

        for (String[] w : students) {

            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);//Kemal Cemal

                }
            }
        }

        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
        //w'ye array icindeki elemanlar girecek, sonra w'deki elamanlar k'ya girecek. result= kismindan
        //sonra ilk gelen 5, 1 olan result ile carpilacak 5 olacak, sonra 4 gelecek, 5 olan result *4=20
        //daha sonra 2 gelecek, 20*2=40 olacak result...
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int result = 1;
        for (int[] w : nums) {
            for (int k : w) {
                result = result * k;
            }
        }
        System.out.println(result);
    }
}