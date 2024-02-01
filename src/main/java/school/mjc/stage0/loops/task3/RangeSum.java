package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBorder, int secondBorder) {
        int sum = 0;

        if (firstBorder > secondBorder) {
            System.out.println("Ошибка: Первая граница должна быть меньше или равна второй.");
            return;
        }

        for (int i = firstBorder; i <= secondBorder; i++) {
            sum += i;
        }

        System.out.println("Сумма чисел от " + firstBorder + " до " + secondBorder + " включительно: " + sum);
    }

    public static void main(String[] args) {
        RangeSum rangeSum = new RangeSum();
        rangeSum.printSumInclusive(1, 5);
    }
}
