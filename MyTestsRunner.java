public class MyTestsRunner {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.testTrueMinusTransaction();
        test.testTrueSinTransaction();
        test.testTrueSquareTransaction();
        test.testTrueAbsTransaction();
        test.testTrueSqrtTransaction();
    }
}
