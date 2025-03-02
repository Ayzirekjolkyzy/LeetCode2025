class Solution {
public:
    bool isValid(string s) {
        int n=s.length();
        stack <char> stk;
        if(n==0||n%2==1) return false;
        for(int i=0; i<n; i++) {
            if(s[i]=='{'||s[i]=='['||s[i]=='(') 
                stk.push(s[i]);
            else if(s[i]=='}'&&!stk.empty()&&stk.top()=='{')
                stk.pop();
            else if(s[i]==']'&&!stk.empty()&&stk.top()=='[')
                stk.pop();
            else if(s[i]==')'&&!stk.empty()&&stk.top()=='(')
                stk.pop();
            else { return false;}
        }
        return stk.empty();
        
        }
};