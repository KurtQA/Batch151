package javaders;

import java.util.Scanner;

public class PrintPrintln {

    public static void main(String[] args) {

        //"TECHPRO EDUCATION" yazisini yukaridan asagiya harf harf yazdiriniz

        // 1. YOL CTRL+D ile asagidaki bir satiri cogaltabiliriz
        System.out.println("*********** 1. Yol *********");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println(" ");
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");

        //"TECHPRO EDUCATION" yazisini tek bir sout ile yukaridan asagiya harf harf yazdiriniz
        System.out.println("************ 2. Yol *********");
        System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
        // '\n' harfler arasina bosluk birakti her harfi bir digerinin altina yazdirdi
        //iki kelime arasinda ayrica bosluk almak icin techpro sonrasinda iki '\n' ekledik

        /*JAVA ILE GUZEL DUNYA cumlesinin her kelimesini alt satira yazdiran
        kodu bir sout ile yazdiriniz

         */
        System.out.println("JAVA\nILE\nGUZEL\nDUNYA");
        //Bu defa her harf degil her kelime arasina '\n' ekledik

        //JAVA ILE GUZEL DUNYA cumlesinin her kelimesini bir tab bosluk birakarak yazin
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");
        //'\t' bize '\n' e gore daha fazla bosluk veriyor kelimeler arasi
        //bazen her kelime arasi sabit bosluklar isteyebilirler, o zaman '\t' kullaniriz

        //"Techpro " ile java cok ' kolay '
        //tek bir sout ile yazdiran kodu yaziniz
        System.out.println("Techpro ile java cok kolay");
        System.out.println("\"Techpro  \" ile java cok kolay");
        //"Techpro " ile java cok ' kolay ' bu yazidaki " tirnagi gorebilmek icin
        //'\"' ekledik gormek istedigimiz yere, komutta oldugu gibi
        //tek tirnagi eklerken yazidaki bosluklara dikkat ettik, bosluk varsa bosluk biraktik
        //biz iki yere '\"' ekledik Techpro kelimesi oncesi ve sonrasinda
        //eger Techpro baslarken ve sonunda " koysaydik, Java String'in bittigini algiliyor


        //" MAHARET"  hic 'DUSMEMEK'  degil;


        //  "Her dustugunde kalkabilmektir"

        //SEKLINDE NOKTALI VIRGULDEN SONRA
        //3 SATIR ALTTAN paragraf basi yaparak yazdiran kodu tek bir sout da olusturunuz
        System.out.println("\" MAHARET\"  hic 'DUSMEMEK'  degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");
        //Print ile Println arasindaki fark
        System.out.println("Hayat Techpro ile cok guzel");
        System.out.println("Ama nasil baktiginiza bagli");
        System.out.print("Yeterki siz isteyin");
        System.out.println(" Zeynep");
        //Zeynep yazarken bir bosluk biraktik alta yazilirken onceki kelimeye bitisik cikmasin diye
        //cunku println degil print kullandik


        /*
        \n ==> her bir characteri bir alt satirda yazdirir
        \t ==> 1 tab bosluk birakir
        \" ==> consolda " yazdirmayi saglar


         */
                // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
                // bir harf  bir alt satirda olacak sekilde yazdiriniz

                //1 Yol
                //ctrl +d ==> windows
                // cmd +d ==> mac
                System.out.println("**********1 .YOL ********************");
                System.out.println("T");
                System.out.println("E");
                System.out.println("C");
                System.out.println("H");
                System.out.println("P");
                System.out.println("R");
                System.out.println("O");
                System.out.println(" ");//HICLIKTE OLUR
                System.out.println("E");
                System.out.println("D");
                System.out.println("U");
                System.out.println("C");
                System.out.println("A");
                System.out.println("T");
                System.out.println("I");
                System.out.println("O");
                System.out.println("N");
                System.out.println("********** 2 .YOL ********************");
                // 2 Yol
                // "TECHPRO EDUCATION" yazisini yukaridan asagiya her
                // bir harf  bir alt satira gelecek sekilde tek bir sout ile yazdiriniz

                System.out.println("T\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");
                // JAVA ILE GUZEL DUNYA cumlesinin her bir kelimesini alt satirda
                // yazdiran kodu tek bir sout ile yaziniz

                System.out.println("JAVA\nILE\nGUZEL\nDUNYA");
                // JAVA ILE GUZEL DUNYA ifadesinin her bir kelime arasinda 1 tab bosluk birakan
                //  kodu yaziniz
                // JAVA I     ==> 1 SPACE BOSLUK
                // JAVA   I   ==> 1 TAB BOSLUK

                System.out.println("JAVAM\tILEMM\tGUZEL\tDUNYA");// \t de harf sayisi onemlidi yoksa esit aralik birakmaz
                // bu nedenle her kelimeyi 5 harfe tamamladik

                // "Techpro " ile java cok ' kolay '
                // tek bir sout ile yazdiran kodu yaziniz

                System.out.println("\"Techpro \" ile java cok ' kolay '");
                //" MAHARET" hic 'DUSMEMEK' degil;


                //  "Her dustugunde kalkabilmektir"

                //SEKLINDE NOKTALI VIRGULDEN SONRA
                // 3 SATIR ALTTAN paragraf basi yaparak tek
                // bir sout ile yazdiran kodu olusturunuz

                System.out.println("\" MAHARET\" hic " +
                        "'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");
                //  Print ile Println arasindaki farklar
                // ln ==> line next bir sonraki satira gec

                System.out.println("**************** 1 *****************");
                System.out.print("Ali");
                System.out.println("Can");
                //AliCan yazdirir
                System.out.println("**************** 2 *****************");
                System.out.println("Ali");
                System.out.print("Can");
                //Ali
                //Can  yazdirir

                System.out.println("**************** 3 *****************");
                System.out.print("Ali");
                System.out.println("Can");
                //Can**************** 3 *****************
                //AliCan



            }

        }


