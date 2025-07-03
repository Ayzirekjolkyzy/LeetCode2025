class Solution {
    public char kthCharacter(int k) {
        if(k==1) return 'a';
        String word="a";
        int ch;
        for(double i=0.0; Math.pow(2.0,i)<=k; i++) {
            if(word.length()>=k) break;
            int temp=word.length();
            for(int j=0; j<temp; j++) {
                ch=word.charAt(j);
                ch++;
                word=word+(char)ch;
            }            
        }
        return word.charAt(k-1);
    }
}