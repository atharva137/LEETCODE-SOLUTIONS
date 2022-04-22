class Solution {
    public long subArrayRanges(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            for(int j = i; j < nums.length; j++){
                
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
                
                sum += max-min;
            }
        }
        
        return sum;
    }
}