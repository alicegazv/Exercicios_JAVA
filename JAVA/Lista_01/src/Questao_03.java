import java.util.Scanner;

public class Questao_03 {
    public static void main(String[] args) {
        //Conversão de Altura

        Scanner s = new Scanner(System.in);
        System.out.println("Type your height :");
        float numb = s.nextFloat();
// 1 metro equivale a 39,37 polegadas
        float convert = numb * 39.37F;

        System.out.println("Your height in inches is : " + String.format("%.2f", convert));
        s.close();
    }
}
