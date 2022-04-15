public class Solution {
        public int maxArea(int[] height) {
        
        int ans =  0;
        int i = 0, j =  height.length-1;
        while(i<=j){
            int l = Math.min(height[i],height[j]);
            ans = Math.max(ans,l*(j-i));
            
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
