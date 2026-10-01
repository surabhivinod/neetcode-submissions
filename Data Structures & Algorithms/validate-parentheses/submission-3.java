class Solution {
    public boolean isValid(String s) {
        //tracking open brackets
        Stack<Character> open = new Stack<>();

        char[] chars = s.toCharArray();

        for(int i = 0; i<chars.length; i++){
            char c = chars[i];
            if( c == '(' ||c =='{' ||c == '[' ){
                open.push(c);
            } else {
                if(open.isEmpty() ){
                    return false;
                }

                char top = open.peek();

                if((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {

                    open.pop();

                } else {
                    return false;
                }
            }
        }
        return open.isEmpty();

    }
}