public class RecursiveSequence{
 static long sequence(int n){
        long sum=0;
        int index=1;
        for(int i=1;i<=n;i++){
            long mul=1;
            for(int j=0;j<i;j++){
                mul=(mul*index)%1000000007;
                index++;
            }
            sum=(sum+mul)%1000000007;
        }
        return sum%1000000007;
    }
}

}
