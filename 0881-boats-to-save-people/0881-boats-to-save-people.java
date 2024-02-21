class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // most optimal approach
        // two pointer
        // using the least number of boats
        Arrays.sort(people);
        int result = 0;
        int start = 0;
        int end = people.length-1;
        while (start <= end) {
            int remaining = limit - people[end];
            result++;
            end--;
            if (start <= end && remaining >= people[start]) {
                start++;
            }
        }
        return result;
    }
}