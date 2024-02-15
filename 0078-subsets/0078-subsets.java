class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        find(0,nums,result,new ArrayList<>());
        return result;
    }
    public void find(int index, int[] nums, List<List<Integer>> result, List<Integer> current){
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            find(i+1,nums,result,current);
            current.remove(current.size()-1);
        }
    }
}