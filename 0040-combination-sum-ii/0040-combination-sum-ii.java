class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,current,target,0,candidates);
        return result;
    }
   public void backtrack(List<List<Integer>> result,List<Integer> current,int target,int index,int[] candidates){
       if(target==0){
           result.add(new ArrayList<>(current));
           return;
       }
       int prev=-1;
       for(int i=index;i<candidates.length;i++){
           if(target<0 || index>=candidates.length) return;
           if(candidates[i]==prev)continue;
           current.add(candidates[i]);
           backtrack(result,current,target-candidates[i],i+1,candidates);
           current.remove(current.size()-1);
           prev=candidates[i];
       }
   }
}
//         List<List<Integer>> result=new ArrayList<>();
//         backtrack() ;
//         return result;
//     }
//     public void backtrack(){
//         if(){
//         for(){

//         }
//     }
// }