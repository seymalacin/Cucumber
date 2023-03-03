package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HomPage;
import pages.LoginPage;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {

    // Page Objelerini Olustur
  HomPage homPage;
  LoginPage loginPage;
  ExcelUtils excelUtils;
  List<Map<String,String>> excelData;
    @Given("kullanıcı {string} bilgileri ile giris yapar")
    public void kullanıcı_bilgileri_ile_giris_yapar(String string) {
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        String sayfa = "customer_info";
        excelUtils=new ExcelUtils(path,sayfa);
        excelData=excelUtils.getDataList();

    }
}
