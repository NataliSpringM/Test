public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        System.out.println(calculator.calculatePolishNotation("4 3 +"));
        System.out.println(calculator.calculatePolishNotation("-4 3 +"));
        System.out.println(calculator.calculatePolishNotation("4 3 -"));
        System.out.println(calculator.calculatePolishNotation("4 -3 -"));
        System.out.println(calculator.calculatePolishNotation("4 3 *"));
        System.out.println(calculator.calculatePolishNotation("-4 -3 *"));
        System.out.println(calculator.calculatePolishNotation("4     3    +"));
        System.out.println(calculator.calculatePolishNotation("4 5 3 -1 * + -"));
        System.out.println(calculator.calculatePolishNotation("12"));
        // System.out.println(calculator.calculatePolishNotation("2 3 %"));
        // System.out.println(calculator.calculatePolishNotation(""));

    }
}