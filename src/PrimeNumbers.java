// 3. WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.

import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N : ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum of prime numbers from 1 to " + n + " is: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i != 0) {
                return false;
            }
        }
        return true;
    }
}