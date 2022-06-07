import java.util.*;

public class JustinCao_Week15_Exercise13_17 {

    public static void main(String args[]) {
        
        Complex numberOne, numberTwo;
        double fillOne;
        double fillTwo;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first complex number: ");
        fillOne = input.nextDouble();
        fillTwo = input.nextDouble();
        numberOne = new Complex(fillOne, fillTwo);

        System.out.print("Enter the second complex number: ");
        fillOne = input.nextDouble();
        fillTwo = input.nextDouble();
        numberTwo = new Complex(fillOne, fillTwo);

        System.out.println(numberOne.toString() + " + " + numberTwo.toString()
                + " = " + numberOne.add(numberTwo).toString());
        System.out.println();
        
        System.out.println(numberOne.toString() + " - " + numberTwo.toString()
                + " = " + numberOne.subtract(numberTwo).toString());
        System.out.println();
        
        System.out.println(numberOne.toString() + " * " + numberTwo.toString()
                + " = " + numberOne.multiply(numberTwo).toString());
        System.out.println();
        
        System.out.println(numberOne.toString() + " / " + numberTwo.toString()
                + " = " + numberOne.divide(numberTwo).toString());
        System.out.println();

        System.out.println("|" + numberOne.toString() + "| = "
                + numberOne.absolute());
    }
}