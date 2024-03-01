class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set=new HashSet<>();
        int count=0;
        for(int num:map.values()){
            set.add(num);
            count++;
        }
        if(set.size()==count)return true;
        return false;
    }
}