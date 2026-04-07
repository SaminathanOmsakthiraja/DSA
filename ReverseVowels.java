import java.util.*;
public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String vowels = "aeiouAEIOU";
        List<Character> v = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) 
                v.add(ch);
        }
        Collections.reverse(v);
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                result.append(v.get(i));
                i++;
            } 
            else 
                result.append(ch);
        }
        System.out.println(result.toString());

        sc.close();
    }
}