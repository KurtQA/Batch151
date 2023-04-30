package day26polymorhphism;

public class Cat extends Animal {

    public void meow() {
        System.out.println("Cats meow");

    }

    @Override//bunu generate'den(override method) getirdik.
    public void drink() {
        //super.drink();//bu kisim otomatik olarak geldi
    }
     @Override//bunu elle yazdik
    public void eat() {
        System.out.println("Animals eat");//Biz bu method ve icindeki sout'u Animal class'indan kopyaladik
        //ve bu class icine yapistirdik. override yapmak istedik. @override koyarsak uzerine dogru yontemle
        //override yapildi mi onu kontrol ettirmis oluruz.


    }
}