import java.util.Scanner;

public class task112326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), nlen = 0;
        int[] arr = new int[n];
        int[] arrn = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                arrn[nlen] = arr[i];
                nlen++;
            }
        }
        boolean swapped;
        for (int i = 0; i < nlen; i++) {
            swapped = false;
            for (int j = 0; j < nlen - 1 - i; j++) {
                if (arrn[j] > arrn[j+1]) {
                    int temp = arrn[j];
                    arrn[j] = arrn[j + 1];
                    arrn[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        nlen = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arrn[nlen];
                nlen++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}