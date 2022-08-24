package task.purchase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class purchaseTask {
    public static @FindBy(linkText = "POPULAR ITEMS")
    WebElement section;

    public static @FindBy(xpath = "/html/body/div[3]/section/article[4]/div/div[3]/a/label")
    WebElement selectProduct;

    public static @FindBy(name = "quantity")
    WebElement quantity;

    public static @FindBy(name = "save_to_cart")
    WebElement addCart;

    public static @FindBy(xpath = "/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[2]")
    WebElement selectColor;

    public static @FindBy(id = "checkOutPopUp")
    WebElement checkoutButton;

    public static @FindBy(id = "next_btn")
    WebElement nextButton;

    public static @FindBy(name = "masterCredit")
    WebElement selectCreditcard;

    public static @FindBy(name = "card_number")
    WebElement numberCreditcard;

    public static @FindBy(name = "cvv_number")
    WebElement cvvNumber;

    public static @FindBy(xpath = "/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[1]/div/select")
    WebElement monthCard;

    public static @FindBy(xpath = "/html/body/div[3]/section/article/div[1]/div[1]/div/div[3]/div/div[4]/sec-form/div[2]/div/sec-view[2]/div/select")
    WebElement yearCard;

    public static @FindBy(name="cardholder_name")
    WebElement nameCard;

    public static @FindBy(id="pay_now_btn_ManualPayment")
    WebElement payButton;

    public purchaseTask sectionMenu() throws InterruptedException {
        Thread.sleep(5000);
        section.click();
        return new purchaseTask();
    }

    public purchaseTask selectProduct() throws InterruptedException {
        Thread.sleep(5000);
        selectProduct.click();
        return new purchaseTask();
    }

    public purchaseTask quantityProduct() throws InterruptedException {
        Thread.sleep(5000);
        quantity.click();
        Thread.sleep(2000);
        quantity.click();
        return new purchaseTask();
    }

    public purchaseTask addToCart() throws InterruptedException {
        Thread.sleep(5000);
        addCart.click();
        return new purchaseTask();
    }

    public purchaseTask selectColor() throws InterruptedException {
        Thread.sleep(5000);
        selectColor.click();
        return new purchaseTask();
    }

    public purchaseTask checkoutButton() throws InterruptedException {
        Thread.sleep(5000);
        checkoutButton.click();
        return new purchaseTask();
    }

    public purchaseTask nextButton() throws InterruptedException {
        Thread.sleep(5000);
        nextButton.click();
        return new purchaseTask();
    }

    public purchaseTask selectOptionCreditcard() throws InterruptedException {
        Thread.sleep(5000);
        selectCreditcard.click();
        return new purchaseTask();
    }

    public purchaseTask numberCreditcard(String card_number) throws InterruptedException {
        Thread.sleep(5000);
        numberCreditcard.sendKeys(card_number);
        return new purchaseTask();
    }

    public purchaseTask cvvNumbre(String cvv) throws InterruptedException {
        Thread.sleep(5000);
        cvvNumber.sendKeys(cvv);
        return new purchaseTask();
    }

    public purchaseTask montCard(String month) throws InterruptedException {
        Thread.sleep(5000);
        Select monthc = new Select(monthCard);
        monthc.selectByVisibleText(month);
        return new purchaseTask();
    }

    public purchaseTask yearCard(String year) throws InterruptedException {
        Thread.sleep(5000);
        Select yearc = new Select(yearCard);
        yearc.selectByVisibleText(year);
        return new purchaseTask();
    }

    public purchaseTask nameCard(String name) throws InterruptedException{
        Thread.sleep(5000);
        nameCard.sendKeys(name);
        return new purchaseTask();
    }

    public purchaseTask payButton() throws InterruptedException {
        Thread.sleep(5000);
        payButton.click();
        return new purchaseTask();
    }

}

