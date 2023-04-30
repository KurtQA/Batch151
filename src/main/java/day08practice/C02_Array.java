package day08practice;

import java.util.Scanner;

public class C02_Array {

    public static void main(String[] args) {

 /*
        Hackerlar bazı harfleri sayılara cevirerek yazısabiliyorlar. Genellikle cevirdikleri harfler su sekilde:

        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        ornegin:
         java ile hersey guzel
         j4v4 1l3 h3r53y guz3l

        Kullanıcıdan bir cumle alınız, 'hacker'ların konusma diline cevireniz.

        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        //1. YOL
//        cumle = cumle.replace('a', '4').replace('e', '3').replace('i', '1').replace('o', '0').replace('s', '5');
//        System.out.println("Hackerların konuşma diline çevirilmiş hali: " + cumle);
        //Lütfen bir cümle giriniz: Java cok guzel seydir
        //Hackerların konuşma diline çevirilmiş hali: J4v4 c0k guz3l 53yd1r

        //2.YOL, Array olusturarak yapacagiz ve for loop kullanacagiz
        //arr cumledeki tum harfleri icine alacak, bu nedenle for loop kullanacagiz

        String arr[] = new String[cumle.length()];
        for (int i = 0; i < cumle.length(); i++) {
            arr[i] = cumle.substring(i, i + 1);//cumlenin ilk harfini aldik ve array'imizin ilk indexine aktardik
            System.out.print(arr[i]);
        }
        System.out.println();//bir satir bosluk olsun diye bunu ekledik
        /*
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

         */
        //Hackerlarin kullandiklari sayi ve harfleri kullanacagiz bu nedenle ikinci bir for loop acacagiz

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].contains("s")){
                arr[i]="5";
            }
            if(arr[i].contains("a")){
                arr[i]="4";
            }
            if(arr[i].contains("e")){
                arr[i]="3";
            }
            if(arr[i].contains("i")){
                arr[i]="1";
            }
            if(arr[i].contains("o")){
                arr[i]="0";
            }

            System.out.print(arr[i]);


        }

//        Lütfen bir cümle giriniz: Java ile hersey guzeldir
//        Java ile hersey guzeldir
//        J4v4 1l3 h3r53y guz3ld1r

    }
}