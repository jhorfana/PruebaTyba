package stepDefinition.purchase;

import io.cucumber.java.en.And;
import task.purchase.purchaseTask;

public class purchaseSteps {
    purchaseTask purchasetask;

    @And("the user selects the Popular Item option")
    public void theUserSelectsThePopularItemOption() throws InterruptedException{
        purchasetask = new purchaseTask();
        purchasetask = purchasetask.sectionMenu();
    }

    @And("the user selects product {string}")
    public void theUserSelectsProduct(String product) throws InterruptedException{
        purchasetask = purchasetask.selectProduct();
    }

    @And("the user selects quantity products of the current color")
    public void theUserSelectsQuantityProductsOfTheCurrentColor() throws InterruptedException {
        purchasetask = purchasetask.quantityProduct();
    }

    @And("the user selects the Add to cart button")
    public void theUserSelectsTheAddToCartButton() throws InterruptedException {
        purchasetask = purchasetask.addToCart();
    }

    @And("the user selects another color")
    public void theUserSelectsAnotherColor()throws InterruptedException {
        purchasetask = purchasetask.selectColor();
    }

    @And("the user selects quantity products of the indicated color")
    public void theUserSelectsQuantityProductsOfTheIndicatedColor() throws InterruptedException{
        purchasetask = purchasetask.quantityProduct();
    }

    @And("the user selects the Cart option")
    public void theUserSelectsTheCartOption()throws InterruptedException {
        purchasetask = purchasetask.addToCart();
    }

    @And("the user selects the CheckOut button")
    public void theUserSelectsTheCheckOutButton()throws InterruptedException {
        purchasetask = purchasetask.checkoutButton();
    }

    @And("the user selects the Next button")
    public void theUserSelectsTheNextButton()throws InterruptedException {
        purchasetask = purchasetask.nextButton();
    }

    @And("the user selects the MasterCredit option")
    public void theUserSelectsTheMasterCreditOption()throws InterruptedException {
        purchasetask = purchasetask.selectOptionCreditcard();
    }

    @And("the user enters the card number {string}")
    public void theUserEntersTheCardNumber(String card_number)throws InterruptedException {
        purchasetask = purchasetask.numberCreditcard(card_number);
    }

    @And("the user enters the cvv number {string}")
    public void theUserEntersTheCvvNumber(String cvv)throws InterruptedException {
        purchasetask = purchasetask.cvvNumbre(cvv);
    }

    @And("the user enters the expiration month {string}")
    public void theUserEntersTheExpirationMonth(String month) throws InterruptedException {
        purchasetask = purchasetask.montCard(month);

    }

    @And("the user enters expiration year {string}")
    public void theUserEntersExpirationYear(String year) throws InterruptedException {
        purchasetask = purchasetask.yearCard(year);

    }

    @And("the user enters name printed on card {string}")
    public void theUserEntersNamePrintedOnCard(String name)throws InterruptedException {
        purchasetask = purchasetask.nameCard(name);

    }

    @And("the user selects the Pay now button")
    public void theUserSelectsThePayNowButton()throws InterruptedException {
        purchasetask = purchasetask.payButton();

    }
}
