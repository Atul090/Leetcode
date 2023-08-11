class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S=new Stack<>();
        Stack<Character> T=new Stack<>();
        for(char c: s.toCharArray()){
            if(!S.isEmpty() && c=='#'){
                S.pop();
            }
            else{
                if(c!='#')S.push(c);
            }
        }
        for(char c:t.toCharArray()){
            if(!T.isEmpty() && c=='#'){
                T.pop();
            }
            else{
                if(c!='#')T.push(c);
            }
        }
    return S.equals(T);
    }    
}
