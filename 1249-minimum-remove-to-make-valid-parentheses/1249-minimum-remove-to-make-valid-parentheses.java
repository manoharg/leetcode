class Solution {
    public String minRemoveToMakeValid(String s) {
    Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack.push(i);
            else if(s.charAt(i)==')'){
                if(!stack.isEmpty()&&s.charAt(stack.peek())=='(')
                    stack.pop();
                else
                    stack.push(i);
            }
        }
        int j=s.length()-1;
        StringBuilder sb = new StringBuilder();
      //  System.out.println(stack);
        while(j>=0){
            if(!stack.isEmpty()&&stack.peek()==j){
                stack.pop();
                j--;
            }else{
                sb.append(s.charAt(j));
                j--;
            }
            
        }
        return sb.reverse().toString();
            
    }
    
}