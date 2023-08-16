class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
/*
        // if(nums.length!=set.size())return true;
        return false;
        using sorting
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            return true;
        }
        return false;
    }
    {
        approach 2
        hash map
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(nums.length!=set.size()){
            return true;
        }
        return false;
        */