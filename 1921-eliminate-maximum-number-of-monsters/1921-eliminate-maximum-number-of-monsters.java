class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        //the question revolves around time of the monster
        //to reach your city 
        //lets calculate the time of arrival of each monster
        int len=dist.length;
        double [] time=new double[len];
        for(int i=0;i<len;i++){
            time[i]=(double)dist[i]/speed[i];
        }
        //sorting to know which monster will reach first and
        //which monster should be eleminated first
        Arrays.sort(time);
        for(int i=0;i<len;i++){
            //checking each minute for the monster to arrive
            //let the minute to reload be i
            //when I need one minute to load the gun
            //i will check for the nearest monster's time
            //to reeach the city
            // if it is less than the reload time then I will be able to eleminate the mosnter
            if(time[i]<=i){
                return i;
            }
        }
        return len;
    }
}