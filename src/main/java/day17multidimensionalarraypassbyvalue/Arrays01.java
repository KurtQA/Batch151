package day17multidimensionalarraypassbyvalue;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Kullanicinin coklu data'yi bir array'e yerlestirebilmesi istedigi zaman durdurabilmesi icin gereken kodu yaziniz.
        /*
        Bu bir user story dir
            1)Kullanicidan data almak icin Scanner object olustur
            2)Coklu data'yi yerlestirmek icin bir array olusturmaliyim
            3)Array olusturabilmek icin kullanicidan array'e kac tane eleman koyacagini almaliyim.
            4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyim.
         */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
        int numOfElements=input.nextInt();//burada kac tanelik array olusturacagimizi belirlemek icin yazdik
        String stdNames []=new String[numOfElements];//yukardaki int ismini son [] icine koyduk. Buna gore calisir
        System.out.println("To stop adding press q");

        for (int i = 0; i< stdNames.length ; i++) {
            System.out.println("Enter the " +(i+1)+ ". student name");
            String name=input.next();
            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i]=name;
            }
        }
        System.out.println(Arrays.toString(stdNames));
      //sonuc [zeynep, Fatma, Gulay]
        //basta 7 sayiyisini girince uc isim sonrasi q'ya basinca [zeynep, Fatma, Gulay,null,null,null] verdi.
        //Kullanici String verecekse String array, sayi verseydi int array olustururuz.

        //stdnames.length yerine numOfElements yazsaydik da calisirdi.
        //her dongude yeni bir data alacagimiz icin o datalari tutmamiz gerekecek. O zaman yeni uygun bir
        //variable olusturuyoruz. Ornegimizde else altinda yine yeni data gireceginden yeni variable olustu
        //cunku q yazsaydik else kismi sonrasina data gelmeyecek, q yazmazsak oraya yukaridaki string name
        //deki datalar girecek. Bunlari da tutmamiz gerekir.


    }
}
