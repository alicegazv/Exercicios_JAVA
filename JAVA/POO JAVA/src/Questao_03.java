import java.util.Scanner;

public class Questao_03 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            //Crie um programa que solicite ao usuário a distância (km) e a velocidade média (km/h)
            // de uma viagem, e exiba o tempo estimado de viagem (horas).
            System.out.println("Digite a distancia");
            float km = s.nextFloat();

            System.out.println("Digite a velocidade:");
            float v = s.nextFloat();

            float veocidadeMedia = km/v;

            System.out.println("Valor estimado por hora eh: " + veocidadeMedia);
}
}
