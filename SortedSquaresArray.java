import java.util.Arrays;
import java.util.Scanner;

public class SortedSquaresArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
    
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        //Arrays.sort(nums);

        for (int i = 0; i < size-1; i++){
            for (int j = i+1; j < size; j++){
                if (nums[j] < nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        System.out.println("Output: " + Arrays.toString(nums));

        sc.close();
    }
}