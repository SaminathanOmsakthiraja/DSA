public class CountCommaInRangeII {
    long total=0;
    if(n<1000){
        return 0;
    }
    if(n>=1000&&n<=999999){
        total+=(n-999);
    }
    else if(n>999999L&&n<=999999999L){
        total+=999000L;
        total+=(n-999999L)*2;
    }
    else if(n>999999999L&&n<=999999999999L){
        total+=999000L;
        total+=999000000L*2;
        total+=(n-999999999L)*3;
    }
    else if(n>999999999999L&&n<=999999999999999L){
        total+=999000L;
        total+=999000000L*2;
        total+=(999000000000L)*3;
        total+=(n-999999999999L)*4;
    }
    else if (n>999999999999999L&&n<=1000000000000000L){
        total+=999000L;
        total+=999000000L*2;
        total+=(999000000000L)*3;
        total+=(999000000000000L)*4;
        total += (n - 999999999999999L) * 5;
    }
    return total;
    
}
