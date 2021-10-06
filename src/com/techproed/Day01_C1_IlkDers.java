package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_C1_IlkDers {
    public static void main(String[] args) {
       // System.setProperty:driver i tanitir
        System.setProperty("webdriver.chrome.driver","C:/Users/asus/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //ChromeDriver dan driver adinda WebDriver turunde obje olusturduk..
        //get():istedigimiz web sayfasina gider
        //driver imiza get komutu ile google.com a gitmesini soyledik
        driver.get("https://www.google.com"); //driver.navigate().to("https://google.com"); de ayni isi yapar
        driver.get("https://www.amazon.com");
        //driver.close(); // driver da acik olan sayfayi kapatiyor
        driver.quit();  // driver da acik butun sayfalari ile tamamen kapatiyor


        /*
        Seleniumun kurulumunda en sonda Google sayfasına giriş denemesi yapılıyor.
        Türkiyede olanlar muhtemelen bu sorun ile karşılaşmıyor olabilir.
        Ama yurt dışında yaşayanlarda google sayfasını acarken bazılarında benim gibi paylaştığım
        resimdeki gibi problemler cıkabiliyor ve sayfa ilerlemiyor diger sayfaları acmıyor.
        Google sayfamıza gittikten
         sonra en alt kısma şu kodu yazarsanız otomatik olarak click yapacak
         kabul ediyorum butonuna sorunsuz sizlerinde Google sayfası acılacaktır ..

            WebElement clickGoogle =driver.findElement(By.id("L2AGLb"));
            clickGoogle.click();

            Arkadaşlar  Youtube ,Google ve Facebook yurt dısında sorun veriyordu
            programın ortasında onaylamayamadığımız icin programı kendi durduruyordu
            daha önce google sayfası icin kodu deneyerek buldum ve
            paylaşmıştım üzerinde uğşarak bugünde facebookuda hal ettim .
            Kodu aşağıdaki gibi yapıştırmayacaksınız . Fransada 'Tout accepter' olan
            yani türkçesi kabul ediyorum demek sizler hangi ülkedeyseniz oranın
            diline göre kabul ediyourum kısmını iki tırnak arasına degiştirip eklemeniz lazım .
            Ve youtube da hal oldu :panic:                                                                                                                                                                                                       Google için :

            driver.findElement(By.id("L2AGLb")).click();
             Youtube icin :
                driver.findElement(By.xpath("//*[.='Kabul ediyorum']")).click();
             Facebook için :
                driver.findElement(By.xpath("//*[.='Tout accepter']")).click();
         */

    }
}
