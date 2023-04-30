package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi aliniz. Bu sayi pozitif ise ekrana pozitif, degilse
        pozitif degil yazdirin
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num=input.nextInt();
        String result= num>=0 ? "Pozitif Sayi" : "Pozitif degil";
        System.out.println(result);

    }
}
