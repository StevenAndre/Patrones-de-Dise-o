package interpreter;

import java.util.Stack;

public class MinusExpresion implements Expression{
    @Override
    public void interpret(Stack<Integer> stack) {
        int aux= stack.pop();
        stack.push(stack.pop()-aux);
    }
}
