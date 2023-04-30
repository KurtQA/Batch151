package day12switchloops;

import java.util.Scanner;

public class Switch04 {

    public static void main(String[] args) {

        //Kullanicidan aldiginiz characterin sesli harf olup olmadigini
        //kontrol eden kodu yazin.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char letter=input.next().charAt(0);
  /*      switch(letter){
            case 'a':
                System.out.println("'a' is a vowel");
                break;
            case 'b':
                System.out.println("'b' is a vowel");
                break;
                boyle devam edersek 29 harfi bu sekilde tek tek
                asagiya yazmak zorunda kaliriz. Bu nedenle baska bir
                yoldan gidelim. Caseleri ard arda siralayip sout'u bir defa
                yazariz, onun da altina default durumu ekleriz
  */
        //1. YOL
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("it is a vowel");
                break;
            default:
                System.out.println("it is not a vowel");

          //sonucu soyle: Please enter a letter
                //i bu harfi biz asagida verdik
                //it is a vowel
                //ancak buyuk A harfi girince calismadi
                //tolowerCase char icin calismaz, string icin calisir
                //o zaman codumuza sesli harfleri de ekleyince sorun cikmiyor
                /*
                ornek
                 kucuk harfler altina
                 case 'A':
                 case 'E':
                 case 'I':
                 */
        }
          //2. YOL
        String letter2=input.next().substring(0,1).toLowerCase();
        switch (letter2) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":

                System.out.println(letter2 + " is a vowel");
                break;
            default:
                System.out.println(letter + " is not a vowel");
        }



     //3. Yol
        String letter3=input.next().substring(0,1);
        switch (letter3) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":

                System.out.println(letter3 + " is a vowel");
                break;
            default:
                System.out.println(letter3 + " is not a vowel");
        }





    }



    }

