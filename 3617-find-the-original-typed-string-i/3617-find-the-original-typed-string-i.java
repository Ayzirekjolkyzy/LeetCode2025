class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        for(int i=0; i<word.length(); i++) {
            if(i>0&&word.charAt(i)==word.charAt(i-1)) {
                count++;
            }
        }
        return count;
    }
}