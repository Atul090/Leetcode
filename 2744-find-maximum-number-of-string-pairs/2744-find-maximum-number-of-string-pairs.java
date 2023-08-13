class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            String rev=new StringBuilder(word).reverse().toString();
            //the string class dosent has the method reverse()
            if(map.containsKey(rev)){
                map.put(rev,map.get(rev)+1);
            }
            else{
                map.put(word,0);
            }
        }
        //iterate through all the values and add them
        for(int num : map.values()){
            count=count+num;
        }
        return count;
    }
}