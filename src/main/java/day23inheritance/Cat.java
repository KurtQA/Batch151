package day23inheritance;

public class Cat extends Animal {

    //Basta class ismi public class Cat idi. Ancak Animal class'tan methodlari kullanabilsin diye
    //Cat class'ini Animal class'in cocugu yaptik extends ve Animal yazarak boyle yaptik.

    public void meow(){
        System.out.println("Cats meow...");
    }
}
