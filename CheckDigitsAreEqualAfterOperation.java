public class CheckDigitsAreEqualAfterOperation {
    public boolean hasSameDigits(String s) {
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        int n = d.length;
        while (n > 2) {
            for (int i = 0; i < n - 1; i++) 
                d[i] = (d[i] + d[i + 1]) % 10;
            n--;
        }
        return d[0] == d[1];
    }
}
