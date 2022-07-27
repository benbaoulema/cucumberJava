package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.DayChecker;

import static org.junit.jupiter.api.Assertions.*;

public class FridayCheckerSteps {
    String today;
    String actualAnswer;

    @Given("Today is {string}")
    public void todayIs(String today) {
        this.today = today;
    }
    @When("I ask whether it is friday yet")
    public void iAskWhetherItIsFridayYet() {
        actualAnswer = DayChecker.isTodayFriday(today);
    }

    @Given("today is Friday")
    public void todayIsFriday() {
        today = "Friday";
    }
    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = DayChecker.isTodayFriday(today);
    }
    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(actualAnswer, expectedAnswer);
    }

}
