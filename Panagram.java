public class Panagram {
    public boolean checkIfPangram(String sentence) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase();
        for(char ch : alpha.toCharArray()){
            if(!sentence.contains((ch+""))){
                return false;
            }
        }
        
        return true;
    }
}    