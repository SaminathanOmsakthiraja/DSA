import java.util.Arrays;
import java.util.Scanner;

public class Sortcolor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size-1; i++) {
            int ele = arr[i];
            for(int j = i+1; j < size; j++){
                if (ele > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = ele;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
    
}
