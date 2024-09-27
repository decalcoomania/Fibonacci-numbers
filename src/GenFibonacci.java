/**
 * Цей клас представляє генератор чисел Фібоначчі.
 * Він обчислює число Фібоначчі для заданого індексу.
 */
public class GenFibonacci {
    private int index;
    private int value;

    /**
     * Конструктор, який генерує число Фібоначчі для заданого індексу.
     * @param index позиція у послідовності Фібоначчі.
     */
    public GenFibonacci(int index) {
        this.index = index;
        this.value = generateFibonacci(index);
    }

    /**
     * Метод для генерації числа Фібоначчі для заданого індексу за допомогою ітерації.
     * @param n індекс числа Фібоначчі.
     * @return число Фібоначчі на заданому індексі.
     */
    private int generateFibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Гетер для отримання значення числа Фібоначчі.
     * @return значення числа Фібоначчі.
     */
    public int getValue() {
        return value;
    }

    /**
     * Гетер для отримання індексу числа Фібоначчі.
     * @return індекс числа Фібоначчі.
     */
    public int getIndex() {
        return index;
    }
}