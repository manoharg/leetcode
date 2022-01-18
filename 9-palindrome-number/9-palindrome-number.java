class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int newNum =0;
        int backUpX = x;
        while(x>0){
            newNum = newNum*10+ x%10;
            x=x/10;
        }
        //System.out.println(newNum+ " "+x);
        return backUpX==newNum;
    }
}