public class FindingMissingElement {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        Set<Integer> num = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int val : nums){
            num.add(val);
            min = (min > val)? val : min;
            max = (max < val)? val : max;
        }
        for (int i = min; i < max; i++){
            if (!num.contains(i))
                missing.add(i);
        }
        System.out.println(num);
        return missing;
    }
}
