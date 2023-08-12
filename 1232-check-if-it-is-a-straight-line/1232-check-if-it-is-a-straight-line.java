
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        //edge case
        if(coordinates.length<=2)return true;
        //slope of straight line is constant
        //slope: (y2-y1)/(x2-x1)
        int x1=coordinates[0][0];
        int x2=coordinates[1][0];
        int y1=coordinates[0][1];
        int y2=coordinates[1][1];
        // double linearslope=(y2-y1)/(x2-x1);
        for(int i=2;i<coordinates.length;i++){
            int x=coordinates[i][0];
            int y=coordinates[i][1];
            // double slope=(y-y2)/(x-x2);
            // if(slope!=linearslope)return false;
            if((y2-y1)*(x-x2)!=(x2-x1)*(y-y2))
                return false;
        }
        return true;

    }
}