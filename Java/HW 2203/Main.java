import java.util.Scanner;
public class Main {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Первоначальное значение A и B: " + firstNumber + secondNumber);
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;

        System.out.println("Финальное значение A и B: " + firstNumber + secondNumber);

        
    }

}
