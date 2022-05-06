package Ass1;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        findReverse(scanner,n,0);
    }

    private static void findReverse(Scanner scanner, int n, int i) {
        if(i==n) return;
        int x=scanner.nextInt();
        findReverse(scanner, n, i+1);
        System.out.println(x);
    }
}
