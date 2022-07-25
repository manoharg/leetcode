class Solution {
    public String decodeString(String s) {
        
      Stack<String> wordStack = new Stack<>();
      Stack<Integer> countStack = new Stack<>();
      
      int number =0;
      StringBuilder word = new StringBuilder();
      for(char ch: s.toCharArray()){
        if(ch=='['){
           wordStack.push(word.toString());
          countStack.push(number);
          word = new StringBuilder("");
          number =0;
        }else if(ch==']'){
          String popWord = wordStack.pop();
          Integer popCount = countStack.pop();
          
          StringBuilder temp = new StringBuilder();
          for(int i=0;i<popCount;i++){
            temp.append(word);
          }
          //System.out.println("count" + popCount+ " popWord" + popWord);
          word = new StringBuilder(popWord + temp.toString());
        }else{
          
          if(ch>='a'&&ch<='z')
            word.append(ch);
          else{
          
            
            //System.out.println(ch-'0');
            number=number*10+(ch-'0');
           // System.out.println(number);
          }
        }
      }
      
      return word.toString();
      
    }
}