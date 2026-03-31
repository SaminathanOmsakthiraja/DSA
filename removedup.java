import java.util.Arrays;
import java.util.Scanner;

public class removedup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if ((arr[i] == arr[j]) && (i != j)){
                    arr[i] = 0;
                    count++;
                    break;
                }
            }
        }
        int idx = 0;
        //System.out.println(count);
        int[] uni = new int[size - count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                uni[idx++] = arr[i];
            }
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(uni));

        sc.close();
    }   
}