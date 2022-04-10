class Solution {
    public int calPoints(String[] ops) {
        Stack<String> stack = new Stack<>();
        for(String op:ops){
            if(op.equals("+")) {
                int last = Integer.parseInt(stack.pop());
                int secondlast = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(secondlast));
                stack.push(Integer.toString(last));
                stack.push(Integer.toString(last+secondlast));
                
            }else if(op.equals("D")){
                int last = Integer.parseInt(stack.peek());
                stack.push(Integer.toString(last+last));
            }else if(op.equals("C")) {
                stack.pop();
            }else
            {
                stack.push(op);
            }
        }
        int sum=0;
        while(stack.size()!=0){
            sum+= Integer.parseInt(stack.pop());
        }
        return sum;
    }
}