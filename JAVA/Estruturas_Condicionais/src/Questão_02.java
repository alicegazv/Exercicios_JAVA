import java.util.Scanner;

public class Questão_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Uma loja oferece descontos baseados no valor da compra:
        //
        //    Até R$ 100,00 → Sem desconto
        //    De R$ 100,01 a R$ 500,00 → 10% de desconto
        //    Acima de R$ 500,00 → 15% de desconto
        //
        //Faça um programa que leia o valor da compra e exiba o total com o desconto aplicado.

        System.out.println("Me informe o valor da sua compra:");
        int compra = s.nextInt();

        if (compra > 500){  //multiplique o preço original
            // pelo percentual de desconto dividido por 100. Depois,
            // subtraia o valor do desconto do preço original
            float desconto =  (compra * 15) /100 ;
            System.out.println("Sua compra aplica um desconto: " + desconto);
        } else if (compra == 100.01 && compra > 500 ) {
            float desconto2 = (compra * 100)  /100 ;
            System.out.println ("Sua compra aplica um desconto: " + desconto2);
        } else {
            System.out.println("Sua compra NÃO aplica um desconto:" + compra);
        }
s.close();
    }
}
