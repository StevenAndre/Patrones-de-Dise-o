package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Interpreter {
    private List<Expression> expressions= new ArrayList<>();

    public Interpreter(String str){
        for (String token:str.split(" ")){
            if (token.equals("+"))
                expressions.add(new PlusExpresion());
            else if (token.equals("-"))
                expressions.add(new MinusExpresion());
            else
                expressions.add(new NumberExpression(Integer.valueOf(token)));
        }
    }
    public int evaluate(){
        Stack<Integer> stack= new Stack<>();
        for (Expression e: expressions)
            e.interpret(stack);
        return stack.pop();

    }
}
