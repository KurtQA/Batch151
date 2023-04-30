package selfstudying1;


import java.util.Arrays;

public class SelfStudy03 {

    public static void main(String[] args) {
      String names[]={"K","C","A","R","S"};
      String el="R";

        Arrays.sort(names);
        int result=Arrays.binarySearch(names,el);
        System.out.println(result);
        if (result<0){
            System.out.println("Array has not "+ el);


        }else{
            System.out.println("Array has "+el);
        }

    }


}
