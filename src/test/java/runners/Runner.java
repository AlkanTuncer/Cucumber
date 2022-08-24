package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@n11", // feature içinde tag vererek istediğimiz testleri çalıştırabiliriz.
        dryRun = false)  // feature'daki metotları almak için 'true' kullanabiliriz. 'true' iken testleri calıstırmaz.
                         // 'false' iken belirtilen dosyadaki bütün testleri calıstırır. 'tags' verirsek sadece onları calıstırır.

public class Runner {

    // Runner class'inin body'sine hic bir kod yazmiyoruz
    // bu class icin onemli olan kullanacagimiz 2 adet notasyon

    // dryRun=false yazildiginda belirlenen tag'la etiketlenen tum scenario'lari sirasiyla calistirir
    // dryRun=true dedigimizde ise kodlari calistirmadan eksik stepler olup olmadigini kontrol eder ve varsa bize eksik stepleri rapor eder

    // features ve glue olarak spesifik bir class ve ya feature dosyasini degil tum klasor ve package'i sectik
    // dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun isimize yarayan bir stepdefinition varsa rahatlikla kullanabiliriz



}