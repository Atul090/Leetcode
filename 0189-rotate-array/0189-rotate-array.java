class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        nums=swap(nums,0,nums.length-1);
        nums=swap(nums,0,k-1);
        nums=swap(nums,k,nums.length-1);
    }
    public int[] swap(int[] nums, int left, int right){
        // int temp;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        return nums;
    } 
}