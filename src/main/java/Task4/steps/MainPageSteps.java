package Task4.steps;

import Task4.pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps extends BaseSteps {

    @Step("закрываем сообщение об cookie")
    public void waitSendAppClickable(){
        new MainPage().waitSendAppClickable();
    }

    @Step("выбираем пункт меню {0}")
    public void selectMainMenu(String itemName){
        new MainPage().selectMainMenu(itemName);
    }

    @Step("выбираем пункт меню {0}")
    public void selectSubMenu(String itemName){
        new MainPage().selectSubMenu(itemName);
    }
}
