package Ass1;

import java.util.Scanner;

public class findAverage {
    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }

    public static double average(Scanner scanner) {
        int n = scanner.nextInt();
        double sum=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return sum/n;
    }
}
