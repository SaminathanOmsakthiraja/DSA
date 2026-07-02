class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        if (n == 1)
            return 1;
        for (int i = n; i > 0; i--){
            String s =  Integer.toString(i);
            for (int c = 0; c < s.length(); c++){
                if (s.charAt(c) == '1')
                    count++;
            }
        }
        return count;
    }
}