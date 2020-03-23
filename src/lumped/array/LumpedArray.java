package lumped.array;

import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size Array 1: ");
        int sizeOne = scanner.nextInt();
        System.out.print("Enter size Array 2: ");
        int sizeTwo = scanner.nextInt();
        int[] listArrayOne = new int[sizeOne];
        int[] listArrayTwo = new int[sizeTwo];
        int[] listArrayThree = new int[listArrayOne.length + listArrayTwo.length];

        System.out.println("Array with size one: ");
            for (int i = 0; i < sizeOne; i++) {
                listArrayOne[i] = (int) Math.floor(Math.random()*1000);
            }
            for (int i = 0; i < sizeOne; i++) {
                System.out.println(listArrayOne[i] + " ");
            }

        System.out.println("Array with size two: ");
        for (int i = 0; i < sizeTwo; i++) {
            listArrayTwo[i] = (int) Math.floor(Math.random()*1000);
        }
        for (int i = 0; i < sizeTwo; i++) {
            System.out.println(listArrayTwo[i] + " ");
        }

        System.out.print("Array after lumped array one & two: ");
        for (int i = 0; i < listArrayOne.length ; i++) {
            listArrayThree[i] = listArrayOne[i];
        }

        for (int i = listArrayOne.length; i < listArrayThree.length  ; i++) {
            listArrayThree[i] = listArrayTwo[i - listArrayOne.length];
        }
        for (int x : listArrayThree)
            System.out.print(x + " ");

    }
}
