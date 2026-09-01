public class FindFirstPalindromicString {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            int l = 0, r = word.length()-1;
            boolean found = true;
            while(l < r){
                if (word.charAt(l) != word.charAt(r)){
                    found = false;
                    break;
                }
                l++;r--;
            }
            if (found)
                return word;
        }
        return "";
    }
}
