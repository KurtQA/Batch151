package day37exceptionsenums;

/*
Kodumuz icinde else kisminda throw new yazarken ismini verdigimiz exception'i exceptionlar arasinda gorduk ve
sectik. Burada IllegalGradeException altinda kirmizi cizgi cikti. Bu cizgi uzerine gelince iki ihtimal gorduk ya
try catch'i sececegiz ya da main method yanina throws olarak exception'imiz atilir. Biz bu ikinci yolu sectik.

///
do {} icerisnde sout ile grade'i girmesini istedik. Grade 0 ve 100 arasi ise sonraki isleme gidilecek.
Kullanici 60, if statement'imiza uyan bir durum oldugu icin bu List'imize girecek. Daha sonra sirasiyla
grade olarak 70, 80 verdi ve bunlar da 0 ve 100 arasi oldugundan if icinde true olacak ve Liste eklenecekler.
Kullanici 123 verirse if icinde false olacak ve else bolumune gelecek, else bolumunde exception'imiz oldugundan
buradaki mesaji yazdiracak.
///
do{} icinde enter the grade mesajimizi kullanicidan integer degil de String alacak sekilde yaptik. Listlerimizi
String yaptik. Boyle olunca if statement icini String'e uygun bir sekle cevirmemiz gerekti. Integer wrapper
classina giderek valueOf () methodunu aldik ve grade'i Integer'a cevirmis olduk. Bu durumda if(intGrade>=)
&& intGrade<=100) olmasi sorun olmayacak. Kullanicinin girdigi 'q' degilse loop devam edecek. Do icindeki
String grade="";'in kizardigini gorunce orada bir scope hatasi oldugunu anlayarak, String'imizi do loop'unun
disina cikardik. Problemle karsilasinca cozmeye calisiriz. Baska bir problem olustu. If icinde intGrade'ler
kizardi. Yine scope problemi oldugunu anlayarak int intGrade=0;'a cevirerek scope disina cikardik.
Kodu calistirinca sirasiyla sayilar girdik.'q'ya varincaya kadar devam etti. 'q'ya baisnca list icine 'q'yu
dahil etti. Bunu engellemek icin kodumuzu gelistirdik. ilk if'imizi else kismina yerlestirdik. Ilk if icine
!grade.equals("q")'yu yazdik. Bu sayede 'q'ya basinca onceki sayilari liste ekledi ancak artik 'q'yu listte
gormedik.

////

Oncelikle bos bir List olusturduk. Sonra do while loop kullandik. Do icinde hicbir sart olmayinca sout'u
calistirinca kullanici mesaja gore gradeler girdi. If statement'imiza uyan gradeler icin true verecek, gradeler
kodumuza sayesinde integer olarak liste eklenecekler. Loop'umuz while condition'i dikkate alinarak devam edecek.
Sartimiz grade 'q'ya esit degilse. 'q'ya esit oldugunda artik false verir ve if statement'imiz altina ekledigimiz
break ile loop kirilacak.

Daha sonra exception alma senaryosunu dusunelim. Kullanici 123 verdi. 123 'q' degil, o zaman !grade.equals("q")
iceren if statement'imiza gore true olacak. Bu defa else kismina gelince exception atilir.

////






 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {

    public static void main(String[] args) {

    }
    //Example 1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz
    public static List<Integer> getGrades() throws IllegalGradeException {

        List<Integer> grades = new ArrayList<>();
        char ch = ' ';

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade.");
            Integer grade = input.nextInt();

            if(grade>=0 && grade<=100){
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

            System.out.println("To stop entering press q");
            ch = input.next().charAt(0);

        }while(ch!='q');

        return grades;
    }


}