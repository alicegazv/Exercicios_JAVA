import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {
        //-Cálculo do Comprimento de um Cercado
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o 1 lado:");
        float lado1 = s.nextFloat();
        System.out.println("Digite o 2 lado:");
        float lado2 = s.nextFloat();
        System.out.println("Digite o 3 lado:");
        float lado3 = s.nextFloat();

        float perimetro = lado1 + lado2 + lado3;


        System.out.println("Comprimento total necessário para a cerca: " + perimetro + " metros");

    }
}
