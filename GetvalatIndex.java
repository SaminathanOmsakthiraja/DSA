import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetvalatIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        int st = sc.nextInt();
        int end = sc.nextInt();
        for (int i = st; i < end; i++){
            System.out.print(arr.get(i) + " ");
        }
    }
    
}
