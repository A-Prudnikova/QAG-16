import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class UiSteps {

    @Step("Add first item to cart")
    public void firstItemAdd() {
        open("http://demowebshop.tricentis.com/build-your-own-expensive-computer-2");
        $("#add-to-cart-button-74").click();

    }

    @Step("Check first item is in cart")
    public void checkFirstItem() {
        $(".cart-label").click();
        $(".qty-input").shouldHave(Condition.value("1"));
    }

    @Step("Continue shopping and add second item to cart")
    public void secondItemAdd() {
        $(byAttribute("name", "continueshopping")).click();
        $(byAttribute("data-productid", "74")).click();
        $("#add-to-cart-button-74").click();
    }

    @Step("Check second item is in cart")
    public void checkSecondItem() {
        $(".cart-label").click();
        $(".qty-input").shouldHave(Condition.value("2"));
    }
}
