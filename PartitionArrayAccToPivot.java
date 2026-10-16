class PartitionArrayAccToPivot{
    public int[] pivotArray(int[] nums, int pivot) {
        int picount = 0;
        int lcount = 0;
        int rcount = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == pivot)
                picount++;
            else if (nums[i] < pivot)
                lcount++;
            else if (nums[i] > pivot)
                rcount++;
        }
        int ridx = lcount+rcount+picount, piidx = lcount+picount; 
        int[] arr = new int[nums.length];
        for (int i = nums.length-1; i >= 0; i--){
            if (nums[i] < pivot)
                arr[--lcount] = nums[i];
            else if (nums[i] > pivot){
                arr[--ridx] = nums[i];
            }
            else
                arr[--piidx] = nums[i];
        }
        return arr;
    }
}