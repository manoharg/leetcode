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
/*
 int len = s.length();
        boolean[] b = new boolean[s.length()];
        StringBuilder res = new StringBuilder("");
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<len;++i){
            if(s.charAt(i) == '(') st.push(i);
            else if(s.charAt(i) == ')'){
                if(!st.isEmpty()){
                   // match these pairs, all unmatched are false anyway
                    b[i] = true;
                    b[(int)st.pop()] = true; 
                }
            }else{
                b[i] = true; // any character other than ( and ) are true anyway
            }
        }               
        
        for(int i=0;i<len;++i){
            if(b[i]) res.append(s.charAt(i));
        }   
        
        return res.toString();
*/