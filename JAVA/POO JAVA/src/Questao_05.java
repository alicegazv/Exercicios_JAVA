import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args) {
        //Questão: Cálculo de Média de Três Números
        Scanner s = new Scanner(System.in);
        System.out.println("Valor 1:");
        int valor1 = s.nextInt();
        System.out.println("Valor 2:");
        int valor2 = s.nextInt();
        System.out.println("Valor 3:");
        int valor3 = s.nextInt();
        int mediaPonderada = (valor1+valor2+valor3)/3;

        System.out.println("Media Ponderada eh: " + mediaPonderada);
    }
}
