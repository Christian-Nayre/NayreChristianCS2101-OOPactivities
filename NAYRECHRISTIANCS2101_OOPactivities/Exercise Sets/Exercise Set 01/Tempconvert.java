import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Celcius value: ");
        Double celcius = input.nextDouble();

        double farenheit = (celcius * 9/5) + 32;
        
        System.out.printf("%.2f Celsius is %.2f Farenheit%n", celcius, farenheit);

        input.close();
    }
}
