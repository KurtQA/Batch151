package day07practice;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {

        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
        //ornek 5, 1*2*3*4*5=faktoriyelini buluruz

       Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
          int rakam=scan.nextInt();

          int factoriyel=1;

          int num=1;
          while (num<=rakam){
              factoriyel=factoriyel*num;
              num++;
          }

        System.out.println(rakam + "!= " + factoriyel);
      //Lutfen bir sayi giriniz
        //5
        //5!= 120

    }


}
