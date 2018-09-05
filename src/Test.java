import java.util.Scanner;

public class Test
{
    // Method to move the numbers around - shell sort
    static void permute(int[] a, int k)
    {
        if (k == a.length)
        {
            for (int i = 0; i < a.length; i++)
            {
                System.out.print(" [" + a[i] + "] ");
            }
            System.out.println();
        }
        else
        {
            for (int i = k; i < a.length; i++)
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;

                permute(a, k + 1);

                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }

    // Generates correct number of lines based on a user input "n"
    static int factorial(int n)
    {
        if (n <= 1)
            return 1;

        return n;
    }

    public static void main(String args[])
    {
        // User input for "n"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of list: ");
        int n = sc.nextInt();
        int[] sequence = new int[n];

        // Begin timer for efficiency calculations
        long timeBefore = System.currentTimeMillis();

        // Populates array with each combo
        for (int i = 0; i < n; i++)
            sequence[i] = (factorial(i+1));

        // Displays numbers to be sorted
        System.out.println("The original sequence is: ");
        for (int i = 0; i < n; i++)
            System.out.print(sequence[i] + " ");

        // Lists all sorted lines
        System.out.println("\nThe permuted sequences are: ");
        permute(sequence, 0);

        // Ends timer for efficiency calculations
        long timeAfter = System.currentTimeMillis();

        // Time to compute output
        System.out.println("Computation time: " + (timeAfter - timeBefore) + "ms");

        // Ends program
        sc.close();
    }
}