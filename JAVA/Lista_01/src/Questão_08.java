import java.util.Scanner;

public class Questão_08 {
    public static void main(String[] args) {
        //Cálculo da Nota Final de um Aluno

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o valor da Prova A:");
        float a = s.nextFloat();
        System.out.println("Digite o valor da Prova B:");
        float b = s.nextFloat();
        System.out.println("Digite o valor da Prova C:");
        float c = s.nextFloat();

        float P1 = a * 2;
        float P2 = b * 3;
        float P3 = c * 5;

        float mediaP = (P1 + P2 + P3) / 10;

        System.out.println("Sua nota:" + String.format("%.2f", mediaP));


    }
}
