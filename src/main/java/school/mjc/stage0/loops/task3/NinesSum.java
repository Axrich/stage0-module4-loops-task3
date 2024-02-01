package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSumForRow(int lengthOfLastNumber) {
        long sum = 0;
        long currentNumber = 9;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += currentNumber;
            currentNumber = currentNumber * 10 + 9;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        NinesSum ninesSumCalculator = new NinesSum();
        ninesSumCalculator.calculateSumForRow(5); // Replace 5 with the desired length of the last number
    }
}
