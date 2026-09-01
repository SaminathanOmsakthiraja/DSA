public class DifferentBetweenElementsumAndDigitsum {
    int digiSum(int n){
        int sum = 0;
        while(n!=0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int elesum = 0;
        int digisum = 0;
        for (int i : nums){
            elesum += i;
            digisum += digiSum(i);
        }
        return Math.abs(elesum - digisum);
    }
}
