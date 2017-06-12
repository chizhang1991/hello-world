public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        if (path == null || path.length() == 0) {
            return path;
        }
        if (path.equals("/../")) {
            return "/";
        }
        // split the path by "/"
        String[] sArray = path.split("/");
        //push valid path into stack
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i].equals("") || sArray[i].equals(".")) {
                continue;
            } 
            else if (!sArray[i].equals("..")) {
                stack.push("/" + sArray[i]);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    continue; // do ../ on "/", do not do anything
                }
            }
        }
        String res = "";
        if (stack.isEmpty()) {
            res = "/";
        }
        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }
        return res;
    }
}