class Solution {
    public String removeOccurrences(String s, String part) {
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