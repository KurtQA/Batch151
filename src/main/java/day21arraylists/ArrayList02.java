package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {


        //Example 1: Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10


        //Once Integere bir List'imizi olusturalim. add methodu ile eleman ekleyelim.
        //sort() once elemanlari buyukten kucuge siralayacak
        //min() bize her zaman iki sayidan en kucuk olani verir
        //Burada tek tek elemanlar arasindaki farklari alip bir sepete koyacagiz


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums);//[12,23,10,19]

        Collections.sort(nums);
        System.out.println(nums);//[10,12,19,23]

        int minDiff= nums.get(1)- nums.get(0);
        //Burada 1. indextekinden 0. indextekini cikar ve minDiff sepetine koy dedik. Biz buraya 2 ve 1'de
        //koyabilirdik. Onemli olan ardisik bir islem yapabilmek

        for (int i=1; i<nums.size(); i++){
            Math.min(minDiff, nums.get(i)- nums.get(i-1));
        }
        System.out.println(minDiff);
        //buraya kadar minDiff de iki deger oldugunu anladik. Artik bu iki degeri isteyip gorecegiz
        for(int i=1; i<nums.size(); i++){
            if (nums.get(i)- nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1)+ " ve "+ nums.get(i));//10 12
            }
        }













    }
}