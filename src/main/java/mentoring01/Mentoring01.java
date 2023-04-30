package mentoring01;


import java.util.Scanner;

public class Mentoring01 {

    public static void main(String[] args) {


        // Ex 2:Herhangi bir 3 öge için float, long ve integer data tipinde degiskenler olusturunuz. Bu
        //degiskenlerin degerlerinin çarpımını konsolda yazdırınız.


        // Ex 3:Basit faizi bulmak için bir kod yazınız.
        //Not: Basit faiz formülü = anapara * oran * yılDegeri /100


        // Ex 4:Bir String ve iki long data tipinde degisken olusturunuz. Konsolda bu long degiskenlerin
        //toplamını ve çarpımını String ile yazdırınız.


        // Ex 5:Degerleri farklı olan iki boolean data tipinde degisken olusturunuz ve bu degerleri iki
        //ardısık deger arasında bosluk bırakacak sekilde aynı satırda yazdırınız.


        // Ex 6:3 öge (kitap, defter ve laptop) fiyatı için long data tipinde degiskenler olusturunuz.
        //Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.


        // Ex 7:Iki tamsayıyı degistirmek için bir kod yazınız.

        // 1.Yol: 3. degisken kullanarak

        // 2.Yol: 3. degisken kullanmadan
        int sayı1 = 5;
        int sayı2 = 2;
        double sonuç = sayı1 / sayı2;
        System.out.println(sonuç);

        int num1 = 4;
        int num2 = 5;
        String str1 = "ali";
        System.out.println(str1 + num1 + num2);


//        int num1 = 4;
//        int num2 = 5;
//        String str1 = "Ali";
//        System.out.println(num1 + num2 + str1);

        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz:");
        char harf = scan.nextLine().charAt(6);
        System.out.println(harf);
    }
}



