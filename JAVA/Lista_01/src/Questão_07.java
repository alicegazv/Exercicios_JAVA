import java.util.Scanner;

public class Questão_07 {
    //Cálculo do Volume de um Cilindro
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digita um valor do raio :");
        double raio = s.nextDouble();
        System.out.println("Digite a altura:");
        float h = s.nextFloat();


        double V;      //  Área do círculo = πr²relembrando se for usar math tem que colocar como double por conta da memoria da capacidae do codigo.
        V = Math.PI * Math.pow(raio, 2) * h;

        System.out.println(" volume total  eh: " + String.format("%.2f", V));


    }
}
