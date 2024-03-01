class Solution {
    public String maximumOddBinaryNumber(String s) {
        int idx=0;
        int l=s.length();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1'){
                char temp=ch[i];
                ch[i]=ch[idx];
                ch[idx]=temp;
                idx++;
            }
        }
        char t=ch[idx-1];
        ch[idx-1]=ch[l-1];
        ch[l-1]=t;
        return new String(ch);

    }
}