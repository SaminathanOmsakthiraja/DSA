public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int d = n;
        for (int i = 0; i < n; i++){
            if(i+1 <= d)
                d-=(i+1);
            else
                return i;
        }
        return 1;
    }
}
