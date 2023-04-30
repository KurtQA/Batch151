package day24datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        LocalDate mycurrentDate=LocalDate.now();//Burada LocalDate classindan now methodunu cagirdik
        //bu bize tarih objesini verdi.
        System.out.println(mycurrentDate);//2023-03-21

        int monthValue= mycurrentDate.getMonthValue();
        System.out.println(monthValue);//3

        int yearValue=mycurrentDate.getYear();
        System.out.println(yearValue);//2023

        int dayValue=mycurrentDate.getDayOfMonth();
        System.out.println(dayValue);//21

        mycurrentDate.getMonth();//mycurrentDate benim objem, objem uzerinden methodu cagiriyorsam bu non static

        Month monthName=mycurrentDate.getMonth();
        System.out.println(monthName);//MARCH
        //Month bir enumdur

        DayOfWeek dayName=mycurrentDate.getDayOfWeek();
        System.out.println(dayName);//TUESDAY, bu bir String olmadigi icin basa String yazinca uyardi. Tuesday bir
        //DayOfWeek dir, enumdur. Basa DayOfWeek yazinca uyari vermedi

        System.out.println(mycurrentDate.plusDays(13));//2023-04-03
        System.out.println(mycurrentDate.plusDays(13).plusMonths(1).plusYears(2));

     //2025-05-03

        System.out.println(mycurrentDate.minusYears(2).minusMonths(1).minusDays(13));

     //2021-02-08

                LocalDate date1=LocalDate.of(1980,8,10);
                LocalDate date2=LocalDate.of(1985,7,19);
        System.out.println(date1.equals(date2));//false
        System.out.println(date1.isBefore(date2));//true
        System.out.println(date2.isAfter(date1));//true

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz
        //          Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" mesaji veriniz

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter year, month, and day numbers in the given order");
          int year= input.nextInt();
          int month=input.nextInt();
          int day= input.nextInt();

          LocalDate givenDate=LocalDate.of(year,month,day);

          if(givenDate.isBefore(LocalDate.now())) {
              System.out.println("Gecersiz tarih girdiniz");
          }else{
              System.out.println("Zamani girebilirsiniz");
          }
        //Please enter year, month, and day numbers in the given order
        //
        //2023 3 24
        //Zamani girebilirsiniz

        //Please enter year, month, and day numbers in the given order
        //
        //1977 2 19
        //Gecersiz tarih girdiniz.
        System.out.println();
        System.out.println("givenDate.lengthOfMonth(3) = " + givenDate.lengthOfMonth());
        //lengthOfMonth()yanina
        //. koyunca sout ve soutv gorundu, ona tiklayinca sout calisilacak sekle girdi.
        //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz
        System.out.println("Please enter year, month, and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();
        LocalDate date = LocalDate.of(y, m, d);
        System.out.println(date.getDayOfWeek());


    }

}
