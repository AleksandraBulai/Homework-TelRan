import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumbers = {250, 34, 10, 55, 78, 11, 22, 63875, 2, 7};
        System.out.println("Сортировать по возрастанию: ");
        boolean isIncrease = scanner.nextBoolean();
        sorter(arrayNumbers, isIncrease);
    }
    public static void sorter(int[] numbers, boolean isIncrease) {
        int num = 0;
        if (isIncrease) {
            for (int index = 0; index < numbers.length - 1; index++) {
                for (int indexJ = index+1; indexJ < numbers.length; indexJ++){
                    if (numbers[index] > numbers[indexJ]) {
                        num = numbers[index];
                        numbers[index] = numbers[indexJ];
                        numbers[indexJ] = num;
                    }
                }
            }
        }
        else {
            for (int index = 0; index < numbers.length - 1; index++) {
                for (int indexJ = index+1; indexJ < numbers.length; indexJ++){
                    if (numbers[index] < numbers[indexJ]) {
                        num = numbers[index];
                        numbers[index] = numbers[indexJ];
                        numbers[indexJ] = num;
                    }
                }
            }
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
