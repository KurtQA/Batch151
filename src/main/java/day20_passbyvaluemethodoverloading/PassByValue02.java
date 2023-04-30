package day20_passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {


        String name= "Tom Hanks";
           String newName=updateName(name,"ali");
        System.out.println(newName);//Tom Hanks ali
        System.out.println(name);//Tom Hanks
        name=updateName(name,"senior");//bu kisimda tekrar ismi desistiriyoruz
        System.out.println(name);//Tom Hanks senior
    }
    public static String updateName(String name, String add){
        name=name+ " " +add;
       return name;
    }
}

