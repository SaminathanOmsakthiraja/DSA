import java.util.Arrays;
import java.util.Scanner;

public class AssignSpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        int val = 1;
        while (top <= bottom && left <= right){
            for (int i = left; i <= right; i++){
                arr[top][i] = val++;
            }
            top++;
            for (int i = top; i <= bottom; i++){
                arr[i][right] = val++;
            }
            right--;
            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    arr[bottom][i] = val++;
                }
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    arr[i][left] = val++;
                }
                left++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        sc.close();
    }
    
}
