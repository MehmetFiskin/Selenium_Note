package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();


        // 1.Yeni bir class olusturalim (Homework)
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        String istenenKelime = "facebook";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Actual Title Test is FAILED.Actual Title is =" + driver.getTitle());



        //3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "facebook";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");


        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
        String actualTitle1 = driver.getTitle();
        String istenenKelime1 = "Walmart.com";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //6. Tekrar "facebook" sayfasina donun
        Thread.sleep(2000);
        driver.navigate().back();

        //7. Sayfayi yenileyin
        Thread.sleep(2000);
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //9.Browser'i kapatin
        driver.close();


    }
}
