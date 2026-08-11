import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }
        for(int i :map.keySet()){
            if(map.get(i)==1)
                return i;
        }
        return 0;
    }
}
