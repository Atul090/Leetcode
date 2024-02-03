class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int num=i;
            int nextDigit=i+1;
            while(num<=high && nextDigit<=9){
                num=num*10+nextDigit;
                nextDigit++;
                if(num>=low && num<=high)   list.add(num);
            }
        }
        list.sort(null);
        return list;
    }
}