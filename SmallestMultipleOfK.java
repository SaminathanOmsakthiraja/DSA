public class SmallestMultipleOfK {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
        int val = k;
        while (set.contains(val)){
            val += k;
        }
        return val;
    }
}
