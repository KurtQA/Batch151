package day12switchloops;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

       /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yaziniz.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir ulke adi giriniz");
        String countryName= input.nextLine();

        switch(countryName.toUpperCase()){
            case "america":
                System.out.println("US");
                break;
            case "the United Kingdom":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
            default:
                System.out.println("Bu ulke tanimli degildir");

        }
        /*
        the United Kingdom
        UK sounucunu verdi ancak basta The United Kingdom yazmistim codun icine o zaman bu
        ulke tanimli degil demisti, sonra The yerine the yazinca dogru sonuc verdi.
        buyuk kucuk harfe duyarli oldugu icin kodu buna gore ayarlayacagiz
        Lutfen bir ulke adi giriniz

        Turkey
        Bu ulke tanimli degildir sonucunu verdi
        buyuk harfleri kucuge cevirdik. Bu durumda dogru sonuc verdi TR olarak
        switch de equalsIgnoreCase kullanilmiyor cunku bir karsilastirma olmuyor. Burada tolower
        ya da toUpper methodlar kullanilir
        eger lowercase kullanildiysa ulke isimlerini kucuk yazdik

         */


    }
}
