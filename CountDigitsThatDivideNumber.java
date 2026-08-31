import java.util.ArrayList;
import java.util.List;

public class CountDigitsThatDivideNumber {
    public int countDigits(int num) {
        if ((num+"").length() == 1) return 1;
        List<Integer> lst = new ArrayList<>();
        int dup = num;
        while(dup != 0){
            if (num % (dup % 10) == 0)
                lst.add(dup % 10);
            dup /= 10;
        }
        return lst.size();
    }
}
