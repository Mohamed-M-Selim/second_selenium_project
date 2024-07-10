package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");

        WebElement loginPageButton = driver.findElement(By.xpath("//a[@href=\"/login\"]"));
        loginPageButton.click();

        WebElement emailTextBox = driver.findElement
                (By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
        emailTextBox.sendKeys("eldenlord@eldenring.com");

        WebElement passTextBox = driver.findElement
                (By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]"));
        passTextBox.sendKeys("bladeofmiquella");

        WebElement loginButton = driver.findElement
                (By.xpath("//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button"));
        loginButton.click();

        WebElement logOutButton = driver.findElement
                (By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));

        if(logOutButton.isDisplayed() && logOutButton.isEnabled()){
            System.out.println("login sucess");
        }else{
            System.out.println("login failed");
        }

        driver.quit();
    }
}