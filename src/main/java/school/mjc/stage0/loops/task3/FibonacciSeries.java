package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacciPrintsFirstThree() {
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 0; i < 3; i++) {
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacciPrintsFirstThree();
    }
}
