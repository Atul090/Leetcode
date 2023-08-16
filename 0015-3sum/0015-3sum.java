//O(n2) most optimized in space and time complexity
class Solution{
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int target=-nums[i];
            if(i==0 || nums[i]!=nums[i-1]){
                int left=i+1;
                int right=nums.length-1;
                while(left<right){
                    int sum=nums[left]+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[left],nums[right],nums[i]));
                        while(left<right && nums[left]==nums[left+1])left++;
                        while(left<right && nums[right]==nums[right-1])right--;
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
}


/* optimized way -> 1ms
with explanation

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // We'll keep our answers here
        
        Arrays.sort(nums); // First, we put the numbers in order
        
        for (int i = 0; i < nums.length - 2; i++) { // Let's pick one special number at a time
            if (i == 0 || nums[i] != nums[i - 1]) { // If this number is different from the previous one
                
                int left = i + 1; // We start looking from the number next to the special number
                int right = nums.length - 1; // And we also look from the end of the numbers
                int target = -nums[i]; // Our goal is to find two numbers that add up to this value
                
                while (left < right) { // We check pairs of numbers until they meet each other
                    
                    int sum = nums[left] + nums[right]; // We add two numbers together
                    
                    if (sum == target) { // If these two numbers add up to our goal
                        result.add(Arrays.asList(nums[i], nums[left], nums[right])); // We found a group!
                        
                        // We move on to different numbers to avoid repeating the same group
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        
                        left++; // Let's look at the next number
                        right--; // And the previous number
                    } else if (sum < target) { // If the sum is too small
                        left++; // We need a bigger number, so we move the left pointer
                    } else { // If the sum is too big
                        right--; // We need a smaller number, so we move the right pointer
                    }
                }
            }
        }
        
        return result; // We have a list of groups that add up to zero
    }
}


// O(n2) -> 1560 ms
/*
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
*/