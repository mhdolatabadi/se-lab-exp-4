package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DivideSqrtStepDefinition {
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two integer input values, (\\d+) and (\\d+)$")
    public void twoIntegerInputValuesAAndB(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I divide the a on b and sqrt$")
    public void iDivideTheAOnBAndSqrt() {
        result = calculator.divideAndSqrt(value1, value2);
        System.out.println(result);
    }

    @Then("^I expect the result to be (\\d+)$")
    public void iExpectTheResultToBeResult(int arg0) {
        Assert.assertEquals(arg0, result);
    }

}
