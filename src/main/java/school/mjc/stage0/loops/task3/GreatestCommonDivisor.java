package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int god = calculateGCD(first, second);
        System.out.println("GCD of " + first + " and " + second + " is: " + god);
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
        gcdCalculator.printGCD(12, 634);
    }
}
