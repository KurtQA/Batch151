package day03scanner;

import java.util.Scanner;
//Java'nin util kutuphanesinden scanner class import edildi demektir.
//Yani kutuphaneden sistemime import yapildi.
public class Scanner01 {

    public static void main(String[] args) {

        //1.adim : Scanner Class'tan bir obje olustur
        Scanner input = new Scanner(System.in);

        //obje ismini input yaptik cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak


        //2. adim : Kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");

        //3.adim :Uygun method'u kullanarak kullanicinin verdigi datayi memory'e yerlestiriniz
        byte age = input.nextByte();
        System.out.println(age);



    }
}
