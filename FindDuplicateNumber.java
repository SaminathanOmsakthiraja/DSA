public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int [] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            arr[nums[i]]++;
            if (arr[nums[i]] > 1)
                return nums[i];
        }
        return nums.length;
    }
}
