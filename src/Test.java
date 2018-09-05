//This is a java program to perform all permutation of given list of numbers of a specific length
import java.util.Scanner;

public class Test
{

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

    static int factorial(int n)
    {
        if (n <= 1)
            return 1;

        return n;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of list: ");
        int n = sc.nextInt();
        int[] sequence = new int[n];

        long timeBefore = System.currentTimeMillis();

        for (int i = 0; i < n; i++)
            sequence[i] = (factorial(i+1));

        System.out.println("The original sequence is: ");
        for (int i = 0; i < n; i++)
            System.out.print(sequence[i] + " ");


        System.out.println("\nThe permuted sequences are: ");
        permute(sequence, 0);

        long timeAfter = System.currentTimeMillis();
        System.out.println("Computation time: " + (timeAfter - timeBefore) + "ms");

        sc.close();
    }
}