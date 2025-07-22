class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        boolean v=false, c=false;
        char[] ch=word.toCharArray();
        for(int i=0; i<ch.length; i++) {
            if(ch[i]<48||(ch[i]>57&&ch[i]<65)||(ch[i]>90&&ch[i]<97)||ch[i]>122)
            return false;
            if(ch[i]>57) {
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]==
                'u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
                    v=true;
                else c=true;
            }
        }
        return (v&&c);
    }
}