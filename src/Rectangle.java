import java.util.Scanner;

public class Rectangle extends Shape {

    Scanner input = new Scanner(System.in);

    private double length;
    private double width;


    @Override
    public void CalculateArea() {

        System.out.println("Input a length: ");
        length = input.nextDouble();

        System.out.println("Input a width: ");
        width = input.nextDouble();

        double area = length * width;
        System.out.println("Area of the Rectangle: " + area);
    }

    @Override
    public void CalculateParameter() {
        System.out.println("Input a length: ");
        length = input.nextDouble();

        System.out.println("Input a width: ");
        width = input.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
    }
}