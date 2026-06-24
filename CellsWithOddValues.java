class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for (int i = 0; i < indices.length; i++){
            int row = indices[i][0];
            for (int k = 0; k < mat[0].length; k++){
                mat[row][k]+=1;
            }
            int col = indices[i][1];
            for (int j = 0; j < mat.length; j++){
                mat[j][col]+=1;
            }
        }
        int count = 0;
        for (int[] i : mat){
            for (int j = 0; j < i.length; j++){
                if (i[j] % 2 != 0)
                    count++;
            }
        }
        return count;
    }
}