package day25polymorphism;

public class Animal {

    public void move(){
        System.out.println("Animals move...");
    }
    public int add(int a, int b){
        return a+b;
    }

   public Animal create() {
       return new Animal();
   }
      //burada Animal objesi olusturuldu, Scanner'daki gibi (Scanner scan) kutu icine koymadik
       // onun yerine bunun sonucunu
       //return olarak ver diyoruz

    public Integer multiply(Integer a, Integer b){
        return a*b;
}
   public final double circleArea(double r){
        return 3.14*r*r;
   }
//final methodu override yapmaya calistik, olmadi. Generate ve sonrasinda override methodlar kisminda hic gorunmedi
    //Biz de bu methodu kopyalayip yapistirmaya hatta final yazisini silmeye calistigimiz halde uyari verdi.






}
