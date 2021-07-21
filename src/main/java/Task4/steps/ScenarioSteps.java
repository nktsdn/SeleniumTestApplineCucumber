package Task4.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    ClickButtonSteps clickButtonSteps = new ClickButtonSteps();
    OptionsInsuranceSteps optionInsuranceSteps = new OptionsInsuranceSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();



    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName) {
        mainPageSteps.selectMainMenu(menuName);
    }

    @When("^выбран подпункт меню  \"(.+)\"$")
    public void selectSubMenu(String itemName) {
        mainPageSteps.selectSubMenu(itemName);
    }

    @Then("^заголовок страницы  -   \"(.+)\"$")
    public void checkTitleSendAppPage(String title) {
        clickButtonSteps.checkPageTitle(title);
    }

    @When("^выполнено нажатие на кнопку 'Оформить онлайн'$")
    public void sendButton() {
        clickButtonSteps.sendButton();
    }

    @Then("^заголовок страницы -  равен \"(.+)\"$")
    public void checkPageTitle(String title) {
        optionInsuranceSteps.checkPageTitle(title);
    }

    @When("^выбран тип страхования min \"(.+)\"$")
    public void selectTypeMin(String item) {
        optionInsuranceSteps.selectType(item);
    }

    @When("^выбран тип страхования \"(.+)\"$")
    public void selectType(String item) {
        optionInsuranceSteps.selectType(item);
    }

    @When("^выполнено нажатие на кнопку 'Оформить'$")
    public void sendButtonInsurance() {
        optionInsuranceSteps.sendButton();
    }

    @When("^заполняются поля:$")
    public void fillForm(DataTable fields) {
        fields.asMap(String.class, String.class).forEach((field, value) -> sendAppSteps.fillField(field, value));
    }

    @Then("^значения полей равны:$")
    public void checkFillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.checkFillField(field, value));
    }

    @When("^выполнено нажатие на кнопку 'Продолжить'$")
    public void sendButtonEnd() {
        sendAppSteps.sendButton();
    }

    @Then("^в поле \"(.+)\" присутствует сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessage(String field, String errorMessage) {
        sendAppSteps.checkErrorMessageField(field, errorMessage);
    }
}
