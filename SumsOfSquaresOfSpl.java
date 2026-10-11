public class SumsOfSquaresOfSpl {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++){
            int idx = i + 1;
            if (len % idx == 0)
                sum += nums[i] * nums[i];
        }
        return sum;
    }
}
