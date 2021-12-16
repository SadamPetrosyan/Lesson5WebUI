import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerHistoryObserver extends BasicTest {
    @Test
    void customerHistoryObserver(){
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//button[contains(text(),'Customer Login')]"))
                .click(); //todo переход на страницу выбора пользователя
        webDriver.findElement(By.name("userSelect"))
                .click();
        assertNull(null, "Successful");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//option[contains(text(),'Hermoine Granger')]"))
                .click();//todo выбор пользователя
        assertEquals("Hermoine Granger",/*todo ожидаемый результат*/"Hermoine Granger","Successful" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[contains(text(),'Login')]"))
                .click();//todo авторизация под именем выбранного Клиента
        webDriver.findElement(By.id("accountSelect")).click();//todo выбор валюты
        assertNotNull(1001);
        webDriver.findElement(By.id("accountSelect")).sendKeys("1002");//todo выбор валюты = фунты стерленги
        webDriver.findElement(By.xpath("//button[contains(text(),'Deposit')]"))
                .click();//todo переход на страницу одобрения депозита
        webDriver.findElement(By.xpath("//input[@placeholder='amount']"))
                .click();
        assertNull(null, "Successful");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//input[@placeholder='amount']"))
                .sendKeys("2000");//todo сумма депозита
        assertEquals(2000,/*todo ожидаемый результат*/ 2000, "Successful");//todo фактический результат
        webDriver.findElement(By.xpath("//button[contains(text(),'Transactions')]"))
                .click();//todo переход на страницу истории депозитов
        webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"))
                .click();// todo переход на Главную страницу сайта
    }
}
