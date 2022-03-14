class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
		// SPLITTING THE PATH TO THEIR RESPECTIVE FOLDER NAMES.
        String[] files = path.split("/");
		
        Stack<String> s = new Stack<>();

        for (String file : files) {
            if (file.equals("") || file.equals(".")) continue;
            if (file.equals("..")) {
                if (!s.isEmpty())
                    s.pop();
                continue;
            }
            s.push(file);
        }

		// EDGE CASE IF WE HAVE NO FILE NAME.
        if (s.isEmpty()) sb.append("/");
		
		//BUILDING THE FILE PATH
        while (!s.isEmpty()) {
            sb.insert(0, s.pop()).insert(0, "/");
        }

        return sb.toString();
        
    }
}