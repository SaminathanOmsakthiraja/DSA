import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        int y = n/2;
        int z = 0;
        int[] mer = new int[n];
        while (x!=n/2) {
            mer[z++] = arr[x++];
            mer[z++] = arr[y++];
        }
        System.out.println(Arrays.toString(mer));
        
        sc.close();
    }   
}