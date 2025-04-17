import java.util.Scanner;

public class Questão_04 {
    public static void main(String[] args) {
        //Cálculo do Consumo de Combustível
        Scanner s = new Scanner(System.in);
        System.out.println("Inform me the distance traveled: KM");
        float distanceTraveled = s.nextFloat();
        System.out.println("Inform me the average vehicle consumption: L");
        float averagevehicle = s.nextFloat();

        float spentFuel = distanceTraveled / averagevehicle;

        System.out.printf("Total fuel used:", String.format("%.2f", spentFuel));


        s.close();
    }
}
