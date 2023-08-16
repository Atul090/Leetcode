//optimized solution
//O(n)
//SINCE THE ARRAY IS STRICTLY INCREASING> all elements are different
//
class Solution{
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            if(set.contains(num-diff) && set.contains(num-2*diff))count++;
            set.add(num);
        }
        return count;
    }
}

/*
iterative solutions

Can be done using 2 for loops in O(n2) time complexity

O(n3)
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff) count++;
                }
            }
        }
        return count;
    }
}
*/