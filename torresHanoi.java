import javax.swing.JOptionPane;
import java.util.*;

/**
 * Created by dave on 22/06/17.
 *
 * Juego interactivo de las torres de hanoi utilizando pila dinamica de java
 * eliges torres que quieres mover.
 */

public class torresHanoi {

    public Stack<Integer> torre1, torre2, torre3, aux;

    public torresHanoi() {
        torre1 = new Stack<Integer>();
        torre2 = new Stack<Integer>();
        torre3 = new Stack<Integer>();
        aux = new Stack<Integer>();

        for (int i = 7; i > 0; i--) {
            torre1.push(i);
            aux.push(i);
        }

    }

    public String imprime(){
        String torres[] = {"T1", "T2", "T3"};

        return  torres[0]  +Arrays.toString(torre1.toArray())+"\n"+
                torres[1] + Arrays.toString(torre2.toArray())+"\n"
                +torres[2] + Arrays.toString(torre3.toArray());

    }

    public boolean win(){
        boolean chek = false;
        int cont = 0;
        Object[] tower  = torre3.toArray();
        Object[] tower2 = aux.toArray();

        for (int i = 0; i < tower.length; i++) {
            if (tower[i] == tower2[i]) {
                cont++;
            }
        }
        if (cont == tower2.length)
            chek = true;

        return chek;
    }

    public void game() {
        int c = 0;
        int movments = 0;

        JOptionPane.showInputDialog(null,"\t                          Instrucciones\n\n" +
                "Para seleccionar una torre seleccione un numero:\n" +
                "T1 = 1\n" +
                "T2 = 2\n" +
                "T3 = 3\n" +
                "q para abandonar el juego");
        JOptionPane.showMessageDialog(null,"A jugar!!!!");

        while (true) {

            try {
                if (win() == true) {
                    JOptionPane.showMessageDialog(null, "You win!!\n " +
                            "Cantidad de movimientos: " + movments);
                    break;

                }
                String movi1 = JOptionPane.showInputDialog(null,
                        imprime()+"\n q para abandonar el juego\n" + "\n Movimientos realizados: " + movments  +"\nDe que torre quieres mover?");

                int num1 = Integer.parseInt(movi1);
                if ((num1 == 1 || num1 == 2 || num1 == 3)) {
                    c = num1;

                    switch (c) {
                        case 1: //Mover los dados de la torre 1 a la 2 & 3
                            if (win() == true)
                                JOptionPane.showMessageDialog(null, "You win!!\n " +
                                        "Cantidad de movimientos: " + movments);
                            int chose = 0;
                            chose = Integer.parseInt(JOptionPane.showInputDialog("A que torre deseas mover?"));

                            if (chose == 2) {// moviendo de la torre1 a la torre 2

                                if (torre2.isEmpty()) {
                                    torre2.push(torre1.pop()); // agragando dato a la torre 2
                                    movments++;
                                } else if (torre1.peek() < torre2.peek()) {
                                    torre2.push(torre1.pop());
                                    movments++;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Movimiento invalido");
                                    movments++;
                                }
                            }

                            if (chose == 3) { // moviendo de la torre1 a la torre 3
                                if (torre3.isEmpty()) {
                                    torre3.push(torre1.pop()); // agragando dato a la torre 3
                                    movments++;
                                } else if (torre1.peek() < torre3.peek()) {
                                    torre3.push(torre1.pop());
                                    movments++;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Movimiento invalido");
                                    movments++;
                                }
                            }
                            break;

                        case 2: // elecciones para torre 2
                            try {
                                int chose2 = 0;
                                chose = Integer.parseInt(JOptionPane.showInputDialog("A que torre deseas mover?"));

                                if (chose == 1) {// moviendo de la torre2 a la torre 1

                                    if (torre1.isEmpty()) {
                                        torre1.push(torre2.pop()); // agragando dato a la torre 2
                                        movments++;
                                    } else if (torre2.peek() < torre1.peek()) {
                                        torre1.push(torre2.pop());
                                        movments++;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Movimiento invalido");
                                        movments++;
                                    }
                                }

                                if (chose == 3) { // moviendo de la torre2 a la torre 3
                                    if (torre3.isEmpty()) {
                                        torre3.push(torre2.pop()); // agragando dato a la torre 3
                                        movments++;
                                    } else if (torre2.peek() < torre3.peek()) {
                                        torre3.push(torre2.pop());
                                        movments++;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Movimiento invalido");
                                        movments++;
                                    }
                                }
                            } catch (Exception error) {
                                if (error instanceof EmptyStackException) {
                                    JOptionPane.showMessageDialog(null, "Torre vacia...");
                                } else if (error instanceof NumberFormatException) {
                                    if (error.getMessage().contains("q")){
                                        JOptionPane.showMessageDialog(null, "Las torres no son para bebes");
                                        break;
                                    }
                                    JOptionPane.showMessageDialog(null, "seleccione una torre!!");
                                }
                                movments++;
                            }
                            break;

                        case 3: // elecciones para torre 3
                            try {
                                int chose3 = 0;
                                chose = Integer.parseInt(JOptionPane.showInputDialog("A que torre deseas mover?"));

                                if (chose == 2) {// moviendo de la torre3 a la torre 2

                                    if (torre2.isEmpty()) {
                                        torre2.push(torre3.pop()); // agragando dato a la torre 3
                                        movments++;
                                    } else if (torre3.peek() < torre2.peek()) {
                                        torre2.push(torre3.pop());
                                        movments++;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Movimiento invalido");
                                        movments++;
                                    }
                                }

                                if (chose == 1) { // moviendo de la torre 3 a la torre 1
                                    if (torre3.isEmpty()) {
                                        torre3.push(torre1.pop()); // agragando dato a la torre 3
                                        movments++;
                                    } else if (torre3.peek() < torre1.peek()) {
                                        torre1.push(torre3.pop());
                                        movments++;
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Movimiento invalido");
                                        movments++;
                                    }
                                }
                            } catch (Exception error) {
                                if (error instanceof EmptyStackException) {
                                    JOptionPane.showMessageDialog(null, "Torre vacia...");
                                } else if (error instanceof NumberFormatException) {
                                    if (error.getMessage().contains("q")){
                                        JOptionPane.showMessageDialog(null, "Las torres no son para bebes");
                                        break;
                                    }
                                    JOptionPane.showMessageDialog(null, "seleccione una torre!!");
                                }
                                movments++;
                            }

                            break;
                    }

                } else {
                    String asw = "";
                    JOptionPane.showMessageDialog(null, "ERROR OPCION INCORRECTA");
                    c = -1000;

                    asw = JOptionPane.showInputDialog(null, "¿seguir jugando si o no?");

                    if (asw.equals("no"))
                        break;
                }
            } catch (NumberFormatException error) {
                if (error.getMessage().contains("q")){ // evaluando si se quiere ser gallina
                    JOptionPane.showMessageDialog(null, "Las torres no son para bebes");
                    break;
                }
                JOptionPane.showMessageDialog(null,"Seleccione una torre!!");
            }
        }
    }

    public static void main(String[] args) {

        torresHanoi hanoi = new torresHanoi();

        hanoi.game();

    }
}
