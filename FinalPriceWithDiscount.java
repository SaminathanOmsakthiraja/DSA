public class FinalPriceWithDiscount {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length-1; i++){
            int min = Integer.MAX_VALUE;
            for (int j = i+1; j < prices.length; j++){
                if (prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
