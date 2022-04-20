class Solution {
    public int minSwaps(String s) {
        
        int cntUn = 0;
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i)==']'){
                if(!stack.isEmpty()&&stack.peek()=='['){
                    stack.pop();
                }else{
                    cntUn++;
                }
            }else{
                stack.push('[');
            }
        }
        
        
       
        return (cntUn+1)/2;
    }
}