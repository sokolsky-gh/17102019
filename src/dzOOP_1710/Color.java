package dzOOP_1710;

public enum Color {

    ANSI_RESET("\u001B[0m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m");
    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    static Color[] colorList = Color.values();

    static int rndInd;

    public static void Rndm(String[] args) {
        int colorArrSize = Color.colorList.length;
        final int max = colorArrSize;
        final int rnd = rnd(max);
    }

    public static int rnd(int max) {
        rndInd = (int) (Math.random() * ++max);
    }

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
    }
}

class Utils{
    @Override
    
}







