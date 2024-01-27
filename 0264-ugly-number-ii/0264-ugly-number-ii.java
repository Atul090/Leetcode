class Solution {
    public int nthUglyNumber(int n) {
        //storing all the ugly number in an array
        int [] ugly=new int [n];
        //first ugly number is 1
        ugly[0] = 1;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        //2*1,2*2..
        //3*2,3*2..
        //5*1,5*2..
        //sort in sequential order
        int indx2=0, indx3=0, indx5=0;
        for(int i=1;i<n;i++){
            int min = Math.min(Math.min(factor2,factor3),factor5);
            ugly[i]=min;
            if(min == factor2){
                factor2 = 2*ugly[++indx2];
            }
            if(min == factor3){
                factor3 = 3*ugly[++indx3];
            }
            if(min == factor5){
                factor5 = 5*ugly[++indx5];
            }
        }
        return ugly[n-1];
    }
}