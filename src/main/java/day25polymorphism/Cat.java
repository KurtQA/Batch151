package day25polymorphism;

public class Cat extends Animal{
//Animal'in child'i olan Cat class'taki methodun access modifier'i parent'dakinden dar olamaz, onunla ayni olabilir
    //Ornegin parent class access modifier public, Cat de public olmali, protected yapamayiz.
    //Parent diyor ki move methodunu projenin her yerinde kullanabilirken child icinde daraltma yapamazsin
    //parent class daha dar bir access modifier ise, child'daki access modifier daha genis olabilir
    //ornegin parent protected, child public olabilir. Parent public iken, child public olabilir
    //parent public iken, child protected olamaz


    /*
    return type overriding de daraltilamiyor ve genisletilemiyor. Ayni olmali. Ornek buradan parent class'taki int
    parametreli methodu override yaparak cagirdik. Burada int data type'li methodun data type'ini degitiremedik, double
    ya da baska data type yapamadik.
    data type void oldugunda da child icinde degistirilemez
     */
    @Override
    public void move() {
        move();
        System.out.println("Cats move...");
    }



    @Override
    public int add(int a, int b) {
        return add(a, b);
    }

    @Override//Sagi tikla Generate'i tikla, overriding method kismini secip, oradan hangi method'u almak istersek
    //onu seciyoruz.
    public Cat create() {
        return new Cat();
    }
    /*
    Bir yukarida [parent classtan aldigimiz Animal create() methodunu buraya aldiktan sonra Cat create() olarak
    degistirdik. Hemen alt satirda return create()'i return new Cat() olarak degistirdik. Bunlari yapabiliriz
    Bu class'a ozgu degisiklik yaptik
    Return types parent'dan child'a gidilmisse degistirilebilir, child'dan parent'a gidersek return type degistirilemez
    Mesela Integer wrapper class ile Long wrapper class arasinda IS-A iliskisi yoktur, bu nedenle return type Integer
    oldugunda Long ile degistirilemez.
    Method'un return type'i "primitive" ise Overriding yapildiginda "return type" degistirilemez.
    Method'un return type'i "void" ise Overriding yapildiginda "return type" degistirilemez.

    Return Type Wrapper Class oldugunda overriding yaparken return type degistirilemez.
    Final methodlar Override edilemezler.
    Final methodlarin body'si degistirilemez, ama override ederken method body'i degistiririz. Java final methodlarin
    override edilmesine musaade etmez.
    Static methodlar override edilemezler
    private methodlar override edilemez.
     */

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }

}
