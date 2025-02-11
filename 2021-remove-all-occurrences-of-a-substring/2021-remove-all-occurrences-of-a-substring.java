class Solution {
    public String removeOccurrences(String s, String part) {
        int a=0;
        String temp=s;
        while(true) {
            temp=s.replaceFirst(part, "");
            if(s!=temp) { 
                s=temp;
                } 
            else break;
        }
        return s;

    }
}