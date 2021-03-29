import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        int num = (int) (Math.random() * 10);
        int[] array = {num, num + 1, num + 2, num + 3};

        Scanner scanner = new Scanner(System.in);

        while (score != 4) {
            int number = scanner.nextInt();
            for (int i : array) {
                if (number == i) {
                    score++;
                    System.out.println(number + " есть в массиве");
                    break;
                }
            }
            if (score == array.length) {
                System.out.println("Вы потопмли корабль!");
            }
        }
    }
}
