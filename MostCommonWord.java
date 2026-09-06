public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase();
        String para[] = paragraph.split(" ");
        Map<String,Integer> count = new HashMap<>();
        int max = -1;
        String result = "";
        for (String word : para){
            if (!Arrays.asList(banned).contains(word) && word != ""){
                count.putIfAbsent(word,1);
                count.put(word,count.get(word)+1);
                if (count.get(word) > max){
                    max = count.get(word);
                    result = word;
                }
            }
        } 
        return result;
}