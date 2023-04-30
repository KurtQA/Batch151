package day24inheritancepolymonphism;

public class Toyota extends Car{

    public void hybrid(){
        System.out.println("Toyota uses hybrid engine...");
        //Bu class da move methodu yok, ancak parent'in icinde oldugundan kullanabilir.
        //default constructor gorunmez.

    }
    //constructorlar olusturulurken en son class'in } kalacak
    public Toyota (){
        System.out.println("Toyota constructor 1");//
    }

    public Toyota (String s){
        System.out.println("Toyota constructor 2");
    }
}
