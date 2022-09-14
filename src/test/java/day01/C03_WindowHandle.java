package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle()); // CDwindow-4C9271BAABAA79F05602CA937801FC3D
        // farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız
    }



}
