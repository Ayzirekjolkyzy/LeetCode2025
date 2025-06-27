class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        boolean k=true;
        for(int i=0; i<nums.length; i++) {
            if(i>0&&nums[i]!=nums[i-1]) {
                if (count>1) {
                    for(int j=2; j*j<=count; j++) {
                        if(count%j==0){ 
                            k=false;
                            break;
                        }
                    }
                    if(k==true) return true;
                    count=1;
                    k=true;
                }
            }
            else count++;

        }
         if (count>1) {
            for(int j=2; j*j<=count; j++) {
                if(count%j==0){ 
                    k=false;
                    break;
                }
            }
            if(k==true) return true;
        }
        return false;
    }
}