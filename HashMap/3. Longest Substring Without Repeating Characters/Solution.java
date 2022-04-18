class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        
     
        
        int i = 0 , j = 0 , ans = 0;
        
        
        for(; j < s.length(); ++j){
            
            char ch = s.charAt(j);
            
        
           hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
            
            while(hashMap.get(ch)>1){
                
                char sh = s.charAt(i);
                int f = hashMap.get(sh);
                if(f==1){
                    hashMap.remove(sh);
                }else{
                    hashMap.put(sh,f-1);
                }
                i++;
            }
            
            ans = Math.max(ans,j-i+1);
            
        }
        
        return ans;
    }
}
