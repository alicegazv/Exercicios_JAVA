import java.util.Scanner;

public class Questão_05 {
    public static void main(String[] args) {
        //Cálculo do Pagamento por Serviço

        // prestador de serviços cobra por hora trabalhada.
        // Faça um programa que solicite o número de horas trabalhadas e o valor cobrado por hora.
        // O programa deve calcular e exibir o valor total a ser pago pelo serviço.
        Scanner s = new Scanner(System.in);
        System.out.println("Me informe o números trabalhados:");
        int horasTrabalhadas = s.nextInt();

        System.out.println("Digite o valor cobrado pela hora:");
        float hours = s.nextFloat();

        double valorTotal = horasTrabalhadas * horasTrabalhadas;

        System.out.println("Valor de horas trabalhadas eh:" + String.format("%.2f", valorTotal));


    }
}
