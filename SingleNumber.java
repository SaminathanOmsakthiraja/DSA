import java.util.*;
class SingleNumber{
    public static  int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }
        for (Map.Entry<Integer,Integer> ele : map.entrySet()){
            if (ele.getValue() == 1){
                return ele.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {4,2,2,1,1};
        System.out.println(singleNumber(arr));
    }
}
