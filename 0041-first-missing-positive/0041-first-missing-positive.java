//using cycle sort
class Solution{
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
}
/*
Using hashmap
class Solution{
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Boolean> map=new HashMap();
        for(int num: nums){
            if(num>0)map.put(num,true);
        }
        int smallest=1;
        while(map.containsKey(smallest)){
            smallest++;
        }
        return smallest;
    }
}
*/
