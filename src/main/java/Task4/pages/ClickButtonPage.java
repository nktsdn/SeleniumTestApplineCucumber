package Task4.pages;

import Task4.steps.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickButtonPage extends BasePage {

    @FindBy(xpath = "//h1[contains(text(), 'Страхование путешественников')]")
    public WebElement title;

    @FindBy(xpath = "//*[contains(text(), 'Оформить онлайн')]")
    public WebElement sendButton;

    public ClickButtonPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }


    public void sendButton(String itemName) {
        driver.findElement(By.xpath("//span[text() = '" + itemName + "']")).click();
    }

}
