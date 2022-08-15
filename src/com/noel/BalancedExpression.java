package com.noel;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {
    public boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();
//        String opening = "({[<";
        List<Character> opening = Arrays.asList('(','{','[','<');
        List<Character> closing = Arrays.asList(')','}',']','>');
//        String closing = ")}]>";
        char temp=' ';
        for (char c : expression.toCharArray() ) {
            if(opening.contains(c))
                stack.push(c);
            if(closing.contains(c))
                if(stack.empty() || closing.indexOf(c) != opening.indexOf(stack.pop()))
                    return false;

        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}
