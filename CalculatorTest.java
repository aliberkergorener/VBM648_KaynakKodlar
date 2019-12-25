import org.junit.Test;
import org.junit.Assert;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void testTrueMinusTransaction() {
        calculator = new Calculator();
        calculator.mode=Calculator.BiOperatorModes.minus;
        calculator.setNum1(7.00);
        System.out.println("İşlemin sonucu = " + (calculator.calculateBi(calculator.mode,5.00)));
        calculator.setNum1(7.00); //num1 değiştiği için tekrar set edilmiştir.
        Assert.assertTrue("Çıkarma İşlemi Testi Doğrudur",calculator.calculateBi(calculator.mode, 5.0)== 2.0);
    }

    @Test
    void testTrueSinTransaction() {
        calculator = new Calculator();
        System.out.println("İşlemin sonucu = "+ calculator.calculateMono(Calculator.MonoOperatorModes.sin,0.0));
        Assert.assertTrue("Sinüs Alma İşlemi Testi Doğrudur",calculator.calculateMono(Calculator.MonoOperatorModes.sin,0.0)
                ==0.0);
    }

    @Test
    void testTrueSquareTransaction() {
        calculator = new Calculator();
        System.out.println("İşlemin sonucu = " + calculator.calculateMono(Calculator.MonoOperatorModes.square, 4.0));
        Assert.assertTrue("Kare Alma İşlemi Testi Doğrudur", calculator.calculateMono(Calculator.MonoOperatorModes.square, 4.0)
                == 16.0);

    }

    @Test
    void testTrueAbsTransaction() {
        calculator = new Calculator();
        System.out.println("İşlemin sonucu = "+calculator.calculateMono(Calculator.MonoOperatorModes.abs,-4.0));
        Assert.assertTrue("Mutlak Değer Alma İşlemi Testi Doğrudur",calculator.calculateMono(Calculator.MonoOperatorModes.abs
                ,-4.0) == 4.00);

    }

    @Test
    void testTrueSqrtTransaction() {
        calculator = new Calculator();
        System.out.println("İşlemin sonucu = "+calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,25.0));
        Assert.assertTrue("Karekök Alma İşlemi Testi Doğrudur",calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot
                ,25.0) == 5.00);

    }

}