class Solution {
    public char findTheDifference(String s, String t) {
        //intution 4
        //Most optimized
        //XOR method
        int result=0;
        for(char c: s.toCharArray()){
            result=result^c;
        }
        for(char c: t.toCharArray()){
            result=result^c;
        }
        return (char)(result);
        
        //intution 3
        // //array method
        // int[] arr1=new int[26];
        // int[] arr2=new int[26];
        // for(char c:s.toCharArray()){
        //     arr1[c-'a']++;
        // }
        // for(char c:t.toCharArray()){
        //     arr2[c-'a']++;
        //     if(arr2[c-'a']>arr1[c-'a'])return c;
        // }
        // return 0;
        
//       intution 2
//using HASHSET(easy){{in progress}}
        // HashSet<Character> map=new HashSet<>();
        // String str=s+t;
        // for(char c:s.toCharArray()){
        //     map.add(c);
        // }
        // for(char c:t.toCharArray()){
        //     if(map.contains(c))map.remove(c);
        //     if()
        // }


        //lessgo 
        //intution1- brute force
        // int i=0;
        // while(i<s.length() && i<t.length()){
        //     if(s.charAt(i)!=t.charAt(i))return t.charAt(i);
        // }
        // return t.charAt(t.length()-1);

    }
}