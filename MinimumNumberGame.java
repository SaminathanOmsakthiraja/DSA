public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.sort(nums);
        int alice = nums[0];
        int bob = nums[1];
        int idx = 0;
        arr[idx++]=bob;
        arr[idx++]=alice;
        for (int i = idx; i < nums.length; i += 2){
            alice = nums[i];
            bob = nums[i+1];
            arr[idx++]=bob;
            arr[idx++]=alice;
        }
        return arr;
    }
}