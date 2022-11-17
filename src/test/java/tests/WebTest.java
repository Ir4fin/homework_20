package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest  {

    @Test
    void openBooking() {
        open("https://www.booking.com/index.en.html");
        $(".bui-header__logo").shouldBe(Condition.visible);
    }
}
