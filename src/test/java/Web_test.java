import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.testng.annotations.Test;


import java.util.ArrayList;

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

            Assert.assertEquals(actualResultTitle, expectedResultTitle);
            Assert.assertEquals(actualResultUrl, expectedResultUrl);

            driver.quit();

        }

        // кейс 3
        // 1 Открыть страницу https://openweathermap.org
        // 2 Нажать на единицы измерения Imperial F
        // 3 Потвердить что температура показана в фарингейтах





        @Test
        public void testTemperature() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

            WebDriver driver = new ChromeDriver();

            String url = "https://openweathermap.org";
            String expectedResultTemperature = "°F";
            String fTempSymbols = "°F";

            driver.get(url);
            Thread.sleep(5000);

            WebElement temperatureImperialF = driver.findElement(
                    By.xpath("//div[@class = 'controls']//div[3]"));

            temperatureImperialF.click();
            Thread.sleep(5000);

            WebElement tempF = driver.findElement(
                    By.xpath("//div[@id = 'weather-widget']/div[2]/div[1]/div[1]/div[2]/div[1]/span"));

            String actualResult = tempF.getText();

            // actualResult.length()-2 - возрощает последние 2 символа
            Assert.assertEquals(actualResult.substring(actualResult.length()-2), expectedResultTemperature);

            driver.quit();
        }

            // кейс 4
            // 1. Открыть страницу https://openweathermap.org
            // 2. Потвердить что внизу страницы есть панель с текстом "We use cookies which are essential for
            // the site to work. We also use non-essential cookies to help us improve our services.
            // Any data collected is anonymised. You can allow all cookies or manage them individually."
            // 3. Потвердить что на панели в низу ест 2 кнопки   Manage cookies  and Allow all


            @Test
            public void popupCookie() throws InterruptedException {

                System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                WebDriver driver = new ChromeDriver();

                String url = "https://openweathermap.org";
                String expectedTextDescription = "We use cookies which are essential "
                        + "for the site to work. We also use non-essential cookies to help us improve our services. "
                        + "Any data collected is anonymised. You can allow all cookies or manage them individually.";
                String buttonText1 = "Allow all";
                String buttonText2 = "Manage cookies";

                driver.get(url);
                Thread.sleep(5000);


                //потверждение что куки панель отображается
                WebElement stickFooterPanel = driver.findElement(
                        By.xpath("//div[@class = 'stick-footer-panel']"));

                Assert.assertTrue(stickFooterPanel.isDisplayed());

                //потверждение текста

                WebElement cookiesDescription = driver.findElement(
                        By.xpath("//div[@class = 'stick-footer-panel__container']"
                                + "//p[@class = 'stick-footer-panel__description']"));

                String actualResultTextDescription = cookiesDescription.getText();

                Assert.assertEquals(actualResultTextDescription, expectedTextDescription);

                //потверждение что 2 нкопки

                WebElement buttonAllow = driver.findElement(
                        By.xpath("//div[@class = 'stick-footer-panel__btn-container']"
                                + "//button[@class = 'stick-footer-panel__link']"));
                Assert.assertEquals(buttonAllow.getText(), buttonText1);

                WebElement buttonManege = driver.findElement(
                        By.xpath("//div[@class = 'stick-footer-panel__btn-container']"
                                + "/a[@href = '/cookies-settings']"));
                Assert.assertEquals(buttonManege.getText(), buttonText2);

                driver.quit();
            }

                // кейс 5
                // 1. Открыть страницу https://openweathermap.org
                // 2. Потвердить что в меню есть 3 сылки FAQ, How to start, Ask a question

                @Test
                public void testSupportDropdown() throws InterruptedException {

                    System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                    WebDriver driver = new ChromeDriver();

                    String url = "https://openweathermap.org";
                    String expectedResultFQA = "FAQ";
                    String expectedResultHowToStart = "How to start";
                    String expectedResultAskQuestion = "Ask a question";

                    driver.get(url);
                    Thread.sleep(5000);

                    WebElement supportDropDown = driver.findElement(By.xpath("//div[@id= 'support-dropdown']"));
                    supportDropDown.click();
                    Thread.sleep(1000);

                    //   Assert.assertEquals(driver.findElement(By.xpath("//ul[@id = 'support-dropdown-menu']/li")).size
                    //   );

                    WebElement FqaLinkIsPresent = driver.findElement(
                            By.xpath("//ul[@class= 'dropdown-menu dropdown-visible']//a[@href = '/faq']"));

                    String actualResultFQA = FqaLinkIsPresent.getText();
                    Assert.assertEquals(actualResultFQA, expectedResultFQA);

                    WebElement startLinkIsPresent = driver.findElement(
                            By.xpath("//ul[@class= 'dropdown-menu dropdown-visible']//li[2]/a[@href = '/appid']"));
                    String actualResultStart = startLinkIsPresent.getText();
                    Assert.assertEquals(actualResultStart, expectedResultHowToStart);

                    WebElement questionLinkIsPresent = driver.findElement(
                            By.xpath("//ul[@class= 'dropdown-menu dropdown-visible']"
                                    + "//li[3]/a[@href = 'https://home.openweathermap.org/questions']"));
                    String actualResultAskQuestion = questionLinkIsPresent.getText();
                    Assert.assertEquals(actualResultAskQuestion, expectedResultAskQuestion);
                    driver.quit();
                }

                    // кейс 6
                    // 1. Открыть страницу https://openweathermap.org
                    // 2. Нажать пункт меню Support > Ask a question
                    // 3. Заполнить поля Email, Subject, Message
                    // 4. Не подтвердив CAPTCHA, нажать на кнопку Submit
                    // 5. Подтвердить, что пользователю будет показана ошибка reCAPTCHA verification failed, please try again.

                    @Test
                    public void testValidationMessageCaptcha() throws InterruptedException {

                        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                        WebDriver driver = new ChromeDriver();

                        String url = "https://openweathermap.org";
                        String emailForm = "test@gmail.,com";
                        String subjectForm = "I want to discuss a purchase of OpenWeather products/subscriptions";
                        String messageForm = "Hello world ";
                        String expectedValidationMassageCaptcha = "reCAPTCHA verification failed, please try again.";
                        String expectedUrlQuestion = "https://home.openweathermap.org/questions";

                        driver.manage().window().maximize();
                        driver.get(url);
                        Thread.sleep(5000);

                        WebElement supportDropDown = driver.findElement(By.xpath("//div[@id= 'support-dropdown']"));
                        supportDropDown.click();
                        Thread.sleep(1000);

                        WebElement questionLinkIsPresent = driver.findElement(
                                By.xpath("//ul[@class= 'dropdown-menu dropdown-visible']"
                                        + "//li[3]/a[@href = 'https://home.openweathermap.org/questions']"));
                        questionLinkIsPresent.click();
                        Thread.sleep(3000);
                        //переключение на вторую вкладу
                        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
                        driver.switchTo().window(tabs2.get(1));
                        //подтверждаю что я нахожусь именно на ней
                        String actualUrlQuestion = driver.getCurrentUrl();
                        Assert.assertEquals(actualUrlQuestion, expectedUrlQuestion);

                        //выбрать имеил поле и написать
                        WebElement emailField = driver.findElement(
                                By.xpath("//input[@class = 'form-control string email required']"));
                        emailField.click();
                        emailField.sendKeys(emailForm);
                        //перейти на поле subject кликнуть и выбрать первый вариант
                        WebElement selectFirst = driver.findElement(
                                By.xpath("//select[@class = 'form-control select required']/option[2]"));
                        Assert.assertEquals(selectFirst.getText(), subjectForm);

                        selectFirst.click();

                        WebElement messageField = driver.findElement(
                                By.xpath("//textarea[@class = 'form-control text required']"));

                        messageField.click();
                        messageField.sendKeys(messageForm);

                        WebElement buttonSubmit = driver.findElement(
                                By.xpath("//input[@data-disable-with='Create Question form']"));
                        buttonSubmit.click();
                        Thread.sleep(3000);

                        WebElement actualCaptchaText = driver.findElement(
                                By.xpath("//div[@class = 'has-error']/div[@class = 'help-block']"));
                        Assert.assertEquals(actualCaptchaText.getText(), expectedValidationMassageCaptcha);
                    }
                        // кейс 6
                        // 1. Открыть страницу https://openweathermap.org
                        // 2. Нажать пункт меню Support > Ask a question
                        // 3. Оставить поле Email пустым
                        // 4. Заполнить поля Subject, Message
                        // 5. Подтвердив CAPTCHA
                        // 6. Нажать на кнопку Submit
                        // 5. Подтвердить, что в поле Email пользователю будет показана ошибка "can't be blank"

                        @Test
                        public void testValidationMessageEmail() throws InterruptedException {

                            System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                            WebDriver driver = new ChromeDriver();

                            String url = "https://openweathermap.org";
                            String messageForm = "Hello world ";
                            String expectedValidationMassage = "can't be blank";
                            String expectedUrlQuestion = "https://home.openweathermap.org/questions";

                            driver.manage().window().maximize();
                            driver.get(url);
                            Thread.sleep(5000);

                            WebElement supportMenu = driver.findElement(
                                    By.xpath("//div[@id='support-dropdown']"));

                            supportMenu.click();

                            WebElement questionLink = driver.findElement(
                                    By.xpath("//ul[@class ='dropdown-menu dropdown-visible']/li[3]/a"));

                            questionLink.click();
                            Thread.sleep(3000);

                            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
                            driver.switchTo().window(tabs2.get(1));

                            String actualQuestionLink = driver.getCurrentUrl();

                            Assert.assertEquals(actualQuestionLink, expectedUrlQuestion);

                            WebElement subjectField = driver.findElement(
                                    By.xpath("//select[@id = 'question_form_subject']//option[2]"));
                            subjectField.click();

                            WebElement messageField = driver.findElement(
                                    By.xpath("//textarea[@class= 'form-control text required']"));

                            messageField.click();
                            messageField.sendKeys(messageForm);

                            Thread.sleep(3000);

                            String window2 = driver.getWindowHandle();
                            driver.switchTo().frame(driver.findElement(
                                    By.cssSelector("iframe[title='reCAPTCHA']")));

                            WebElement captcha = driver.findElement(
                                    By.xpath("//div[@class= 'recaptcha-checkbox-border']"));

                            captcha.click();
                            Thread.sleep(3000);

                            driver.switchTo().window(window2);

                            WebElement submitButton = driver.findElement(By.xpath("//input[@value = 'Submit']"));

                            submitButton.click();
                            Thread.sleep(3000);

                            WebElement ActualValidationError = driver.findElement(
                                    By.xpath("//span[@class = 'help-block'] "));

                            Assert.assertEquals(ActualValidationError.getText(), expectedValidationMassage);

                            driver.quit();
                        }

                            //TC_07
                            //
                            //Открыть базовую ссылку
                            //Нажать на единицы измерения Imperial: °F, mph
                            //Нажать на единицы измерения Metric: °C, m/s
                            //Подтвердить, что в результате этих действий, единицы измерения температуры изменились с F на С

                            @Test
                            public void testSwitcher() throws InterruptedException {

                                System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                                WebDriver driver = new ChromeDriver();

                                String url = "https://openweathermap.org";
                                String temperatureValue = "°C";


                                driver.manage().window().maximize();
                                driver.get(url);
                                Thread.sleep(3000);

                                WebElement temperatureValueToF = driver.findElement(
                                        By.xpath("//div[@class = 'switch-container']/div[3]"));
                                temperatureValueToF.click();
                                Thread.sleep(3000);

                                WebElement temperatureValueToC = driver.findElement(
                                        By.xpath("//div[@class = 'switch-container']/div[2]"));
                                temperatureValueToC.click();
                                Thread.sleep(3000);

                                String temperatureC = driver.findElement(
                                        By.xpath("//span[@class = 'heading']")).getText();
                                Assert.assertTrue(temperatureC.contains(temperatureValue));
                            }

                               // TC_08

                               // Открыть базовую ссылку
                               // Нажать на лого компании
                               // Дождаться, когда произойдет перезагрузка сайта, и подтвердить, что текущая ссылка не изменилась
                                @Test
                                public void testLogoCompany() throws InterruptedException {

                                    System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                                    WebDriver driver = new ChromeDriver();

                                    String url = "https://openweathermap.org";


                                    driver.manage().window().maximize();
                                    driver.get(url);
                                    Thread.sleep(3000);

                                    WebElement logoCompany = driver.findElement(
                                            By.xpath("//img[@src = '/themes/openweathermap/assets/img/logo_white_cropped.png']"));
                                }


                                   // TC_09

                                   // Открыть базовую ссылку
                                   // В строке поиска в навигационной панели набрать “Rome”
                                   // Нажать клавишу Enter
                                   // Подтвердить, что вы перешли на страницу в ссылке которой содержатся слова “find” и “Rome”
                                   // Подтвердить, что в строке поиска на новой странице вписано слово “Rome”

                                    @Test
                                    public void testSearchNewResult() throws InterruptedException {

                                        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                                        WebDriver driver = new ChromeDriver();

                                        String url = "https://openweathermap.org";
                                        String expectedResultCity = "Rome";
                                        String searchValue1 = "find";
                                        String searchValue2 = "Rome";

                                        driver.manage().window().maximize();
                                        driver.get(url);
                                        Thread.sleep(5000);


                                        WebElement searchField = driver.findElement(
                                                By.xpath("//div[@id ='desktop-menu']//input[@type = 'text']"));

                                        searchField.click();
                                        searchField.sendKeys(expectedResultCity);
                                        searchField.sendKeys(Keys.ENTER);
                                        Thread.sleep(3000);

                                        String actualBaseUrl = driver.getCurrentUrl();
                                        Boolean actualBaseUrlBul;

                                        if (actualBaseUrl.contains(searchValue1) && actualBaseUrl.contains(searchValue2)) {
                                            actualBaseUrlBul = true;
                                        } else {
                                            actualBaseUrlBul = false;
                                        }
                                        Boolean expectedResult = actualBaseUrl.contains(searchValue1) && actualBaseUrl.contains(searchValue2);
                                        Assert.assertEquals(actualBaseUrlBul, expectedResult);

                                        String actualResultSearchBar = driver.findElement(
                                                By.xpath("//input[@class]")).getAttribute("value");

                                        Assert.assertEquals(actualResultSearchBar, expectedResultCity);


                                        driver.quit();
                                    }
                                        //TC_10
                                        //
                                        //Открыть базовую ссылку
                                        //Нажать на пункт меню API
                                        //Подтвердить, что на открывшейся странице пользователь видит 30 оранжевых кнопок
                                        @Test
                                        public void test30OrangeButton() throws InterruptedException {

                                            System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver_mac_arm64/chromedriver");

                                            WebDriver driver = new ChromeDriver();

                                            String url = "https://openweathermap.org";
                                            int expectedResult = 30;

                                            driver.manage().window().maximize();

                                            driver.get(url);

                                            WebElement apiMenu = driver.findElement(
                                                    By.xpath("//div[@id = 'desktop-menu']//a[@href = '/api']"));

                                            apiMenu.click();

                                         //  WebElement actualResultOrangeButton = driver.findElement(
                                          //         By.xpath("//a[contains(@class,'orange')]"))
                                          //  .size();

                                          //  Assert.assertEquals(actualResultOrangeButton,expectedResult);

                                            //
                                            // Check




                                            driver.quit();





















































                                }
}
