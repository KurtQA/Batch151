package day22stringbuilder;

import day23inheritance.Animal;
import day23inheritance.Cat;

public class StudentRunner extends Animal {

    public static void main(String[] args) {
    //Student Class'ina sadece Student yazinca ulasamadik, cunku
       // public String stdName= "Ali Can"; static degildi.
        //Bunun icin object olusturmamiz gerekti. Asagidaki obje
        //ile ulasabiliriz.
        Student std1 =new Student();
        System.out.println();

        Cat c2= new Cat();//Bunu yazinca Cat kisimlari kizardi. Basinca uzerine import yapti.
        // Ayrica extends Animal'i StudentRunner'a ekleyerek Animal'in child'i yaptik.




    }
}
