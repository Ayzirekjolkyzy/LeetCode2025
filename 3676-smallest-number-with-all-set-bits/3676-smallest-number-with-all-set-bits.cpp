class Solution {
public:
    int smallestNumber(int n) {
        int i=n, k=0;
        while(i>0) {
            k++;
            i/=2;
        }
        if(n>(pow(2.0, k)-1)) 
            return (pow(2.0, k+1)-1);
        else
            return (pow(2.0,k)-1);

    }
};