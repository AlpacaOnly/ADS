import java.util.Scanner;

public class minOfFunction {
    public static void main(String[] args) {
        System.out.println(findMin(new Scanner(System.in)));
    }

    public static int findMin(Scanner scanner) {
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=scanner.nextInt();
        }
        int min=1;
        for(int i=1; i< arr.length; i++) {
            if (arr[i]<=min) arr[i]=min;
        }
        return min;
    }

}
