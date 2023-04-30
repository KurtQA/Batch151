package mentoring01;

import java.util.ArrayList;
import java.util.List;

public class Question2Java {

    public static void main(String[] args) {

     //  Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
        //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        //1.Way with for each(add method, indexOf method, set method

        List<Integer> value=new ArrayList<>();
        value.add(12);
        value.add(31);
        value.add(7);
        value.add(13);
        value.add(10);

        int sum=0;

        for (Integer s:value) {
            if (s == 13 || s == 10) {

                continue;
            }
            value.set(value.indexOf(s), s + 2);
        }
                System.out.println(value);

        /*
        The code uses h.set(h.indexOf(w), w+2); to update the value of the current element w in the ArrayList h.
         The set method updates the element at the specified index with the new value, which is w+2 in this case.

The indexOf method is used to get the index of the current element w in the ArrayList h.
 This is needed because the set method requires the index of the element to be updated.

There is no second if statement because it's not needed in this case.
The first if statement checks if the current element is either 7 or 10.
If it is, the continue statement is executed, which skips the current iteration of the loop and
 moves on to the next element in the ArrayList.
 Since the desired action is to only update the values of elements that are not equal to 7 or 10,
 there's no need for a second if statement.

The set method does not need to be assigned to a new int variable
because it updates the value of the element in the ArrayList directly.
In this case, the set method updates the value of the element at the specified index with the new value w+2.
 The updated value is stored in the ArrayList itself, so there's no need to assign it to a new variable.

         */

        //2. Way with for loop(size method, get method, set method)
/*
List<Integer> h = new ArrayList<>();
h.add(12);
h.add(31);
h.add(7);
h.add(13);
h.add(10);

for(int i = 0; i < h.size(); i++){
    int current = h.get(i);
    if(current != 7 && current != 10){
        h.set(i, current + 2);
    }
}

System.out.println(h);
In this code, we use a traditional for-loop instead of a for-each loop. We iterate over the indices of the ArrayList using the size() method to get the number of elements in the ArrayList.

For each element at index i, we use the get() method to retrieve the element's value. If the value is not 7 or 10, we update the element's value by adding 2 to it using the set() method.

Finally, we print the updated ArrayList h using System.out.println(h).

*/


            }
        }




