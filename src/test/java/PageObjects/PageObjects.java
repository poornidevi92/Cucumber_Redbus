package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
 public WebDriver driver;
    By EnterBoardingCity = By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[1]/div/div[1]/div/div");
    By EnterDestinationCity = By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div/div[3]/div[1]/div/div");

    By Select_Date = By.id("onwardCal");
    By Click_Search = By.id("search_button");

    public void setEnterBoardingCity(String city){

        driver.findElement(EnterBoardingCity).sendKeys("chennai");
    }
    public void setEnterDestinationCity(String city){

        driver.findElement(EnterDestinationCity).sendKeys("coimbatore");
   }
    public void setSelectDate(){
        driver.findElement(Select_Date).click();
}
public void click_Search(){
driver.findElement(Click_Search).click();
}
}


