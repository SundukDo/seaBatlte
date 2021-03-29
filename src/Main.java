import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        while (score != 2) {
            int number = scanner.nextInt();
            for (Ships ships : Ships.values()) { // : занесение
                if (number == ships.getNum()) {
                    score++;
                    System.out.println("ВЫ потопили " + ships.getName() + " корабль!");
                    break;
                }
            }
        }
    }

}