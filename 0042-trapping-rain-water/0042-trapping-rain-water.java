class Solution {
    public int trap(int[] height) {
        //using TWO POINTER approach
        int left=0;
        int right=height.length-1;
        int leftMax=0;
        int rightMax=0;
        int rain=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>leftMax){
                    leftMax=height[left];
                }   
                else{
                    rain=rain+leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>rightMax){
                    rightMax=height[right];
                }
                else{
                    rain=rain+rightMax-height[right];
                }
                right--;
            }
        }
        return rain;
    }
}
