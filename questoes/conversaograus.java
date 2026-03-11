package JavaQuestoes.questoes;
import java.util.Scanner;


public class conversaograus {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = teclado.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f%n", fahrenheit);

        teclado.close();
    }   
}
