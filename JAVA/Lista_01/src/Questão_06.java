import java.util.Scanner;

public class Questão_06 {
    public static void main(String[] args) {
        //Um cronômetro exibe o tempo em horas, minutos e segundos.
        // Faça um programa que solicite esses três valores e exiba o total correspondente apenas em segundos.
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a hora:");
        float horas = s.nextInt();
        System.out.println("Digite a minutos:");
        float minutos = s.nextInt();
        System.out.println("Digite segundos:");
        float segundos = s.nextInt();

        float h1 = horas * 3600;// Segundos

        float m2 = minutos * 60;

        float TotalDeSegundos = h1 + m2 + segundos;

        System.out.print("Convertendo Horas para segundos: \n" + 1);
        System.out.print("Convertendo Minutos para segundos: \n" + 2);
        System.out.print("Total de Segundos: " + TotalDeSegundos);


    }
}
