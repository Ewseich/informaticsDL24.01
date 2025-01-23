import java.util.Scanner;
public class task112319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arrn = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int a = arr[i];
            while (a != 0) {
                sum += a % 10;
                a /= 10;
            }
            arrn[i] = sum;
        }

        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arrn[j] < arrn[j + 1]) {
                    int temp = arrn[j];
                    arrn[j] = arrn[j + 1];
                    arrn[j + 1] = temp;
                    temp = arr[j];
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