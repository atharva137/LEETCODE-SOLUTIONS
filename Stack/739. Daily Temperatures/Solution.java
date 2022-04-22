import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //   monotonic stack 
        
        int n = temperatures.length;
        
        int [] ans = new int [n];
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i < n; i++){
            ans [i] = 0;
            
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                
                ans [stack.peek()] = i - stack.pop();
            }
            
            stack.push(i);
        }
        
        return ans;
    }
}