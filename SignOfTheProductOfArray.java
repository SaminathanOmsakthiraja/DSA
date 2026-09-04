public class SignOfTheProductOfArray {
    public int signFunc(int x){
        if (x % 2 == 0) return 1;
        return -1;
    }
    public int arraySign(int[] nums) {
        int count = 0;
        for (int i : nums){
            if (i < 0) count++;
            else if (i == 0) return 0;
        }
        return signFunc(count);
    }
}
