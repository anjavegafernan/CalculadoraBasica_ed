
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = entrada.nextDouble();


        System.out.print("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Elige la operación a realizar (+ - * /): ");
        char ope = entrada.next().charAt(0);

        double result;

        switch (ope) {
            case '+':

            System.out.print("Introduce el primer número: ");
            float num1 =entrada.nextFloat();
            System.out.print("Introduce el segundo número: ");
            float num2 =entrada.nextFloat();
            System.out.print("Elije la operación a realizar (+ - * / d m): ");
            char ope = entrada.next().charAt(0);
            float result = 0;
            boolean err = false;
            float MCM = 0;


//Suma, resta, multiplicación, división
            if (ope == '+' ) {

                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;

                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: no se puede dividir entre 0.");
                } else {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Operación no válida. Debe ser +, -, * o /.");

            } else if (ope == '/') {
                result = num1 / num2;
            }else {
                System.out.println("Error! Operación no reconocida");
                err  = true;
            }
            if (!err) {
                System.out.println(num1 + " " + ope + " " + num2 + "=" + result);
            }

        }

        entrada.close();
    }
}
