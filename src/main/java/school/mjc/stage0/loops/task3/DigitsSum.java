package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = calculateDigitsSum(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }

    private int calculateDigitsSum(int number) {
        String numberStr = number + "";
        int sum = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            sum += Integer.parseInt(numberStr.charAt(i) + "");
        }

        return sum;
    }

    public static void main(String[] args) {
        DigitsSum digitsSumCalculator = new DigitsSum();
        digitsSumCalculator.printDigitsSum(66342);
    }
}
