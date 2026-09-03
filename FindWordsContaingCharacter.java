public class FindWordsContaingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indx = new ArrayList<>();
        for (int i = 0; i < words.length; i++)
            if (words[i].contains(x+""))
                indx.add(i);
        return indx;
    }    
}
