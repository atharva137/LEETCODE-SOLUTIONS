class MyHashSet {

    boolean [] map;
    public MyHashSet() {
        
        map = new boolean [1000000+1];
    }
    
    public void add(int key) {
        
        map[key] = true;
    }
    
    public void remove(int key) {
        map[key] = false;
    }
    
    public boolean contains(int key) {
        
        if(map[key]) return true;
        
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */