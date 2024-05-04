import java.util.Scanner;

class RectangleDriver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        System.out.println("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        Rectangle myRectangle = new Rectangle(width, height);

        System.out.println("Rectangle dimensions:");
        System.out.printf("Width: %.2f\n", myRectangle.getWidth());
        System.out.printf("Height: %.2f\n", myRectangle.getHeight());
        System.out.printf("Area: %.2f\n", myRectangle.calculateArea());

        input.close();
    }
}