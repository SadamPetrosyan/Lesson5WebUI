import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemovalOfAnAccountHolderTest extends BasicTest {
    @Test
//TODO: удаление владельца счета
    void removalOfAnAccountHolderTest(){
        webDriver.get(URL);
        webDriver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]"))
                .click();//todo переход на страницу с вкладками "Добавить Клиента", "Открыть учетную запись", "Клиенты"
        webDriver.findElement(By.xpath("//button[contains(text(),'Customers')]"))
                .click();//todo переход на страницу "Клиенты"
        webDriver.findElement(By.xpath("//input[@placeholder='Search Customer']"))
                .click();
        assertNull(null, "Successful");//todo ожидаемый результат
        webDriver.findElement(By.xpath("//input[@placeholder='Search Customer']"))
                .sendKeys("Neville");//todo поиск Клиента
        assertEquals("Neville",/*todo ожидаемый результат*/ "Neville","Successful" );//todo фактический результат
        webDriver.findElement(By.xpath("//button[contains(text(),'Delete')]"))
                .click();//todo удаление Клиента
        webDriver.findElement(By.xpath("//button[contains(text(),'Home')]"))
                .click();// todo переход на Главную страницу сайта
    }
}
