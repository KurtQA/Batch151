package day23practice;

import java.util.Scanner;

public class C01_cdenOncekia {

    public static void main(String[] args) {

        /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   karakterleri sayin dedigine gore scanner dan kelime istedikten sonra int counter=0; yazalim. Hafizada
   yer acalim diye default deger atariz.
   String datalarda default deger ""liktir. Carpma ve bolme icin default deger 1 dir.
   for loop icinde sartimiz i<str.indexOf("c") cunku kelimedeki c'yi buluncaya kadar i calisacak. if statement
   da a lari bulmak icin str.charAt(i)=='a' yazdik. C'ye ulasinca kac a varsa diye gorsun ve counter'a eklesin
   sout kismi iceride yazmak istersek her adimi bize gosterecek, ancak sonucu gormek icin sout {} disina yaziyoruz
      */

        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir kelime giriniz");
            String str=input.nextLine().toLowerCase();
            int counter=0;
            for(int i=0; i<str.indexOf("c"); i++){//i c'nin kelime icindeki indexinden kucuk. O kadar calisacak
                if (str.charAt(i)=='a'){
                    counter++;
                }//if body
            }//for body
        System.out.println("c'den once "+counter+" a vardir");//aceliya yazinca sonuc: c'den once 1 a vardir
        //arayacak yazinca asagi kisimda, c'den once 3 a vardir yazdi

        //2.YOL
          int sayac=0;
        if (str.contains("c") && str.contains("a")){
            for (int i=0; i<str.length(); i++){
                if(str.charAt(i)=='a'){
                    sayac++;
                }else if(str.charAt(i)=='c'){
                    break;
                }//else if
            }//for loop
            System.out.println("c'den onceki a sayisi +sayac");

        }else{
            System.out.println("Lutfen c ve a harflerini iceren kelime giriniz");
        }
        //alacakaranlik    c'den once 2 a vardir     c'den onceki a sayisi +sayac
        //ebegumeci    c'den once 0 a vardir     Lutfen c ve a harflerini iceren kelime giriniz

    }
}
