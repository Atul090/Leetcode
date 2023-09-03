class Solution {
    public int[] replaceElements(int[] arr) {
        //optimized way
        //since we have to keep track of the greates element to its right
        int max=arr[arr.length-1];
        int[] ans=new int[arr.length];
        ans[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                ans[i]=max;
                max=arr[i];
            }
            else{
                ans[i]=max;
            }
        }
        return ans;
    }
}
//         int[] ans=new int[arr.length];
//         for(int i=0;i<arr.length-1;i++){
//             int max=arr[i+1];

//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]>max) max=arr[j];
//             }
//             ans[i]=max;
//         }
//         ans[arr.length-1]=-1;
//         return ans;
//     }
// }