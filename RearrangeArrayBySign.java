import java.util.ArrayList;

public class RearrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i : nums){
            if ( i < 0)
                neg.add(i);
            else
                pos.add(i);
        }
        int[] rearr = new int[nums.length];
        int pidx = 0;
        int nidx = 0;
        for (int i = 0; i < nums.length; i+=2)
            rearr[i] = pos.get(pidx++);
        for (int i = 1; i < nums.length; i+=2)
            rearr[i] = neg.get(nidx++);
        
        return rearr;
    }
}
