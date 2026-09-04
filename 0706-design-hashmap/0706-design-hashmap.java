import java.util.ArrayList;
import java.util.List;

class MyHashMap {
    private final int SIZE = 10007;
    private List<int[]>[] map;
    
    @SuppressWarnings("unchecked")
    public MyHashMap() {
        map = new ArrayList[SIZE];        
    }

    private int hash(int key){
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int i = hash(key);
        if (map[i] == null) {
            map[i] = new ArrayList<>();
        }
        for (int[] pair : map[i]) { 
            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }
        map[i].add(new int[]{key, value});
    }
    
    public int get(int key) {
        int i = hash(key);
        if (map[i] == null) { return -1; }
        for (int[] pair : map[i]) {
            if (pair[0] == key) { return pair[1]; }
        }
        return -1;
    }
    
    public void remove(int key) {
        int i = hash(key);
        if (map[i] == null) {
            return;
        }
        for (int j = 0; j < map[i].size(); j++) {
            if (map[i].get(j)[0] == key) {
                map[i].remove(j);
                return;
            }
        }
    }
}
