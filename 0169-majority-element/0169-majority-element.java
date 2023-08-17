class Solution {
    public int majorityElement(int[] nums) {
    /*
       optimal approach
       Moore's Voting Algorithm 
       time complexity O(n)
    */
       int count=0,target=0;
       for(int num: nums){
           if(count==0)target=num;
           if(num==target)count++;
           else count--;
       }
       return target;

    /*
    approach 2.0: if the number is present more than half times in the array
    then if the array is sorted it will dominate the array(n/2)
    
    time complexity: nlog(n)-Arrays.sort() uses quicksort-TC{ log(n) }

        if(nums.length==1)return nums[0];
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    */
        
    }
}