class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //baxktracking
        List<List<Integer>> result=new ArrayList<>();
        find(candidates, target , new ArrayList<>(), result, 0);
        return result;
    }

    public void find(int[] candidates, int target,List<Integer> current, List<List<Integer>> result, int index){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0 || index==candidates.length)    return;
        current.add(candidates[index]);
        find(candidates,target-candidates[index],current,result,index);
        current.remove(current.size()-1);
        find(candidates,target,current,result,index+1);
    }
}