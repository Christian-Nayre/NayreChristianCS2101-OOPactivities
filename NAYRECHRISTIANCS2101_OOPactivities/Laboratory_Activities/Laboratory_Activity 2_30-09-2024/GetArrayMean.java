import java.util.Scanner;

public class GetArrayMean {

    public static double getMean(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        while (true) {
            System.out.print("Enter the number of elements: ");
            if (input.hasNextInt()) {
                n = input.nextInt();
                if (n <= 0) {
                    System.out.println("Please enter a positive integer.");
                    input.nextLine();
                    continue;
                }
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine(); 
            }
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter number: ");
                if (input.hasNextInt()) {
                    numbers[i] = input.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    input.nextLine();
                }
            }
        }

        try {
            double mean = getMean(numbers);
            System.out.println("Mean of array is: " + String.format("%.2f", mean));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}