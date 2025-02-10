class Solution {
    public String clearDigits(String s) {
        StringBuffer ss = new StringBuffer();
        int a=0;
        char[] s1=s.toCharArray();
        for(int i=s.length()-1; i>=0; i--) {
            if(!Character.isDigit(s1[i])) {
                if(a<=0)
                     ss.append(s1[i]);
                else if(a>0) {
                    a--;
                }
            }
            else a++;
        }
        //     if(Character.isDigit(ss[i])) {
        //         if(i>=1) {
        //             ss.deleteCharAt(i-1);
        //             i--;
        //         }
        //         ss.deleteCharAt(i);
        //     }
        // }
        s=ss.reverse().toString();
        return s;
    }
}