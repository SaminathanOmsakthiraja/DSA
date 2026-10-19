public class partitioning_into_minimum_number_of_deci_binary_numbers {
    public int minPartitions(String n) {
        int max = 0;
        for (char ch : n.toCharArray()){
            int val = ch - '0';
            max = (val > max) ? val : max;
        }
        return max;
    }
}