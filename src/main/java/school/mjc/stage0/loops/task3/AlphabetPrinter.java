package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char startChar = 'A';
        char endChar = 'Z';

        for (char ch = startChar; ch <= endChar; ch++) {
            System.out.println(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
}
