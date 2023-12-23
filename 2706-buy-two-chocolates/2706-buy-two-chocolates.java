class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=101;
        int minScnd=101;
        for(int price: prices){
            if(price<min){
                minScnd=min;
                min=price;
            }else if(price<minScnd){
                minScnd=price;
            }
        }
        return min+minScnd <= money ? money-(min+minScnd) : money;
    }
}