public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
        if(s.length() == 0)
            return true;
        int ps = 0;
        int pt = 0;
        while(pt<t.length()){
            if(s.charAt(ps) == t.charAt(pt))
                ps++;

            if(ps == s.length())
                return true;
            pt++;
        }
        return false;
    }    
}
