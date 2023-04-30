package day12switchloops;

public class Loops001 {
    public static void main(String[] args) {


        //loops are for loop, while loop, do while loop, for each loop
        for( int i=1 ;  i<6  ; i++  ){
            System.out.println("Hi");

        }
        //for loop:
        //for( baslangic degeri(nereden baslayacak) ; condition  ; increment/decrement ){}

        //4'den 24'e kadar tum sayilari aralarinda bosluk biarakarak console'a yazdirin
        for(int i=4; i<25; i++){
            System.out.print(i + " ");
        }
        //4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 bu sonucu verdi.

        System.out.println();
        //33 den 11 e kadar tum cift tamsayilari ayni satirda, aralarina bosluk birakarak yazdirin

        for(int i=33; i>10; i--){

            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();//burada bos bir sout koyduk. Cunku alttaki kodumuz calismadi. Bunu koyunca calisti
       for(int i=14; i>2; i--){
           if(i%2!=0){
               System.out.print(i + " ");
           }


           }
       }


    }


