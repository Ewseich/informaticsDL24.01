import java.util.Scanner;
public class task1446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrnum = new int[n];
        for (int i = 0; i < n; i++) {
            arrnum[i] = sc.nextInt();
            arr[i] = sc.nextInt();
        }
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    temp = arrnum[j];
                    arrnum[j] = arrnum[j + 1];
                    arrnum[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arrnum[j] > arrnum[j + 1] && arr[j] == arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    temp = arrnum[j];
                    arrnum[j] = arrnum[j + 1];
                    arrnum[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (int i = 0; i < n; i++) {

            System.out.println(arrnum[i] + " " + arr[i]);
        }

    }
}