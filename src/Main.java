import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();
        shapes[3] = new Square();
        Boolean looping = true;

        while (looping) {
            try {
                System.out.println("-----=Welcome to Geometric Shape=----\n" +
                        "\t--Choose your desired Shape--\n");
                System.out.println("[1] \tCircle\n" +
                        "[2] \tRectangle\n" +
                        "[3] \tTriangle\n" +
                        "[4] \tSquare \n" + " \t[5] Exit \n");

                int choice = input.nextInt();


                int selection;

                switch (choice) {
                    case 1:
                        System.out.println("OPERATOR: \n" + "[1] Calculate Area\n" + "[2]Calculate Parameter\n");
                        selection = input.nextInt();

                        switch (selection) {
                            case 1:
                                shapes[0].CalculateArea();
                                break;
                            case 2:
                                shapes[0].CalculateParameter();
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("OPERATOR: \n" + "[1] Calculate Area\n" + "[2]Calculate Parameter\n");
                        selection = input.nextInt();

                        switch (selection) {
                            case 1:
                                shapes[1].CalculateArea();
                                break;
                            case 2:
                                shapes[1].CalculateParameter();
                                break;
                        }
                        break;

                    case 3:

                        System.out.println("OPERATOR: \n" + "[1] Calculate Area\n" + "[2]Calculate Parameter\n");
                        selection = input.nextInt();

                        switch (selection) {
                            case 1:
                                shapes[2].CalculateArea();
                                break;
                            case 2:
                                shapes[2].CalculateParameter();
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("OPERATOR: \n" + "[1] Calculate Area\n" + "[2]Calculate Parameter\n");
                        selection = input.nextInt();

                        switch (selection) {
                            case 1:
                                shapes[3].CalculateArea();
                                break;
                            case 2:
                                shapes[3].CalculateParameter();
                                break;
                        }
                        break;

                    case 5:
                        System.out.println("Thank you!");
                        return;

                    default:
                        System.out.println("Error!");

                }

            } catch (Exception e) {
                System.out.println("Error, please try again.");
                input.nextLine();
            }

        }

    }
}