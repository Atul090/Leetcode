class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        // trick is to use smaller tokens first as face up to save power
        // and gain more power by using larger tokens face-down and 
        // gain more power
        //sorting the array to use 2 pointer approach
        //play small token as face-up to loose less power score+1
        //and large tokens as face down to gain more power score-1
        //return 0 if the score is 0 and the tokens are smaller than power
        //mantain a score to cal
        int left=0;
        int right=token.length-1;
        int score=0;
        int res=0;
        Arrays.sort(token);
        while(left<=right){
            if(power>=token[left]){
                power-=token[left];
                score+=1;
                res=Math.max(score,res);
                left++;
            } else if(score>0) {
                power+=token[right];
                score=score-1;
                right--;
            } else {
                break;
            }
        }
        return res;
    }
}