
class RandomizedSet {
  Map<Integer, Integer> map;
  List<Integer>  list;
    public RandomizedSet() {
        map = new HashMap<>();
      list =   new ArrayList<>();
    }
    
    public boolean insert(int val) {
       
        if(map.containsKey(val))
          return false;
       list.add(val);
      map.put(val, list.size()-1);
      return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))
          return false;
       int ind = map.get(val);
       int last = list.size()-1;
       int temp = list.get(ind);
      map.put(list.get(last),ind);
       list.set(ind, list.get(last));
      list.set(last, temp);
      list.remove(last);
      
      map.remove(val);
      return true;
    }
    
    public int getRandom() {
        Random r = new Random();
        int next = r.nextInt(list.size());
       return list.get(next);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */