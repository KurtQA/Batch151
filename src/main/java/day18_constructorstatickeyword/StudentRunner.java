package day18_constructorstatickeyword;

import java.util.Arrays;

public class StudentRunner {

    public static void main(String[] args) {
        System.out.println(Student.numOfRegisteredStd);//0
        //sadece class'in ismini yazarsak ve nokta koyarsak
        //sadece static olanlari goruruz, ornegin numOfRegisteredStd
        //gorunur ve onu alabiliriz.
        //object ile baktigimizda static olmayanlari
        //class ile baktigimizda static olanlari goruruz.

        //static olamayan num variable'ini cagirmak icin object olusturduk
        Student s1=new Student();
        System.out.println(s1.num);
        //static olan numOfRegisteredStd variable'ina object uzerinden de
        //ulasabiliriz ama bu hatadir.
        //Arrays.sort(); statictir, String. yazinca staticler cikiyor


    }
}
