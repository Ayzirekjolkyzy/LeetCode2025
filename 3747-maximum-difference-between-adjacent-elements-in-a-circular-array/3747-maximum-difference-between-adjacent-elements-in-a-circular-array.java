class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ret=0;
        for(int i=0; i<nums.length-1; i++) {
            ret=Math.max(ret, Math.abs(nums[i]-nums[i+1]));
        }
        ret=Math.max(ret, Math.abs(nums[0]-nums[nums.length-1]));
        return ret;
    }
}