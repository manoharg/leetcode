class Solution {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        
        int i = 0;
        int j = 0;
        while (i < pushed.length) {
            stack.push(pushed[i++]);
           // System.out.println(stack.peek()+ " "+ popped[j]);
            while (j<popped.length&&!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
    
        if(stack.isEmpty())
            return true;
        return false;
    }
}
