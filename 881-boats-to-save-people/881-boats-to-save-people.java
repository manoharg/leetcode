class Solution {

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int i = 0;
        int j = people.length - 1;
// 3 3 4 5
        while (i <= j) {
            int cLimit = limit - people[j--];
           if (cLimit > 0) {
                cLimit = cLimit - people[i];
                if (cLimit >= 0) {
                    i++;
                }
            }
            boats++;
        }
        return boats;
    }
}
