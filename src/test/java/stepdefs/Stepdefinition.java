package stepdefs;

import PageObjects.PageObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefinition {

    //Webdriver wd;
    //WebdriverManager.Chromedriver().setup();



    @Given("open browser")
    public void open_browser() {
        System.out.println("open browser");
    }
    @Then("Enter url")
    public void Enter_url(){

        System.out.println("Enter url");
    }
    @Then ("Enter Boarding city")
    public void Enter_Boarding_city(){
//        PageObjects. setEnterBoardingCity();
        System.out.println("Enter Boarding city");
    }
    @Then ("Enter Destination city")
    public void Enter_Destination_city(){
        System.out.println("Enter Destination city");
    }
    @Then ("select date")
    public void select_date(){
        System.out.println("select date");
    }
    @And("click search buses")
    public void click_search_buses(){
        System.out.println("click search buses");
    }





}
