package day18_constructorstatickeyword;


public class StaticNonStaticBlocks02 {



    public StaticNonStaticBlocks02(){
        System.out.println("I am constructor");
        System.out.println("Constructor 1");
    }

    public StaticNonStaticBlocks02(int price){

        System.out.println("Constructor 2");

    }
    public StaticNonStaticBlocks02(String name){

        System.out.println("Constructor 3");

    }

    public StaticNonStaticBlocks02(boolean isOld){

        System.out.println("Constructor 4");

    }
    //non-static block constructor'larda calistirlmasi gereken ortak kodlari icerir.
    //non-static bloc icine yazilan kodlar her constructor icin calistirilir.
    //Birden fazla non-static block varsa ustte olan once calsitirilir.

    {
        System.out.println("I am constructor");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks02 obj1=new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2=new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3=new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4=new StaticNonStaticBlocks02(false);

    }
    //result: I am constructor
    //I am constructor
    //Constructor 1
    //I am constructor
    //Constructor 2
    //I am constructor
    //Constructor 3
    //I am constructor
    //Constructor 4

}
