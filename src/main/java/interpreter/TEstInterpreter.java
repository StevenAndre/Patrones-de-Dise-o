package interpreter;

public class TEstInterpreter {
    public static void main(String[] args) {
        String exp= "4 8 3 - +";

        System.out.println("Resultado "+new Interpreter(exp).evaluate());
    }
}
//TODO observation here