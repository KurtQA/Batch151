package day17multidimensionalarraypassbyvalue;

import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {

        //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
        //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
        // "Undefined operation" mesaji verilerek uygulama dursun

        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */



          //+, -, *, /, % islemlerini yapabilen bir hesap makinasi yapiniz.
        //Kullanici "q" ya basmadigi surece islem secip yapabilsin
        //q ya basmasi durumunda "see you again" mesaji verilerek uygulama dursun
        //kullanici hesaplama operatoru disinda bir sey girmesi durumunda
        // "Undefined operation" mesaji verilerek uygulama dursun

        /*
            1)Kullanicidan data almak icin Scanner object olustur
            2)Kullanicidan yapacagi islemi almaliyiz
            3)Kullanicidan iki tane sayi almaliyiz
            4)Tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */
        Scanner input=new Scanner(System.in);
        System.out.println("To stop adding press q");

        do{
            System.out.println("Please enter the operation among +, -, *, /, % ");
            char opr= input.next().toLowerCase().charAt(0);

            if(opr=='q'){
                System.out.println("See you again");
                break;
            }
            boolean r= opr=='+'  || opr =='-' || opr=='*' || opr=='/' || opr=='%';
            if(!r){
                System.out.println("Undefined operation");
                break;
            }
            System.out.println("Please enter the first number");
            int n1=input.nextInt();
            System.out.println("Please enter the second number");
            int n2 =input.nextInt();
            switch (opr){
                case '+':
                    System.out.println(n1+ " + " +n2+ "=" + (n1+n2));
                    break;
                case '-':
                    System.out.println(n1+ "-" +n2 +"=" +(n1-n2));
                    break;
                case '*':
                    System.out.println(n1+ "*" +n2 +"=" +(n1*n2));
                    break;
                case '/':
                    System.out.println(n1+ "/" +n2 +"=" +(n1/n2));
                    break;
                case '%':
                    System.out.println(n1+ "%" +n2 +"=" +(n1%n2));
                    break;
            }

        }while(true);
    }
}
