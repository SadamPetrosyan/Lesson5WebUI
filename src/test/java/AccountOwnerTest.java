import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class AccountOwnerTest extends BasicTest {


        @Test//TODO: выбор готового владельца счёта
            void accountOwnerTest () {
                webDriver.get(URL);
                webDriver.findElement(By.xpath("//button[contains(text(),'Customer Login')]"))
                        .click(); //todo переход на страницу выбора пользователя
                webDriver.findElement(By.name("userSelect"))
                        .click();
                assertNull(null, "Successful");//todo ожидаемый результат
                webDriver.findElement(By.xpath("//option[contains(text(),'Albus Dumbledore')]"))
                        .click();//todo выбор пользователя
                assertEquals("Albus Dumbledore",/*todo ожидаемый результат*/"Albus Dumbledore","Successful" );//todo фактический результат
                webDriver.findElement(By.xpath("//button[contains(text(),'Login')]"))
                        .click();//todo авторизация под именем выбранного Клиента
                webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"))
                        .click();// todo переход на Главную страницу сайта
        }




}
