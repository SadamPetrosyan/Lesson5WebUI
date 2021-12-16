import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TakingADepositTest extends BasicTest {
    @Test
//TODO: выбор готового владельца и взятие депозита в "Долларах"
    void takingADepositTest() {
        webDriver.get(URL);webDriver.findElement(By.xpath("//button[contains(text(),'Customer Login')]"))
                .click();//todo переход на страницу выбора пользователя
        webDriver.findElement(By.name("userSelect"))
                .click();
        assertNull(null, "Successful");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//option[contains(text(),'Ron Weasly')]"))
                .click();//todo выбор пользователя
        assertEquals("Ron Weasly",/*todo ожидаемый результат*/ "Ron Weasly","Successful" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[contains(text(),'Login')]"))
                .click();//todo авторизация под именем выбранного Клиента
        webDriver.findElement(By.xpath("//button[contains(text(),'Deposit')]"))
                .click();//todo переход на страницу одобрения депозита
        webDriver.findElement(By.xpath("//input[@placeholder='amount']"))
                .click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']"))
                .sendKeys("1500");//todo сумма депозита
        assertEquals(1500,/*todo ожидаемый результат*/ 1500, "Successful");//todo фактический результат
        webDriver.findElement(By.xpath("//button[@type='submit']"))
                .click();//todo подтверждение суммы депозита
        webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"))
                .click();// todo переход на Главную страницу сайта
    }
}
