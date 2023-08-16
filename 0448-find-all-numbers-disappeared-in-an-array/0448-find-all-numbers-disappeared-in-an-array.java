class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int num: nums){
            set.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(i+1))result.add(i+1);
        }
        return result;
    }
}