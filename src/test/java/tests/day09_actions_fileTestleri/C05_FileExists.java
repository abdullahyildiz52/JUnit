package tests.day09_actions_fileTestleri;


import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_FileExists {
    @Test
    public void test01(){
        /*
            Bir dosyanin bilgisayarimizda oldugunu test etmek cok kolaydir
            Ancak testimizin dinamik olmasini saglamak
            yani hangi bilgisayarda calistirilirsa calistirilsin
            testin dogru calisabilmesi icin
            dosya yoluna calismamiz gerekir
         */
        // bir dosyanin bilgisayarimizda var oldugunu test etmek istersek
        Assert.assertTrue(Files.exists(Paths.get("C:\\Users\\YILDIZ\\Downloads\\avatar.jpg")));
    }

    @Test
    public void dinamikTest() {
        // dosya yolunu dinamik yapalim
        // C:\Users\YILDIZ                     \Downloads\avatar.jpg
        // /Users/ahmetbulutluoz                /Downloads/avatar.png
        // C:\Users\acarn                       \Downloads\avatar.png
        // /C:\Users\kantoor                    \Downloads\avatar.png
        // Java'da dosya yolunu bize veren, 2 tane kod var
        // 1- calistigimiz klasorun dosya yolunu almak isterseniz
        System.out.println(System.getProperty("user.dir"));
        //   C:\Users\YILDIZ\IdeaProjects\team116_JUnit
        //   C:\Users\YILDIZ\IdeaProjects\team116_JUnit/src/test/java/tests/day08_iFrame_windows_actionsClass
        // 2- bilgisayarimizin ana dosya yolu

        System.out.println(System.getProperty("user.home"));

        // C:\Users\YILDIZ
        // bu bilgileri kullanarak
        // indirdigimiz dosyanin dinamik dosya yolunu elde etmek istersek
        // iki parcada elde edebiliriz
        // System.getProperty("user.home") + herkeste ayni olan kisim
        String dinamikDosyaYolu = System.getProperty("user.home") + "\\Downloads\\avatar.jpg";
        System.out.println(dinamikDosyaYolu); // /Users/ahmetbulutluoz/Downloads/avatar.png
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));


    }



}
