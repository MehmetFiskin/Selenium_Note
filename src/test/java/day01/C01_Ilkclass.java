package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Ilkclass {
    public static void main(String[] args) {

        /*
        En temel haliyle bir otomasyon yapmak için
        Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
        bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
        ve metthod'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
         */

        System.setProperty("webdriver.chrome.driver","src/resources/driver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Actual Title : " + driver.getTitle());//Gidilen sitenin basligini yazdirir.

        System.out.println("Actual Url : " + driver.getCurrentUrl());//Gidilen sitenin url'ni yazdirir.

        System.out.println(driver.getPageSource());

        driver.close();
    }
}
