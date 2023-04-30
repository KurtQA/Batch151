package day23inheritance;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat c1 = new Cat();//Bir object olusturduk.

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1= new Dog();
        d1.eat();
        d1.drink();
        d1.bark();

        Bird b1=new Bird();

        b1.eat();
        b1.drink();
        b1.tweet();

        //Buraya dog ve bird ile ilgili ornek b1.eat(); yazdigimizda hata verdi cunku biz dog ve bird classlarina gidib bu classlari
        //Animal class'inin cocugu yapmadik. Bunun uzerine AnimalRunner class'indan bird ve dog classlarina giderek class isimlerine
        //extend Animal ekledik.

    }
}
