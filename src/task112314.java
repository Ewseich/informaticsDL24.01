import java.util.Scanner;
public class task112314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int min3 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i] <= min1) {
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] <= min2 && arr[i] != min1) {
                min3 = min2;
                min2 = arr[i];

            }
            else if (arr[i] < min3 && arr[i] != min1 && arr[i] != min2) {
                min3 = arr[i];
            }
        }
        int third = 0;
        if (n == 1) System.out.println(Math.min(min1, min2));
        else if (n == 2) System.out.println(Math.min(min1, min2));
        else{
            System.out.print(min1 + " " + min2 + " " + min3 + " ");
            for (int i = 0; i < n; i++){
                if (arr[i] == min1 && third < 3 ) {
                    min1 = Integer.MAX_VALUE;
                    third++;
                    continue;
                }
                else if ((arr[i] == min2) && third < 3 ) {
                    min2 = Integer.MAX_VALUE;
                    third++;
                    continue;
                }
                else if ((arr[i] == min3) && third < 3 ) {
                    min3 = Integer.MAX_VALUE;
                    third++;
                    continue;
                }
                System.out.print(arr[i] + " ");
            }
        }



    }
}