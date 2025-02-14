class Solution {
    public int countPartitions(int[] nums) {
        int ret=0;
        int sum1=0, sum2=nums[0];
        for(int i=1; i<nums.length; i++) {
            sum1+=nums[i];
        }
        for(int i=1; i<nums.length-1; i++) {
            if((sum1-sum2)%2==0) ret++;
            sum1-=nums[i];
            sum2+=nums[i];
        }
        if((sum1-sum2)%2==0) ret++;
        return ret;
    }
}