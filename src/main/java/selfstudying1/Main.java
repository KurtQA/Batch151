package selfstudying1;

import java.util.Scanner;

public class Main {

//    Ask user to their weight and height and type a program with calculates mass index
//* HINT : Body Mass Index = Weight (kg) / Square of height (m)
//    Then give a message to user as following:

//    If BMI is less than 18.5 , you re weak
//    If BMI is between 18.5 and 25 , your weight is ideal
//    If BMI is between 25 and 30, you re fat
//    If BMI is more than or equal to 30, obese
//    EXAMPLE :
//    INPUT:
//    Weight : 71
//    Height : 1.72
//    OUTPUT :
//    Your BMI is  : 23.99945916711736
//    Your weight is ideal

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilogram");
        double weight = input.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are weak.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Your weight is ideal.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }


    }
}

