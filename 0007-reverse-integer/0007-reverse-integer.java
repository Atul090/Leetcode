class Solution {
    public int reverse(int x) {
        if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE) return 0;
        long reversed=0;
        while(x!=0){
            int rem=x%10;
            reversed=reversed*10+rem;
            x/=10;
        }
        if(reversed<Integer.MIN_VALUE || reversed>Integer.MAX_VALUE) return 0;
        return (int)reversed;
    }
}