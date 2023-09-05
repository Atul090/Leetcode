class Solution {
    public int mySqrt(int x) {
        int left=0, right=x;
        int res=0;
        while(left<=right){
            int mid=left+ (right-left)/2;
            long square=(long)mid*mid;
            if(square>x){
                right=mid-1;
            }
            else if(square<x){
                res=mid;
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        return res; //number closeset to sqrt(x)
    }
}
        /*
        int flag=0;
        for(int i=1;i<=x;i++){
            int sq=i*i;
            if(sq==x)return i;
            else if(sq>x){
                flag=i-1;
                break;
            }
        }
        return flag;
    }
}/*/