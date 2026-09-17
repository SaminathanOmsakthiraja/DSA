public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_len = 0;
        int max = 0;
        for (int i = 0 ;i < nums.length; i++){
            if (nums[i] == 1)
                max++;
            else{
                max_len = (max_len < max)? max : max_len;
                max = 0;
            }
        }
        return (max_len < max)? max : max_len;
    }
}