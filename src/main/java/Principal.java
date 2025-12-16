
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
        }

        entrada.close();
    }
}
