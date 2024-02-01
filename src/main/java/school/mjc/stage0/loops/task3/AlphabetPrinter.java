package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }

    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
}

