class Solution {
    public String clearDigits(String s) {
        StringBuffer ss = new StringBuffer(s);
        int a=0;
        while(a<ss.length()) {
            if(Character.isDigit(ss.charAt(a))) {
                if(a>0) {
                  ss.deleteCharAt(a-1);
                  a--;
                  }
                  ss.deleteCharAt(a);
                  a--;
            }

            a++;
        }
    return ss.toString();
    }
}
