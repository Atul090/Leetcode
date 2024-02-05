class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i)) != -1) res++;
        }
        return res;
        // Set<Character> set=new HashSet<>();
        // for(char c: jewels.toCharArray()){
        //     set.add(c);
        // }
        // int res=0;
        // for(char c: stones.toCharArray()){
        //     if(set.contains(c)) res++;
        // }
        // return res;
    }
}