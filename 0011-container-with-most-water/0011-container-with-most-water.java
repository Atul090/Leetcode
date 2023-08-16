class Solution {
    public int maxArea(int[] height) {
      //optimized method
      //two pointers
      //UPVOTE
      int left=0;
      int right=height.length-1;
      int result=0;
      while(left<right){
        int min=Math.min(height[right],height[left]);
        int area=(right-left)*min;
        result=Math.max(area,result);
        //increasing the pointers as per the heights
        if(height[left]>height[right])  right--;
        else  left++;
      }
      return result;
    }
}
//can be done using brute force+> O(n2) complexity
