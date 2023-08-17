class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int maxCount=0;
        for(int num: nums){
            if(!set.contains(num-1)){
                int count=0;
                while(set.contains(num+count)){
                    count++;
                }
                maxCount=Math.max(count,maxCount);
            }
        }
        return maxCount;
    }
}
/*
-EXPLANATION- UPVOTE
approach:- if the number is a start of a subsequence then it will not have any left elem
            {1,2,3},{100},{65,66} here 1,100,65 are the start of the subsequences
HAVE TO FINE THE LONGEST SUBSEQUENCE
step 1 |> store the array in a set.
step 2 |> check for the left element
step 3 |> if found use iteration for finding the length for longest
*/