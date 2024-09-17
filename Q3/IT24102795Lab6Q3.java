import java.util.Scanner;
public class IT24102795Lab6Q2C {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        int count = 0;
        int number;
        double sum =0;
        double rms;

        do
        {
            System.out.print("Enter a number : ");
            number = input.nextInt();

            if(number < 0 && number > -99 )
            {
                System.out.println("Invlaid Input. Please enter a positive integer or -99 to terminate");

            }
            else if(number == -99)
            {
                rms = Math.sqrt(sum / count);
                System.out.print("\n");
                System.out.println("The Root Mean Square (RMS) is : " + rms);
            }
            else
            {
                count = count + 1;
                sum = sum + number * number;
            }
        }while (number != -99);
    }
}
