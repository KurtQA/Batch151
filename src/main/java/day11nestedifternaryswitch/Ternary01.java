package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

   /*
   Kullanicidan alinan iki sayidan kucuk olanini ekrana yazdiriniz.
    */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two integers...");

            int first=input.nextInt();
            int second=input.nextInt();
            //1.Yol: use if else
        if(first<second){
            System.out.println(first);} else {System.out.println(second);}
        //2. Yol: use ternary
        int result= first<second ? first : second;
        System.out.println(result);


    }
}
