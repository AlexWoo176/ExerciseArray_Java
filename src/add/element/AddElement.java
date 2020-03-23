package add.element;

import java.util.Scanner;

public class AddElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size array: ");
        int size =  sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter array["+i+"]: ");
            array[i]=sc.nextInt();
        }

        System.out.print("Enter a index: ");
        int index=sc.nextInt();
        System.out.print("Enter a value: ");
        int value = sc.nextInt();

        int[] result=new int[size+1];
        if(index<0 || index>size+1){
            System.out.print("Can't Insert");
        }
        else{
            for(int i=0;i<index;i++){
                result[i]=array[i];
            }
            result[index]=value;
            for (int i = index+1; i < size+1; i++) {
                result[i]=array[i-1];
            }
        }

        for(int x : result){
            System.out.print(x + " ");
        }
    }
}
