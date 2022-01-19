​
HashMap operations are in average O(1)
String traversal well its O(n) where n is length of string!
Substring(i) its complexity is O(i) according to java 7's new update (update 6).
​
​
n= length of String
O(n*10)
​
```
public List<String> findRepeatedDnaSequences(String s) {
List<String> result = new ArrayList<>();
if(s==null || s.length() <= 10)
{
return result;
}
Map<String,Integer> seen = new HashMap<>();
StringBuilder sb = new StringBuilder(s.substring(0,10));
seen.put(sb.toString(), 1);
for(int i=10; i<s.length(); i++)
{
sb.deleteCharAt(0); // what is the complexity