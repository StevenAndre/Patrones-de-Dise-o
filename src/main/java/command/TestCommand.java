package command;

import java.util.Scanner;

public class TestCommand {

    public static void main(String[] args) {
        Player player= new Player(0,0,0);
        MovementInvoker movementInvoker= new MovementInvoker(player);

        Scanner teclado = new Scanner(System.in);
        char m=teclado.next().trim().toLowerCase().charAt(0);
        while(m!='q'){
            movementInvoker.move(m);
            m=teclado.next().trim().toLowerCase().charAt(0);
        }

    }

}

