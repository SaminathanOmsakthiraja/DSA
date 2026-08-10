public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int max_count = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] == nums[i]) continue;
            if(nums[i-1] == nums[i]-1)
                count++;
            else{
                max_count = Math.max(count,max_count);
                count = 1;
            }
        }
        return Math.max(count,max_count);
    }    
}
