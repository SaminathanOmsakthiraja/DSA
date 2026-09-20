public class ReverseDegreeOfString {
    public int reverseDegree(String s) {
        int sum = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            sum += (i+1) * (26 - (s.charAt(i) - 97));
        }
        return sum;
    }
}
