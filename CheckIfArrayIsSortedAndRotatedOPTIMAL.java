class CheckIfArrayIsSortedAndRotatedOPTIMAL {
    boolean checkIfArrayIsSortedAndRotated(int[] nums){
        int rot = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > nums[(i + 1) % nums.length])
                rot++;
        if (rot <= 1)
            return true;
        return false;
    }    
}