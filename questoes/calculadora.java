import java.util.Scanner;
public class calculadora {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();
        System.out.println("Escolha a operação (+, -, *, /): ");
        String operacao = teclado.next();

        double resultado;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.printf("Erro: Divisão por zero não é permitida.");
                    teclado.close();
                    return;
                }
                break;
            default:
                System.out.printf("Operação inválida.");
                teclado.close();
                return;
        }

        System.out.printf("O resultado de %.0f %s %.0f é: %.0f%n", num1, operacao, num2, resultado);
        teclado.close();
    }
}
