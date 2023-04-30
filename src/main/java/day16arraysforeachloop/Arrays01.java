package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {
        //Kullanicinin coklu datayi bir array'e yerlestirilebilmesi icin gereken kodu yaziniz.
    /*
    kullanicinin data almak icin Scanner object olustur
    coklu datayi yerlestirmek icin bir array olustur
    array olusturabilmek icin kullanicidan arraye kac tane eleman koyacagini almaliyim
    loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.

     */

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the number of elements you want to add");
        int numOfElements = input.nextInt();

        String stdNames[] = new String[numOfElements];

        System.out.println("To stop adding press 'q'");

        for(int i=0; i<stdNames.length; i++){

            System.out.println("Enter the " + (i+1) + ". student name");

            String name = input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i] = name;
            }

        }
        System.out.println(Arrays.toString(stdNames));


    }
}
