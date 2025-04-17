import java.util.Scanner;

public class Questão_03 {
    public static void main(String[] args) {
        //Classificação de Números
        //
        //Enunciado: Faça um programa que solicite um número ao
        // usuário e verifique se ele é positivo, negativo ou zero.
        Scanner s = new Scanner(System.in);

        System.out.println("Me informe um algum número:");
         float num = s.nextFloat();

         if (num == 0 ){
             System.out.println("O seu numero é zero");
         } else if ( num > 0) {
             System.out.println("Seu numero é positivo.");
         }else {
             System.out.println("Seu numero é negativo.");
         }
    }
}
