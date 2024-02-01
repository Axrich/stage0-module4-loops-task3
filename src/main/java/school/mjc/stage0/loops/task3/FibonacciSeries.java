package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("First " + lastFibonacci + " terms of Fibonacci series:");

        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {

        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(10);
    }
}
