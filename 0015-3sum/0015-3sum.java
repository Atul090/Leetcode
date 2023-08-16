

// O(n2)
import java.util.Collections;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        HashSet<ArrayList<Integer>> dublicate=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    ArrayList<Integer> arr=new ArrayList(Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(arr);
                    dublicate.add(arr);
                }
                set.add(nums[j]);
            }
        }
        result.addAll(dublicate);
        return result;
    }
}
