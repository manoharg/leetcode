class Solution {

    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] one = new int[7];
        for (int i = 0; i < tops.length; i++) one[tops[i]]++;
        int freqTop = Integer.MIN_VALUE;
        int top=0;
        for (int i = 0; i < tops.length; i++) {
            if (one[tops[i]] > freqTop) {
                freqTop = one[tops[i]];
                top = tops[i];
            }
        }

        int[] two = new int[7];
        int freqBot = Integer.MIN_VALUE;
        int bot=0;
        for (int i = 0; i < bottoms.length; i++) one[bottoms[i]]++;
        for (int i = 0; i < bottoms.length; i++) {
            if (one[bottoms[i]] > freqBot) {
                freqBot = one[bottoms[i]];
                bot = bottoms[i];
            }
        }
      //  System.out.println("top "+ top);
        int c1 = 0;
        int j = 0;
        for (; j < tops.length; j++) {
            if (tops[j] != top) {
                if (top == bottoms[j]) c1++; else break;
            }
        }
        
      //  System.out.println("j "+ j);
        int c2 = 0;
        int k = 0;
        for (; k < bottoms.length; k++) {
            if (bottoms[k] != bot) {
                if (tops[k] == bot) c2++; else break;
            }
        }
      //  System.out.println("k "+ k);
        
        if (j == tops.length && k == bottoms.length) return Math.min(c1, c2); else if (j == tops.length) return c1; else if (k == bottoms.length) return c2; else return -1;
    }
}
