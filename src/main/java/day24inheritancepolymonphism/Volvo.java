package day24inheritancepolymonphism;


public class Volvo extends Car {

    public void secure() {
        System.out.println("Volvo is the most secure car in the world...");

    }

    @Override // Bu bir "annotation" dir. Override yapma kurallarini kontrol eder.
    //sagi tiklayinca generate altinda override gorunuyor.
    //Classin yan stununda mavi bir yuvarlak var, ona tiklayinca parent'a gidilebiliyor ve oradan buraya gelinebilir.
    public void move() {
        System.out.println("Volvo moves...");
    }

    @Override
    public void engine() {
    }
//@Override bu bir annotation dir. Override yapma kurallari kontrol eder.

    //super.move();//sagi tikladik generate'in altinda overriding kismi tiklaninca classtaki methodlar gorundu

}

