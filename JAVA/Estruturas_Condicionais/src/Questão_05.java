import java.util.Scanner;

public class Questão_05 {
    public static void main(String[] args) {
        //Cálculo de Média e Aprovação
        //
        //Enunciado: Um aluno faz duas provas. Se sua média for 7 ou mais,
        // ele está aprovado. Caso contrário, está reprovado.
        // Faça um programa que solicite as duas notas e exiba se o aluno foi aprovado ou reprovado.
    Scanner s = new Scanner(System.in);
        System.out.println("Digite a nota da 1 prova:");
        float nota1 = s.nextFloat();
        System.out.println("Digite a nota da 2 prova:");
        float nota2 = s.nextFloat();

         float soma = (nota1 + nota2) / 2;

        if (soma > 7){
            System.out.println("Você está aprovado, sua média: " + String.format("%.2f",soma));
        } else {
            System.out.println("Você não está aprovado");
        }

    }
}
