package com.nhsba.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver;

    @Given("I am a jobseeker on NHS Jobs website")
    public void i_am_a_jobseeker_on_nhs_jobs_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jobs.nhs.uk/candidate/search");

    }

    @When("I put my preferences into the Search functionality")
    public void i_put_my_preferences_into_the_search_functionality() {
        driver.findElement(By.id("keyword")).sendKeys("Nurse");
        driver.findElement(By.id("location")).sendKeys("London");


    }
    @Then("I should get a list of jobs which matches my preferences")
    public void i_should_get_a_list_of_jobs_which_matches_my_preferences() {
        driver.findElement(By.id("search")).click();

    }
    @Then("I sort my search results with the newest Date Posted")
    public void sort_my_search_results_with_the_newest_date_posted() {
        driver.findElement(By.xpath("//select[@id='sort']")).click();
        driver.findElement(By.xpath("//option[@value='publicationDateDesc']")).click();

    }
}
