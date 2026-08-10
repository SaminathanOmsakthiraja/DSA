class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
                hm.get(key).add(word);
            }
            else
                hm.get(key).add(word);
        }
        List<List<String>> result = new ArrayList<>(hm.values());
        return result;
    }
}