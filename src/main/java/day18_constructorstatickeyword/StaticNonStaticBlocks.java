package day18_constructorstatickeyword;

  /*
  1)"Static block"lar static variable'lara ilk degerlerini atamak icin kullanilir. They used to initialise static
  variables by giving their values


   */

import java.time.LocalDate;

public class StaticNonStaticBlocks {

    //static variable'lar static block kullanmadan da initialize edilebilirler.
    public static double pi = 3.14;// bu sekilde yazilabilecegi gibi

    public static double price;//price'in degerini dogrudan yazacaksak bu sekilde yazalim
  //Asagidaki sekilde de yazilabilir(static block), price icin kod yazacaksak bunu kullanalim.
    static {
      System.out.println("Hey I am a static block");
        LocalDate d = LocalDate.now();//Bu bize anlik tarihi verir
        if (d.getMonthValue() == 3) {
            price = 1000;
        } else {
            price = 1200;
        }
     //Eger price icin kod yazmamiz gerekirse static bloc kullanmaliyiz.
        //d.getMonthValue()==3 yani Mart ayi ise ve ayin 3'u ise soyle olsun diyor
      //static block lar main method dan once yazilir. Static kod icinde olusturdugumuz sout,
      // main method icindeki souttan once calistirilir
      //eger birden fazla static block varsa, once birinci static block, sonra ardindakiler en son main method
      //calistirilir.

    }

    public static void main(String[] args) {
        System.out.println("Hey I am a main method");
    }
}