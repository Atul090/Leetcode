class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        dfs(0,s,result,new ArrayList<String>());
        return result;
    }
    public void dfs(int index,String s,List<List<String>> result,List<String> current){
        if(index>=s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPallindrome(s,index,i)){
                current.add(s.substring(index,i+1));
                dfs(i+1,s,result,current);
                current.remove(current.size()-1);
            }

        }
        
    }
    public boolean isPallindrome(String str,int i,int j) {
            while (i <= j) {
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
}