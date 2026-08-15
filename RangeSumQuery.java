class RangeSumQuery {
    int[] prefixsum;
    public NumArray(int[] nums) {
        prefixsum = new int[nums.length];
        int sum = nums[0];
        prefixsum[0] = sum;
        for(int i = 1; i < nums.length; i++){
            sum += nums[i];
            prefixsum[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if ( left == 0)
            return prefixsum[right];
        else
            return prefixsum[right] - prefixsum[left-1];
    }
}