class Solution {
    public int sum(int[] a){
        int s=0;
        for(int i:a)
        s+=i;
        return s;
    }
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
           if(sum(accounts[i])>wealth)
                wealth=sum(accounts[i]);     
        }
        return wealth;
    }
}