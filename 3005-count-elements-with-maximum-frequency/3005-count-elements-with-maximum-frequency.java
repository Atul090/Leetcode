class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;

        for(int i: map.values()){
            if(i>max){
                max=i;
            }
        }
        //we have the max freq now lets check if how many elem 
        //are with the max freq
        for(int i:map.values()){
            if(i==max){
                count++;
            }
        }
        return count*max;
    }
}