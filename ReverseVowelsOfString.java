public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        char sch[] = s.toCharArray();
        List<Character> vow = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                vow.add(ch);
                arr.add(i);
            }
        }
        Collections.reverse(vow);
        for (int i = 0; i < arr.size(); i++){
            sch[arr.get(i)] = vow.get(i);
        }
        String res = new String(sch);
        return res;
    }
}
