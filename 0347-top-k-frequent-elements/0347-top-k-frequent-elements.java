class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> frequency=new HashMap<>();
    ArrayList<Integer>[] bucket=new ArrayList[nums.length+1];
    for(int n:nums){
        frequency.put(n,frequency.getOrDefault(n,0)+1);
    }
    for(int key:frequency.keySet()){
        int freq=frequency.get(key);
        if(bucket[freq]==null){
            bucket[freq]=new ArrayList<>();
        }
        bucket[freq].add(key);
    }
    int[] result=new int[k];
    int counter=0;
    for(int i=bucket.length-1;i>=0 && counter<k;i--){
        if(bucket[i]!=null){
            for(Integer num:bucket[i]){
                result[counter++]=num;
            }
        }
    }
    return result;
    }
}
