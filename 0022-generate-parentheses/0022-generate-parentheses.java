class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList();
        find("(",1,0,result,n);
        return result;
    }
    public void find(String current,int o, int c,List<String> result,int n){
        if(current.length()==2*n){ 
            result.add(current);
            return;
        }
        if(o<n)find(current+"(",o+1,c,result,n);
        if(c<o)find(current+")",o,c+1,result,n);
    }
    
}