public class HowManyNumberAreSmallerThanCurrentValue {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int num[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i!=j && nums[i] > nums[j]){
                    num[i]++;
                }
            }
        }
        return num;
    }
}
