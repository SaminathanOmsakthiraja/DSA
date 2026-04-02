class SpiralMatrix {
    public static void main(String[] args) {

        // Step 0: Input matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int top = 0;                    // starting row
        int bottom = matrix.length - 1; // ending row
        int left = 0;                   // starting column
        int right = matrix[0].length - 1; // ending column

        // // Step 1: loop until boundaries cross
        while (top <= bottom && left <= right) {

            // Step 2: Left → Right
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++; // move top down

            // Step 3: Top → Bottom
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--; // move right left

            // Step 4: Right → Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--; // move bottom up
            }

            // Step 5: Bottom → Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++; // move left right
            }
        }
    }
}