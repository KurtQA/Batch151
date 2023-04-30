package mentoring01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

    public static void main(String[] args) {

        //Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.

        List<Integer> myList=new ArrayList<>();

        myList.add(10);
        myList.add(11);
        myList.add(17);
        myList.add(5);
        myList.add(4);
        myList.add(9);
        System.out.println(myList);
      //[10, 11, 17, 5, 4, 9]

        int carpim=1;
        for (Integer w:myList) {
            if (w%2==0){
                carpim=carpim*w;
            }


        }
        System.out.println(carpim);//40
    }
}
