import java.util.Scanner;
public class task112321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            int j = i, x = arr[i];
            while (j>0 && x < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = x;
        }
        boolean swapped;
        for (int i = n/2; i < n - 1; i++) {
            swapped = false;
            for (int j = n/2; j < n - 1 - i + n/2; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
