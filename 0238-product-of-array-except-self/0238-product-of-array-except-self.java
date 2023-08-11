class Solution {
    public int[] productExceptSelf(int[] nums) {
        //Most optimized (Space & Time)
        
        int[] output=new int[nums.length];
        //computing the left current product
        int left=1;
        for(int i=0;i<nums.length;i++){
            output[i]=left;
            left=left*nums[i];
        }
        //computing the right product
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            output[i]=right*output[i];
            right=right*nums[i];
        }
        return output;

        //using extra space
        //taking 2 arrays for left product and right product
        //do check

        // int[] out=new int[nums.length];
        // int[] left=new int[nums.length];
        // int[] right=new int[nums.length];
        // left[0]=1;
        // right[nums.length-1]=1;
        // for(int i=1;i<nums.length;i++){
        //     left[i]=left[i-1]*nums[i-1];
        // }
        // for(int i=nums.length-2;i>=0;i--){
        //     right[i]=right[i+1]*nums[i+1];
        // }
        // for(int i=0;i<nums.length;i++){
        //     out[i]=left[i]*right[i];
        // }
        // return out;
    }
    
}