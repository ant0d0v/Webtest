import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Web_test {

    // кейс 1
    // 1 Открыть страницу https://openweathermap.org
    // 2 Набрать в поиске Paris
    // 3 Нажать кнопку Search
    // 4 Из выпадающего списка Paris FR
    // 5 Подтвердить что, что заголовок изменился на "Paris"

    @Test
    public void testH2Text_WhenSearchingCityCountry() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        String url = "https://openweathermap.org";
        String cityName = "Paris";
        String expectedResult = "Paris, FR";

        driver.get(url);
        Thread.sleep(5000);

        WebElement searchCityField = driver.findElement(
                By.xpath("//div[@id = 'weather-widget']//input[@placeholder = 'Search city' ]")
        );
        searchCityField.click();
        searchCityField.sendKeys(cityName);

        Thread.sleep(5000);

        WebElement searchButton = driver.findElement(
                By.xpath("//button[@type = 'submit']")
        );
        searchButton.click();
        Thread.sleep(2000);

        WebElement parisFRChoiceDropdownMenu = driver.findElement(
                By.xpath("//ul[@class = 'search-dropdown-menu']/li/span[text() = 'Paris, FR ']")
        );
        parisFRChoiceDropdownMenu.click();
        Thread.sleep(5000);

        WebElement h2CityCountryHeader = driver.findElement(
                By.xpath("//div[@id = 'weather-widget']//h2")
        );

        String actualResult = h2CityCountryHeader.getText();

        Assert.assertEquals(actualResult, expectedResult);


        driver.quit();
    }
        // кейс 2
        // 1 Открыть страницу https://openweathermap.org
        // 2 Нажать на пункт меню Guide
        // 3 Потвердить что вы перешли на страницу со ссылкой https://openweathermap.org/guide
        // и что тайтл этой страницы  OpenWeatherMap API guide - OpenWeatherMap



        @Test
        public void testGuidUrlAndHeader() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

            WebDriver driver = new ChromeDriver();

            String url = "https://openweathermap.org";
            String expectedResultTitle = "OpenWeatherMap API guide - OpenWeatherMap";
            String expectedResultUrl = "https://openweathermap.org/guide";

            driver.get(url);



        Thread.sleep(5000);

        WebElement guidElementMenu = driver.findElement(
                By.xpath("//nav[@id = 'nav-website' ]//a[@href = '/guide']"));

        guidElementMenu.click();
        Thread.sleep(5000);

        String actualResultUrl = driver.getCurrentUrl();
        String actualResultTitle = driver.getTitle();

        Assert.assertEquals(actualResultTitle,expectedResultTitle);
        Assert.assertEquals(actualResultUrl, expectedResultUrl);

        driver.quit();






    }
}
