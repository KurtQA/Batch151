package javaders.practicestringmanipulations;

public class C01_PracticeStringManipulations {


    public static void main(String[] args) {

   String tv="5.99$";
   String laptop="4.47$";
        String tv2=tv.replace("$","");
        String laptop2=laptop.replace("$","");
        System.out.println(laptop.replace("$",""));
        Double totalPrice= Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);
        String ressam="Ali Erdem Kurt";
          String ressam1= ressam.substring(0,10);
        System.out.println(ressam1);

        String str = "Java programming is fun and challenging";
        int index = str.lastIndexOf("ing");
        System.out.println(index); // Output: 17






    }

}
