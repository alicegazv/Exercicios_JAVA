import java.util.Scanner;

public class Questão_04 {
    public static void main(String[] args) {
        //Verificação de Par ou Ímpar
        //
        //Enunciado: Faça um programa que leia um número inteiro e verifique se ele é par ou ímpar.
        Scanner s = new Scanner(System.in);
        System.out.println("Me informe um número:");
        int num = s.nextInt();

        if ( num % 2 == 0){
            System.out.println("Seu número é par");
        } else {
            System.out.println("Seu número é impar");
        }
    }
}
