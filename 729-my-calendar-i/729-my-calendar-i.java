class MyCalendar {
    TreeMap<Integer, Integer> map;
    public MyCalendar() {
          map = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
      
        Map.Entry<Integer, Integer> floor = map.floorEntry(start);
      Map.Entry<Integer, Integer> ceiling = map.ceilingEntry(start);
     // System.out.println(floor);
     // System.out.println(ceiling);
      
      if(floor!=null && start<floor.getValue()){
            return false;
      } else if(ceiling!=null && ceiling.getKey()<end){
         return false;
      }
      map.put(start, end);
      return true;
  
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */