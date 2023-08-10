class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        String temp="";
        for(String s:words){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String current=new String(c);
            if(!current.equals(temp))
                list.add(s);
            temp=current;
        }
        return list;
    }
}