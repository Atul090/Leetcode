class Solution {
    public int singleNumber(int[] nums) {
        //Bit manipulation
        //can be done using HashMap
        //every element appears twice except one
        int result=0;
        for(int num: nums){
            result^=num;
            //0^n=n
        }
        return result;
    }
}