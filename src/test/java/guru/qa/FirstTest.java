package guru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest() {
        System.out.println("firstTest!");
        Selenide.open("http://ya.ru");
    }
}
