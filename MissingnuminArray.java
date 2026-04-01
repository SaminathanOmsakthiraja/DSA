import java.util.*;

public class MissingnuminArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        List<Integer> result =  new ArrayList<>();
        for (int i = 0; i < n ; i++){
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if ((i+1)==arr[j]){
                    found = true;
                    break;
                }
            }
            if (!found)
                result.add(i+1);
        }
        System.out.println(result);
        sc.close();
    }
    
}
