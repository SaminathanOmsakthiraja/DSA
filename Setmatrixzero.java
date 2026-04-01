import java.util.*;

public class Setmatrixzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        boolean[] rows = new boolean[row];
        boolean[] cols = new boolean[col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (arr[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (rows[i] || cols[j]){
                    arr[i][j] = 0;
                }
            }
        }

       for (int i = 0; i < row; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        sc.close();
    }
}