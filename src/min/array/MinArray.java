package min.array;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE;
        System.out.print("Enter size array: ");
        SIZE = scanner.nextInt();
        int [] array = new int[SIZE];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        int minArray = 0;
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minArray]) {
                minArray = i;
                index = i;
            }
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Largest value is " + array[minArray]);
        System.out.println("Position largest value is " + index );
    }
}
