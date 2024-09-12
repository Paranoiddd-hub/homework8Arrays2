import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("    Задача 1");

        int[] monthlyExpenses = {10, 40, 50, 60, 40};
        int sum = 0;

        for (int current : monthlyExpenses) {
            sum += current;
        }
        System.out.printf("Сумма затрат за месяц составила %d рублей %n", sum);
        System.out.println();


        //Задача 2
        System.out.println("    Задача 2");
        int[] weeklyExpenses = {1, 4, 5, 6, 4};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int current : weeklyExpenses) {
            if (current >= max) {
                max = current;
            }
            if (current <= min) {
                min = current;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %d рублей %n", min);
        System.out.printf("Максимальная сумма трат за неделю составила %d рублей %n", max);
        System.out.println();


        //Задача 3
        System.out.println("    Задача 3");

        int[] monthlyExpensesTask3 = {11, 22, 33, 44, 54};
        int sumTask3 = 0;

        for (int current : monthlyExpensesTask3) {
            sumTask3 += current;
        }
        double average = (double) sumTask3 / monthlyExpensesTask3.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей %n", average);
        System.out.println();


        //Задача 4
        System.out.println("    Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char current = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = current;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }

    }
}
