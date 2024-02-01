package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = calculateGCD(first, second);
        System.out.println(gcd);
    }

    private int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor gcdCalculator = new GreatestCommonDivisor();
        gcdCalculator.printGCD(30, 25); // Example values, replace with your own
    }
}
