class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set= new HashSet<>();
        while(n!=1){
            int s = ss(n);
            if(set.contains(s))
                return false;
            set.add(s);
            n=s;
        }
        return true;
    }
    private int ss(int n){
        int s =0;
        while(n>0){
            int last = n%10;
            s= s+ last*last;
            n=n/10;
        }
        return s;
    }
}