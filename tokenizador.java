import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dave on 13/05/16.
 * programa que tokeniza una linea de codigo conforme a la sig tabla
 *
 * if
 * else
 * comparacion  < o > o <= o => o == 0 !=
 * numero
 * literal
 *
 * Los valores que no cumplan con la tabla detendran el proceso de tokenizado
 */
public class tokenizador {

    public static void tabla(String [] str, int contadorCiclo){

        int i;
        if (str[contadorCiclo].matches("[0-9]*")){
            System.out.print(" <numero>");
        }
        if (str[contadorCiclo].matches("[A-za-z0-9]{1,}") != str[contadorCiclo].equals("else") !=  str[contadorCiclo].equals("if")){

            i = contadorCiclo + 1;

            System.out.print(" <id"+i+">");

        }
        if (str[contadorCiclo].matches("'[A-za-z]{1,}")){
            System.out.print(" <literal>");
        }
        if (str[contadorCiclo].equals("==")||str[contadorCiclo].equals("<=")||str[contadorCiclo].equals(">=")||
                str[contadorCiclo].equals("!=")||str[contadorCiclo].equals("<")||str[contadorCiclo].equals(">")){
            System.out.print(" <comparacion>");
        }
        if (str[contadorCiclo].equals("if") || str[contadorCiclo].equals("else") ){
            System.out.print(" <Reservada>");
        }


    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        System.out.print("Ingresa una linea de codigo: ");
        String linea = leer.nextLine();
        

        String[] cut = linea.split("\\s");

        for (int i = 0; i < cut.length; i++) {
            if (cut[i].equals("=")||cut[i].equals("+")||cut[i].equals("-")||cut[i].equals("*")||cut[i].equals("/")
                    ||cut[i].equals("for")||cut[i].equals("while")||cut[i].equals(")")||cut[i].equals("(")
                    ||cut[i].equals("breake")||cut[i].equals("case:")||cut[i].equals("}")||cut[i].equals("{")
                    ||cut[i].equals("[")||cut[i].equals("]")||cut[i].equals("||")||cut[i].equals("&&")||cut[i].equals("$")
                    ||cut[i].equals("?")){
                System.out.print(" Error al tokenizar "+cut[i]+" no encontrado ");
                break;
            }else {
                tabla(cut, i);
            }
        }



    }
}
