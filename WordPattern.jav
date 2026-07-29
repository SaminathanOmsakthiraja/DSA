class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,String> mp = new HashMap<>();
        String[] ss = s.split(" ");
        if(pattern.length() != ss.length)
            return false;
        for(int i = 0; i < pattern.length(); i++){
            String ch = pattern.charAt(i) + "";
            if (mp.containsKey(ch)){
                if (!ss[i].equals(mp.get(ch)))
                    return false;
            }
            else{
                if (mp.containsValue(ss[i])){
                        return false;
                }
                mp.put(ch,ss[i]);
            }
        }
        System.out.print(Arrays.toString(ss) + "\n" + mp);
        return true;
    }
}