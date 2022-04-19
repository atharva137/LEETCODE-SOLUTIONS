import java.util.HashMap;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hashMap = new HashMap<Integer,Boolean>();
        
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i], true);
        }
        
        
        for(int key : hashMap.keySet()){
            
            if(hashMap.containsKey(key-1)){
                hashMap.put(key,false);
            }
        }
        
        int len = 0;
        for(int key : hashMap.keySet()){
            
            if(hashMap.get(key)){
                int curr = 1;
                while(hashMap.containsKey(key+1)){
                    key = key +1;
                    curr++;
                }
                if(curr>len){
                    len = curr;
                }
            }         
        }
        
        return len;
    }
}