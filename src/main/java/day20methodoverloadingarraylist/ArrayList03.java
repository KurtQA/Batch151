package day20methodoverloadingarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {

        /*
            Example 1: Bir Integer List'teki birbirine en yakin iki elemani bulunuz
            [12, 23, 10, 19] ==> 12 and 10
         */

        public static void main(String[] args) {

            List<Integer> nums = new ArrayList<>();
            nums.add(13);
            nums.add(23);
            nums.add(14);
            nums.add(10);
            System.out.println(nums);// [13, 23, 14, 10]

            //Collections.sort(nums); method'u nums listindeki elemanlari "natural order" yapar
            Collections.sort(nums);
            System.out.println(nums);// [10, 13, 14, 23]

            int minDiff = nums.get(1) - nums.get(0);

            for(int i=1; i<nums.size(); i++){
                minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));
            }
            System.out.println(minDiff);

            for(int i=1; i<nums.size(); i++){

                if(nums.get(i) - nums.get(i-1) == minDiff){
                    System.out.println(nums.get(i-1) + " and " + nums.get(i));//13 14
                }
            }
        }
    }

