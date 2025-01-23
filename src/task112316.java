import java.util.Scanner;
public class task112316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 1, bol = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        for (int i = 0; i < n; i++) {
            if (i != n-1 && arr[i] == arr[i+1]) {
                count++;
            }
            else {
                if (count == k) {
                    System.out.print(arr[i] + " ");
                    bol = 1;
                }
                count = 1;
            }
        }
        if (bol == 0) System.out.println(0);
    }
}

