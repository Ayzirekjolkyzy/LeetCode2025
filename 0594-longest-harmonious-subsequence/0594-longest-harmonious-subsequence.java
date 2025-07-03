class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max, min;
        int ret=0, temp=0;
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i+1]-nums[i]==1) {
                max=nums[i+1];
                min=nums[i];
                temp=0;
                for(int j=0; j<nums.length; j++) {
                    if(nums[j]==max||nums[j]==min) temp++;
                }
                if(temp>ret) ret=temp;
            }
        }
        return ret;
    }
}