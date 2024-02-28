class Solution {
    public List<List<Integer>> combine(int n, int k) {
        //using backtracking
        List<List<Integer>> result=new ArrayList<>();
        dfs(n,k,new ArrayList<>(),result,1);
        return result;
    }
    public void dfs(int n,int k,List<Integer> current,List<List<Integer>> result,int index){
        if(current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<=n;i++){
            current.add(i);
            dfs(n,k,current,result,i+1);
            current.remove(current.size()-1);
        }
    }
}