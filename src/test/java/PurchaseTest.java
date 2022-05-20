import com.saucedemo.pages.FeaturePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PurchaseTest {

    @Given("^I am on saucedemo page$")
    public void iAmOnSaucedemoPage() {
        new FeaturePage().saucedemopage();
    }

    @When("^I login with credential username$")
    public void iLoginWithCredentialUsername() throws Throwable {
        new FeaturePage().enteruserName("standard_user");
    }

    @And("^I login with password$")
    public void iLoginWithPassword() throws Throwable {
        new FeaturePage().enterPasswordFiled("secret_sauce");
    }


    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
        new FeaturePage().clickOnloginButton();
    }

    @And("^I filter the products by Price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String filter) {
        new FeaturePage().filterproducts("hilo");

    }

    @And("^I select cheapest & costliest products and add to basket$")
    public void iSelectCheapestCostliestProductsAndAddToBasket() {
        new FeaturePage().selectproducts();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {

    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
    }

    @And("^I enter details firstname \"([^\"]*)\", lastName \"([^\"]*)\" and zipPostalCode \"([^\"]*)\"$")
    public void iEnterDetailsFirstnameLastNameAndZipPostalCode(String arg0, String arg1, String arg2) {

        throw new PendingException();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
    }

    @Then("^I should be able to see message 'Thank you for your order'$")
    public void iShouldBeAbleToSeeMessageThankYouForYourOrder() {
    }

    @When("^I login with credential username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iLoginWithCredentialUsernameAndPassword(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
