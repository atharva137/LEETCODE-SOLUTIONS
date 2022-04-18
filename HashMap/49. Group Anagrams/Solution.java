class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hashMap = new HashMap<>();
        
        List<List<String>> list = new ArrayList<>();
        
        
        for(String str : strs){
            char [] arr = str.toCharArray();
            Arrays.sort(arr);
           String s = new String(arr);
            if(hashMap.containsKey(s)){
                List<String> l = hashMap.get(s);
                l.add(str);
                hashMap.put(s,l);
            }else{
                List<String> arrList = new ArrayList<String>();
                arrList.add(str);
                hashMap.put(s,arrList);
            }
        }
        
        for(String key : hashMap.keySet()){
            list.add(hashMap.get(key));
        }
        
        return list;
        
    }
}