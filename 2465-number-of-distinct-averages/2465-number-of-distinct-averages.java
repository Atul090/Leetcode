class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set=new HashSet<>();
        Arrays.sort(nums);
        int end=nums.length-1;
        for(int i=0;i<end;i++){
            double avg=(double)(nums[i]+nums[end])/2;
            set.add(avg);
            end--;
        }
        return set.size();
    }
}