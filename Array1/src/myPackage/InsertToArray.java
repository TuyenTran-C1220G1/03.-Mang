package myPackage;

import java.util.Scanner;

import static myPackage.DeleteElementFromArray.inputArray;

public class InsertToArray {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter position to insert:");
        int index = scanner.nextInt();

        System.out.println(" Enter element to insert:");
        int x = scanner.nextInt();

        if (index <= -1 || index > arr.length - 1) {
            System.out.println("can not insert element to array");
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
        }
    }
}

