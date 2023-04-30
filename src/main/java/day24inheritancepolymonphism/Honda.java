package day24inheritancepolymonphism;

public class Honda extends Car{

    public void eco(){

        System.out.println("Honda engines are so economic");
    }

    public String model="Civic";
    public int price=20000;

    public Honda(){
        System.out.println(this.model);//Ayni classtaki ilgili model variable'ini bul ve calistir demek
        System.out.println(super.model);//Parent'a git oradaki ilgili model variable'i bul ve calistir demek
    }

}
