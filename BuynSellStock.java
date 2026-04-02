import java.util.Scanner;

public class BuynSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min_price = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            int profit = 0;
            if (arr[i] < min_price)
                min_price = arr[i];

            profit = arr[i] - min_price;
            
            if (profit > max_profit)
                max_profit = profit;
        }

        System.out.println("");
        
        sc.close();
    }
    
}
