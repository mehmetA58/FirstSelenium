package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Locale;

public class Day02_C6_ifElseTest {
    public static void main(String[] args) throws InterruptedException {
        /*
    1. Create a class
    2. ChromeDriver kullanarak, youtube (http://youtube.com)web sayfasına gidin ve sayfa başlığının "youtube"
    olup olmadığını doğrulayın(verify), eğer değilse doğru başlığı(Actual Title) konsolda
    yazdirin.
    3. Sayfa URL'sinin "youtube" içerip içermediğini(contains) doğrulayın, içermiyorsa doğru
    URL'yi yazdırın.
    4. Daha sonra Navigate to https://www.amazon.com/
    5. Navigate back to youtube
    6. Refresh the page
    7. Navigate forward to amazon
    8. Maximize the window
    9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa
    doğru başlığı(Actual Title) yazdırın.
    10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
    URL'yi yazdırın
    11.Quit the browser
     */
        System.setProperty("webdriver.chrome.driver", "C:/Users/asus/Documents/selenium dependencies/drivers/chromedriver.exe");
        // System.setProperty:driver i tanitir
        WebDriver driver= new ChromeDriver();   //ChromeDriver dan driver adinda WebDriver turunde obje olusturduk..
        driver.get("http://youtube.com");
        //get():istedigimiz web sayfasina gider
        //driver imiza get komutu ile google.com a gitmesini soyledik
        String youtubeTitle= driver.getTitle();
        System.out.println("youtubeTitle :" + youtubeTitle);

        if (youtubeTitle.toLowerCase(Locale.ROOT).contains("youtube")) { //equalignorecase olmasi gerek..
            System.out.println("baslik dogrudur");
        }else{
            System.out.println("baslik dogru degildir");
            System.out.println("actual Title "+youtubeTitle);
        }

        String youtubeUrl = driver.getCurrentUrl();
        System.out.println("youtubeUrl :" + youtubeUrl);
        if (youtubeUrl.toLowerCase(Locale.ROOT).contains("youtube")) {
            System.out.println(youtubeUrl +" youtube kelimesi iceriyor");
        }else {
            System.out.println(youtubeUrl +" youtube kelimesi icermiyor");
            System.out.println("actual title :" + youtubeUrl);
        }

        driver.navigate().to("https://www.amazon.com/"); //amazon sayfasini gorecegiz
        // driver.get("https://google.com"); de ayni isi yapar
        // navigate method icerisine URL veya String yazabiliyoruz.
        // get ile navigate arasinda fark yok. Aradaki tek fark get method'u daha hizli calisir.
        driver.navigate().back(); //youtube sayfasini gorecegiz
        // once amazon sonra youtube sayfasina gidip tekrar gooogle geri doner <- tusunun görevini gördü
        driver.navigate().refresh();//youtube sayfasini gorecegiz // oldugu sayfayi yeniler
        driver.navigate().forward();//amazon sayfasini gorecegiz  //oncesine donmus oldugumuz sayfadan ileriye eski haline gittik
        driver.manage().window().maximize();//amazon sayfasi maximize driver i tum sayfaya kaplatiyoruz...
        // driver.manage().window().fullscreen();// tam ekran yapiyor-- f11 yaptigini yapar

        Thread.sleep(5000);
        String Amztitle = driver.getTitle();
        if (Amztitle.toLowerCase().contains("Amazon")){
            System.out.println("title Amazon kelimesi iceriyor");
        }else{
            System.out.println("title Amazon kelimesi icermiyor");
            System.out.println("actual Title "+Amztitle);
        }

        String AmzUrl = driver.getCurrentUrl();
        if (AmzUrl.toLowerCase().contains("https://www.amazon.com/ ")){
            System.out.println("sayfa dogrudur");
        }else{
            System.out.println("sayfa dogru degildir");
            System.out.println("actual Title "+AmzUrl);
        }
        //driver.close(); // driver da acik olan sayfayi kapatiyor
        driver.quit();   // driver da acik butun sayfalari ile tamamen kapatiyor
    }
}
