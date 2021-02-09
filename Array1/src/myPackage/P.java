package myPackage;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of prime number: ");
        int number = sc.nextInt();
        int count = 0;
        int  N = 2;
        boolean check = true;
        while (count < number) {
            for (int i=2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                } else check=true;
            }
            if (check) {
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
