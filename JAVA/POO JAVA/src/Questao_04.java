import java.util.Scanner;

public class Questao_04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite 1 valor:");
        float num1 = s.nextInt();
        System.out.println("Digite 2 valor:");
        float num2 = s.nextInt();

        num1 = num1+ num2;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println("Trocando os valores:");
        System.out.println("Valor1 = " + num1 );
        System.out.println("Valor2 = " + num2 );

        //Solicite ao usuário dois valores e troque-os de lugar sem utilizar `if`, `while` ou variáveis auxiliares.

    }
}
