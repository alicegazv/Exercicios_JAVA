import java.util.Scanner;

public class Questão_01 {
    public static void main(String[] args) {
        //Verificação de Idade para Habilitação
        //
        //Enunciado: Faça um programa que solicite a idade do usuário e verifique
        // se ele pode obter a carteira de motorista. Se a idade for igual ou superior a 18 anos, exiba
        // "Você pode tirar a carteira de motorista", senão, exiba
        // "Você ainda não pode tirar a carteira de motorista".

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = s.nextInt();
        if (idade > 18){
        System.out.println("Você pode tirar carteira de motorista, pois você tem: " + idade + " anos.");
        } else {
            System.out.println("Você não pode tirar a carteira, pois você tem: " +  idade + " anos.");
        }

    }
}
