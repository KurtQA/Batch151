package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Ex)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
        /*
                  A
                 A A
                A A A
         */
        Scanner input = new Scanner(System.in);
        //input yerine scan ya da istedigimiz ismi yazabilirdik. Genelde input ya da scan yaziliyor
        System.out.println("Lutfen bir karakter veriniz");

        char ch = input.next().charAt(0);//zeynep
        //niye zeynep yazdik, char yazdiginiz yazinin ilk karakterini yani 'z'yi alacak
        //charAt(0) icine 0 yazmamiz, kelimenin ilk harfini almamizi sagliyor
        //java indexteki ilk harfi sifir sayar, ikinci harf birdir, ucuncu harf ikidir
        //data alip ch konteyner'ina yerlestirmek icin once next().yazdik
        //nokta koyar koymaz charAt()'i bulduk ve icine 0 koyduk, sonuna ; ekledik
        System.out.println("  " + ch + "  ");
        System.out.println(" " + ch + " " + ch + " ");
        System.out.println(ch + " " + ch + " " + ch);

        //  /t aralarinda bir tab bosluk birakarak ayni sekli tek sout ile yazalim
        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +"\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);



    }
}
