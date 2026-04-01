import java.util.*;

class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // assume square matrix
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++){
            int left = 0, right = n - 1;
            while (left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }

        // Print result
        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        sc.close();
    }
}