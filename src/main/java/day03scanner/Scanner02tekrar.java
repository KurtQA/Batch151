package day03scanner;

import java.util.Scanner;

public class Scanner02tekrar {
    public static void main(String[] args) {

        //next() methodu sadece ilk kelimeyi alir, devamini almaz
        //nextLine() ise kullanicinin girdigi String'in tamamini alir.
        Scanner scan= new Scanner(System.in);
        System.out.println("Alfabeden bir harf giriniz");
        //Kullanicidan aldiginiz data type char ise asagidaki kodu yaziniz.
        //once scan.next() al sonra nokta koyunca charAt()'i gorursun. Icine 0 yaz
        //0 ilk gordugun harfi al demektir
         char harf = scan.next().charAt(0);
        System.out.println(harf);
        /* Eger charAt() parantez icine 0 yerine 4 alsaydik ve calistirsaydik,
        asagiya bir harf yerine bir kelime ornek Zeynep yazsaydik, bu defa bize Zeynep'in
        n harfini verirdi. Java 0 yazildiginda kelimenin ilk harfini 0 olarak okuyor

        */

    }
}
