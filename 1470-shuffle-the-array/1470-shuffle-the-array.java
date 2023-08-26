class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int k=0;
        for(int i=0;i<n*2;i=i+2){
            ans[i]=nums[k];
            ans[i+1]=nums[k+n];
            k++;
        }
        return ans;
    }
}
//using single loop(optimized)

//using seperate loops
/*
int k=0;
int[] ans=new int[nums.length];
for(int i=0;i<n;i=i++){
    ans[k]=nums[i];
    k+=2;
}
k=1;
for(int i=n;i<2*n;i++){
    ans[k]=nums[i];
    k+=2;
}
return ans;
*/