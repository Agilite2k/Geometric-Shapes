import java.util.Scanner;
public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    private double base;
    private double height;
    Scanner input = new Scanner(System.in);

    @Override
    public void CalculateArea() {
        System.out.println("Input a height: ");
        height = input.nextDouble();

        System.out.println("Input a Base: ");
        base = input.nextDouble();

        double area = (height * base)/2;
        System.out.println("The Area of the Triangle: " + area);
    }

    @Override
    public void CalculateParameter(){

        System.out.println("Input a Side A: ");
        sideA = input.nextDouble();
        System.out.println("Input a Side B: ");
        sideB = input.nextDouble();
        System.out.println("Input a Side C: ");
        sideC = input.nextDouble();

        double parameter = sideA + sideB + sideC;

        System.out.println("The Parameter of the Triangle: " + parameter);
    }

}