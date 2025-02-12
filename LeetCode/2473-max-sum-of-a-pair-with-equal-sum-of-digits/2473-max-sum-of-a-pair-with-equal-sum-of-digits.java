class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max=-1;
        
        for(int num : nums) {
            int sum = sumOfDig(num);
            if(map.containsKey(sum)) {
                max=Math.max(max, map.get(sum)+num);
                map.put(sum, Math.max(map.get(sum), num));
            }
            else map.put(sum, num);
        }
        return max;
    }

    public int sumOfDig(int n) {
        int ret=0;
        while(n>0) {
            ret+=n%10;
            n/=10;
        }
        return ret;
    }
}
