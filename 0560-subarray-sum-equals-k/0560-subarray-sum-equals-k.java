class Solution{
    //optimized sliding window
    public int subarraySum(int[] nums, int k){
        //using prefix sum variable and hashmap
        int sum=0;
        int count=0;
        Map<Integer,Integer> map= new HashMap<>();
        //where I will map the prefix sum and the count using k
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
//lesss go (Sliding window)
/*
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        //implementing sliding window
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>k){
                sum-=nums[i];
                i++;
            }
            if(sum==k)count++;
        }
        return count;
    }
}*/