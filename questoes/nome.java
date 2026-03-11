package JavaQuestoes.questoes;

import java.util.Scanner;
public class nome {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String nome = teclado.nextLine();
    if(nome.toLowerCase().startsWith("a")){
        System.out.printf("Seu nome é: %s%n", nome);
    }
    teclado.close();
    }
}