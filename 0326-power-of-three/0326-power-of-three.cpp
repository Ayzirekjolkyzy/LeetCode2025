class Solution {
public:
    bool isPowerOfThree(int n) {
        bool k=true;
      if(n<=0) return false;
      if(n==1) return true;
      else{ 
          while(n>1) {
              if(n%3) { k=false; break;}
              n=n/3;
            } return k;

        }
    }   
    
};