class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
      Map<Integer, Long> map = new HashMap<>();
      long day =0;
      for(int task: tasks){
        day++;
        if(map.containsKey(task)){
          long x= map.get(task);
          day = Math.max(day, map.get(task));
          map.put(task, day+space+1);
        }else{
          map.put(task, day+space+1);
        }
      }
      return day;
        
    }
}