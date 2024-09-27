import java.util.Scanner;

/**
 * Основний клас для тестування класу GenFibonacci та перевірки математичної умови.
 */
public class Main {
    /**
     * Основний метод, який зчитує введення, створює об'єкти Фібоначчі і перевіряє умову.
     * @param args аргументи командного рядка.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть m: ");
            int m = scanner.nextInt();
            System.out.print("Введіть n: ");
            int n = scanner.nextInt();
            System.out.print("Введіть k: ");
            int k = scanner.nextInt();

            // Перевірка, що m >= k
            if (m < k) {
                System.out.println("Помилка: m повинно бути більшим або рівним k.");
                return;
            }

            // Створення об'єктів Фібоначчі
            GenFibonacci fibM = new GenFibonacci(m);
            GenFibonacci fibN = new GenFibonacci(n);
            GenFibonacci fibK = new GenFibonacci(k);
            GenFibonacci fibNM = new GenFibonacci(n + m);
            GenFibonacci fibNK = new GenFibonacci(n + k);
            GenFibonacci fibMK = new GenFibonacci(m - k);

            // Обчислення знака на основі k
            int sign = (k % 4 == 0) ? 1 : -1;

            // Перевірка умови за допомогою значень з об'єктів GenFibonacci
            boolean result = sign * (fibM.getValue() * fibNK.getValue() - fibK.getValue() * fibNM.getValue())
                    == fibMK.getValue() * fibN.getValue();

            // Виведення результату
            System.out.println(result);
        }
    }
}
