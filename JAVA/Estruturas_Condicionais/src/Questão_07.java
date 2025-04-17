import java.util.Scanner;

public class Questão_07 {
    public static void main(String[] args) {
// Identificação do Dia da Semana
//Enunciado:
// Faça um programa que leia um número de 1 a 7 e exiba o nome do dia da semana correspondente.
// Use switch-case
        Scanner s = new Scanner(System.in);

        System.out.println("Me informe um valor para lhe informar o dia da semana:");
        int diaSemana = s.nextInt();
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                break;
        }
    }
}
