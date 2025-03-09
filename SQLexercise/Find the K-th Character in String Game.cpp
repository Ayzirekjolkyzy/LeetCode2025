class Solution {
public:
    char kthCharacter(int k) {
        string a="a";
        int ch=1;
        while(ch<k) {
            string temp=a;
            for(int i=0; i<a.size(); i++) {
                temp[i]=a[i]+1;
            }
            a+=temp;
            ch=a.size();
            }
        return a[k-1];
    }
};




