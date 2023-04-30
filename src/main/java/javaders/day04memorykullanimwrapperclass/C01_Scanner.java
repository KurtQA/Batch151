package javaders.day04memorykullanimwrapperclass;

import java.util.Scanner;

public class C01_Scanner {

    //Kullanicidan aldiginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki sayilarin
    //toplamini yazdiran kodu olusturunuz
    //ornek 38671 diyelim
    //sonra 3+8+7+1=19 rakamini veren bir kod yazmaliyiz
    //bunun icin modules'i kullanacagiz
    //son basamaktaki rakami almak icin modules 10 yani %10'u kullanacagiz
    //sayiyi kucultmeliyiz, 38671'i once %10'a boleriz, integer sayiyi 10'a bolunce Java
    //virgulden sonrasini siler ve tam sayi olarak verir
    //38671 %10=3867
    //3867 %10=386
    //386 %10=38
    //38 %10=3
    //3 %10=3
    //simdi kodu olusturalim main method icinde


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz");
           int number = input.nextInt();//38671

        //son rakami al
        int lastDigit = number%10;//1
        //sayiyi kucult
        number=number/10;//3867
        //sondan ikinci rakami al
        int secondLastDigit = number%10;//7
        number=number/10;//386

        //sondan ucuncu rakami al
        int lastThirdDigit=number %10;//6
        number=number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit=number%10;//8
        number=number/10;

        //ilk rakami al
        int firstDigit = number%10;//3
        number=number/10;
        System.out.println(lastDigit+secondLastDigit+lastFourthDigit+firstDigit);





    }
}
