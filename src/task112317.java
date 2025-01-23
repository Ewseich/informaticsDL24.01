import java.util.Scanner;
public class task112317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0, bol = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    for (int k = 0; k < n; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    count++;
                }

            }
            if (!swapped) break;


        }
        if (count == 0) {
            System.out.println(0);
        }
    }
}