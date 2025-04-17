import java.util.Scanner;

public class Questao_06 {
    public static void main(String[] args) {
        //Crie um programa que peça ao usuário seu nome e sobrenome separadamente e exiba o nome completo em uma única linha.
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu nome :");
        String nome = s.next() ;
        System.out.print("Digite o seu sobrenome:");
        String sobrenome = s.next();

        System.out.print( nome + " " + sobrenome) ;

// Estudar metodo Strig slip
    }
}
