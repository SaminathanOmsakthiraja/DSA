public class FindValueAfterOperation {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations){
            if (op.charAt(0) == '-' || op.charAt(2) == '-')
                x -= 1;
            else if (op.charAt(0) == '+' || op.charAt(2) == '+')
                x += 1;
        }
        return x;
    }
}
