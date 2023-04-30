package javaders.day9stringmanipulationsifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        //INTERVIEW QUESTIONS
        //String str="abbccdc" tekrarsiz
        //burada a bastan da sondan da 0. indexte. Bu duruma tekrarsiz diyoruz. Bu harften
        //baska bir tane daha yok
        //b harfi 1.indexte, bastan, sondan ise 2. oldugundan bu tekrarsiz degildir
        //c harfi bastan 3., last indexte 6. indexte bu da tekrarsiz degil
        //d harfi bastan 5 sondan 5 indexte olup 5 5'e esit olup burada tekrarsiz
        //karakterleri ekrana yazdiriniz

        //yukarida Parantez icine konulan ch String str="aac"; deki ilk a harfi indexOf(ch)
        //sonra lastIndex(ch) deki a'yi aldik.Nasil aldik charAt(0) da 0.indexi istedigimizi belirttik.
        //0. indexte a var
        // If str konteynerindaki a harfinin baslangic indexi
        //ile son indexi equal
        //ilk a ch sonra c'yi ch1 diye alabiliriz paranteze
        //parantez icindeki ch ilk idex ile son index esit ise true verecek
        //indexOf() methodu 0.indexi verir, lastIndexxOf() en sondan gordugu ilk indexi veriyor
        //ornek sondan a'yi ilk gordugu yere gidiyor

        String str ="aac";

        char ch =str.charAt(0);
        if(str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(ch);
        }//if body

        char ch1 = str.charAt(1);
        if(str.indexOf(ch1) == str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }//if body
        char ch2=str.charAt(2);
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println(ch2);//sonuc c'yi return etti. Sadece c'nin tekrari yoktu
        }

        // Ex : Sayi pozitif ise ekrana "Pozitif Sayi " yazdiran kodu yaziniz
        int num = 20;

        if(num>0){
            System.out.println("Positive");
        }

    //Ex: Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdiriniz
        //0 1 2 3 4 5 6 7 8 9 ==>Rakam
        int number = 12;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }
        //Ex: Sayi uc basamakli ise ekrana "Sayi 3 Basamaklidir"yazdiriniz.
        int n=-234;
        n=Math.abs(n);
        if(n>99 && n<1000){
            System.out.println("Sayi 3 Basamaklidir");
            //Math Class onemli bir Calsstir. Icerisinde bir cok method barindirir.
            //abs() methodu verilen sayinin mutlak degerini yani pozitif halini verir
        }


         Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int no= input.nextInt();
        if(no%2==0){
            System.out.println("No cift sayidir");
        }
        if(no%2!=0){
            System.out.println("No tek sayidir");

        }


        }
    }





