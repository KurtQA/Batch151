package day21arraylists;

import java.util.List;

public class ArrayList001 {

    public static void main(String[] args) {
        //Example 2: Bir listteki tekrarsiz elemanlari console a yazdiriniz

        List<Double> prices = List.of(2.5, 2.5, 3.75);

        //2.5, 2.5, 3.75
        for ( Double w : prices ) {

            if(prices.indexOf(w)==prices.lastIndexOf(w)){
                System.out.print(w+" ");//3.75 4.0

            }
        }
        System.out.println();

        //Example 3: Bir list te tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Integer> heights = List.of(3,13,3);

        int counter=0;

        for ( Integer w :   heights ) {

            if(heights.indexOf(w) != heights.lastIndexOf(w) ){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("All elements are unique in the list");
        }else{
            System.out.println("At least one element is not unique in the list");
        }





    }
}