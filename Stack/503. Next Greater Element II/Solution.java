class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int [] ans = new int [nums.length];
        
        Stack<Integer> stack = new Stack<Integer>();
        
        Arrays.fill(ans,-1);
        int n = nums.length;
        
        for(int i = 0; i <= (nums.length*2)-1; i++){
            
           while(!stack.isEmpty()&&nums[i%n]>nums[stack.peek()]){
                
                ans[stack.pop()] = nums[i%n];
            }     
            stack.push(i%n);
        }  
   
        return ans;
    }
}