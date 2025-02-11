class Solution {
    public String removeOccurrences(String s, String part) {
        int a=0;
        String temp=s;
        StringBuilder ss=new StringBuilder(s);
        while(a<s.length()) {
            temp=s.replaceFirst(part, "");
            if(s!=temp) { 
                s=temp;
                } 
            else a+=part.length();
        }
        return s;

    }
}