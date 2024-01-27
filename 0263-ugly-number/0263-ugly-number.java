class Solution {
    public boolean isUgly(int n) {
        int [] factors={2,3,5};
        while(n>1){
            boolean flag=false;
            for(int fac: factors){
                if(n%fac==0){ 
                    n/=fac;
                    flag=true;
                    break;
                }
            }
            if(flag==false) return false;
        }
        return n==1;
    }
}