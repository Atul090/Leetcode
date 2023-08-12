class Solution {
    public int missingNumber(int[] nums) {
        //Approach 1.0 (Maths)
        //The sum of first n natural number is n(n+1)/2
        //Given an array nums containing n distinct numbers in the range [0, n]
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
        }
        return sum;
    }
}


        //Approach 2.0 (Cyclic Sort)
        //Concept of Cyclic sort as the array is in bounds [1,n]
        //Keep in mind to optimize the space and time complexity
        //the array starts with 0 so the correct position of elements will be "a[i]=i"
        //So lets start

        // int i=0;
        // while(i<nums.length){
        //     int correct=i;
        //     if(nums[i]!=correct && nums[i]<nums.length){
        //         int temp=nums[i];
        //         nums[i]=nums[correct];
        //         nums[correct]=temp;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // for(int j=0;j<nums.length;j++){
        //     if(nums[j]!=j){return j;}
        // }
        // return nums.length;

        //-------
        // Approach 3.0
        //Brute Force

        // Arrays.sort(nums);
        // int i;
        // for(i=0;i<nums.length;i++){
        //     if(i!=nums[i]){
        //         return i;
        //     }
        // }
        // return i;
