//1.WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA


import java.util.ArrayList;
import java.util.Scanner;



public class Largest {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.print("Enter your length:");
        int length = input.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.print("Enter your number " + i);
            int num = input.nextInt();
            numList.add(num);
        }
        int largest = 0;
        for (int i = 0; i < length; i++) {
            if (largest < numList.get(i)) {
                largest = numList.get(i);
            }
        }

        System.out.print("largest number: " + largest);
    }
}
