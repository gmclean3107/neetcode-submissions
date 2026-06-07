class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() <= 1) {
            return false;
        }

        for (int i=0; i<s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("[\\[{(]")) {
                if (i == s.length()-1) {
                    return false;
                }
                stack.push(s.charAt(i));
            } else {
                switch(s.charAt(i)){
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') {
                            return false;
                        }
                        break;

                    case ']':
                        if (stack.isEmpty() || stack.pop() != '[') {
                            return false;
                        }
                        break;

                    case '}':
                        if (stack.isEmpty() || stack.pop() != '{') {
                            return false;
                        }
                        break;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
