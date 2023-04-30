package day24datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {


    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-03-21T13:40:15.410179500
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd/yyyy * HH:mm");
        String formattedLdt = dtf.format(ldt);
        System.out.println(formattedLdt);//Mart/21/2023 * 13:47

    }
}
