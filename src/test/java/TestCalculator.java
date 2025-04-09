import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void test1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2,3),5);
    }

    @Test
    public void test2() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sub(5,3),2);
    }
}
