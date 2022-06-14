class Solution {
    public int percentageLetter(String s, char letter) {
        int freq=0;
        for(char ch:s.toCharArray()){
            if(ch==letter){
                freq++;
            }
        }
        System.out.println(freq);
        double temp = (freq*1.0*100/s.length());
         //System.out.println(temp);

        return (int)temp;
    }
}