
import java.util.Scanner;

    public class Principal {

        public static void main(String[] args) {

            // creo la variable que me permite recibir datos por teclado
            Scanner entrada = new Scanner(System.in);


            System.out.print("Introduce el primer número: ");
            float num1 =entrada.nextFloat();
            System.out.print("Introduce el segundo número: ");
            float num2 =entrada.nextFloat();
            System.out.print("Elije la operación a realizar (+ - * / d m): ");
            char ope = entrada.next().charAt(0);
            float result = 0;
            boolean err = false;
            float MCM = 0;
            float MCD = 0;

//Suma, resta, multiplicación, división, MDM y MCD
            if (ope == '+' ) {
                result = num1 + num2;
            } else if (ope == '-') {
                result = num1 - num2;
            } else if (ope == '*') {
                result = num1 * num2;
            } else if (ope == '/') {
                result = num1 / num2;
            } else if (ope == 'd') {
                result= MCD/(num1) + MCD/(num2);
            } else if (ope == 'm') {
                result = (num1 * num2);
            }else {
                System.out.println("Error! Operación no reconocida");
                err  = true;
            }
            if (!err) {
                System.out.println(num1 + " " + ope + " " + num2 + "=" + result);
            }

        }
    }
