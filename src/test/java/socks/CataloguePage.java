package socks;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class CataloguePage extends BaseSeleniumPage {
  @FindBy (xpath = "//a[contains(@onclick, '1896')]")
  private WebElement addFirstLot;

  @FindBy (xpath = "//a[contains(@onclick, '2d88')]")
  private WebElement addSecondLot;

  @FindBy (xpath = "//span[@id='numItemsInCart']")
  private WebElement checkout;

  public CataloguePage() {
    PageFactory.initElements(driver, this);
  }

  public CataloguePage addLots(){
    addFirstLot.click();
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    //addSecondLot.click();
    return new CataloguePage();
  }

  public BasketPage goToBasket(){
    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    assertTrue(checkout.isDisplayed());
    checkout.click();
    return new BasketPage();
  }

}
