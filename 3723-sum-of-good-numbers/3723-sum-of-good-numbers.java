class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int summ=0;
        for(int i=0; i<nums.length; i++) {
            if((k+i)>=nums.length||(i-k)<0) {
                if((k+i)>=nums.length&&nums[i]>nums[i-k]) summ+=nums[i];
                else if((i-k)<0&&nums[i]>nums[i+k]) summ+=nums[i];
            }
            else if(nums[i]>nums[i+k]&&nums[i]>nums[i-k]) summ+=nums[i];
        }
        return summ;
    }
}