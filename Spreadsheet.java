import java.util.Scanner;

public class Spreadsheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int grandTotal = 0;
        int[] colSum = new int[n];

        for (int i = 0; i < n; i++) {
            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

                rowSum += arr[i][j];
                colSum[j] += arr[i][j];
            }

            grandTotal += rowSum;

            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");

            System.out.println(rowSum);
        }

        for (int x : colSum)
            System.out.print(x + "\t");

        System.out.println(grandTotal);
    }
}