import java.util.Arrays;
public class MinimumMoveToMakeEqualArr {
    public int minMoves(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int count = 0;
        for (int i : nums)
            count += max - i;
        return count;
    }
}
