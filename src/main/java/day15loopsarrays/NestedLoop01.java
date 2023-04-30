package day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {

    /*
    1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....

                          Week1 icin kac kez icteki donecek?
                          for(int i=1; i<5; i++) burada i<5 olmasinin nedeni bir ay dort haftadan
                          olusur. 4 ten bir buyuk olan 5'i yazdik.
                          bir sonarki loop icinde k<8 yazdik. Cunku bir haftada 7 gun var. Bir fazlasi 8
     */

    public static void main(String[] args) {
        //ilk loop iki kez, alttaki loop uc kez calisir
        //yani ilk loop bir kez donunce icerideki loop uc kez doner. Her bir donusunde, ikinci loop
        //uc defa doner

        for (int i = 1; i < 5; i++) {
            System.out.println("Week:" + i);

            for (int k = 1; k < 8; k++) {
                System.out.println("Day :" + k);

                /*
                Week:1
             Day :1
             Day :2
             Day :3
             Day :4
             Day :5
             Day :6
             Day :7
             Week:2
             Day :1
             Day :2
             Day :3
             Day :4
             Day :5
             Day :6
             Day :7
             Week:3
             Day :1
             Day :2
             Day :3
             Day :4
             Day :5
            Day :6
            Day :7
            Week:4
            Day :1
            Day :2
            Day :3
            Day :4
            Day :5
            Day :6
             Day :7

                 */

                for (int m = 1; m < 3; m++) {
                    System.out.println("Week:" + m);

                    for (int y = 1; y < 4; y++) {
                        System.out.println("Day :" + y);
                        //her hafta icin uc kez calisti. Ornek Week:1, Day:1 Day:2 Day:3
                        //Week:2, Day:1 Day:2 Day:3
                        //Week:2, Day:1 Day:2 Day:3


                    }
                }

            }
        }

        //Nested while-loop

        int m = 1;

        while (m < 3) {

            System.out.println("Week:" + m);


            int y = 1;
            while (y < 4) {
                System.out.println("Day :" + y);
                y++;
            }
            m++;
        }
        /*
        2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        **** (bu sekilleri olusturmak icin dort kez calistiracagiz)
                        **** (dort yildiz var)
                        ****
            Note: Get the number of the rows and the columns from user
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows=input.nextInt();
        System.out.println("Please enter number of columns");
        int columns = input.nextInt();

        for(int r=1; r<=rows; r++){

            for(int c=1; c<=columns; c++){
                System.out.print("*");
            }
            System.out.println();
        }
            /*
              Result:
              Please enter number of rows

             3
             Please enter number of columns
             4
             ****
             ****
             ****
              Eger sout icine "* " yazsaydik yani yildiz yanina bosluk biraksaydik
              tum yildizlar arasi bosluk cikiyor. Daha guzel gorunuyor.
              loop lar istenilen sayidan baslar. 0 da bir de olabilir.
              satirlari sayarken bu soruya gore 1 ile basladik.
              r<=rows dedik cunku kullanici 2 verdi. Rows kismi 2 olunca r 2 den kucuk ve esit
              yaptik. Aksi halde Java'ya daha fazla is yaptiririz: r<rows+1 olurdu.


             */
        //iki sout yazdik, birine print, otekine println yazdik ayni sekil cikabilsin diye
        System.out.println();
       /*
        3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

        Burada tekrarli rakamlar, tekrarli islem var. Birinci satirda 1, ikinci satirda 3
        ucuncu satirda  3 tane... Yani icerideki loop satir sayisi kadar calisacak.
        3. satirda icerideki loop 3 kez, 4. satirda 4 kez calisacak.

                */

       /*
       Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */



    }
}