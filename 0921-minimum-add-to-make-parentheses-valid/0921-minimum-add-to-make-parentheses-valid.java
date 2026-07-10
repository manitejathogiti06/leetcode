class Solution {
    public int minAddToMakeValid(String s) {

        int count = 0;

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '{' || ch == '['){

                stack.push(ch);
            } else{

                if(!stack.isEmpty() && stack.peek() == '('){
                   

                   stack.pop();
                } else{

                    stack.push(ch);


                }
            }
        }
        return stack.size();
    }
}

                