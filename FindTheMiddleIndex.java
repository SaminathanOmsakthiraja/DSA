public class FindTheMiddleIndex {
    public int findMiddleIndex(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        if(nums.length == 1) 
            return 0;
        left[0] = nums[0];
        right[nums.length-1] = nums[nums.length-1];
        for(int i = 1; i < nums.length; i++) 
            left[i] = left[i-1] + nums[i];
        for(int i = nums.length-2; i >= 0; i--) 
            right[i] = right[i+1] + nums[i];
        if(right[1] == 0)
            return 0;
        for(int i = 1; i < nums.length-1; i++)
            if(left[i-1] == right[i+1]) 
                return i;
        if(left[nums.length-2] == 0) 
            return nums.length-1;
        return -1;
    }
}
