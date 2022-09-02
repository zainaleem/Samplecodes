import java.util.Scanner;

public class Swap {

    public static void main(String args[]){

        String temp;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        String num1 = in.nextLine();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Enter the 2nd number: ");
        String num2 = in.nextLine();

        System.out.println("Before swapping 1st num is "+num1+" and 2nd num is "+num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping 1st number is "+num1+" and 2nd num is "+num2);


    }


}
