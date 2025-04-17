import java.util.Scanner;

public class Questao_02 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Digita um valor do raio :");
            float raio = s.nextFloat();
            System.out.println("Digite a area lateral:");
            float altura = s.nextFloat();


            double areatotal=  2 * Math.PI * raio * (raio + altura);       //  Área do círculo = πr²relembrando se for usar math tem que colocar como double por conta da memoria da capacidae do codigo.

            System.out.println("Area total eh: " + areatotal);

            //Escreva um programa que peça o raio de um círculo e exiba sua área. Área total = 2πr(r + h


        }}

