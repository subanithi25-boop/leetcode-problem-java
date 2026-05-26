class LRUCache {
    int capacity;
    Map<Integer, Integer> map;
    Queue<Integer> q;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        q = new LinkedList<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        q.remove(key);
        q.offer(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            q.remove(key);
        }
        else if(map.size() == capacity){
            map.remove(q.poll());
        }
        q.offer(key);
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */