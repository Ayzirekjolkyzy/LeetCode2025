class Solution {
public:
    string customSortString(string order, string s) {
        int t=0;
        for(int i=0; i<order.size()&&i<s.size(); i++, t++) {
            for(int j=0; j<s.size(); j++) {
                if(order[i]==s[j]) {
                    if(s[t]!=s[j])
                        swap(s[j], s[t]);
                    else if(t!=j&&(s[t]==s[j]))
                        swap(s[j], s[++t]);
                }
            }
        }
        return s;
    }
};