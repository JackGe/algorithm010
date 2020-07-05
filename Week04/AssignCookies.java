class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int content = 0;
        if(g.length <=0 || s.length <=0){
            return 0 ;
        }
       Arrays.sort(g);
       Arrays.sort(s);
        int i = 0 ;
        int  j = 0;
        for( ; j < s.length && i< g.length; ){
           if(s[j]>= g[i]){
               content ++;
               i++;
               j++;
           }else{
               j++;
           }
        }
        return content;
    }
}
