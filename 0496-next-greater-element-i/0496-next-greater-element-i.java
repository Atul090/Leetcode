class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //we will have to use stack and map 
        //to store the next greator value in the key value pair
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int num: nums2){
            while(!stack.isEmpty() && num>stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.add(num);
        }
        int i=0;
        int[] ans=new int[nums1.length];
        for (int num : nums1) {
            if (map.containsKey(num)) {
                ans[i++] = map.get(num);
            } else {
                ans[i++] = -1; // Element not found in nums2
            }
        }      
        return ans;
    }
}