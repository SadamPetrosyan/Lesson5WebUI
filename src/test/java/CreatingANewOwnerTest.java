import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatingANewOwnerTest extends BasicTest {
    @Test
// TODO: создание нового владельца счета в банке
    void creatingANewOwnerTest(){
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).
                click();//todo переход на страницу с вкладками "Добавить Клиента", "Открыть учетную запись", "Клиенты"
        webDriver.findElement(By.xpath("//button[contains(text(),'Add Customer')]"))
                .click();//todo переход на страницу "Добавить Клиента"
        webDriver.findElement(By.xpath("//input[@placeholder='First Name']"))
                .sendKeys("Tom");//todo заполнение поля Имени Клиента
        assertEquals("Tom",/*todo ожидаемый результат*/ "Tom","Successful" );//todo фактический результат
        webDriver.findElement(By.xpath("//input[@placeholder='Last Name']"))
                .sendKeys("Marvolo");//todo заполнение поля Фамилии Клиента
        assertEquals("Marvolo",/*todo ожидаемый результат*/ "Marvolo","Successful" );//todo фактический результат
        webDriver.findElement(By.xpath("//input[@placeholder='Post Code']"))
                .sendKeys("A1ML0RD");//todo заполнение поля Почтового индекса Клиента
        assertEquals("A1ML0RD",/*todo ожидаемый результат*/ "A1ML0RD","Successful" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[@type='submit']"))
                .click();//todo кнопка сохранения пользователя в системе
    }
}
