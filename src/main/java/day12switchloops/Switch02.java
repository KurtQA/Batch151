import java.util.Scanner;

public class Switch02 {

    //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz...");

        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz...");

        char islem = input.next().charAt(0);
        switch (islem) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case'*':
                System.out.println(a+"*"+b+"="+(a*b));
                break;
            case'/':
                System.out.println(a+"/"+b+"="+(a/b));
                break;
            case'%':
                System.out.println(a+"%"+b+"="+(a*b/100));
            default:
                System.out.println("Isleminiz tanimlanmamistir...");
        }

     //8 ve 9 rakamini girdik
        //Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz...
        //
        //+ islem olarak +'yi sectik
        //8.0+9.0=17.0
        //eger alt kisma break koymaz isek asgidakini de calistirip onun da sonucunu verirdi.
        /*
        28
        12
        Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz...
-
        28.0-12.0=16.0
         */

        /*
        Lutfen iki sayi giriniz...
        6
        3
        Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz...
        *
        6.0*3.0=18.0
         */

        /*
        44
        11
        Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz...
        /
        44.0/11.0=4.0
         */

        /*
       Lutfen iki sayi giriniz...

       20
       10
       Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz...
       %
       20.0%10.0=2.0
         */
    }
}