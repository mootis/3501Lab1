import java.util.Scanner;

public class Main {

    // Method for factorial

    static double factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {

        // User input for n

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.close();

        long timeBefore = System.currentTimeMillis();

        /*
        Factorial using loop - Did not behave correctly

        int i, fact = 1;
        // int number = 5;
        for(i = 1; i <= n; i++){
            fact = fact*i;
        }

        System.out.println("Factorial of " + n +" is: " + fact);
        */

        // Factorial using recursion

        double fact;
        fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);

        System.out.println("See below");

        int i;
        int factorialSet[];

        for(i = 1; i <= factorial(n); i++){

            System.out.println(i);
/*
            while (i <= n){
                factorialSet = new int[n];
                factorialSet[i] = n;
            }

            System.out.println(factorialSet);
*/
        }

        long timeAfter = System.currentTimeMillis();
        System.out.println("Computation time: " + (timeAfter - timeBefore) + "ms");

        /*
        Testing

        System.out.println(timeBefore);
        System.out.println(timeAfter);

        */

    }

}