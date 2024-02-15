class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return new ArrayList<>();
        Map<Character,String> map=new HashMap<>();
        List<String> result=new ArrayList<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(map,digits,result,0,new StringBuilder());
        return result;
    }
    public void backtrack(Map<Character,String> map,String digits,List<String> result,int index,StringBuilder current){
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        char digit=digits.charAt(index);
        String letters=map.get(digit);
        for(int i=0;i<letters.length();i++){
            current.append(letters.charAt(i));
            backtrack(map,digits,result,index+1,current);
            current.deleteCharAt(current.length()-1);
        }   
    }
}