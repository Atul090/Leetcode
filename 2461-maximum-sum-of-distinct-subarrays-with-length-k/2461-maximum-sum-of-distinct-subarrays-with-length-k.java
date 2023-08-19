/*
Sliding window approach:- TC- O(n)
*/
class Solution{
    public long maximumSubarraySum(int[] nums, int k){
        Set<Integer> set=new HashSet<>();
        long sum=0,maxSum=0;
        int i=0,j=0;
        while(j<nums.length){
            if(j-i<k && set.size()<k){
                while(set.size()>0 && set.contains(nums[j])){
                    sum=sum-nums[i];
                    set.remove(nums[i]);
                    i++;
                } 
                sum=sum+nums[j];
                set.add(nums[j]);
                j++;
            }
            else{
                if(j-i==k && set.size()==k){
                    maxSum=Math.max(sum,maxSum);
                }
                sum=sum-nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        if(j-i==k && set.size()==k){
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
/*
create a set for distinct numbers
i left pointer and j is right pointer
j-i==k sum found
*/


/*
Brute Force Solution: TC- O(n*k)

class Solution{
    public long maximumSubarraySum(int[] nums, int k){

        int maxSum=0;
        for(int i=0;i<=nums.length-k;i++){
            boolean[] visited=new boolean[10001];
            boolean distinct=true;
            int sum=0;
            for(int j=i;j<i+k;j++){
                if(visited[nums[j]]){
                    distinct=false;
                    break;
                }
                visited[nums[j]]=true;
                sum+=nums[j];
            }
            if(distinct){
                maxSum=Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}
*/
