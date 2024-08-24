//4.WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.
import java.util.Scanner;

public class SumOfEvenNumbers {
    public  static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("The sum of even numbers is: " + sum);
    }
}