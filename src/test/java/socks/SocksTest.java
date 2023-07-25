package socks;

import com.sun.tools.javac.Main;
import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Timeout;
import readProperties.ConfigProvider;

import java.util.concurrent.TimeUnit;

public class SocksTest extends BaseSeleniumTest {


  //Написать на языке Java e2e тест по авторизации и добавления товара в корзину.
  //Проверить, что сумма цены товаров в корзине соответствует сумме цен заказанных товаров.

  @Test
  public void checkSumTest(){
    driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
    String loginValue = ConfigProvider.USER_LOGIN;
    String passwordValue = ConfigProvider.USER_PASSWORD;
    MainSockPage mainSockPage = new MainSockPage();
    mainSockPage.authorization(loginValue, passwordValue)
        .openCataloguePage().addLots().goToBasket();
    BasketPage basketPage = new BasketPage();
    driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
    Assert.assertEquals(basketPage.getBasketSummary(), basketPage.getOrderSummary());


  }

}
