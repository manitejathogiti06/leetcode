class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '{' || ch == '['){

                stack.push(ch);
            } else{

                if(stack.isEmpty()){

                    return false;
                }

                char top = stack.pop();  // top element

                // check top element 

                if(ch == ')'&&top != '(' || ch == '}'&& top != '{' || ch == ']'&&top != '['){

                    return false;
                }

                

            }
            
        }

        return stack.isEmpty();
        
    }
}