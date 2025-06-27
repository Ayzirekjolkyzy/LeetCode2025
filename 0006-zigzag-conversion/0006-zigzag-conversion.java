class Solution {
    public String convert(String s, int numRows) {
        
        int sizee=s.length();
        if(sizee==1||numRows==1) return s;
        else {
            int a=numRows*2-2; 
            int b=0;
            String ret="";
            boolean k=false;
            boolean temp=false;
            for(int i=0; i<numRows; i++) {
                if(a==0||b==0) k=true;
                else k=false;
                for(int j=i; j<sizee; ) {
                    ret=ret+s.charAt(j);
                    if(k==true) {
                        j+=(a+b); 
                    }
                    else {
                        if(temp==true) {
                            j+=b;
                            temp=false; 
                        }
                        else {
                            j+=a;
                            temp=true;    
                        } 
                    }
                    
                }
                a-=2;
                b+=2;
                temp=false;
            }
             return ret;
        }
        
    }
}