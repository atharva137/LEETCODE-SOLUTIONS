class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int [] ans = new int [nums1.length];
        
        for(int i = 0; i < nums2.length; i++){
            
            set.put(nums2[i],-1);
            
            while(!stack.isEmpty()&&nums2[i]>nums2[stack.peek()]){
                
                set.put(nums2[stack.pop()],nums2[i]);
            }
            
            stack.push(i);
        }
        
        
        for(int i = 0; i < nums1.length; i++){
            
            ans[i] = set.get(nums1[i]);
        }
        
        return ans;
    }
}