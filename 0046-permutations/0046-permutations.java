class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        find(nums,result,new ArrayList<>());
        return result;
    }
    public void find(int[] nums,List<List<Integer>> result,List<Integer> current){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        } else {
            for(int i=0;i<nums.length;i++){
                if(current.contains(nums[i])) continue;
                current.add(nums[i]);
                find(nums,result,current);
                current.remove(current.size()-1);
            }
        }
    }
}