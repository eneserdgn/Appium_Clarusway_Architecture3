package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.productsPage;
import utils.driverFactory;

public class productsPageDefinitions {

    productsPage products = new productsPage(driverFactory.getDriver());

    @Then("should see the Products Page")
    public void shouldSeeTheProductsPage() {
        products.checkProductsPage();
    }
}
