class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int x = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1])
                x = nums.length - 1 - i;
        }
        int [] dup = Arrays.copyOf(nums,nums.length);
        Arrays.sort(dup);
        while(x-- > 0){
            int temp = dup[0];
            for(int i = 0; i < dup.length-1; i++){
                dup[i] = dup[i+1];
            }
            dup[dup.length-1] = temp;
        }
        System.out.print(Arrays.toString(dup) + " " + Arrays.toString(nums));
        return Arrays.equals(nums,dup);
    }
}