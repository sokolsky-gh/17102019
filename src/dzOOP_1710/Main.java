package dzOOP_1710;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    void main(String[] args) {
        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
    }

    void print() {
        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
    }
}

class Utils extends Main {
    public static void print(String text) {
        System.out.println(text);
    } //должен просто выводить текст в консоль

    public static void print(String text, Color color) {
        System.out.println( + text + ANSI_RESET);
    } //выводить в консоль текст окрашенный в переданный цвет
}
