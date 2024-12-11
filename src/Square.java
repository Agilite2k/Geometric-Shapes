import java.util.Scanner;

public class Square extends Shape {

    private double side;
    Scanner input = new Scanner(System.in);

    public void CalculateArea(){
        System.out.println("Input a side");
        side = input.nextDouble();

        double area = side * side;

        System.out.println("The Area of the Square: " + area);

    }

    public void CalculateParameter(){
        System.out.println("Input a side");
        side = input.nextDouble();

        double parameter = 4 * side;
        System.out.println("The Parameter of the square: " + parameter);
    }

}