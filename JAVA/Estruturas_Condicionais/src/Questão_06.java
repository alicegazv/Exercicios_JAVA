import java.util.Scanner;

public class Questão_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Conversão de Notas para Conceitos
        //
        //Enunciado: Crie um programa que converta a nota de um aluno em conceito usando a seguinte tabela:
        //
        //    Nota 9 ou 10 → A
        //    Nota 7 ou 8 → B
        //    Nota 5 ou 6 → C
        //    Nota 3 ou 4 → D
        //    Nota abaixo de 3 → E

        System.out.println("Me informe a sua nota:");
        double nota = s.nextDouble();

        if (nota <= 10 && nota >= 9) {
            System.out.println("Sua nota é A");
        } else if (nota >= 8 && nota >= 7) {
            System.out.println("Sua nota é B");
        } else if (nota >= 5 && nota >= 6) {
            System.out.println("Sua nota é C");
        }else if (nota >= 3 && nota >= 4) {
            System.out.println("Sua nota é D");
        } else if (nota < 3){
            System.out.println("Sua nota é E");
        }
    }
}
