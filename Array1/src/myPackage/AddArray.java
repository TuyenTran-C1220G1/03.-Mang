package myPackage;

public class AddArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 0, 9};
        int[] sumArr = new int[arr1.length + arr2.length];
        int i;
        for (i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            sumArr[i++] = arr2[j];
        }
        for (int element : sumArr) {
            System.out.print(element + "\t");
        }
    }
}
