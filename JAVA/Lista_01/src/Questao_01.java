import java.util.Scanner;

public class Questao_01 {
    public static void main(String[] args) {
        //Cálculo do Custo Total de Impressão
        Scanner s = new Scanner(System.in);
        System.out.println("Quantas páginas imprimidas:");
        int paginas = s.nextInt();
        float valorPaginas = 1.50F;

        double valorTotal = paginas * valorPaginas;
        System.out.println("Valores das pagínas : " + valorTotal);

        s.close();
    }
}
