import java.util.Scanner;
public class task1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean swapped = true;
        for (int i = 1; i < n - 1; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
                swapped = false;
            } arr[j + 1] = k;
            if (!swapped) {
                for (int l = 0; l < n; l++){
                    System.out.print(arr[l] + " ");
                }
                System.out.println();
            }
        }


    }
}
