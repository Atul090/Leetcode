class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //using cyclic sort approach
        List<Integer> result=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                if(correct<nums.length){
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1)result.add(i+1);
        }
        return result;

        /*using HashSet
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int num: nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1))result.add(i+1);
        }
        return result;
        */
    }
}