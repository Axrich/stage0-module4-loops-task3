package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = calculateDigitsSum(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }

    private int calculateDigitsSum(int number) {
        // Convert the number to a string to iterate over its digits
        String numberStr = number + "";
        int sum = 0;

        // Iterate through each character in the string and calculate the sum
        for (int i = 0; i < numberStr.length(); i++) {
            // Convert the character back to an integer and add to the sum
            sum += convertCharToInt(numberStr.charAt(i));
        }

        return sum;
    }

    private int convertCharToInt(char ch) {
        // Convert character to integer without using Integer.parseInt
        return ch - '0';
    }

    public static void main(String[] args) {
        // Example usage
        DigitsSum digitsSumCalculator = new DigitsSum();
        digitsSumCalculator.printDigitsSum(12345);
    }
}
