package day15loopsarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

     //Kullanicinin coklu datayi bir array'e yerlestirebilmesi icin gereken kodu yaziniz.

        //1.WAY
        String[] myArray = new String[3]; // declaring an array with a length of 3
        myArray[0] = "apple"; // adding the first element
        myArray[1] = "banana"; // adding the second element
        myArray[2] = "orange"; // adding the third element
        System.out.println(Arrays.toString(myArray)); // output: ["apple", "banana", "orange"]
        //2.WAY
        String[] z = {"apple", "banana", "orange"}; // declaring an array with multiple elements
        System.out.println(Arrays.toString(z)); // output: ["apple", "banana", "orange"]

        //Example and solution:
        // declare an int array with a length of 4
        int[] myIntArray = new int[4];

// add elements to the int array using the index of each element
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;

// declare a char array with a length of 4
        char[] myCharArray = new char[4];

// add elements to the char array using the index of each element
        myCharArray[0] = 'a';
        myCharArray[1] = 'b';
        myCharArray[2] = 'c';
        myCharArray[3] = 'd';

// print the elements of the int array
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + " of the int array: " + myIntArray[i]);
        }

// print the elements of the char array
        for (int i = 0; i < myCharArray.length; i++) {
            System.out.println("Element " + i + " of the char array: " + myCharArray[i]);
        }
        boolean[] myBooleanArray = new boolean[4]; // declaring a boolean array with a length of 4
        myBooleanArray[0] = true; // adding the first element
        myBooleanArray[1] = false; // adding the second element
        myBooleanArray[2] = false; // adding the third element
        myBooleanArray[3] = true; // adding the fourth element
        System.out.println(Arrays.toString(myBooleanArray));

        //Example for boolean:
        boolean[] isCorrect = new boolean[5]; // declaring a boolean array with a length of 5

        for (int i = 0; i < isCorrect.length; i++) {
            if (i % 2 == 0) {
                isCorrect[i] = true;
            } else {
                isCorrect[i] = false;
            }
            System.out.println((Arrays.toString(isCorrect)));
        }

        /*

        FOR LOOP
        for (initialization; condition; update) {
       // code to be executed
      WHILE LOOP
       while (condition) {
      // code to be executed
     DO WHILE LOOP
      do {
    // code to be executed
      }while (condition);
      }
      }
      FOR EACH LOOP
      for (type variable : array) {
    // code to be executed
     }
     The for loop is used to execute a block of code a fixed number of times.
     The while loop is used to execute a block of code repeatedly while a certain condition is true.
     The do-while loop is similar to the while loop, but the condition is evaluated at the
     end of each iteration of the loop instead of at the beginning.
     The for-each loop is used to iterate over the elements of an array or a collection.
         */
        //example of for each loop array
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
