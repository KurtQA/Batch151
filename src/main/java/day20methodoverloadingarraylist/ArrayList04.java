package day20methodoverloadingarraylist;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class ArrayList04 {


        public static void main(String[] args) {

            //Icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
            LocalDate myCurrentDate = LocalDate.now();
            System.out.println(myCurrentDate);// 2023-03-15

            //Tarih'ten istedigimiz bileseni nasil aliriz?
            int monthValue = myCurrentDate.getMonthValue();
            System.out.println(monthValue);//3

            int yearValue = myCurrentDate.getYear();
            System.out.println(yearValue);// 2023

            int dayValue = myCurrentDate.getDayOfMonth();
            System.out.println(dayValue);//15

            //Asagidaki "Month" bir Enum'dir.
            //Enum, Java'da sabit degerleri(Ay isimleri, Gun isimleri, Ulkedeki sehir isimleri, Samanyolu Galaksisindeki gezegen isimleri)
            //depolamak icin kullanilir.
            Month monthName = myCurrentDate.getMonth();
            System.out.println(monthName);// MARCH

            //Asagidaki "DayOfWeek" bir Enum'dir.
            DayOfWeek dayName = myCurrentDate.getDayOfWeek();
            System.out.println(dayName);//WEDNESDAY

            //Ileriki tarihe nasil gidilir?
            System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));// 2027-05-20

            //Gecmis tarihe nasil gidilir?
            System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));// 1992-12-28

            //Specific bir tarih objesi nasil olusturulur?
            LocalDate gokhanDob = LocalDate.of(1986, 6, 10);
            LocalDate fatihDob = LocalDate.of(1985, 2, 25);

            //Bir tarihin bir tarih'ten sonra olup olmadigi nasil kontrol edilir?
            boolean r1 = gokhanDob.isAfter(fatihDob);
            System.out.println(r1);//true

            //Bir tarihin bir tarih'ten once olup olmadigi nasil kontrol edilir?
            boolean r2 = fatihDob.isBefore(gokhanDob);
            System.out.println(r2);// true

            //Bir tarihin bir tarih'e esit olup olmadigi nasil kontrol edilir?
            boolean r3 = gokhanDob.isEqual(fatihDob);
            System.out.println(r3);// false

            //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
            //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter year, month, and day numbers in the given order");
            int year = input.nextInt();
            int month = input.nextInt();
            int day = input.nextInt();

            LocalDate givenDate = LocalDate.of(year, month, day);

            if(givenDate.isBefore(LocalDate.now())){
                System.out.println(givenDate + " invalid date");
            }else{
                System.out.println("Enter time for the ticket");
            }


            int lengthOfMonth = myCurrentDate.lengthOfMonth();
            System.out.println(lengthOfMonth);

            //Example 2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
            System.out.println("Please enter year, month, and day numbers in the given order");
            int y = input.nextInt();
            int m = input.nextInt();
            int d = input.nextInt();

            LocalDate date = LocalDate.of(y, m, d);

            System.out.println(date.getDayOfWeek());
        }

    }

