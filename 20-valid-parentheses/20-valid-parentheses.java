class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '['){
                stack.addLast(ch);
            } else if(ch==')') {
                if(stack.size()==0) {
                    return false;
                }else
                {
                    if(stack.getLast()=='(')
                  stack.removeLast();
                    else
                         stack.addLast(ch);
                }
             
            }else if(ch == '}'){
                 if(stack.size()==0) {
                    return false;
                }else
                {
                    if(stack.getLast()=='{')
                  stack.removeLast();
                     else
                         stack.addLast(ch);
                }
             
            }else if(ch == ']') {
                 if(stack.size()==0) {
                    return false;
                }else
                {
                    if(stack.getLast()=='[')
                  stack.removeLast();
                     else
                         stack.addLast(ch);
                }
            }
                   
        }
        return stack.size()==0;
        
    }
}