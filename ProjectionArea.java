import java.util.*;

public class ProjectionArea {
    public static int projectionArea(int[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++){
            int row_max = 0, col_max = 0;
            for (int j = 0; j < grid.length; j++){
                if (grid[i][j] > 0) total++;
                row_max = Math.max(row_max, grid[i][j]);
                col_max = Math.max(col_max, grid[j][i]);
            }
            total += row_max;
            total += col_max;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] nums =  new int[size][size];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        System.out.println(projectionArea(nums));

        sc.close();
    }
}