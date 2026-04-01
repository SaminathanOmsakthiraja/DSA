import java.util.*;

public class Duplicatenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> dups = new ArrayList<>();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if ((arr[i] == arr[j]) && (i!=j)){
                    dups.add(arr[i]);
                    arr[i] = -1;
                    break;
                }
            }
        }
        System.out.println(dups);

        sc.close();
    }
    
}
