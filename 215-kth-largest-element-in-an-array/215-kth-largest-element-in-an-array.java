class Solution {

    //TC : O(NlogK)
    /*
    add() can be used instead of offere but add throws an exception if capacity is full.
    remove() throws exception.
    
    If you are able to solve the question simly by sorting, then you can use a heap.
    */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.offer(nums[i]);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }
}
