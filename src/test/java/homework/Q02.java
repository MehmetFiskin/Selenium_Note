package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();


        //1.  Yeni bir class olusturun (TekrarTesti)
        //2.  Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String istenenKelime = "youtube";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Actual Title Test is FAILED.Actual Title is =" + driver.getTitle());


        //3.  Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "youtube";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");
        Thread.sleep(2000);

        //4.  Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        //5.  Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(2000);

        //6.  Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(2000);

        //7.  Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(2000);

        //8.  Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //9.  Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualTitle1 = driver.getTitle();
        String istenenKelime1 = "Amazon";
        if(actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");
        System.out.println("Actual Title1 =" +driver.getTitle());

        //10. Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualUrl1 = driver.getCurrentUrl();
        String arananKelime1 = "facebook";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url1 Testi FAILED.Actual Url1 =" +driver.getCurrentUrl() );


        //11. Sayfayi kapatin
        driver.close();

    }
}
