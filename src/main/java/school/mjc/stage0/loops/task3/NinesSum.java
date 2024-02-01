package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long currentNumber = 9;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += currentNumber;
            currentNumber = currentNumber * 10 + 9;
        }

        System.out.println("Sum of the series is: " + sum);
    }

    public static void main(String[] args) {
        // Example usage
        NinesSum ninesSumCalculator = new NinesSum();
        ninesSumCalculator.calculateSum(4); // Replace 4 with the desired length of the last number
    }
}
