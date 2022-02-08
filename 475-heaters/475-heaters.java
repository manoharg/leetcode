class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        // for each house find its insertion point in heaters and 
        // calculate the distance to left and right heater , take min
        // take max of all radiucs
        Arrays.sort(heaters);
        int rad = Integer.MIN_VALUE;
        for(int house: houses){
            int index = bs(house, heaters);
           // System.out.println("index x"+ index + "for house" + house);
            int left;
            if(index>=1)
                left = house - heaters[index-1];
            else 
                left = Integer.MAX_VALUE;
            int right;
            if(index>=heaters.length)
                right= Integer.MAX_VALUE;
            else
                right=heaters[index]-house;
            
            rad = Math.max(rad, Math.min(left,right));
            
        }
        return rad;
    }
    private int bs(int t, int[] nums){
        int l =0;
        int h=nums.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]==t)
                return m;
            if(nums[m]<t)
                l=m+1;
            else
                h=m-1;
        }
        return l;
            
    }
}