import java.util.Scanner;
public class IT24102795Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        double square, squareRoot, sqrt;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        System.out.print("\n");

        square = num * num;
        squareRoot = Math.sqrt(num);

        System.out.println("Square of " + num + "is :" + square);
        System.out.print("SquareRoot of " + num + "is :" + squareRoot);
    }
}