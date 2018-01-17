class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stackRPN = new Stack<String>();
        String operators = "+-*/";
        for(String token:tokens){
            if(!operators.contains(token)){
                stackRPN.push(token);
            }
            else{
                int a = Integer.valueOf(stackRPN.pop());
                int b = Integer.valueOf(stackRPN.pop());
                int i = operators.indexOf(token);
                switch(i){
                    case 0: stackRPN.push(String.valueOf(a+b));
                        break;
                    case 1: stackRPN.push(String.valueOf(b-a));
                        break;
                    case 2: stackRPN.push(String.valueOf(a*b));
                        break;
                    case 3: 
                        if(a!=0)
                            stackRPN.push(String.valueOf(b/a));
                        break;
                }
            }
        }
        return Integer.valueOf(stackRPN.pop());
    }
}