public class MaximumValueAfterInsertion {
    public String maxValue(String num, int x) {
        StringBuilder n = new StringBuilder(num);
        StringBuilder m = new StringBuilder("");
        boolean insert = false;
        for(int c = 0; c < num.length();c++){
            if(n.charAt(0) == '-'){
                if(n.charAt(c) == '-'){
                    m.append(n.charAt(c));
                    continue;
                }
                else if(n.charAt(c) > (char)(x+'0') && !insert){
                    m.append((char)(x+'0'));
                    insert = true;
                    m.append(num.substring(c));
                    return m.toString();
                }
                m.append(n.charAt(c));
            }
            else{
                if(n.charAt(c) < (char)(x+'0') && !insert){
                    m.append((char)(x+'0'));
                    insert = true;
                    m.append(num.substring(c));
                    return m.toString();
                }
                m.append(n.charAt(c));
            }
        }
        if(!insert)
            m.append((char)(x+'0'));
        return m.toString();
    }
}