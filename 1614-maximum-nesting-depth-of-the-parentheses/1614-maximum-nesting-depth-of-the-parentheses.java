class Solution {
    public int maxDepth(String s) {

        Stack<Character> stack = new Stack<>();

        int depth = 0;

        int maxdepth = 0;

        for(char ch : s.toCharArray()){

            if(ch == '('){

                stack.push(ch);

                depth++;

                maxdepth = Math.max(maxdepth,depth);
            } else if(ch == ')'){

                stack.pop();

                depth--;


            }
        }

        return maxdepth;
        
    }
}