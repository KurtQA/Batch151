package day24datetime;


import java.time.LocalDate;
        import java.time.LocalTime;
        import java.time.ZoneId;
        import java.time.format.DateTimeFormatter;
public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//12:35:59.503894200
        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);//12
        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//35
        int second = myCurrentTime.getSecond();
        System.out.println(second);//18
        int nano = myCurrentTime.getNano();
        System.out.println(nano);//54699200
        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(10).minusHours(1);
        System.out.println(next);
        //Zaman formati nasil degistirilir?
        // DateTimeFormatter.ofPattern() methodu kullanilarak degistirebiliriz
        /* DateTime Class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi AM, PM gösterilmez
        hh : mm a ==> 12 li saat sistemi AM, PM
        hh : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        mm minute demektir, MM month demektir
        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August
         */
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh : mm : ss a");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//13:02
        LocalDate myCurrentDate = LocalDate.of(2023, 8, 25);
        System.out.println(myCurrentDate);//2023-08-25
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);//08-25-2023
        //Tarihi Gun / Ay isminin ilk 3 harfi verecek sekle ceviriniz 25/Aug/23
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);//25/Ağu/23
        //Tarihi 25/August/2023 sekline ceviriniz
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd ? MMMM * yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);//25/Ağustos/2023
        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
        //Tokyo'da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2023-03-21
        //Amsterdam'da ayin kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2023-03-21
        //Tokyo'da saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//19:36:38.317506800
    }
}