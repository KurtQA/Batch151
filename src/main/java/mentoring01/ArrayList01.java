package mentoring01;


import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {
       // Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int sum = 0;
        for(Integer w : myList){
            sum = sum + w;
        }
        System.out.println(sum);



        }




    }

