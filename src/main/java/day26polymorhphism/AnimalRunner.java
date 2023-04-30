package day26polymorhphism;

public class AnimalRunner {

    public static void main(String[] args) {

        Cat myCat=new Cat();
        myCat.eat();//Animals eat (burada run'a bastik ve Animal class'indaki sout calisti. Icinde Animals eat yaziyordu.Parent class'da eat()
        //vardi, Cat class'inda yoktu. Biz eat()'unu bulunca yazdirdik.


    }


}
