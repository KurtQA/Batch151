package day07practice;

import java.util.Arrays;

public class C04_Array {

    public static void main(String[] args) {


        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
        int arr[]={1,2,-3,4,-5,-6};

        //arr'nin isaretlerini degistireceksek yeni bir array olusturalim ki degisen isaretli elamanlari buna
        //ekleyelim.
        int brr[]=new int[arr.length];//burada yeni array, arr'nin length'i kadar olacak. Cunku sadece isaretleri
        //degistirecegiz.
       int idx=0;
        for (int each:arr) {//arr'deki her elemani for each ile aldik.
            brr[idx]=each*-1;//her elemani -1 ile carptik ve
            // her elemanin negatif degerini sirasiyla brr'ye assign ettik
            idx++; //indexi her seferinde birer arttiracagiz.
        }
        System.out.println(Arrays.toString(brr));//[-1, -2, 3, -4, 5, 6]
    }
}
