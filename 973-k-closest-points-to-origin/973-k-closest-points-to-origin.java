class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Max heap where key is x*x+y*y
        // Pop the unnecessary elements .i.e., elements which are farther from origin
        // are not required.
    PriorityQueue<point> pq = new PriorityQueue<>(new Comparator<point>(){
        public int compare(point one, point two){
            return two.dist-one.dist;
        }
    });
        
    for(int i=0;i<points.length;i++){
        int x= points[i][0];
        int y= points[i][1];
        pq.offer(new point(x*x+y*y, x, y));
        if(pq.size()>k)
            pq.poll();
    }
    int[][] res = new int[pq.size()][];
        int i=0;
    while(!pq.isEmpty()){
        point p= pq.poll();
        res[i++]= new int[]{p.x, p.y};
    }
       
    return res;    
    }
    
   
}
 class point{
        int dist;
        int x;
        int y;
        point(int dist, int x, int y){
            this.dist= dist;
            this.x=x;
            this.y=y;   
        }
    }