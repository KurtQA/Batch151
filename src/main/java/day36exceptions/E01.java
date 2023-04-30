package day36exceptions;

/*


        1)Run Button'una bastiktan sonra console'da alinan Exception'lara "Runtime Exception" denir.
          ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
          "Runtime Exception" a ornektir.
          "Runtime Exception" lara "Unchecked Exception" da denir.

        2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lar da vardir, bunlara "Compile Time Exception" denir.
          FileNotFoundException, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception" lara "Checked Exception" da denir.

        3)FileNotFoundException: Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve "dosyanin varligi" konusunda
                                 hata olusursa ne yapmasi gerektigini soylemenizi ister.

        4)IOException: "IO" Input Output demektir.
                       Note: IOException, FileNotFoundException'in parent'idir.

        5)Java da hata'lar temelde 2 ye ayrilir.
            i)Exception'lar   ii)Error'lar: a)StackOverflow Error b)Out Of Memory Error  c)Virtual Machine Error


  Compile Time Exception:

  1)FileNotFoundException(Dosya bulunamadi hatasi)
  Javadan bir dosyayi bulmasini istediginizde java dosyanin adresi ve dosyanin varligi konusunda hata olusursa
  ne yapmasi gerektigini de soylemenizi ister.
  Ona ne yapmasini soylersek ayrica javayi bu dosyanin silinmedigi konusunda rahatlatmamiz gerekir.

  2)IOException(Input-Output)
  Bu exception input ve output ile ilgili tum problemleri handle edebilir. Application'imiza data girdisi
  yaptigimizda veya data ciktisi yapabiliriz. Dosyanin bulunmasi halinde oradaki datayi kullanabiliriz. Oyleyse
  dosyanin bulunmasi input ile alakali bir operasyondur. IOException bu nedenle FileNotFoundException'in
  parent'idir. Genel olan spesifik olanin parent'i olur. Bu durumda parent catch block'da ona gore sirasini alir.
  Coklu catch block yapmazsak, o zaman sadece IOExeption'i kullaniriz.

Learn Java earn money.
Java is OOP Language.
OOP has 4 principles
1)Inheritance
2)Polymorphism: i)Overloading   ii)Overriding
3)Encapsulation
4)Abstraction : i)Abstract Class    ii)Interface

 Overloading static polymorphismdir.

////


Javadan textfile'a gitmesi icin bir kod olusturduk:
FileInputStream fis= new FileInputStream()
Java TextFile kismina gelecek.
int i=0; while icerisinde i'ye fis.read()!=-1'i assign ettik. read methodunda ! yazarak java textfile icini
okuyamadigi surece while devam edecek. Sout parantezi icinde i'yi char'a cevirerek yazmasini istedik
(char)i

burada main method yanina normalde FileNotFoundException olmaliyken onun parent'i olan IOException throws
keywordu ile eklendi.
read methodu gelecek ilk character olan "L" yi alir. Aslinda characteri degil Ascii degerini alir.
L nin Ascii degeri 76 , while ici 76 aldi. 76 esit degil -1 diyoruz
Ifade dogru oldugu icin 76 yi char'a cevirecek ve buyuk L olarak yazdiracak.Bu sekilde devam eder.
Read methodu butun satirlar bittiginde -1 dondur. Ve sonuc olarak -1 esit degildir -1 diyecegi icin
Loop kirilir.


 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    public static void main(String[] args) throws IOException {
//1.Way: Exception'i mathod signature satirina ekledik
        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i = 0;

        while((i = fis.read())!=-1){
            System.out.print((char)i);
        }
        /*
Learn Java earn money.
Java is OOP Language.
OOP has 4 principles
1)Inheritance
2)Polymorphism: i)Overloading   ii)Overriding
3)Encapsulation
4)Abstraction : i)Abstract Class    ii)Interface

         */

    }

}

