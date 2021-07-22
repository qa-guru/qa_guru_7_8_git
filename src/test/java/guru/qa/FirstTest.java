package guru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @Test
    void firstTest() {
        System.out.println("First Test!!!!");
        Selenide.open("http://ya.ru");
    }
}
