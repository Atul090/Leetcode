class Solution {
    public int[] twoSum(int[] nums, int target) {
        //solution must use costant extra space
        //we can use two pointer approach

        //since the array is sorted in asc order
        //smaller sums would come from left part of array
        //larger sums would come from right part of array
    
        int start=0;
        int end=nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]>target)end--;
            else if(nums[start]+nums[end]<target)start++;
            else
                break;
        }
        return new int[]{start+1,end+1};
    }
}