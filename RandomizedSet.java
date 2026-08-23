class RandomizedSet {
    static HashSet<Integer> random;
    public RandomizedSet() {
        random = new HashSet<>();
    }
    
    public boolean insert(int val) {
        return random.add(val);
    }
    
    public boolean remove(int val) {
        return random.remove(val);
    }
    
    public int getRandom() {
        Random rand = new Random();
        int index = rand.nextInt(random.size());
        int i = 0;

        for (Integer val : random) {
            if (i == index) {
                return val;
            }
            i++;
        }
        return 0;
    }
}

