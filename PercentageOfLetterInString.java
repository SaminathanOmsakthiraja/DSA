public class PercentageOfLetterInString {
    public int percentageLetter(String s, char letter) {
        double count = 0.0;
        for (char ch : s.toCharArray())
            if (ch == letter)
                count++;
        int persent = (int)(count * 100) / s.length();
        return persent;
    }    
}
