package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",//RAPORARIN DAHA OKUNAKLI OLMASI ICIN
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
       monochrome=true,//RAPORLARIN KONSOLDA OKUNAKLI CIKMASI İÇİN

        features = "./src/test/resources/features",//features folder path
        glue = {"stepdefinitions","hooks"},   //stepdefinitions path
        tags = "@data_tables",
        dryRun =false


)
public class Runner {
}
//Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
//Runner class, features file lar ile step defitions i birbirile baglar
//hizli bir sekilde hepsini tara. tanimlanmamis adimi ver SD dosyasina ekle tekrar TC'leri calistirmak istedimiz zaman da false yap