package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;
import screenplay.UserAddProductToCart;

public class PurchaseStepDefinitions {
    private Actor user;
    private WebDriver driver;
    @Given("the user is on the shopping site")
    public PurchaseStepDefinitions(Object user) {
        this.user = user;
    }
    @When("the user add (string) to the cart")
    public void userAddProductToCart(String productName) {
        user.attemptsTo(userAddProductToCart.named(productName));
    };
    @When("the user views th cart")
    public void userViewsTheCart() {
        Actor actor = Actor.named("User");
        user.attemptsTo(ViewCart.items());
    }
    @When("the user completes the purchase form with the following details:")
    public void userCompletesPurchaseForm(io.cucumber.datatable.DataTable dataTable) {
        String Name = userCompletesPurchaseForm ("Name");
        String Country = userCompletesPurchaseForm("Country");
        String City = userCompletesPurchaseForm("City");
        String CreditCard = userCompletesPurchaseForm("Credit Card");
        String Month = userCompletesPurchaseForm("Month");
        String Year = userCompletesPurchaseForm("Year");
    }

    private String userCompletesPurchaseForm(String name) {
        final String o1 = String;
        return o;
    }

    @When("El usuario finaliza la compra")
    public void userFinalizePurchase() {
        user.attemptsTo(FinalizePurchase.complete());
    }
    @Then("La compra es exitosa")
    public void purchaseIsSuccessful() {
    }

    @When("ingreso datos <first_name>")
    public void ingresoDatosFirst_name() {
    }
}