class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /**
        Sliding window
        two sided open list  to maintain the max of window. Store only elements which are of use.
        ----------j---------
        Elments lessthan j are useless.
        
        **/
        int start=0,end=0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();
        while(end<nums.length){
            int cur=nums[end];
            while(!queue.isEmpty()&&queue.peekLast()<cur)
                queue.pollLast();
            queue.offer(cur);
            if(end-start+1<k)
                 end++;
            else if(end-start+1==k){
               // System.out.println(queue);
                ans.add(queue.peek());
                if(queue.peek()==nums[start])
                    queue.poll();
                start++;
                end++;
            }
        }
        
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}