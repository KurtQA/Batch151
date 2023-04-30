package day08practice;

public class C03_Array {

    public static void main(String[] args) {

/*

      Aşağıdaki multi dimensional array'lerin iç array'lerinde aynı indexe sahip elamanların
      toplamını yazdıran bir program yazın.


      int arr1[][] = {{1,2},{3,4,5}};
      int arr2[][] = {{7,8,9},{10,11},{12}};

     */

        //1.YOL chatGPT'den
//        int arr1[][] = {{1, 2}, {3, 4, 5}};
//        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
//
//        // İki array'in boyutları eşit değilse programı sonlandırır
//        if (arr1.length != arr2.length) {
//            System.out.println("Hata: İki array'in boyutları eşit değil");
//            return;
//        }
//
//        // İki array'in her bir iç array'inin boyutu farklıysa programı sonlandırır
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i].length != arr2[i].length) {
//                System.out.println("Hata: İki array'in birbirine karşılık gelen iç array'lerinin boyutları farklı");
//                return;
//            }
//        }
//
//        // Aynı index'e sahip elemanların toplamını yazdırır
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j] + arr2[i][j] + " ");
//            }
//            System.out.println();
//        }//Hata: İki array'in boyutları eşit değil


        //2.YOL
        //soruda bize ayni index olan ornek 1 otekinde 7 0.indexte ayni indexteler. 9 rakami birinci arrayin
        //ilk elemaninda iki eleman var oyle olunca 9un karsilik gelecek index yok. Ayni sekilde 5 rakaminin
        //arr2'de bir karsiligi yok. birbirine uyumlu olan, karsilik gelen elemanlar toplama islemine alinacak
        int arr1[][] = {{1, 2}, {3, 4, 5}};//0. indexte 1 ve 2 var,
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        //kisa olan yani length'i kisa olan array ile for loop'u baslatacagiz
        int sinir = 0;
        int toplam=0;
        for (int i = 0; i < arr1.length; i++) {//distaki arraylerin kisa olaninin sayisinca donguye alacagiz
            //arr1 deki dis array'in uzunlugu ile arr2 deki dis array uzunlugunu karsilastiacagiz. Kucuk olani secegiz
            //bu nedenle if statement ile bir sart olusturacagiz
            if (arr1[i].length < arr2[i].length) {//arr1'in i indexindeki dis arrayin eleman uzunlugu ile
                //arr2'nin i. indexindeki eleman uzunlugunu karsilastirdik.
                sinir = arr1[i].length;
            } else {
                sinir = arr2[i].length;

            }
            for (int j=0; j<sinir; j++){//j ic array'i temsil ediyor
                toplam=arr1[i][j]+arr2[i][j];
                System.out.println(i+ ","+j+"inedxindeki elemanlarin toplami " +toplam);
            }
            //0,0inedxindeki elemanlarin toplami 8//1 ile 7 toplandi
            //0,1inedxindeki elemanlarin toplami 10//2 ile 8 toplandi, rakam 9 atlandi
            //1,0inedxindeki elemanlarin toplami 13//3 ile 10 toplandi, ayni indexteler
            //1,1inedxindeki elemanlarin toplami 15//ikinci arraylerde birinde 4 otekinde 11 ayni indexlerde
            //rakam 9,5,12 karsilik bulmadigindan atlandilar, toplamaya eklenmediler.
        }
        //icice for loop var. Ikinci for birinci for loop'un {} icinde olacak.
    }
}








