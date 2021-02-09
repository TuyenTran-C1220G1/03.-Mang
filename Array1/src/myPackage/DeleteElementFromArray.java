package myPackage;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static int[] inputArray() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.printf("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Element in array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner scanner = new Scanner(System.in);
        int x;
        int index=0;
        System.out.println("Enter element, which you want to delete: ");
        x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != x) {
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println("Element in array after delete: ");
        for (int j = 0; j < index; j++) {
            System.out.print(arr[j] + "\t");
        }
    }
}
