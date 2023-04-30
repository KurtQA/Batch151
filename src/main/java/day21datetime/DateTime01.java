package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {


    public static void main(String[] args) {

        //Anlik zamani nasil aliriz?

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//21:04:33.198675600

        //Anlik zamanda bilesenler nasil alinir?

        int hour = myCurrentTime.getHour();
        System.out.println(hour);//21

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//6

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano=myCurrentTime.getNano();
        System.out.println(nano);


        //Gelecek ve gecmis zamana gidilir
        LocalTime next= myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //Zaman formati nasil degistirilir?

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm");
        //24 luk saat dilimi yerine 12 lik saat dilimi kullanilirsa hh:mm yazilir
        //HH:mm am ya da pm yazilir ayrica
        //HH.mm.ss olursa saniyeyi gosterir.
        String formattedMyCurrentTime=dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degistirilir
        LocalDate myCurrentDate= LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25


        //Tarihi Ay/Gun/Yil sekline ceviriniz.
        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate1=dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate1); //08/25/2022


        //Tarihi Gun/Ay ismi sekline ceviriniz. 25/August/2022
       //Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz. 25/Aug/22
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2  = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);// 25/Aug/22

        //Tarihi Gun/Ay ismi/Yil sekline ceviriniz. 25/August/2022
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //Tokya'da ayin kaci?
        LocalDate  dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-17

        //Tashkent'te ayin kaci?
        LocalDate  dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTashkent);// 2023-03-16

        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);// 03:50:06.866277

        //Berlin'de saat kac?
        LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(timeInBerlin);//19:52:19.433288
    }
}




