class Solution {
public:
    int arrangeCoins(int n) {
        int i=0, k=n;
        while(i<n) {
            i++;
            if((k-i)<0) return i-1;
            else if((k-i)==0) return i;
            k-=i;
            
        }
        return i;
    }
};