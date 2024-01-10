package travian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Random;

import static utilities.TestBase.waitFor;

public class Yagma {

    public static void main(String[] args) {
        Random randomSaniye = new Random();


        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();


        //Sayfayi ac
        driver.get("https://ts7.x1.europe.travian.com/");
        //Driver ın kaç saniyede bir Browseri açacağını belirliyoruz
        int sayi1 = randomSaniye.nextInt(10000);
        System.out.println("Sayfayi Kac Saniyede bir actigi = " + sayi1);
        waitFor(sayi1);

        //Kullanici adına tikla ve gir
        WebElement userName = driver.findElement(By.xpath("//*[@*='name']"));

        //userName.sendKeys("NİCOLASFLAMEL");
        //userName.sendKeys("Ocean");
        userName.sendKeys("yigitler");

        int sayi2 = randomSaniye.nextInt(10000);
        System.out.println("kac Saniyede bir UserName girdigi = " + sayi2);
        waitFor(sayi2);

        //Sifreye tikla ve gir
        WebElement userPassword = driver.findElement(By.xpath("//*[@*='password']"));
        //userPassword.sendKeys("15681968");
        //userPassword.sendKeys("Sueda123");
        userPassword.sendKeys("852456");

        int sayi3 = randomSaniye.nextInt(10000);
        System.out.println("Kac Saniyede Bir sifreyi girdigi = " + sayi3);
        waitFor(sayi3);


        //Giris yap
        driver.findElement(By.xpath("//*[@*='submit']")).click();
        int sayi4 = randomSaniye.nextInt(10000);
        System.out.println("Kac Saniyede bir giris yaptigi = " + sayi4);
        waitFor(sayi4);

        for (int i = 0; i < 6; i++) {
            //Koye git
            driver.findElement(By.xpath("//*[@*='M223 109c-14.5 4.4-17.7 5.5-18.8 6.3-1.9 1.5-7.4 4.6-10.2 5.8-1.4.6-3.8 1.7-5.5 2.4-1.6.7-5 1.9-7.4 2.7-5.7 1.7-6.9 3.5-4.8 7.7 1.2 2.3 1.3 3.9.6 6.3-1.2 4.2-.3 6.7 2.6 7.4 2 .5 2.5 1.4 3.1 6 .7 5.6 3.4 10.4 6 10.4.8 0 2.2.9 3.1 2 1 1.1 2.9 2 4.3 2s4.8.9 7.6 1.9c3.1 1.2 10.2 2.4 18 3.1 7.1.6 16 1.5 19.7 2 8.1 1 10 .3 15.6-6.2 4-4.4 8-6.5 16.5-8.4 3.3-.8 4.1-1.4 4.8-4.1.5-1.8 1.7-3.4 2.8-3.8 2.4-.8 2.5-1.8.5-4.9-1.2-1.8-1.3-2.9-.5-5.2.8-1.9.8-3.5.1-4.9-.5-1.1-1.2-4.5-1.6-7.7-.6-5.4-.8-5.7-4.4-7.2-3.5-1.3-7.4-5-8.3-7.7-.2-.6-2.6-1.2-5.3-1.4-2.8-.1-5.7-.5-6.5-.8-1.6-.7-20.1-3.6-26-4.1-1.9-.2-4.6 0-6 .4z']")).click();
            int sayi5 = randomSaniye.nextInt(10000);
            System.out.println("Koye Kac saniyede bir gittigi = " + sayi5);
            waitFor(sayi5);


            //Usse git
            driver.findElement(By.xpath("//*[@*='buildingSlot a39 g16 aid39 roman']")).click();
            int sayi6 = randomSaniye.nextInt(10000);
            System.out.println("Usse Kaç saniyede bir gittigi = " + sayi6);
            waitFor(sayi6);


            int sayi8 = 300000+ randomSaniye.nextInt(400000);
            driver.findElement(By.className("startAllFarmLists")).click();

            waitFor(sayi8);

            System.out.println("Yagma Listesini Kaç saniyede bir başlattığı = " + sayi8);

            int toplam =sayi5+sayi6+sayi8;
            System.out.println("Toplamda Kaç Saniyede bir çalıştığı = " +toplam);
            System.out.println("Kaç Defa Çalıstigi = " + i);
            driver.get("https://ts7.x1.europe.travian.com/dorf1.php");

        }

        driver.close();
    }


}



