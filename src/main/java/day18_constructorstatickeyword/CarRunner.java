package day18_constructorstatickeyword;

public class CarRunner {

    public static void main(String[] args) {

        //CarRunner class icinde main method yazdik. Buradaki main method gider diger classlardaki main method
        //islevi gorur.
        //Car classi bize istedigimizde Honda ya da baska marka model bir araba uretebilecek durumda olacak



            Car c1 = new Car();
            Car c2 = new Car("Toyota","Corolla", 2022, 45000);
            Car c3 = new Car("Audi", "R8", 2023, 50000);
            Car c4 = new Car("BMW");

        }
    }
