class FreqStack {

    class Pair {
        int num;
        int count;
        int time;

        Pair(int num, int count, int time) {
            this.num = num;
            this.count = count;
            this.time = time;
        }
    }

    private PriorityQueue<Pair> queue;
    private HashMap<Integer, Integer> map;
    private int clock = 0;

    public FreqStack() {
        queue = new PriorityQueue<Pair>((a, b) -> (a.count == b.count ? b.time - a.time : b.count - a.count));
        map = new HashMap();
    }

    public void push(int x) {
        Pair pair = new Pair(x, map.getOrDefault(x, 0) + 1, clock++);
        map.put(x, map.getOrDefault(x, 0) + 1);
        queue.offer(pair);
    }

    public int pop() {
        Pair cur = queue.poll();
        // update
        map.put(cur.num, map.getOrDefault(cur.num, 0) - 1);
        return cur.num;
    }
}
/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
