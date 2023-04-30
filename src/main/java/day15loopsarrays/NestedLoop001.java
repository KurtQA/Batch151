package day15loopsarrays;

import java.util.Scanner;

public class NestedLoop001 {

    public static void main(String[] args) {
        System.out.println("Please enter row number");
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();

        for(int h=1;h<=row; h++){

            for(int f=1; f<=h; f++){
                System.out.print(h + " ");
            }
            System.out.println();
        }
        /*
        Please enter row number
        3 verdik kullanici kisminda

        1
        2 2
        3 3 3


         */

    }
}
