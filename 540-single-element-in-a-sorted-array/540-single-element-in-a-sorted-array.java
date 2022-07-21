class Solution {

    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (start == end) break;

            int mid = start + (end - start) / 2;
            if (nums[mid] == nums[mid - 1]) {
               if((mid-1-start)%2==0){
                 start = mid+1;
               }else{
                 end = mid-2;
               }
                
            } else if (nums[mid] == nums[mid + 1]) {
            if((end-mid+1)%2==0){
                 end = mid-1;
               }else{
                 start = mid+2;
               }
            } else {
                return nums[mid];
            }
        }
        return nums[start];
    }
}

//                   [1,1,2,3,3,4,4,8,8]
//                    0 1 2 3 4 5 6 7 8
//                   3-0