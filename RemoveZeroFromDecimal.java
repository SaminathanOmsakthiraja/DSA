public class RemoveZeroFromDecimal {
    public long removeZeros(long n) {
        String num = "";
        while (n != 0){
            long val = n % 10;
            if (val != 0)
                num += val+"";
            n /= 10;
        }
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        return Long.valueOf(sb.toString());
    }
}
