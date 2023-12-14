class Solution {
    public int totalMoney(int n) {
        int weekCount=0;
        int sum=0;
        int dailySum=0;
        for(int day=1;day<=n;day++){
            if(day%7==1){
                weekCount++;
                dailySum=weekCount;
            }
            else{
                dailySum++;
            }
            sum=sum+dailySum;
        }
        return sum;
    }
}