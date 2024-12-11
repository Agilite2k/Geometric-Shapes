import java.util.Scanner;

public class Circle extends Shape {

    private double radius;
    private double diameter;
    Scanner input = new Scanner(System.in);


    @Override
    public void CalculateArea(){

        System.out.println("Input the radius of the Circle: ");
        radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }

    @Override
    public void CalculateParameter(){

        System.out.println("Input the radius of the Circle: ");
        radius = input.nextDouble();

        double parameter = 2 * Math.PI * radius;

        System.out.println("Parameter of the Circle: " + parameter);
    }

}