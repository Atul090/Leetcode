class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0, right=num;
        while(left<=right){
            int mid=left+(right-left)/2;
            long square=(long)mid*mid;
            if(square>num)right=mid-1;
            else if(square<num)left=mid+1;
            else return true;
        }
        return false;
    }
}