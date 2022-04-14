import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        
        for(int val : nums2){
           hashMap.put(val,hashMap.getOrDefault(val,0)+1);
        }
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i = 0; i < nums1.length; i++){
            
            if(hashMap.containsKey(nums1[i])){
                hashMap.put(nums1[i],hashMap.get(nums1[i])-1);
                arrList.add(nums1[i]);
                hashMap.remove(nums1[i],0);
            }
        }
        
        int [] arr =  new int [arrList.size()];
        
        for(int i = 0; i < arrList.size(); i++){
            arr[i] = arrList.get(i);
        }
        return arr;
    }
    
}